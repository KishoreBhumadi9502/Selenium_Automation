package com.cyclos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageObjects {

	@FindBy(id = "login-link")
	WebElement link_Login;

	@FindBy(xpath = "//input[@type='text']")
	WebElement uname;

	@FindBy(xpath = "//input[@type='password']")
	WebElement pword;

	@FindBy(xpath = "//span[contains(.,'Submit')]")
	WebElement btn_login;

	LoginPageObjects(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}

}
