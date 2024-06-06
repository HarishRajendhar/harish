package stepDefinations;


import cucumber.api.java.en.Given;
import java.util.concurrent.TimeUnit;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;

import org.common.Config;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;

@RunWith(Cucumber.class)
public class ProjectFunctionality {

    @Given("^Login to the cloras application with given credentials$")
    public void login_to_the_cloras_application_with_given_credentials() throws Throwable {
    	Config.launchBrowser();
    	Config.goToUrl();
    	Config.getDriver().findElement(By.xpath("//input[@placeholder='Email Address']")).sendKeys("harishr@dckap.com");
    	Config.getDriver().findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Newuser123!");
    	Config.getDriver().findElement(By.xpath("//button[@type='submit']")).click();  

    }

    @When("^Click on projects icon and click click on Add new button$")
    public void click_on_projects_icon_and_click_click_on_add_new_button() throws Throwable {
    Config.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    Config.getDriver().findElement(By.xpath( "//img[@alt='Projects']")).click();
    Config.getDriver().findElement(By.xpath( "//a[@id='project_add']")).click();
    Thread.sleep(2000);
    Config.getDriver().findElement(By.xpath("//input[@name='project_name']")).sendKeys("harishrajendhar");
    Config.getDriver().findElement(By.xpath("//textarea[@name='project_description']")).sendKeys("For Testing Purpose");
    Config.getDriver().findElement(By.xpath("//button[@class='btn btn-default cls-save']")).click();
    }
  
    @Then("^A new project is created$")
    public void a_new_project_is_created() throws Throwable {
    	
    	System.out.println("test");
      
    	
    }

    @And("^Enter project name and description and clikc on save$")
    public void enter_project_name_and_description_and_clikc_on_save() throws Throwable {
    	
    	Config.getDriver().close();
    }

}