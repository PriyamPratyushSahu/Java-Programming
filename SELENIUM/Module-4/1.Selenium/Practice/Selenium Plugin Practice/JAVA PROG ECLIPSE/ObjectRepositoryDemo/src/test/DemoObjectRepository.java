package test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.io.SAXReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoObjectRepository {
	public static void main(String args[]) throws FileNotFoundException, DocumentException
	{
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ANUSMITA SARKAR\\Documents\\Selenium drivers\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.navigate().to("http://www.adactinhotelapp.com");
		driver.manage().window().maximize();
		Properties prop=new Properties();
		//FileInputStream fs=new FileInputStream("C:\\Users\\ANUSMITA SARKAR\\Documents\\CAPGEMINI CW\\JAVA PROG ECLIPSE\\ObjectRepositoryDemo\\HotelApp.properties");
		File f=new File("C:\\Users\\ANUSMITA SARKAR\\Documents\\CAPGEMINI CW\\JAVA PROG ECLIPSE\\ObjectRepositoryDemo\\properties.xml");
		//FileInputStream fs=new FileInputStream("C:\\Users\\ANUSMITA SARKAR\\Documents\\CAPGEMINI CW\\JAVA PROG ECLIPSE\\ObjectRepositoryDemo\\HotelApp.properties");
		SAXReader sr=new SAXReader();
		Document d=sr.read(f);
		/*try {
			prop.load(fs);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		String uname=d.selectSingleNode("//menu//uname").getText();
		String pass=d.selectSingleNode("//menu//pass").getText();
		String login=d.selectSingleNode("//menu//login").getText();


		driver.findElement(By.id(uname)).sendKeys("Anu56789");
		driver.findElement(By.id(pass)).sendKeys("Anus@345");
		driver.findElement(By.id(login)).click();
		
		
	}
}
