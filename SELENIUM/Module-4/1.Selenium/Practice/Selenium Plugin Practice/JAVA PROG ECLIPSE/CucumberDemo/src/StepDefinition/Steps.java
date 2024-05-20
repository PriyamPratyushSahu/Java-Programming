package StepDefinition;

//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
import io.cucumber.java.en_lol.WEN;
import io.cucumber.java.en_old.Tha;
import io.cucumber.java.nl.Gegeven;

public class Steps 
{
	@Gegeven("^I am on HotelApp Login page$")
	public void i_am_on_HotelApp_Login_page() throws Throwable
	{
		System.out.println("I am in given annotation");
	}
	@WEN("^User enters username$")
	public void user_enters_username() throws Throwable
	{
		System.out.println("I am in the first when annotation");
	}
	@WEN("^User enters password$")
	public void user_enters_password() throws Throwable
	{
		System.out.println("I am in the second when annotation");
	}
	@WEN("^User clicks Login button$")
	public void User_clicks_Login_button() throws Throwable
	{
		System.out.println("I am in the third when annotation");
	}
	@Tha("^User gets Login succeesful$")
	public void User_gets_Login_succeesful() throws Throwable
	{
		System.out.println("I am in then annotation");
	}
}
