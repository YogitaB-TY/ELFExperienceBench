package com.demowebshop.pomRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage extends Base_Page {
	public WelcomePage(WebDriver driver) {
		super(driver);
	}

	@FindBy(partialLinkText = "Log in")
	private WebElement loginLink;

	public void clickLogin() {
		loginLink.click();
	}

	@FindBy(partialLinkText = "Register")
	private WebElement registerLink;

	public void clickRegisterLink() {
		registerLink.click();
	}

	@FindBy(partialLinkText = "BOOKS")
	private WebElement headerBooksLink;

	public void clickheaderBooksLink() {
		headerBooksLink.click();
	}

}
