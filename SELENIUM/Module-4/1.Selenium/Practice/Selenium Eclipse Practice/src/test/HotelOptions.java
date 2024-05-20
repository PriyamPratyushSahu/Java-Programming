package test;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
//import net.jodah.failsafe.internal.util.Assert;

public class HotelOptions {

	public static WebDriver driver;	
			
			public static void main(String[] args) throws InterruptedException 
			{
				System.setProperty("webdriver.chrome.driver","E:\\Capgemini_Training\\Modules\\Module-4\\Drivers\\chromedriver_win32\\chromedriver.exe");
				driver = new ChromeDriver();
//				driver.get("http://www.adactinhotelapp.com");
				driver.navigate().to("http://www.adactinhotelapp.com");
//				driver.navigate().to("http://www.google.com");
//				driver.navigate().back();
//				driver.navigate().forward();
//				driver.navigate().refresh();
//				driver.close();
				String title = driver.getTitle();
				System.out.println(title);
				String url = driver.getCurrentUrl();
				boolean test = driver.getPageSource().contains(title);
				
				WebElement uName = driver.findElement(By.id("username"));
				uName.clear();
				uName.sendKeys("Priyam3232");
				WebElement pwd = driver.findElement(By.name("password"));
				pwd.clear();
				pwd.sendKeys("0D0C55");
				driver.findElement(By.xpath("//input[@id='login']")).click();
				
				driver.findElement(By.linkText("Booked Itinerary")).click();
				Thread.sleep(3000);
				driver.navigate().back();
				
				Select loc = new Select(driver.findElement(By.id("location")));
				List<WebElement> options = loc.getOptions();
				for(WebElement option : options)
				{
					System.out.println(option.getText());
				}
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
				driver.quit();
			}


	}
