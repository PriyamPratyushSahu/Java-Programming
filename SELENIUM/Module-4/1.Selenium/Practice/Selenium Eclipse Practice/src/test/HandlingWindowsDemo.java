package test;

import java.util.Set;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWindowsDemo 
{
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","E:\\Capgemini_Training\\Modules\\Module-4\\Drivers\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/popup.php");
		driver.manage().window().maximize();
		
		String MainWindow = driver.getWindowHandle();
		System.out.println("MW : "+MainWindow);
		driver.findElement(By.xpath("//a[normalize-space()='Click Here']")).click();
		
		Set<String> l1 = driver.getWindowHandles();
		System.out.println(l1);
		Iterator<String> it1 = l1.iterator();
		
		while(it1.hasNext())
		{
			String ChildWindow = it1.next();
			System.out.println("CW : "+ChildWindow);
			if(!MainWindow.equalsIgnoreCase(ChildWindow))
			{
				driver.switchTo().window(ChildWindow);
				driver.findElement(By.xpath("//input[@name='emailid']")).sendKeys("abcd@gmail.com");
				driver.findElement(By.xpath("//input[@name='btnLogin']")).click();
				Thread.sleep(3000);
				driver.close();
			}
		}
		driver.switchTo().window(MainWindow);
	}
}
