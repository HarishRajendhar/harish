package stepDefinations;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.junit.Cucumber;

import org.common.Config;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;

@RunWith(Cucumber.class)
public class systems {

    @Given("^User with credentials to login to the home page$")
    public void as() throws Throwable {
    	Config.launchBrowser();
    	Config.goToUrl();
    }

    @When("^Navigate to the systems page and create a new system$")
    public void df() throws Throwable {
    	Config.getDriver().findElement(By.xpath("//input[@placeholder='Email Address']")).sendKeys("harishr@dckap.com");
    	Config.getDriver().findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Newuser123!");
		Config.getDriver().findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		Config.getDriver().findElement(By.xpath("//div[@class='col-sm-4 p-0']//div[2]//span[2]//a[1]")).click();
    }

    @Then("^A new system should be displayed$")
    public void ee() throws Throwable {
    	//a[@href='#'] //img[@alt='Advanced']
    	Config.getDriver().findElement(By.xpath("//a[@href='#']")).click(); 
    	Config.getDriver().findElement(By.xpath("//span[normalize-space()='Systems']")).click();
    	//div[@class='clo-grid']//div[1]//div[5]//span[1]//img[1]
    	Config.getDriver().findElement(By.xpath("//a[@id='system_add']")).click();
    	Thread.sleep(2000);
    	Config.getDriver().findElement(By.xpath("//*[@id='title']/input")).click();
    	Config.getDriver().findElement(By.id("title")).sendKeys("Custom1 Big Commerce");
    	Config.launchBrowser();
    	Config.goToUrl();
   	
    	
    	Config.getDriver().findElement(By.xpath("//*[@id='description']/div")).click();
    	Config.getDriver().findElement(By.id("description")).sendKeys("Custom2 Big commerce system");
   
   	Config.getDriver().findElement(By.xpath("//*[@id='form-container']/div/form/div[1]/div[1]/div[2]/div/div/div/div[2]")).click();
    	Config.getDriver().findElement(By.name("status_code")).sendKeys("401");
    	Config.getDriver().findElement(By.name("message")).sendKeys("title");
    	Config.getDriver().findElement(By.name("test_url")).sendKeys("https://api.bigcommerce.com/stores/GET_FROM_USER[store_hash]/v3/catalog/products");
    	Config.getDriver().findElement(By.xpath("//a[contains(text(),'Header')]")).click();
    	Config.getDriver().findElement(By.xpath("//p[contains(text(),' Bulk Edit ')]")).click();
   	Thread.sleep(1000);
    	Config.getDriver().findElement(By.name("test_header")).click();
    	Config.getDriver().findElement(By.name("test_header")).sendKeys("Content-Type::Content-Type::application/x-www-form-urlencoded\r\n"
    			+ "X-Auth-Client::X-Auth-Client::GET_FROM_USER\r\n"
    			+ "X-Auth-Token::X-Auth-Token::GET_FROM_USER\r\n"
    			+ "Accept::Accept::application/json");	
    	
    	Config.getDriver().findElement(By.xpath("//button[contains(text(),'Save')]")).click();
    	   	

//    	Config.getDriver().findElement(By.xpath("//*[@id='title']/input")).click();
//    	
//    	Config.getDriver().findElement(By.id("title")).sendKeys("Custom1 Big Commerce");
//    	Config.getDriver().findElement(By.xpath("//*[@id='description']/div")).click();
//    	Config.getDriver().findElement(By.id("description")).sendKeys("Custom1 Big commerce system");
//    	Config.getDriver().findElement(By.xpath("//*[@id='form-container']/div/form/div[1]/div[1]/div[2]/div/div/div/div[2]")).click();
//    	Config.getDriver().findElement(By.name("status_code")).sendKeys("401");
//    	Config.getDriver().findElement(By.name("message")).sendKeys("title");
//    	Config.getDriver().findElement(By.name("test_url")).sendKeys("https://api.bigcommerce.com/stores/GET_FROM_USER[store_hash]/v3/catalog/products");
//    	Config.getDriver().findElement(By.xpath("//a[contains(text(),'Header')]")).click();
//    	Config.getDriver().findElement(By.xpath("//p[contains(text(),' Bulk Edit ')]")).click();
//    	Thread.sleep(1000);
//    	Config.getDriver().findElement(By.name("test_header")).click();
//    	Config.getDriver().findElement(By.name("test_header")).sendKeys("Content-Type::Content-Type::application/x-www-form-urlencoded\r\n"
//    			+ "X-Auth-Client::X-Auth-Client::GET_FROM_USER\r\n"
//    			+ "X-Auth-Token::X-Auth-Token::GET_FROM_USER\r\n"
//    			+ "Accept::Accept::application/json");
//    	
//
//    	Config.getDriver().findElement(By.xpath("//button[contains(text(),'Save')]")).click();
//    	System.out.println("System added successfully");
    	  	
      }

}