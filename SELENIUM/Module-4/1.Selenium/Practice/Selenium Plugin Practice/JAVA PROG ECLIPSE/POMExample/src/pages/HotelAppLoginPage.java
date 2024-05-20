package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HotelAppLoginPage {
  
	WebDriver driver;
	public HotelAppLoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	@Test
  public void setUsername(String username) 
	{
	  driver.findElement(By.id("username")).sendKeys("Anu56789");
  }
	public void setPassword(String password) 
	{
	  driver.findElement(By.id("password")).sendKeys("Anus@345");
  }
	public void clickLogin()
	{
		driver.findElement(By.id("login")).click();
	}
	public void LoginToHotelApp(String username,String password)
	{
		this.setUsername(username);
		this.setPassword(password);
		this.clickLogin();
	}
	@BeforeTest
	public void beforeTest()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ANUSMITA SARKAR\\Documents\\Selenium drivers\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.navigate().to("http://www.adactinhotelapp.com");
	}
}
