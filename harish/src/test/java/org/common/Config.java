package org.common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Config {
	
	private static WebDriver driver = null;
	
//	public Config() {
//		PageFactory.initElements(driver, HomePage.class);
//	}
	
	public static void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		   driver = new ChromeDriver();
		 driver.manage().window().maximize();
	}
	
	public static void goToUrl() {
	 driver.get("https://staging.dckapintegrator.com/");
}
	public static void goToYopUrl() {
		  driver.get("https://yopmail.com/en/");
	}
	
	public static WebDriver getDriver() {
		return driver;
	}	
	
	public static void loginUser() {
	Config.getDriver().findElement(By.xpath("//input[@placeholder='Email Address']")).sendKeys("harishr@dckap.com");
	Config.getDriver().findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Newuser123!");
	Config.getDriver().findElement(By.xpath("//button[@type='submit']")).click();
	}
}
