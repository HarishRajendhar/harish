package stepDefinations;



import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;

import org.common.Config; 
import org.junit.runner.RunWith;
import org.openqa.selenium.By;

@RunWith(Cucumber.class)
public class LoginPage{
	
	
	@Given("^Initialize the browser with chrome$")
	public void initialize_the_browser_with_chrome() throws Throwable {
	    Config.launchBrowser();
	   
	}

	@And("^Navigate to home page$")
	public void navigate_to_home_page() throws Throwable {
	   Config.goToUrl();
	    
	}


	@When("^User enters Username and Password and logs in$")
	public void user_enters_username_and_password_and_logs_in() throws Throwable {
		Config.getDriver().findElement(By.xpath("//input[@placeholder='Email Address']")).sendKeys("harishr@dckap.com");
		Config.getDriver().findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Newuser123!");
		
	   
	}

	@Then("^Verify that user is succesfully logged in$")
	public void verify_that_user_is_succesfully_logged_in() throws Throwable {
	    
		Config.getDriver().findElement(By.xpath("//button[@type='submit']")).click(); 
		Config.getDriver().close();
		
	}

    
}