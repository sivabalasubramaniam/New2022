package com.pom.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Final_Page {

	public static WebDriver driver;
	
	@FindBy(xpath="//input[@name='logout']")
	private WebElement logout_Button;

	public Final_Page(WebDriver final_Page_driver) {
this.driver=final_Page_driver;
PageFactory.initElements(driver, this);
	
	}
	
	
	
	public WebElement getLogout_Button() {
		return logout_Button;
	}

	
	
	
	
	
	
/*	
	WebElement logout_button = driver.findElement(By.xpath("//input[@name='logout']"));
	logout_button.click();
	
	*/
}
