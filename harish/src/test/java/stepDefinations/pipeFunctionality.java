package stepDefinations;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.junit.Cucumber;



import org.common.Config;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;


@RunWith(Cucumber.class)
public class pipeFunctionality {

    @Given("^User logged in$")
    public void user_has_a_access_and_logins() throws Throwable {
    	Config.launchBrowser();
    	Config.goToUrl();
    }
  
    @When("^click manage on particular project$")
    public void navigates_to_the_particular_project() throws Throwable {
    	Config.getDriver().findElement(By.xpath("//input[@placeholder='Email Address']")).sendKeys("harishr@dckap.com");
    	Config.getDriver().findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Newuser123!");
		Config.getDriver().findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		Config.getDriver().findElement(By.xpath("//div[@class='col-sm-4 p-0']//div[2]//span[2]//a[1]")).click();
		
    }

    @Then("^Go to Integrations page and create a new pipe")
    public void go_to_flows_page_and_create_a_new_flow() throws Throwable {
    	
    	Config.getDriver().findElement(By.xpath("//a[@id='pipe_add']")).click();
    	
    	
    	Config.getDriver().findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("testpipe100");
    	
    	Config.getDriver().findElement(By.xpath("//label[@id='62cd49673e92b8cc9fb5905d']")).click();
    	Thread.sleep(2000);
    	Config.getDriver().findElement(By.xpath("//div[@class='ant-select-selection__rendered']")).click();
    	Config.getDriver().findElement(By.xpath("//li[contains(text(),'hhhh')]")).click();
    	
    	Config.getDriver().findElement(By.xpath("/html[1]/body[1]/section[1]/div[1]/main[1]/div[1]/div[4]/div[1]/div[2]/div[1]/div[3]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/ul[1]/li[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]")).click();
    	Config.getDriver().findElement(By.xpath("//li[contains(text(),'Epicore')]")).click();
    	
    	
    	
    	
		Config.getDriver().findElement(By.xpath("//button[@class='btn btn-default cls-save']")).click();
		
		
		Config.getDriver().findElement(By.xpath("//button[normalize-space()='Yes']")).click();
		Config.getDriver().close();
    }

}