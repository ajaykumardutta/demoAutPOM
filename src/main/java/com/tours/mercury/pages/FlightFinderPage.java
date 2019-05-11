package com.tours.mercury.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlightFinderPage {

	@FindBy(xpath = "(//input[@name='tripType'])[last()]")
	public WebElement oneWay_RBTN;
	
	@FindBy(xpath = "(//input[@name='servClass'])[last()-1]")
	public WebElement businessClass_RBTN;
	
	@FindBy (name = "airline")
	public WebElement airline_DD;
	
	@FindBy (name = "findFlights")
	public WebElement continue_BTN;
	
	public FlightFinderPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	

}
