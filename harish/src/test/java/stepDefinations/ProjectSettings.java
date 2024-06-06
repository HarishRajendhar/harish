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
public class ProjectSettings {

    @Given("^login to the dashboard page$")
    public void login_to_the_dashboard_page() throws Throwable {
    	Config.launchBrowser();
    	Config.goToUrl();
    }

    @When("^Navigate to Advanced icon and proceed to project settings to change few settings$")
    public void navigate_to_advanced_icon_and_proceed_to_project_settings_to_change_few_settings() throws Throwable {
        
    	Config.loginUser();
    	Thread.sleep(2000);
    	Config.getDriver().findElement(By.xpath("//div[@class='col-sm-4 p-0']//div[2]//span[2]//a[1]")).click();
		Config.getDriver().findElement(By.xpath("//li[@id='project-settings']//a[@class='nav-link nav_tooltip']")).click();
    	
    }

    @When("^make needed changes$")
    public void make_needed_changes() throws Throwable {
    	
  
//    	Config.getDriver().findElement(By.xpath("//*[contains(text(), 'Pipes Reprocessing')]//parent::div//*[@class='css-1wy0on6']")).click();
//    	Config.getDriver().findElement(By.xpath("//*[@id='react-select-3-option-']")).click();
    	 
    	Config.getDriver().findElement(By.xpath("//*[contains(text(), 'Enable Activity Logs')]//parent::div//*[@class='css-1wy0on6']")).click();
    	Config.getDriver().findElement(By.xpath("//*[@id='react-select-5-option-']")).click();
    	
    	Config.getDriver().findElement(By.xpath("//*[contains(text(), 'Enable Console Logs')]//parent::div//*[@class='css-1wy0on6']")).click();
    	Config.getDriver().findElement(By.xpath("//*[@id='react-select-6-option-']")).click();
    
    
    }

    @Then("^changed setting should be reflected$")
    public void changed_setting_should_be_reflected() throws Throwable {
    	Config.getDriver().close();
    }
  
  
    
    
}