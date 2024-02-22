package com.demowebshop.testscripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.demowebshop.genericlibrary.Base_Test;
import com.demowebshop.genericlibrary.ExcelRead;
import com.demowebshop.pomRepo.HomePage;
import com.demowebshop.pomRepo.LoginPage;
import com.demowebshop.pomRepo.WelcomePage;

public class LoginTest extends Base_Test {

	@Test(dataProvider = "loginData")
	public void tC_Login_001(String email, String password) throws InterruptedException {
		WelcomePage welcomePage=new WelcomePage(driver);
		welcomePage.clickLogin();
		LoginPage loginPage=new LoginPage(driver);
		loginPage.enterEmail(email);
		loginPage.enterPassword(password);
		loginPage.clickLoginButton();
		HomePage homePage=new HomePage(driver);
		try {
		softAssert.assertTrue(homePage.getLogoutLink().isDisplayed());
		}catch (Exception e) {
			e.printStackTrace();
			Reporter.log("User not logged in");
		}
	}
	
	@DataProvider(name = "loginData")
	public String[][] loginDataProvider() throws EncryptedDocumentException, IOException {
		return ExcelRead.multipleRead("Login");
	}
}
