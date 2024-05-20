package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class HotelAppLogin1 {
	@DataProvider(name="testdata")
	public Object[][] getData()
	{
		Object[][] data=new Object[2][2];
		data[0][0]="Anu56789";
		data[0][1]="Anus@345";
		data[1][0]="Deepak2510";
		data[1][1]="Deepak@2000";
		return data;

	}
	@Test(dataProvider = "testdata")
  public void test(String username,String password) 
	{
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
