package com.stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.testrunner.AdactinRunner;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stepdefinition {
	
	WebDriver driver= AdactinRunner.driver;
	
	
	@Given("^user Launch The Adactin Application$")
	public void user_Launch_The_Adactin_Application() throws Throwable {
		
		driver.get("https://adactinhotelapp.com/");
		
	}

	//@When("^user Enters The Username In The InputBox$")
	//public void user_Enters_The_Username_In_The_InputBox() throws Throwable {
		//WebElement username = driver.findElement(By.id("username"));
      //username.sendKeys("sridhar0231");
	//}

      //@When("^user Enters Password In The InoutBox$")
      //public void user_Enters_Password_In_The_InoutBox() throws Throwable {
      //WebElement password = driver.findElement(By.id("password"));
      //password.sendKeys("sridhar123");
	//}
	@When("^user Enters The \"([^\"]*)\" Username In The InputBox$")
	public void user_Enters_The_Username_In_The_InputBox(String user) throws Throwable {
		
		WebElement username = driver.findElement(By.id("username"));
	  	username.sendKeys(user);
	}

	@When("^user Enters The \"([^\"]*)\" Password In The InputBox$")
	public void user_Enters_The_Password_In_The_InputBox(String pass) throws Throwable {
		WebElement password = driver.findElement(By.id("password"));
	      password.sendKeys("pass");

		
		
		
	}


	@Then("^user Clicks On The LoginBtn And It Navigate To The SearchPage$")
	public void user_Clicks_On_The_LoginBtn_And_It_Navigate_To_The_SearchPage() throws Throwable {
     WebElement loginbtn = driver.findElement(By.id("login"));
	loginbtn.click();
	}

}
