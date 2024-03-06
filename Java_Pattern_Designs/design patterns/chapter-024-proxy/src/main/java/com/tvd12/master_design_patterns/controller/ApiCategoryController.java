package com.tvd12.master_design_patterns.controller;

import com.tvd12.ezyhttp.core.exception.HttpBadRequestException;
import com.tvd12.ezyhttp.core.response.ResponseEntity;
import com.tvd12.ezyhttp.server.core.annotation.*;
import com.tvd12.master_design_patterns.BookApplication;
import com.tvd12.master_design_patterns.adapter.CategoryDataServiceToCategoryRepositoryAdapter;
import com.tvd12.master_design_patterns.entity.Category;
import com.tvd12.master_design_patterns.handler.ChainOfResponsibility;
import com.tvd12.master_design_patterns.model.AddCategoryModel;
import com.tvd12.master_design_patterns.model.CategoryModel;
import com.tvd12.master_design_patterns.repository.CategoryRepository;
import com.tvd12.master_design_patterns.request.AddCategoryRequest;
import com.tvd12.master_design_patterns.response.AddCategoryResponse;
import com.tvd12.master_design_patterns.service.CategoryService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.tvd12.ezyfox.io.EzyStrings.isBlank;

@Controller("/api/v1")
public class ApiCategoryController {

    private final BookApplication bookApplication =
        BookApplication.getInstance();
    private final CategoryRepository categoryRepository =
        bookApplication
            .getDatabaseContext()
            .getRepository(Category.class);
    private final CategoryService categoryService =
        bookApplication
            .getServiceProvider()
            .getService(CategoryService.class);

    @DoGet("/categories")
    public List<Category> getCategories() throws Exception {
        return categoryRepository.findAll();
    }

    @DoGet("/categories/{categoryId}")
    public CategoryModel getCategoryById(
        @PathVariable long categoryId
    ) throws Exception {
        return categoryService.getCategoryById(
            categoryId
        );
    }

    @DoPost("/categories/add")
    public ResponseEntity addCategory(
        @RequestBody AddCategoryRequest request
    ) {
        return new ChainOfResponsibility()
            .addFirstVoidHandler(() -> {
                final Map<String, String> errors = new HashMap<>();
                if (isBlank(request.getCategoryName())) {
                    errors.put("categoryName", "required");
                }
                if (!errors.isEmpty()) {
                    throw new HttpBadRequestException(errors);
                }
            })
            .addFirstHandle(() -> {
                final long categoryId = bookApplication
                    .getAdapterProvider()
                    .getAdapter(CategoryDataServiceToCategoryRepositoryAdapter.class)
                    .saveModel(new AddCategoryModel(request.getCategoryName()));
                return new AddCategoryResponse(categoryId);
            })
            .handle();
    }
}