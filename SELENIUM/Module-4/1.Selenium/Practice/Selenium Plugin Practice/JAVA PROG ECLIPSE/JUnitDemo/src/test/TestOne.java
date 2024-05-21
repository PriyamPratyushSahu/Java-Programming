package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
//import org.junit.FixMethodOrder;


public class TestOne 
{
	WebDriver driver;
	String ExpTitle="Adactin.com - Book A Hotel";
	@Before
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ANUSMITA SARKAR\\Documents\\Selenium drivers\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.navigate().to("http://www.adactinhotelapp.com");
		//driver.manage();
	}
	
	@Test
	public void testOne() throws InterruptedException
	{
		/*String title=driver.getTitle();
		String url=driver.getCurrentUrl();
		boolean test=driver.getPageSource().contains(title);
		
		//Assert.assertEquals(ExpTitle,title);
		WebElement uName=driver.findElement(By.id("username"));
		uName.clear();
		uName.sendKeys("Anu56789");
		WebElement pwd=driver.findElement(By.name("password"));
		pwd.sendKeys("Anus@345");
		
		driver.findElement(By.xpath("//input[@id='login']")).click();
		driver.findElement(By.linkText("Booked Itinerary")).click();
		Thread.sleep(3000);
		driver.navigate().back();
		Select loc=new Select(driver.findElement(By.id("location")));
		loc.selectByVisibleText("London");*/
		WebElement uName = driver.findElement(By.id("username"));
		uName.clear();
		uName.sendKeys("Anu56789");
		WebElement pwd = driver.findElement(By.id("password"));
		pwd.clear();
		pwd.sendKeys("Anus@345");
		
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
		assertEquals(ExpTitle,actTitle);
		}
	}
	@Test
	//@Order(2)
	public void testHotelApp()
	{
		driver.findElement(By.id("username")).sendKeys("Anu56789");
		driver.findElement(By.id("password")).sendKeys("Anus@345");
		driver.findElement(By.id("login")).click();
		assertTrue(driver.findElement(By.id("location")).isDisplayed());
	}
	
	@After
	public void tearDown()
	{
		driver.quit();
	}
	

}