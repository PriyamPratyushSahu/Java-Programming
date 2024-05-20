package test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class POIDemo {

	public static void main(String[] args) throws IOException 
	{
		File f=new File(".\\datasource\\data.xlsx");
		FileInputStream is=new FileInputStream(f);
		XSSFWorkbook w=new XSSFWorkbook(is);
		//		HSSFWorkbook w=new HSSFWorkbook(is); - for xls format
		XSSFSheet sheet= w.getSheetAt(0);
		String username=sheet.getRow(1).getCell(0).getStringCellValue();
		String password=sheet.getRow(1).getCell(1).getStringCellValue();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ANUSMITA SARKAR\\Documents\\Selenium drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://www.adactinhotelapp.com");
		WebElement uname=driver.findElement(By.id("username"));
		uname.clear();
		uname.sendKeys(username);
		WebElement pwd=driver.findElement(By.id("password"));
		pwd.clear();
		pwd.sendKeys(password);
		driver.findElement(By.id("login")).click();
	}

}
