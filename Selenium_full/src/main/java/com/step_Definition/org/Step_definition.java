package com.step_Definition.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.base_Class.org.Base_Class;
import com.frm.org.File_Reader_Manager_Page;
import com.pom.org.Page_Object_Manager;
import com.selenium_complete.org.Selenium_full.Test_Runner;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step_definition

{
public static WebDriver driver=Test_Runner.driver;
public static Page_Object_Manager pom=new Page_Object_Manager(driver);
@Given("^refresh the page$")
public void refresh_the_page() throws Throwable {
driver.navigate().refresh();
}

//LOGIN PAGE---------------------------------------------------------------------------------------------------------------------
@Given("^user launch the Browser$")
public void user_launch_the_Browser() throws Throwable {
driver.get(File_Reader_Manager_Page.get_Instance().get_Instance_CR().get_url());
	
	driver.manage().window().maximize();
	Thread.sleep(2000);
	System.out.println("URL Lanuch successfully");
}

@When("^user Enter the valid user_Name$")
public void user_Enter_the_valid_user_Name() throws Throwable {
	WebElement user_name = pom.get_lp().getUser_Name();
	user_name.sendKeys("sivabalasubramaniam9");

}

@When("^user Enter The Valid Password$")
public void user_Enter_The_Valid_Password() throws Throwable {
	WebElement password =pom.get_lp().getPassword();
	password.sendKeys("20102647");
}

@Then("^user Enter click the Login Button$")
public void user_Enter_click_the_Login_Button() throws Throwable {
	WebElement login_button = pom.get_lp().getLogin_Button();
	login_button.click();

	Thread.sleep(3000);
	System.out.println("login page over");
}
//---------------------------------------------------------------------------------------------------------------------------------


//SEARCH HOTEL PAGE----------------------------------------------------------------------------------------------------------------
@Given("^user Select The Location In the Location Drop Down$")
public void user_Select_The_Location_In_the_Location_Drop_Down() throws Throwable {
	Select location = new Select(pom.get_search_hp().getLocation());
	location.selectByValue(File_Reader_Manager_Page.get_Instance().get_Instance_CR().get_hotel_Location());
	

}

@When("^user Select The Hotel name In The Hotel Drop Down$")
public void user_Select_The_Hotel_name_In_The_Hotel_Drop_Down() throws Throwable {
	Select hotels = new Select(pom.get_search_hp().getHotels());
	hotels.selectByValue(File_Reader_Manager_Page.get_Instance().get_Instance_CR().get_hotel_Name());

}

@When("^user Select The Room Type In The Room Type Drop Down$")
public void user_Select_The_Room_Type_In_The_Room_Type_Drop_Down() throws Throwable {
	Select room_type = new Select(pom.get_search_hp().getRoom_Type());
	room_type.selectByValue(File_Reader_Manager_Page.get_Instance().get_Instance_CR().get_Room_Type());

}

@When("^user Select The Number Of Rooms In The Number Of Rooms Drop Down$")
public void user_Select_The_Number_Of_Rooms_In_The_Number_Of_Rooms_Drop_Down() throws Throwable {
	Select number_of_rooms = new Select(pom.get_search_hp().getNumber_Of_Rooms());
	number_of_rooms.selectByValue(File_Reader_Manager_Page.get_Instance().get_Instance_CR().get_Number_Of_Rooms());

}

@When("^user Enters The Valid Check In Date$")
public void user_Enters_The_Valid_Check_In_Date() throws Throwable {
	WebElement checkin_date =pom.get_search_hp().getCheck_In_Date();
	checkin_date.clear();
	checkin_date.sendKeys(File_Reader_Manager_Page.get_Instance().get_Instance_CR().get_Check_In_Date());

}

@When("^user Enters The Valid Check Out Date$")
public void user_Enters_The_Valid_Check_Out_Date() throws Throwable {
	WebElement checkout_date =pom.get_search_hp().getCheck_Out_Date();
	checkout_date.clear();
	checkout_date.sendKeys(File_Reader_Manager_Page.get_Instance().get_Instance_CR().get_Check_Out_Date());

}

@When("^user Select The Number Of Adult Rooms$")
public void user_Select_The_Number_Of_Adult_Rooms() throws Throwable {
	Select adult_room = new Select(pom.get_search_hp().getAdult_Room());
	adult_room.selectByValue(File_Reader_Manager_Page.get_Instance().get_Instance_CR().get_Adult_Rooms());

}

@When("^user Select The Number Of Children Rooms$")
public void user_Select_The_Number_Of_Children_Rooms() throws Throwable {
	Select child_room = new Select(pom.get_search_hp().getChildren_Room());
	child_room.selectByValue(File_Reader_Manager_Page.get_Instance().get_Instance_CR().get_Children_Rooms());

}

@Then("^user Click The Search_button and Its navigate to next Page$")
public void user_Click_The_Search_button_and_Its_navigate_to_next_Page() throws Throwable {
	WebElement search_button =pom.get_search_hp().getSearch_Button();
	search_button.click();
System.out.println("search hotel page over");
}
//----------------------------------------------------------------------------------------------------------------------------------

//SELECT HOTEL PAGE
@Given("^user check and Select The Select_button$")
public void user_check_and_Select_The_Select_button() throws Throwable {
	WebElement select_button = pom.get_select_hp().getSelect_Button();
	select_button.click();
}

@Then("^user click The continue_button and Its Navigates to Book hotel Page$")
public void user_click_The_continue_button_and_Its_Navigates_to_Book_hotel_Page() throws Throwable {
	WebElement continue_button =pom.get_select_hp().getContinue_Button();
	continue_button.click();
	Thread.sleep(3000);
	System.out.println("select hotel page over");
}
//-----------------------------------------------------------------------------------------------------------------------------------


//BOOK HOTEL PAGE-------------------------------------------------------------------------------------------------------------------
@Given("^user Enter His First_Name$")
public void user_Enter_His_First_Name() throws Throwable {
	WebElement first_name = pom.get_book_hp().getFirst_name();
	first_name.sendKeys(File_Reader_Manager_Page.get_Instance().get_Instance_CR().get_First_Name());

}

@When("^user Enters His Last_Name$")
public void user_Enters_His_Last_Name() throws Throwable {
	WebElement last_name = pom.get_book_hp().getLast_name();
	last_name.sendKeys(File_Reader_Manager_Page.get_Instance().get_Instance_CR().get_Last_Name());

}

@When("^user Enters The Address$")
public void user_Enters_The_Address() throws Throwable {
	WebElement billing_address =pom.get_book_hp().getBilling_address();
	billing_address.sendKeys(File_Reader_Manager_Page.get_Instance().get_Instance_CR().get_Address());
}

@When("^user Enters The Valid Credit Card Number$")
public void user_Enters_The_Valid_Credit_Card_Number() throws Throwable {
	WebElement credit_card_number = pom.get_book_hp().getCredit_card_number();
	credit_card_number.sendKeys(File_Reader_Manager_Page.get_Instance().get_Instance_CR().get_Credit_Card_No());
}

@When("^user Enters The Credit Card Type$")
public void user_Enters_The_Credit_Card_Type() throws Throwable {
	Select credit_card_type = new Select(pom.get_book_hp().getCredit_card_type());
	credit_card_type.selectByValue(File_Reader_Manager_Page.get_Instance().get_Instance_CR().get_Credit_Card_Type());
}

@When("^user Enter The Credit Card Expiry month$")
public void user_Enter_The_Credit_Card_Expiry_month() throws Throwable {
	Select expiry_month = new Select(pom.get_book_hp().getExpiry_month());
	expiry_month.selectByValue(File_Reader_Manager_Page.get_Instance().get_Instance_CR().get_Credit_Card_Expiry_Month());
}

@When("^user Enter The Credit Card Expiry Year$")
public void user_Enter_The_Credit_Card_Expiry_Year() throws Throwable {
	Select expiry_year = new Select(pom.get_book_hp().getExpiry_year());
	expiry_year.selectByValue(File_Reader_Manager_Page.get_Instance().get_Instance_CR().get_Credit_Card_Expiry_Year());
	
}

@When("^user Enter The Valid Credit Card CVV Number$")
public void user_Enter_The_Valid_Credit_Card_CVV_Number() throws Throwable {
	WebElement cvv_number = pom.get_book_hp().getCvv_number();
	cvv_number.sendKeys(File_Reader_Manager_Page.get_Instance().get_Instance_CR().get_CVV_Number());
}

@Then("^user click The Book_button and Its navigates to Final Page$")
public void user_click_The_Book_button_and_Its_navigates_to_Final_Page() throws Throwable {
	WebElement book_button=pom.get_book_hp().getBook_button();
	book_button.click();
	Thread.sleep(5000);
	System.out.println("book hotel page over");
}
//-----------------------------------------------------------------------------------------------------------------------------------------

//FINAL PAGE
@Given("^user Click the Logout_buttton$")
public void user_Click_the_Logout_buttton() throws Throwable {
	WebElement logout_button = pom.get_final_Page().getLogout_Button();
	logout_button.click();
	System.out.println("final page over");
}




}
