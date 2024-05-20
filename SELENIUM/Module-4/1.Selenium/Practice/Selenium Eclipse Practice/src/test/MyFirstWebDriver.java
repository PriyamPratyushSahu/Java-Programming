package test;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyFirstWebDriver {
	
	public static WebDriver driver;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\Capgemini_Training\\Modules\\Module-4\\Drivers\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		
		/* ******************************** Example 1 **********************************/
		//driver.get("http://adactinhotelapp.com");
		
		
		/* ******************************** Example 2 **********************************/
		
//		driver.navigate().to("http://adactinhotelapp.com");
//		driver.navigate().to("http://google.com");
//		driver.navigate().back();
//		driver.close();
		
		
		/* ******************************** Example 3 **********************************/
		
//		driver.get("https://www.google.com/");
//		WebElement element = driver.findElement(By.name("q"));
//		element.sendKeys("Priyam Pratyush Sahu");
//		element.submit();
//		System.out.println("Page Title is: "+ driver.getTitle());
//		//driver.quit();
		
		
		
		driver.get("https://www.google.com/");																				
        driver.findElement(By.linkText("//div[@class='FPdoLc lJ9FBc']//input[@name='btnI']")).click();					
        System.out.println("title of page is: " + driver);							
        driver.quit();	
		
		

	}

}
