package test;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestingOwnForm {
	
	public static WebDriver driver;

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","E:\\Capgemini_Training\\Modules\\Module-4\\Drivers\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("file:///E:/Capgemini_Training/Modules/Module-1/Lab%20Solutions/HTML/Lab6.html");
		
		WebElement Name = driver.findElement(By.id("nametxt"));
		Name.clear();
		Name.sendKeys("Priyam Pratyush Sahu");
		
		WebElement empcode = driver.findElement(By.id("empcode"));
		empcode.clear();
		empcode.sendKeys("Priysahu");
		
		WebElement dept = driver.findElement(By.id("Technical"));
		dept.click();
		
		Select day = new Select(driver.findElement(By.id("Day")));
		day.selectByIndex(4);
		
		Select Month = new Select(driver.findElement(By.id("Month")));
		Month.selectByIndex(6);
		
		Select Year = new Select(driver.findElement(By.id("Year")));
		Year.selectByIndex(22);
		
		WebElement address = driver.findElement(By.id("multi_line"));
		address.sendKeys("Plot No: 367/21\nBehind HDFC Bank");
		
		WebElement training_program_1 = driver.findElement(By.id("HTML"));
		training_program_1.click();
		WebElement training_program_2 = driver.findElement(By.id("Java"));
		training_program_2.click();
		
		Select attend_training_prgram = new Select(driver.findElement(By.id("Program")));
		attend_training_prgram.selectByIndex(1);
		
		WebElement Submit = driver.findElement(By.id("Submitform"));
		Submit.click();
		
		
		
//		WebElement password = driver.findElement(By.id("password"));
//		//WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
//		password.clear();
//		password.sendKeys("0D0C55");
	}

}
	
		
		
		/* ******************************** Example 1 **********************************/
		//
		
		
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
		
		
		
		