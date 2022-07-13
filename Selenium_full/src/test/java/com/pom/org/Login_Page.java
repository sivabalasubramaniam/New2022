package com.pom.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {
	
	public static WebDriver driver;
@FindBy(xpath="//input[@name='username']")	
private WebElement user_Name;

@FindBy(xpath="//input[@name='password']")
private WebElement password;

@FindBy(xpath="//input[@name='login']")
private WebElement login_Button;

public Login_Page(WebDriver ldriver) {
this.driver=ldriver;
PageFactory.initElements(driver, this);
}

public WebElement getUser_Name() {
	return user_Name;
}


public WebElement getPassword() {
	return password;
}


public WebElement getLogin_Button() {
	return login_Button;
}




	
	/*WebElement user_name = driver.findElement(By.xpath("//input[@name='username']"));
	user_name.sendKeys("sivabalasubramaniam9");

	WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
	password.sendKeys("20102647");

	WebElement login_button = driver.findElement(By.xpath("//input[@name='login']"));
	login_button.click();

	Thread.sleep(3000);
	System.out.println("login page over");
*/	
}
