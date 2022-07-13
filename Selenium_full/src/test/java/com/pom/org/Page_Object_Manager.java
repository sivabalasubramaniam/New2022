package com.pom.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Page_Object_Manager {
	public static WebDriver driver;
	

	public Page_Object_Manager(WebDriver page_Object_Manager_driver) {
this.driver=page_Object_Manager_driver;
		}
	
	public static Login_Page get_lp() {
Login_Page lp=new Login_Page(driver);
return lp;
	}
	
	public static Search_Hotel_Page get_search_hp() {
Search_Hotel_Page search_hp=new Search_Hotel_Page(driver);
return search_hp;
	}
	
	public static Select_Hotel_Page get_select_hp() {
Select_Hotel_Page select_hp=new Select_Hotel_Page(driver);
return select_hp;
	}
	
	public static Book_Hotel_Page get_book_hp() {
Book_Hotel_Page book_hp=new Book_Hotel_Page(driver);
return book_hp;
	}
	
	public static Final_Page get_final_Page() {
Final_Page final_page=new Final_Page(driver);
return final_page;
	}
}
