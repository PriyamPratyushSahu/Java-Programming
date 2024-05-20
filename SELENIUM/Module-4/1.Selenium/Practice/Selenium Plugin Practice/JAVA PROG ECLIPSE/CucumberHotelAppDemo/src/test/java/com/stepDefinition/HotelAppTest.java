package com.stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HotelAppTest 
{
	public static WebDriver driver;
	@Given("I am on HotelApp Login page")
	public void i_am_on_hotel_app_login_page() 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ANUSMITA SARKAR\\Documents\\Selenium drivers\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.navigate().to("http://www.adactinhotelapp.com");
		//System.out.println("inside given block");
	}

	@When("User enters username")
	public void user_enters_username() {
		  driver.findElement(By.id("username")).sendKeys("Anu56789");

		//System.out.println("inside when block 1");
	}

	@When("User enters password")
	public void user_enters_password() {
		  driver.findElement(By.id("password")).sendKeys("Anus@345");

		//System.out.println("inside when block 2");

	}

	@When("User clicks Login button")
	public void user_clicks_login_button() {
		//System.out.println("inside when block 3");
		driver.findElement(By.id("login")).click();

	}

	@Then("User gets Login succeesful")
	public void user_gets_login_succeesful() {
		driver.quit();
		//System.out.println("inside then block");

	}
}
