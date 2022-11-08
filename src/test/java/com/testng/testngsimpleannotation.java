package com.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testngsimpleannotation {

	@BeforeSuite
	public void setup() {
		System.out.println("System Set Property");

	}

	@BeforeTest
	public void launchbrowser() {
		System.out.println("Browser Launch");

	}

	@BeforeClass
	public void urllaunch() {
		System.out.println("Amazon Application");
	}

	@BeforeMethod
	public void login() {
		System.out.println("Login");
	}

	@Test
	public void searchLenovo() {
		System.out.println("Search Lenovo Laptop");

	}

	@Test
	public void searchapple() {
		System.out.println("Search for Apple");

	}

	@AfterMethod
	public void verify() {
		System.out.println("Verify");

	}

	@AfterClass
	public void logout() {
		System.out.println("Logout");

	}

	@AfterTest

	public void closebrowser() {
		System.out.println("Close Browser");

	}

	@AfterSuite

	public void deletecookies() {
		System.out.println("Delete Cookies");

	}

}
