package com.demowebshop.pomRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends Base_Page {
	public LoginPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(id = "Email")
	WebElement emailTextField;

	public void enterEmail(String email) {
		emailTextField.sendKeys(email);
	}

	@FindBy(id = "Password")
	WebElement passwordTextField;

	public void enterPassword(String password) {
		passwordTextField.sendKeys(password);
	}

	@FindBy(xpath = "//input[@value='Log in']")
	WebElement loginButton;

	public void clickLoginButton() {
		loginButton.click();
	}
}
