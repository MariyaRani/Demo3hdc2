package hdc2demo;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReportListener {
	WebDriver driver;
	ExtentHtmlReporter htmlReporter;
	ExtentReports extent;
	//helps to generate the logs in test report
	ExtentTest test;
	
	//@Parameters({"OS","browser"})
	
  @BeforeTest
 // public void startReport(String OS,String browser){
  public void startReport() 
  {
	 //initialize the HTMLReporter
	 
  }
}
