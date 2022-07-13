package com.selenium_complete.org.Selenium_full;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.frm.org.File_Reader_Manager_Page;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\main\\java\\com\\selenium_complete\\org\\Selenium_full", 
glue = "com\\step_Definition\\org",
dryRun=false,
strict=true,
monochrome=true)
public class Test_Runner {
	
	public static WebDriver driver;
	 
@BeforeClass	
	public static void set_Up() throws Throwable {
	
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\USER\\eclipse-workspace\\Selenium\\src\\DriverFolder\\chromedriver.exe");

	driver = new ChromeDriver();
	Thread.sleep(3000);
	System.out.println("Browser Lanuch successfully");
	}
@AfterClass
public static void tear_Down() {
driver.quit();
}
	
}
