package test;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestOne 
{
	public static WebDriver driver;
	String expTitle = "Adactin.com - Book A Hotel";
	
	@Before
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver","E:\\Capgemini_Training\\Modules\\Module-4\\Drivers\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.adactinhotelapp.com");
	}
	
	@Test
	public void testTestOne()
	{
		String title = driver.getTitle();
		WebElement uName = driver.findElement(By.id("username"));
		uName.clear();
		uName.sendKeys("Priyam3232");
		WebElement pwd = driver.findElement(By.name("password"));
		pwd.clear();
		pwd.sendKeys("0D0C55");
		driver.findElement(By.xpath("//input[@id='login']")).click();
		driver.findElement(By.linkText("Booked Itinerary")).click();
		driver.navigate().back();
		
		Select loc = new Select(driver.findElement(By.id("location")));
		List<WebElement> options = loc.getOptions();
		loc.selectByVisibleText("London");
		new Select(driver.findElement(By.id("hotels"))).selectByIndex(2);
		new Select(driver.findElement(By.id("room_type"))).selectByIndex(1);
		driver.findElement(By.name("datepick_in")).clear();
		driver.findElement(By.name("datepick_in")).sendKeys("03/03/2022");
		driver.findElement(By.name("datepick_out")).clear();
		driver.findElement(By.name("datepick_out")).sendKeys("08/03/2022");
		driver.findElement(By.name("Submit")).click();
		driver.findElement(By.id("radiobutton_0")).click();
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.id("first_name")).sendKeys("Abcd");
		driver.findElement(By.id("last_name")).sendKeys("Fgh");
		driver.findElement(By.id("address")).sendKeys("jgjbmmn");
		driver.findElement(By.id("cc_num")).sendKeys("1212121212121212");
		new Select(driver.findElement(By.id("cc_type"))).selectByVisibleText("American Express");
		new Select(driver.findElement(By.id("cc_exp_month"))).selectByVisibleText("March");
		new Select(driver.findElement(By.id("cc_exp_year"))).selectByVisibleText("2022");
		driver.findElement(By.id("cc_cvv")).sendKeys("438");
		driver.findElement(By.id("book_now")).click();	
		String actTitle = driver.getTitle();
		assertEquals(expTitle,actTitle);
	}
	
	@Test
	//@Order(2)
	public void testHotelApp()
	{
		WebElement uName = driver.findElement(By.id("username"));
		uName.clear();
		uName.sendKeys("Priyam3232");
		WebElement pwd = driver.findElement(By.name("password"));
		pwd.clear();
		pwd.sendKeys("0D0C55");
		driver.findElement(By.xpath("//input[@id='login']")).click();
		assertTrue(driver.findElement(By.id("location")).isDisplayed());
	}
	
	@After
	public void tearDown()
	{
		driver.quit();
	}
}

