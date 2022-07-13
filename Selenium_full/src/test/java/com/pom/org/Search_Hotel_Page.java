package com.pom.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Search_Hotel_Page {
	
	public static WebDriver driver;
	
	@FindBy(xpath="//select[@name='location']")
private WebElement location;
	
	

	@FindBy(xpath="//select[@name='hotels']")
	private WebElement hotels;
	
	@FindBy(xpath="//select[@name='room_type']")
	private WebElement room_Type;
	
	@FindBy(xpath="//select[@name='room_nos']")
	private WebElement number_Of_Rooms;
	
	@FindBy(xpath="//input[@name='datepick_in']")
	private WebElement check_In_Date;
	
	@FindBy(xpath="//input[@name='datepick_out']")
	private WebElement check_Out_Date;
	
	@FindBy(xpath="//select[@name='adult_room']")
	private WebElement adult_Room;
	
	@FindBy(xpath="//select[@name='child_room']")
	private WebElement Children_Room;
	
	@FindBy(xpath="//input[@name='Submit']")
	private WebElement search_Button;
	
	
	public Search_Hotel_Page(WebDriver search_Hotel_Page_driver) {
	this.driver=search_Hotel_Page_driver;
	PageFactory.initElements(driver, this);
	}
	
	
	
	
	public WebElement getLocation() {
		return location;
	}


	public WebElement getHotels() {
		return hotels;
	}


	public WebElement getRoom_Type() {
		return room_Type;
	}


	public WebElement getNumber_Of_Rooms() {
		return number_Of_Rooms;
	}


	public WebElement getCheck_In_Date() {
		return check_In_Date;
	}


	public WebElement getCheck_Out_Date() {
		return check_Out_Date;
	}


	public WebElement getAdult_Room() {
		return adult_Room;
	}


	public WebElement getChildren_Room() {
		return Children_Room;
	}


	public WebElement getSearch_Button() {
		return search_Button;
	}

	
	/*Select location = new Select(driver.findElement(By.xpath("//select[@name='location']")));
	location.selectByValue("London");

	Select hotels = new Select(driver.findElement(By.xpath("//select[@name='hotels']")));
	hotels.selectByValue("Hotel Hervey");

	Select room_type = new Select(driver.findElement(By.xpath("//select[@name='room_type']")));
	room_type.selectByValue("Super Deluxe");

	Select number_of_rooms = new Select(driver.findElement(By.xpath("//select[@name='room_nos']")));
	number_of_rooms.selectByValue("4");

	WebElement checkin_date = driver.findElement(By.xpath("//input[@name='datepick_in']"));
	checkin_date.clear();
	checkin_date.sendKeys("08/10/2022");

	WebElement checkout_date = driver.findElement(By.xpath("//input[@name='datepick_out']"));
	checkout_date.clear();
	checkout_date.sendKeys("10/10/2022");

	Select adult_room = new Select(driver.findElement(By.xpath("//select[@name='adult_room']")));
	adult_room.selectByValue("3");

	Select child_room = new Select(driver.findElement(By.xpath("//select[@name='child_room']")));
	child_room.selectByValue("1");

	WebElement search_button = driver.findElement(By.xpath("//input[@name='Submit']"));
	search_button.click();

	Thread.sleep(2000);
*/
}
