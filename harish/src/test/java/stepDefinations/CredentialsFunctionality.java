package stepDefinations;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;

import java.awt.List;

import org.common.Config;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

@RunWith(Cucumber.class)
public class CredentialsFunctionality  {

    @Given("^User logins and lands home page$")
    public void user_logins_and_lands_home_page() throws Throwable {
    	Config.launchBrowser();
    	Config.goToUrl();
    }

    @When("^Access the particular project$")
    public void access_the_particular_project() throws Throwable {
    	Config.getDriver().findElement(By.xpath("//input[@placeholder='Email Address']")).sendKeys("harishr@dckap.com");
    	Config.getDriver().findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Newuser123!");
		Config.getDriver().findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		Config.getDriver().findElement(By.xpath("//div[text()='HARISH R']")).click();
		
    }
    
    @And("^Go to credentials page and create a new credential$")
    public void go_to_credentials_page_and_create_a_new_credential() throws Throwable {
    	
//    	
//    	
//    	Thread.sleep(2000);
//    	Config.getDriver().findElement(By.xpath("//input[@id='cr_name']")).sendKeys("newcredtest");
//    	Config.getDriver().findElement(By.xpath("//div[@class='css-1hwfws3 form-control-select__value-container']")).click();
//    	Config.getDriver().findElement(By.xpath("//div[@class='css-1hwfws3 form-control-select__value-container form-control-select__value-container--has-value']")).click();
    	Config.getDriver().findElement(By.xpath("//img[@alt='Systems']")).click();
    	Config.getDriver().findElement(By.xpath("//img[@class='clo-opt-h']")).click();
    	Config.getDriver().findElement(By.xpath("//div[text()='Edit']")).click();
    	Config.getDriver().findElement(By.xpath("//button[text()='Add New Credential']")).click();
    	
    	

    	
    	Config.getDriver().findElement(By.id("cr_name")).sendKeys("Big commerce");
    	
    	
    	Config.getDriver().findElement(By.id("datapoint")).click();
    	Thread.sleep(2000); 
    	
    	//JavascriptExecutor js = (JavascriptExecutor)driver;
    	
    		//	js.executeScript("document.getElementsByName('datapoint')[0].setAttribute('type', 'text');");
    		
    		//	Config.getDriver().findElement(By.id("datapoint"));
    	Config.getDriver().findElement(By.xpath("//div[@class='css-1pcexqc-container']//div//input")).sendKeys("Bigcommerce");
    	Config.getDriver().findElement(By.xpath("//div[@class='css-1pcexqc-container']//div//input")).sendKeys(Keys.ENTER);
    	Thread.sleep(2000);
    	Config.getDriver().findElement(By.id("cr_timezone")).click();
    	Thread.sleep(2000);
    	Config.getDriver().findElement(By.xpath("//*[@id='react-select-3-input']")).sendKeys("kol");
    	Config.getDriver().findElement(By.xpath("//*[@id='react-select-3-input']")).sendKeys(Keys.ENTER);
    //	Config.getDriver().findElement(By.xpath("//*[@id='creds-step1']/div/button")).click();
    	
    Config.getDriver().findElement(By.xpath("//*[@id='X-Auth-Client']")).sendKeys("p8ix10bpx2kktbepy7vxdq6aezg9foe");
    Config.getDriver().findElement(By.xpath("//*[@id='X-Auth-Token']")).sendKeys("grwhqwrv93oagvg0zst00ukwn1rlkno");
    Config.getDriver().findElement(By.xpath("//*[@id='store_hash']")).sendKeys("4603pdm30a");
    Config.getDriver().findElement(By.xpath("//button[@name='redirect_action']")).click();	
  
   
    }

   

    @Then("^A new credential details should be displayed$")
    public void a_new_credential_details_should_be_displayed() throws Throwable {
    	Config.getDriver().close();
    	
    }

    
  
}