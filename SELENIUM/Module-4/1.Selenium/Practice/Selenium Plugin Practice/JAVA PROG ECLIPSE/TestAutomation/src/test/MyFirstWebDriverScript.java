package test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

//import net.jodah.failsafe.internal.util.Assert;
public class MyFirstWebDriverScript {

	public static WebDriver driver;
	static String ExpTitle="HotelApp";
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ANUSMITA SARKAR\\Documents\\Selenium drivers\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		//driver.get("http://www.adactinhotelapp.com");
		driver.navigate().to("http://www.adactinhotelapp.com");
		//driver.navigate().to("https://www.google.com");
		//driver.navigate().back();
		////driver.navigate().refresh();
		
		//driver.close();
		String title=driver.getTitle();
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
		loc.selectByVisibleText("London");
		//new Select(driver.findElement(By.id("location"))).selectByIndex(1);
		Thread.sleep(5000);

		driver.quit();
	}

}
