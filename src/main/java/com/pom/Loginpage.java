package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {

	// 1.Declare the elements as private @FindBy annotation
	// 2.Generate getters
	// 3.Inside the constructor,initialize the driver and WebElements using
	// PageFactory.initElements()

	WebDriver driver;

	@FindBy(name = "password")
	private WebElement password;
	@FindBy(name = "login")
	private WebElement loginBtn;
	@FindBy(id = "username")
	private WebElement username;

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}

	public Loginpage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(this.driver, this);

	}

}
