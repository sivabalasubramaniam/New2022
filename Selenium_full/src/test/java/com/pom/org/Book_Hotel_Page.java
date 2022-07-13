package com.pom.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Book_Hotel_Page {

	
	public static WebDriver driver;
	
	@FindBy(xpath="//input[@name='first_name']")
	private WebElement first_name;

	@FindBy(xpath="//input[@name='last_name']")
	private WebElement last_name;
	
	@FindBy(xpath="//textarea[@name='address']")
	private WebElement billing_address;
	
	@FindBy(xpath="//input[@name='cc_num']")
	private WebElement credit_card_number;
	
	@FindBy(xpath="//select[@name='cc_type']")
	private WebElement credit_card_type;
	
	@FindBy(xpath="//select[@name='cc_exp_month']")
	private WebElement expiry_month;
	
	@FindBy(xpath="//select[@name='cc_exp_year']")
	private WebElement expiry_year;
	
	@FindBy(xpath="//input[@name='cc_cvv']")
	private WebElement cvv_number;
	
	@FindBy(xpath="//input[@name='book_now']")
	private WebElement book_button;
	
	
	
	public Book_Hotel_Page(WebDriver book_Hotel_Page_driver) {
	this.driver=book_Hotel_Page_driver;
	PageFactory.initElements(driver, this);
	
	}
	
	
	public WebElement getFirst_name() {
		return first_name;
	}


	public WebElement getLast_name() {
		return last_name;
	}


	public WebElement getBilling_address() {
		return billing_address;
	}


	public WebElement getCredit_card_number() {
		return credit_card_number;
	}


	public WebElement getCredit_card_type() {
		return credit_card_type;
	}


	public WebElement getExpiry_month() {
		return expiry_month;
	}


	public WebElement getExpiry_year() {
		return expiry_year;
	}


	public WebElement getCvv_number() {
		return cvv_number;
	}


	public WebElement getBook_button() {
		return book_button;
	}
	
	
	
/*	
	
	WebElement first_name = driver.findElement(By.xpath("//input[@name='first_name']"));
	first_name.sendKeys("SIVA BALASUBRAMANIAM A");

	WebElement last_name = driver.findElement(By.xpath("//input[@name='last_name']"));
	last_name.sendKeys("ARUMUGAM");

	WebElement billing_address = driver.findElement(By.xpath("//textarea[@name='address']"));
	billing_address.sendKeys("kamarajapuram, Madurai");

	WebElement credit_card_number = driver.findElement(By.xpath("//input[@name='cc_num']"));
	credit_card_number.sendKeys("0000000000000000");

	Select credit_card_type = new Select(driver.findElement(By.xpath("//select[@name='cc_type']")));
	credit_card_type.selectByValue("VISA");

	Select expiry_month = new Select(driver.findElement(By.xpath("//select[@name='cc_exp_month']")));
	expiry_month.selectByIndex(4);

	Select expiry_year = new Select(driver.findElement(By.xpath("//select[@name='cc_exp_year']")));
	expiry_year.selectByValue("2013");

	WebElement cvv_number = driver.findElement(By.xpath("//input[@name='cc_cvv']"));
	cvv_number.sendKeys("211");

	WebElement book_button = driver.findElement(By.xpath("//input[@name='book_now']"));
	book_button.click();

	Thread.sleep(5000);*/
	

}
