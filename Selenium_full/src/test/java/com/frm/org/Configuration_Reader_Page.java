package com.frm.org;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class Configuration_Reader_Page {
	
	public static Properties pro;
	
	public Configuration_Reader_Page() throws Throwable {
File f=new File("C:\\Users\\USER\\eclipse-workspace\\Selenium_full\\src\\test\\java\\com\\frm\\org\\Configuration.properties");
FileInputStream fis=new FileInputStream(f);
pro=new Properties();
pro.load(fis);
	
	}

	
	public  String get_Browser_Name() {
String browser_Name = pro.getProperty("browsername");
return browser_Name;
	}
	
	
	
	public  String get_url() {
String url = pro.getProperty("url");
return url;
	}
	
	public String get_hotel_Location() {
String hotel_Location = pro.getProperty("hotelLocation");
return hotel_Location;
	}
public String get_hotel_Name() {
String hotel_Name = pro.getProperty("hotelName");
return hotel_Name;
}

public  String get_Room_Type() {
String room_Type = pro.getProperty("roomType");
return room_Type;
}

public String get_Number_Of_Rooms() {
String number_Of_Rooms = pro.getProperty("noOfRooms");
return number_Of_Rooms;

}

public String get_Check_In_Date() {
String check_In_Date = pro.getProperty("checkInDate");
return check_In_Date;
}

public String get_Check_Out_Date() {
String check_Out_Date = pro.getProperty("checkOutDate");
return check_Out_Date;
}

public String get_Adult_Rooms() {
String adult_Rooms = pro.getProperty("adultRoom");
return adult_Rooms;
}

public String get_Children_Rooms() {
String children_Rooms = pro.getProperty("childrenRoom");
return children_Rooms;

}

public  String get_First_Name() {
String first_Name = pro.getProperty("firstName");
return first_Name;

}

public String get_Last_Name() {
String last_Name = pro.getProperty("lastName");
return last_Name;
}


public String get_Address() {
String address = pro.getProperty("address");
return address;
}

public String get_Credit_Card_No() {
String credit_Card_Number = pro.getProperty("creditCardNo");
return credit_Card_Number;
}

public String get_Credit_Card_Type() {
String credit_Card_Type = pro.getProperty("creditCardType");
return credit_Card_Type;

}

public String get_Credit_Card_Expiry_Month() {
String credit_Card_Expiry_Month = pro.getProperty("ccExpirymonth");
return credit_Card_Expiry_Month;
}


public String get_Credit_Card_Expiry_Year() {
String credit_Card_Expiry_Year = pro.getProperty("ccExpiryYear");
return credit_Card_Expiry_Year;
}

public String get_CVV_Number() {
String cvv_Number = pro.getProperty("cvvNo");
return cvv_Number;
}
}


