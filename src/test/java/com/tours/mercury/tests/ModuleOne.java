package com.tours.mercury.tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.tours.mercury.driverLaunch.DriverLaunch;
import com.tours.mercury.pages.FlightFinderPage;
import com.tours.mercury.pages.LoginPage;
import com.tours.mercury.utilities.Utilities;

public class ModuleOne extends DriverLaunch {

	LoginPage loginPageObject;
	FlightFinderPage flightFinderPageObject;

	@BeforeClass
	public void beforeMEthod() {
		loginPageObject = new LoginPage(driver);
		flightFinderPageObject = new FlightFinderPage(driver);
	}

	@AfterClass
	public void afterClassM() {
		driver.close();
	}

	/*@AfterMethod
	public void afterMethod() {
		
	}*/

	@Test
	public void loginTest() {
		log = report.createTest("loginTest");
		loginPageObject.username_TXT.sendKeys("tutorial");
		log.log(Status.INFO, "*** User entered username ***");
		loginPageObject.password_TXT.sendKeys("tutorial");
		log.log(Status.INFO, "*** User entered password ***");
		loginPageObject.login_BTN.click();
		log.log(Status.INFO, "*** user logged in ***");
	}

	@Test
	public void selectFlight() throws InterruptedException {
		log = report.createTest("selectFlight");
		flightFinderPageObject.oneWay_RBTN.click();
		log.log(Status.INFO, "*** User selected one way option ***");
		flightFinderPageObject.businessClass_RBTN.click();
		Utilities.dropdownValueSelection(flightFinderPageObject.airline_DD, "Blue Skies Airlines");
		log.log(Status.INFO, "*** User selected blue skies airlines ***");
		flightFinderPageObject.continue_BTN.click();
	}
	
	@DataProvider (name = "getData")
	public Object[][] dataProviderMethod(){
		return new Object[][] {{"username1", "password1"}, {"username2", "password2"}};
	}
	@Test
	public void testcase3() {
		
	}

}
