package stepDefinations;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.junit.Cucumber;

import org.common.Config;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

@RunWith(Cucumber.class)
public class mapFunctionality {

    @Given("^Entering the home page$")
    public void entering_the_home_page() throws Throwable {
    	Config.launchBrowser();
    	Config.goToUrl();

    }

    @When("^Entering flow page$")
    public void navigate_to_a_project_page() throws Throwable {
    	Config.getDriver().findElement(By.xpath("//input[@placeholder='Email Address']")).sendKeys("harishr@dckap.com");
    	Config.getDriver().findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Newuser123!");
		Config.getDriver().findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		Config.getDriver().findElement(By.xpath("//div[@class='col-sm-4 p-0']//div[2]//span[2]//a[1]")).click();
    }

    @Then("^creating a new flow with mapping$")
    public void go_to_flows_page_and_create_a_new_flow() throws Throwable {
    	Config.getDriver().findElement(By.xpath("//img[@alt='Advanced']")).click();
    	Config.getDriver().findElement(By.xpath("//span[normalize-space()='Flows']")).click();
    	Config.getDriver().findElement(By.xpath("//a[@id='flow_add']")).click();
    	Config.getDriver().findElement(By.id("upload")).sendKeys("D:\\Offers Flow (6).json");
    	
    	
    	Config.getDriver().findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("mapping");
    	
    	Thread.sleep(2000);
    	
    	WebElement source= Config.getDriver().findElement(By.cssSelector(".fh-desc"));
    	System.out.println("test script");
    	WebElement target= Config.getDriver().findElement(By.xpath("//div[@class='element-dummy']"));
    	Actions a=new Actions(Config.getDriver());	
    	a.dragAndDrop(source, target).build().perform();
    	
    	//div[@class='fh-desc'] //div[@class='element-dummy'] .fh-name .f-handler .fh-desc .fh-desc 
    }
    
}