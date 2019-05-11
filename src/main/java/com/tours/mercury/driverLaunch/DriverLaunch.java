package com.tours.mercury.driverLaunch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class DriverLaunch {
	
	public WebDriver driver;
	public final String CURRENT_PATH =  System.getProperty("user.dir");
	
	// Extent Reports
	
	public ExtentHtmlReporter htmlFile;
	public ExtentReports report;
	public ExtentTest log;
	
	@BeforeSuite
	public void beforeSuite(){
		System.setProperty("webdriver.chrome.driver", CURRENT_PATH + "\\resources\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com/mercurywelcome.php");
		driver.manage().window().maximize();
		
		//extent reports
		htmlFile = new ExtentHtmlReporter("AutomationReport.html");
		report = new ExtentReports();
		report.attachReporter(htmlFile);
	}
	
	
	@AfterSuite
	public void afterSuite(){
		report.flush(); // to print the data to the report
	}
	

}
