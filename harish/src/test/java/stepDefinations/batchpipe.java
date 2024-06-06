package stepDefinations;



import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.junit.Cucumber;

import org.common.Config;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;

@RunWith(Cucumber.class)
public class batchpipe {

	@Given("^land and login the home page$")
    public void land_and_login_the_home_page() throws Throwable {
		Config.launchBrowser();
    	Config.goToUrl();
    	Config.getDriver().findElement(By.xpath("//input[@placeholder='Email Address']")).sendKeys("harishr@dckap.com");
    	Config.getDriver().findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Newuser123!");
    	Config.getDriver().findElement(By.xpath("//button[@type='submit']")).click();  
    }

    @When("^navigate to a particular project and navigate to particular pipe$")
    public void navigate_to_a_particular_project_and_navigate_to_particular_pipe() throws Throwable {
    	Thread.sleep(2000);
    	Config.getDriver().findElement(By.xpath("//div[@id='merchant-dashboard']//div[3]//span[2]//a[1]")).click();	
    
    }

    @Then("^click sync now for a batch pipe$")
    public void click_sync_now_for_a_batch_pipe() throws Throwable {
    	Thread.sleep(3000);
    	Config.getDriver().findElement(By.xpath("//div[@class='clo-grid-body wrap']//div[2]//div[6]//div[1]//div[2]//div[1]//a[1]")).click();	
    }
}