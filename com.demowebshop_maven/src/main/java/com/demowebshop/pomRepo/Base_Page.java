package com.demowebshop.pomRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.demowebshop.genericlibrary.FrameworkLibrary;

public class Base_Page extends FrameworkLibrary{
	
	public Base_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

}
