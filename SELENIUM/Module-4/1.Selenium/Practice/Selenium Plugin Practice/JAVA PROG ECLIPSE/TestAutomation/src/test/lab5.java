package test;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class lab5 {
	public static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ANUSMITA SARKAR\\Documents\\Selenium drivers\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demo.opencart.com/");
		String title=driver.getTitle();
		 
		if(title.equals("Your Store")) {
			System.out.println("Title is Verified");
		}
		else {
			System.out.println("Title is not correct");
		}
		
		driver.findElement(By.xpath("//i[@class='fa fa-user']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Register']")).click();
		driver.findElement(By.xpath("//input[@value='Continue']")).click();
		String privacy=driver.findElement(By.xpath("//div[@class='alert alert-danger alert-dismissible']")).getText();
		if(privacy.equals("Warning: You must agree to the Privacy Policy!")) {
			System.out.println("Privacy Policy error shown correctly");
		}
		else {
			System.out.println("Privacy policy error not shown");
		}
		driver.findElement(By.xpath("//*[@id=\"input-firstname\"]")).sendKeys("Anusmita");
		
		driver.findElement(By.xpath("//input[@name='agree']")).click();
		String fname_err=driver.findElement(By.xpath("//div[contains(text(),'First Name must be between 1 and 32 characters!')]")).getText();
		if(fname_err.equals("First Name must be between 1 and 32 characters!")) {
			System.out.println("First Name error shown correctly");
		}
		else {
			System.out.println("First Name error not shown");
		}

		driver.findElement(By.xpath("//input[@value='Continue']")).click();
		driver.findElement(By.xpath("//input[@id='input-lastname']")).sendKeys("Sarkarrr");
		
		String lname_err=driver.findElement(By.xpath("//div[contains(text(),'Last Name must be between 1 and 32 characters!')]")).getText();
		if(lname_err.equals("Last Name must be between 1 and 32 characters!")) {
			System.out.println("Last Name error shown correctly");
		}
		else {
			System.out.println("Last Name error not shown");
		}
		driver.findElement(By.xpath("//input[@value='Continue']")).click();
		driver.findElement(By.xpath("//input[@id='input-lastname']")).clear();
		driver.findElement(By.xpath("//input[@id='input-lastname']")).sendKeys("Sarkar");
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys("fiji4059@ishop2k.com");
		driver.findElement(By.xpath("//input[@id='input-telephone']")).sendKeys("76788756454");
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("anu667");
		driver.findElement(By.xpath("//input[@id='input-confirm']")).sendKeys("anu667");
		driver.findElement(By.xpath("//*[@id=\"content\"]/form/fieldset[3]/div/div/label[1]/input")).click();
		driver.findElement(By.xpath("//input[@value='Continue']")).click();
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/a")).click();
		driver.findElement(By.xpath("//*[@id=\"content\"]/ul[2]/li[1]/a")).click();

		
	}

}

