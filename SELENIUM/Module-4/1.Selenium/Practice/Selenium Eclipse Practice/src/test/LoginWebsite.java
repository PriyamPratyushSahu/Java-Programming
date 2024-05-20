package test;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginWebsite {

	public static WebDriver driver;
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","E:\\Capgemini_Training\\Modules\\Module-4\\Drivers\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://adactinhotelapp.com/");
		
		String title = driver.getTitle();
		String url = driver.getCurrentUrl();
		boolean test = driver.getPageSource().contains(title);
		
		WebElement uName = driver.findElement(By.id("username"));
		//WebElement uName = driver.findElement(By.xpath("//input[@id='username']"));
		
		uName.clear();
		uName.sendKeys("Priyam3232");
		
		WebElement password = driver.findElement(By.id("password"));
		//WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
		password.clear();
		password.sendKeys("0D0C55");
		
		driver.findElement(By.id("login")).click();
		
		
		
		

	}

}
