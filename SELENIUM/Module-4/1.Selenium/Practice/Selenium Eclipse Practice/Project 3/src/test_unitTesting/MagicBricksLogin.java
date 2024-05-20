package test_unitTesting;

import org.openqa.selenium.*;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.junit.*;

public class MagicBricksLogin {
	
	public static WebDriver driver;
	@Before
	public void kuchVi()
	{System.out.println("Navigates to the site");
	System.setProperty("webdriver.chrome.driver","E:\\Capgemini_Training\\Modules\\Module-4\\Drivers\\chromedriver_win32\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.navigate().to("https://www.magicbricks.com/");
	driver.manage().window().maximize();
//	try {
//		Thread.sleep(5000);
//	} catch (InterruptedException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
	}
	
	@Test
	public void Test()
	{
		 System.out.println("Enter phone number and continue");
		 try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		 WebElement login = driver.findElement(By.xpath("//a[@class='mb-header__main__link js-menu-link active']"));
//		 Actions actions = new Actions(driver);
//		 actions.moveToElement(login);
//		 //login.click();
//		 driver.findElement(By.xpath("//a[@class='mb-login__drop-cta']")).click();
		
		 
		 
	}
	
	@After
	public void afterTest()
	{
	//	driver.quit();
		System.out.println("Test run complete");
	}

}
