package com.base.com;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Baseclass {

	public static WebDriver driver;

	public static WebDriver browserLaunch(String browser) {
		if (browser.equalsIgnoreCase("chrome")) {

			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Multimedia\\eclipse-workspace\\flipkart\\Drivers\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();

		} else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Multimedia\\eclipse-workspace\\flipkart\\Drivers\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();

		}

		else {
			System.out.println("invalid browser");
		}
		driver.manage().window().maximize();
		return 	driver;
	}

	public static void launchUrl(String url) {
		// driver.get("url");

		driver.get(url);

	}

	public static void closebrowser() {
		// driver.close();

		driver.close();

	}

	public static void printscreen(String filename) throws IOException {

		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\Multimedia\\eclipse-workspace\\flipkart\\screenshot\\"+filename+".png");
		FileUtils.copyDirectory(source, destination);

	}
	
	public static void sendvalues(WebElement element, String values) {
	    element.sendKeys(values); 
		
		
	}
	
	public static void clickOnElement(WebElement element) {
   
		 element.click();
		
		
	}
	
	
	
	
	
	
	

}
