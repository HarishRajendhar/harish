package stepDefinations;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.junit.Cucumber;

import org.common.Config;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;

@RunWith(Cucumber.class)
public class Signout {

    @Given("^home page landing$")
    public void home_page_landing() throws Throwable {
    	Config.launchBrowser();
    }

    @When("^assertion on home page landing$")
    public void assertion_on_home_page_landing() throws Throwable {
    	Config.goToUrl();
    	Config.getDriver().findElement(By.xpath("//input[@placeholder='Email Address']")).sendKeys("harishr@dckap.com");
		Config.getDriver().findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Newuser123!");
		Config.getDriver().findElement(By.xpath("//button[@type='submit']")).click(); 
		
    }

    @Then("^logout and check if user is succesfully logout$")
    public void logout_and_check_if_user_is_succesfully_logout() throws Throwable {
    	Thread.sleep(2000); 
    	
    	Config.getDriver().findElement(By.xpath("//img[@alt='User profile']")).click();
    	Config.getDriver().findElement(By.xpath("//*[text()='Signout']")).click();
    	
    }
 
}