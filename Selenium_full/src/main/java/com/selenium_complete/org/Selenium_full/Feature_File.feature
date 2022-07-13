Feature: Adactin hotel page Login
 
 Background:
Given refresh the page


@login
Scenario: Login Page

Given user launch the Browser
When user Enter the valid user_Name
And user Enter The Valid Password
Then user Enter click the Login Button

@search_hotel
Scenario: user Search the Hotel

Given user Select The Location In the Location Drop Down
When user Select The Hotel name In The Hotel Drop Down
And user Select The Room Type In The Room Type Drop Down
And user Select The Number Of Rooms In The Number Of Rooms Drop Down
And user Enters The Valid Check In Date
And user Enters The Valid Check Out Date
And user Select The Number Of Adult Rooms
And user Select The Number Of Children Rooms
Then user Click The Search_button and Its navigate to next Page

@select_Hotel
Scenario: user Select The Hotel

Given user check and Select The Select_button
Then user click The continue_button and Its Navigates to Book hotel Page

@book_Hotel
Scenario: user given his Details for Book The Hotel

Given user Enter His First_Name
When user Enters His Last_Name
And user Enters The Address
And user Enters The Valid Credit Card Number
And user Enters The Credit Card Type
And user Enter The Credit Card Expiry month
And user Enter The Credit Card Expiry Year
And user Enter The Valid Credit Card CVV Number
Then user click The Book_button and Its navigates to Final Page

@final_Page
Scenario: user Logout The booking page

Given user Click the Logout_buttton



