package stepDefinations;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.junit.Cucumber;

import org.common.Config;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;

@RunWith(Cucumber.class)
public class dynamicbatch {

    @Given("^land and login the home page to proceed$")
    public void login_to_integrator() throws Throwable {
    	Config.launchBrowser();
    	Config.goToUrl();

    }

    @When("^navigate to a project settings and do essentials$")
    public void add_scheduler_for_any_pipe_using_cron_scheduler() throws Throwable {
    	Config.getDriver().findElement(By.xpath("//input[@placeholder='Email Address']")).sendKeys("harishr@dckap.com");
    	Config.getDriver().findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Newuser123!");
		Config.getDriver().findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		Config.getDriver().findElement(By.xpath("//div[@id='merchant-dashboard']//div[3]//span[2]//a[1]")).click();
		
		
		
		
    }

    @Then("^check the dynamic sync$")
    public void sync_for_pipe_should_happen_automatically() throws Throwable {
    	Thread.sleep(2000);
  	Config.getDriver().findElement(By.xpath("//div[@class='clo-grid-body wrap']//div[2]//div[5]//div[1]//div[2]//div[1]//a[1]//div[1]//div[1]")).click();
   	Thread.sleep(2000);
  	Config.getDriver().findElement(By.xpath("//button[normalize-space()='Yes, I am sure']")).click();
  	
  	
//    	Config.getDriver().findElement(By.xpath("//input[@value='including_min']")).click();
  	
  	
  	
 // 	/html[1]/body[1]/section[1]/div[1]/main[1]/div[1]/div[4]/div[1]/div[1]/div[4]/div[1]/div[1]/div[2]/div[2]/div[6]/div[1]/div[2]/div[1]/a[1]
  	
  		
  	
  	
  	
  	
  	
//     	Config.getDriver().findElement(By.xpath("//button[@class='btn btn-default cls-save']")).click();
//     	Thread.sleep(1000);
//     	Config.getDriver().findElement(By.xpath("//div[@class='ant-drawer ant-drawer-right ant-drawer-open cron__drawer']//i[@aria-label='icon: close']//*[name()='svg']")).click();

     	//Config.getDriver().close();
     	
    }

}