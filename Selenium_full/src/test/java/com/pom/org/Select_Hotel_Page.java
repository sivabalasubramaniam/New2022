package com.pom.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Select_Hotel_Page {

	public static WebDriver driver;
	
	@FindBy(xpath="//input[@name='radiobutton_0']")
private WebElement select_Button;
	

	@FindBy(xpath="//input[@name='continue']")
	private WebElement continue_Button;
	

	public Select_Hotel_Page(WebDriver select_hotel_driver) {
	this.driver=select_hotel_driver;
	PageFactory.initElements(driver, this);
	
	}
	
	public WebElement getSelect_Button() {
		return select_Button;
	}


	public WebElement getContinue_Button() {
		return continue_Button;
	}

	
	/*WebElement select_button = driver.findElement(By.xpath("//input[@name='radiobutton_0']"));
	select_button.click();

	WebElement continue_button = driver.findElement(By.xpath("//input[@name='continue']"));
	continue_button.click();
	Thread.sleep(3000);
*/
	
	
}
