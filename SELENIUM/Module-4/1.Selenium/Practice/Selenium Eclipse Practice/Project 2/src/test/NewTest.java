package test;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class NewTest {
	WebDriver driver;
	String ExpTitle="Adactin.com - Book A Hotel";

	@Test(priority = 2)
  public void f() throws InterruptedException {
		WebElement uName = driver.findElement(By.id("username"));
		uName.clear();
		uName.sendKeys("Priyam3232");
		WebElement pwd = driver.findElement(By.id("password"));
		pwd.clear();
		pwd.sendKeys("0D0C55");
		
		driver.findElement(By.xpath("//input[@id='login']")).click();
		Thread.sleep(5000);
		List<WebElement> listElement = driver.findElements(By.id("location"));
		for(int i =0;i<listElement.size();i++) {
		 String elementText = listElement.get(i).getText(); 
		 System.out.println(elementText); 
		 //Thread.sleep(5000);
		
		Select loc = new Select(driver.findElement(By.id("location")));
		loc.selectByVisibleText("London");
		Select hot = new Select(driver.findElement(By.id("hotels")));
		hot.selectByVisibleText("Hotel Creek");
		Select room = new Select(driver.findElement(By.id("room_type")));
		room.selectByVisibleText("Standard");
		
		driver.findElement(By.xpath("//input[@id='Submit']")).click();
		
		driver.findElement(By.xpath("//input[@id='radiobutton_0']")).click();
		
		driver.findElement(By.xpath("//input[@id='continue']")).click();
		
		WebElement name = driver.findElement(By.id("first_name"));
		
		name.sendKeys("ABC");
		
		WebElement lname = driver.findElement(By.id("last_name"));
		
		lname.sendKeys("XYZ");
		
		WebElement add = driver.findElement(By.id("address"));
		
		add.sendKeys("Pune");
		
		WebElement card = driver.findElement(By.id("cc_num"));
		
		card.sendKeys("1234567898745632");
		
		Select type = new Select(driver.findElement(By.id("cc_type")));
		type.selectByVisibleText("VISA");
		
		Select mon = new Select(driver.findElement(By.id("cc_exp_month")));
		mon.selectByVisibleText("May");
		
		Select year = new Select(driver.findElement(By.id("cc_exp_year")));
		year.selectByVisibleText("2022");
		
		WebElement cvv = driver.findElement(By.id("cc_cvv"));
		
		cvv.sendKeys("123");
		
		driver.findElement(By.xpath("//input[@id='book_now']")).click();
		String actTitle=driver.getTitle();
		AssertJUnit.assertEquals(ExpTitle,actTitle);
		}
  }
	@Test(priority = 1)
	public void testHotelApp()
	{
		driver.findElement(By.id("username")).sendKeys("Priyam3232");
		driver.findElement(By.id("password")).sendKeys("0D0C55");
		driver.findElement(By.id("login")).click();
		AssertJUnit.assertTrue(driver.findElement(By.id("location")).isDisplayed());
	}
  @BeforeMethod
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","E:\\Capgemini_Training\\Modules\\Module-4\\Drivers\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.navigate().to("http://www.adactinhotelapp.com");
  }

  @AfterMethod
  public void afterTest() {
	 driver.quit();
  }

}
