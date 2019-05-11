package com.tours.mercury.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tours.mercury.driverLaunch.DriverLaunch;

public class LoginPage extends DriverLaunch{
	
	@FindBy (name = "userName")
	public WebElement username_TXT;
	
	@FindBy (name = "password")
	public WebElement password_TXT;
	
	@FindBy (name = "login")
	public WebElement login_BTN;
	
	
	public LoginPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	

}
