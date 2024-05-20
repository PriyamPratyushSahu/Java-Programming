package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class HotelAppLogin {
  
	WebDriver driver;
	@Test
  @Parameters({"username","password"})
  public void Login(String username,String password) 
  {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\ANUSMITA SARKAR\\Documents\\Selenium drivers\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
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
