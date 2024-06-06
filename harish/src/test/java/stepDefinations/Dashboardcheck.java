package stepDefinations;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import cucumber.runtime.junit.Assertions;

import static org.junit.Assert.assertEquals;

import org.common.Config;
import org.junit.Assert;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

@RunWith(Cucumber.class)
public class Dashboardcheck {

    @Given("^Initializing the driver$")
    public void initializing_the_driver() throws Throwable {
    	Config.launchBrowser();
    }

    @When("^Navigate to home login page$")
    public void navigate_to_home_login_page() throws Throwable {
    	Config.goToUrl();
//    	String ActualTitle= Config.getDriver().getTitle();
//    	String ExpectedTitle= "Login | DCKAP Integrator";
//    	assertEquals(ActualTitle, ExpectedTitle);   	
    }

    @Then("^User enters Username and Password$")
    public void user_enters_username_and_password() throws Throwable {
    	
	
    	Config.getDriver().findElement(By.xpath("//input[@placeholder='Email Address']")).sendKeys("harishr@dckap.com");
		Config.getDriver().findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Newuser123!");
		Config.getDriver().findElement(By.xpath("//button[@type='submit']")).click(); 
		Thread.sleep(3000);
		WebElement isElementDisplayed = Config.getDriver().findElement(By.xpath("//h2[@class='cls-main-title']"));
        Assert.assertEquals(true, isElementDisplayed.isDisplayed());
 }
  
    @And("^Verify all fields in dashboard page is displayed$")
     public void verify_all_fields_in_dashboard_page_is_displayed() throws Throwable {
    	Thread.sleep(2000);
        WebElement isElementDisplayed1 = Config.getDriver().findElement(By.xpath("//span[normalize-space()='Total Records Processed']"));
        Assert.assertEquals(true, isElementDisplayed1.isDisplayed());
        WebElement isElementDisplayed2 = Config.getDriver().findElement(By.xpath("//span[normalize-space()='Success Rate']"));
        Assert.assertEquals(true, isElementDisplayed2.isDisplayed());
        WebElement isElementDisplayed3 = Config.getDriver().findElement(By.xpath("//span[normalize-space()='New Customers']"));
        Assert.assertEquals(true, isElementDisplayed3.isDisplayed());
        WebElement isElementDisplayed4 = Config.getDriver().findElement(By.xpath("//span[normalize-space()='New Orders']"));
        Assert.assertEquals(true, isElementDisplayed4.isDisplayed());
        Config.getDriver().close();
    }

}