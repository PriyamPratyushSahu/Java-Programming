package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.HotelAppLoginPage;
import pages.SearchPage;

public class LoginTest {
  WebDriver driver;
	@Test
  public void f() {
  }
  @Test
	public void testHotelAppLogin()
	{
		HotelAppLoginPage hp=new HotelAppLoginPage(driver);
		hp.LoginToHotelApp("Anu56789", "Anus@345");
		SearchPage sp=new SearchPage(driver);
		sp.searchPage("Sydney", "Hotel Creek", "Standard");
	}
  @BeforeTest
  public void before()
  {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\ANUSMITA SARKAR\\Documents\\Selenium drivers\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.navigate().to("http://www.adactinhotelapp.com");
  }
  @AfterTest
  public void after()
  {
	  driver.close();
  }
}
