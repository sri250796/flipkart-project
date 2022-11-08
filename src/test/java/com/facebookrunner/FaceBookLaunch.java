package com.facebookrunner;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.base.com.Baseclass;

public class FaceBookLaunch extends Baseclass {
	public static WebDriver driver;

	public static void main(String[] args) throws IOException {

		driver = browserLaunch("chrome");
		launchUrl("https://www.facebook.com/");

		WebElement email = driver.findElement(By.name("email"));
        sendvalues(email, "sridhar123@gmail.com");
  
		WebElement password = driver.findElement(By.name("pass"));
		sendvalues(password, "123456");

		WebElement lgnbtn = driver.findElement(By.name("login"));
		clickOnElement(lgnbtn);

		//printscreen("fb1");
		
		//rintscreen("fb2");
		
		//printscreen("fb3");
		
		closebrowser();

		System.out.println("Sucess");
	}

}
