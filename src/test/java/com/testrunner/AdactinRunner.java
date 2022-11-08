package com.testrunner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\feature", glue = "com.stepdef", plugin = { "pretty",
		"html:Report/Cucumber_Report", "json:Report/Cucumber.json",
		"com.cucumber.listener.ExtentCucumberFormatter:Report/Cucumber_Extent_Report.html" }, monochrome = true, dryRun = false, strict = true, tags = "@test1")

public class AdactinRunner {

	public static WebDriver driver;

	@BeforeClass
	public static void setup() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Multimedia\\eclipse-workspace\\flipkart\\Drivers\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();

	}

	@AfterClass
	public static void browserclose() {
		driver.close();

	}

}
