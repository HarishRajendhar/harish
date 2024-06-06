package stepDefinations;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.junit.Cucumber;

import org.common.Config;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;

@RunWith(Cucumber.class)
public class Scheduler {

    @Given("^login to Integrator$")
    public void login_to_integrator() throws Throwable {
    	Config.launchBrowser();
    	Config.goToUrl();

    }

    @When("^Add scheduler for any pipe using cron scheduler$")
    public void add_scheduler_for_any_pipe_using_cron_scheduler() throws Throwable {
    	Config.getDriver().findElement(By.xpath("//input[@placeholder='Email Address']")).sendKeys("harishr@dckap.com");
    	Config.getDriver().findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Newuser123!");
		Config.getDriver().findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		Config.getDriver().findElement(By.xpath("//div[@class='col-sm-4 p-0']//div[2]//span[2]//a[1]")).click();
    }

    @Then("^Sync for pipe should happen automatically$")
    public void sync_for_pipe_should_happen_automatically() throws Throwable {
    	Thread.sleep(2000);
    	Config.getDriver().findElement(By.xpath("//div[3]//div[5]//div[1]//div[1]//div[1]//div[1]//div[1]")).click();
    	Thread.sleep(2000);
    	Config.getDriver().findElement(By.xpath("//button[@class='btn btn-default add_schedule_btn']")).click();
    	Config.getDriver().findElement(By.xpath("//input[@value='including_min']")).click();
     	Config.getDriver().findElement(By.xpath("//button[@class='btn btn-default cls-save']")).click();
     	Thread.sleep(1000);
     	Config.getDriver().findElement(By.xpath("//div[@class='ant-drawer ant-drawer-right ant-drawer-open cron__drawer']//i[@aria-label='icon: close']//*[name()='svg']")).click();

     	//Config.getDriver().close();
     	
    }

}