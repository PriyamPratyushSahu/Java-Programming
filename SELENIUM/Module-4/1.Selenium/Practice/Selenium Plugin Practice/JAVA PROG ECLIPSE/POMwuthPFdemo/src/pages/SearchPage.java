package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class SearchPage {
  
	WebDriver driver;
	public SearchPage(WebDriver driver)
	{
		this.driver=driver;
	}
	public void setLocation(String location)
	{
		Select loc = new Select(driver.findElement(By.id("location")));
		loc.selectByVisibleText(location);
	}
	public void setHotels(String name)
	{
		Select hot = new Select(driver.findElement(By.id("hotels")));
		hot.selectByVisibleText(name);
	}
	public void setRoomType(String type)
	{
		Select room = new Select(driver.findElement(By.id("room_type")));
		room.selectByVisibleText(type);
	}
	public void clickSearch()
	{
		driver.findElement(By.xpath("//input[@id='Submit']")).click();

	}
	public void searchPage(String location,String name,String type)
	{
		this.setLocation(location);
		this.setHotels(name);
		this.setRoomType(type);
		this.clickSearch();
	}
	@Test
  public void f() {
  }
  
  
}