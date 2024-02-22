package com.demowebshop.pomRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends Base_Page{

	public RegisterPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(id="gender-male")
	private WebElement maleGenderRadioButton;
	
	public void clickMaleRadioButton() {
		maleGenderRadioButton.click();
	}
	
	@FindBy(id = "gender-female")
	private WebElement femaleGenderRadioButton;
	
	public void clickFemaleRadioButton() {
		femaleGenderRadioButton.click();
	}
	
	@FindBy(id="FirstName")
	private WebElement firstnameTextField;
	
	public void enterFirstName(String firstname) {
		firstnameTextField.sendKeys(firstname);
	}
	
	@FindBy(id="LastName")
	private WebElement lastnameTextField;
	
	public void enterLastName(String lastname) {
		lastnameTextField.sendKeys(lastname);
	}
	@FindBy(id="Email")
	private WebElement emailTextField;
	
	public void enterEmail(String email) {
		emailTextField.sendKeys(email);
	}
	@FindBy(id="Password")
	private WebElement passwordTextField;
	
	public void enterPassword(String password) {
		passwordTextField.sendKeys(password);
	}
	@FindBy(id="ConfirmPassword")
	private WebElement confirmPasswordTextField;
	
	public void enterConfirmPassword(String password) {
		confirmPasswordTextField.sendKeys(password);
	}
	
	@FindBy(id="register-button")
	private WebElement registerButton;
	
	public void clickRegisterButton() {
		registerButton.click();
	}
	
	
}
