package com.selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WindowHandles {

	
	
	public static void main(String[] args) throws AWTException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Multimedia\\eclipse-workspace\\flipkart\\Drivers\\Drivers\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.flipkart.com/");
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		   
		   WebElement wc = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		   wc.click();	
		 
		 
		 
		 WebElement mobile = driver.findElement(By.xpath("//div[text()='Mobiles & Tablets']"));
		 
		 
		 WebElement fash= driver.findElement(By.xpath("//div[text()='Fashion']"));
				 
		 Actions a=new Actions(driver); 
		 
		 Robot b=new Robot();
		 a.contextClick(mobile).build().perform();
		 b.keyPress(KeyEvent.VK_DOWN);
		 b.keyRelease(KeyEvent.VK_DOWN);
		 b.keyPress(KeyEvent.VK_ENTER);
		 b.keyRelease(KeyEvent.VK_ENTER);
		 a.contextClick(fash).build().perform();
		 b.keyPress(KeyEvent.VK_DOWN);
		 b.keyRelease(KeyEvent.VK_DOWN);
		 b.keyPress(KeyEvent.VK_ENTER);
		 b.keyRelease(KeyEvent.VK_ENTER);
		 
		 String windowHandle = driver.getWindowHandle();
		 System.out.println(windowHandle);
		 Set<String> windowHandles = driver.getWindowHandles();
		 for (String id : windowHandles) 
		 {
			System.out.println(id);
		 }
		 System.out.println("finished");
	}

}			 

