package stepDefinations;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.junit.Cucumber;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.common.Config;
import org.junit.Assert;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

@RunWith(Cucumber.class)
public class pagenavigation {

    @Given("^login page landing$")
    public void login_page_landing() throws Throwable {
    	Config.launchBrowser();
    	Config.goToUrl(); 
    	Config.getDriver().findElement(By.xpath("//input[@placeholder='Email Address']")).sendKeys("harishr@dckap.com");
    	Config.getDriver().findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Newuser123!");
		Config.getDriver().findElement(By.xpath("//button[@type='submit']")).click();
    }

    @When("^check half of total pages for navigation$")
    public void check_half_of_total_pages_for_navigation() throws Throwable {
    	
    	//dashboard page
    	
    	Config.getDriver().manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
       Config.getDriver().findElement(By.xpath("//h2[@class='cls-main-title']")).isDisplayed();
      
        
       // Integration page
      // Thread.sleep(2000);
       Config.getDriver().findElement(By.xpath("//div[@class='col-sm-4 p-0']//div[2]//span[2]//a[1]")).click(); 
       
       Config.getDriver().manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
       
       Config.getDriver().findElement(By.xpath("//h2[@class='cls-main-title']")).isDisplayed();
       
       
    // credentials page 
       Config.getDriver().findElement(By.xpath("//li[@id='credentials']//a[@class='nav-link nav_tooltip']")).click();
       Config.getDriver().manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
       Config.getDriver().findElement(By.xpath("//*[contains(text(),'Credentials')]")).isDisplayed();
       
       
      
       // Logs page 
       Config.getDriver().findElement(By.xpath("//li[@id='logs']//a[@class='nav-link nav_tooltip']")).click();
       Config.getDriver().manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
       Config.getDriver().findElement(By.xpath("//*[contains(text(),'Logs')]")).isDisplayed();
       
       // Project Settings page 
       Config.getDriver().findElement(By.xpath("//img[@alt='Project Settings']")).click(); 
       Config.getDriver().manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
       Config.getDriver().findElement(By.xpath("//*[contains(text(),'Settings')]")).isDisplayed();
       
    // Project documents page 
   
       Config.getDriver().findElement(By.xpath("//img[@alt='Project Documents']")).click();
       Config.getDriver().manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
       Config.getDriver().findElement(By.xpath("//*[contains(text(),'Project Documents')]")).isDisplayed();
       
       // Help and Support page 
       Config.getDriver().findElement(By.xpath("//img[@alt='Help & Support']")).click(); 
       Config.getDriver().manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
       Config.getDriver().findElement(By.xpath("//*[contains(text(),'Help & Support')]")).isDisplayed();
       
       
    }

    @Then("^check other half pages for navigation$")
    public void check_other_half_pages_for_navigation() throws Throwable {
    	
    	// Projects page 
    	
    	
    	 Config.getDriver().findElement(By.xpath("//img[@alt='DCKAP Integrator']")).click(); 
       Config.getDriver().findElement(By.xpath("//img[@alt='Projects']")).click(); 
      Config.getDriver().manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
        Config.getDriver().findElement(By.xpath("//*[contains(text(),'Projects')]")).isDisplayed();
        
        // Exchange page 
      //  Config.getDriver().findElement(By.xpath("//img[@alt='DCKAP Integrator']")).click(); 
        Config.getDriver().findElement(By.xpath("//img[@alt='Exchange']")).click(); 
        Config.getDriver().manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
        Config.getDriver().findElement(By.xpath("//*[contains(text(),' Exchange ')]")).isDisplayed();
    	
    	
    	 Config.getDriver().quit();
    	
    }

}