package stepDefinations;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;

import org.common.Config;
import org.junit.Assert;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

@RunWith(Cucumber.class)
public class switchAccounts {

    @Given("^when user is on home page$")
    public void when_user_is_on_home_page() throws Throwable {
    	Config.launchBrowser();
    	Config.goToUrl();
    }

    @When("^enters the username and password$")
    public void enters_the_username_and_password() throws Throwable {
    	Config.getDriver().findElement(By.xpath("//input[@placeholder='Email Address']")).sendKeys("harishr@dckap.com");
		Config.getDriver().findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Newuser123!");
		Config.getDriver().findElement(By.xpath("//button[@type='submit']")).click();  
		
		
    }

    @Then("^Click switch accounts and select another account$")
    public void account_is_switched() throws Throwable {
    	
    	Thread.sleep(3000);
    	Config.getDriver().findElement(By.xpath("//span[@class='account_info']")).click();
    	
    }

    @And("^Account is switched$")
    public void click_switch_accounts_and_select_another_account() throws Throwable {
    	Thread.sleep(  2000);
    	Config.getDriver().findElement(By.xpath("//div[normalize-space()='Brighty J']")).click();
    	Config.getDriver().findElement(By.xpath("//button[normalize-space()='Switch']")).click();
    	Thread.sleep(2000);
        WebElement isElementDisplayed4 = Config.getDriver().findElement(By.xpath("//span[normalize-space()='Testing 3.3.3']"));
        Assert.assertEquals(true, isElementDisplayed4.isDisplayed());
        Config.getDriver().close();
      
    }
  
}