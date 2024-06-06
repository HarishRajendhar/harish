package stepDefinations;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.junit.Cucumber;

import java.util.concurrent.TimeUnit;

import org.common.Config;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;


@RunWith(Cucumber.class)
public class flowFunctionality {

    @Given("^User has a access and logins$")
    public void user_has_a_access_and_logins() throws Throwable {
    	Config.launchBrowser();
    	Config.goToUrl();
    }

    @When("^Navigates to the particular project$")
    public void navigates_to_the_particular_project() throws Throwable {
    	Config.getDriver().findElement(By.xpath("//input[@placeholder='Email Address']")).sendKeys("harishr@dckap.com");
    	Config.getDriver().findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Avengers42");
		Config.getDriver().findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		Config.getDriver().findElement(By.xpath("//div[@class='col-sm-4 p-0']//div[2]//span[2]//a[1]")).click();
    }

    @Then("^Go to flows page and create a new flow$")
    public void go_to_flows_page_and_create_a_new_flow() throws Throwable {
    	
    	Config.getDriver().findElement(By.xpath("//img[@alt='Advanced']")).click();
    	Config.getDriver().findElement(By.xpath("//span[normalize-space()='Flows']")).click();
    	Config.getDriver().findElement(By.xpath("//a[@id='flow_add']")).click();
    	
    	Thread.sleep(2000);
//    	Config.getDriver().findElement(By.xpath("//i[@class='fa fa-pencil cls-edit-icon']")).sendKeys("as");
//      Config.getDriver().findElement(By.xpath("//textarea[@name='description']")).sendKeys("For Testing Purpose");
//    	Config.getDriver().findElement(By.xpath("//div[@id='status']")).click();
    	
        Config.getDriver().findElement(By.id("upload")).sendKeys("C:\\Users\\Harish R\\file\\Offers Flow 99.json");
		
		
		
		Config.getDriver().manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	//	new WebDriverWait(Config.getDriver(), 20).until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='form-control cls-name name']"))).sendKeys("test123");
		
//		Config.getDriver().findElement(By.xpath("//input[@name='name']")).sendKeys("test123");
//		Config.getDriver().findElement(By.xpath("//textarea[@name='description']")).sendKeys("for testing purpose");
		
		Config.getDriver().findElement(By.xpath("//button[@class='btn btn-default cls-save']")).click();
		
		Config.getDriver().close();
		
		
    }

}