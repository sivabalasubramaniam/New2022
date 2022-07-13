package com.base_Class.org;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Base_Class {

	public static WebDriver driver;
	
	public static WebDriver get_Browser() throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\USER\\eclipse-workspace\\Selenium\\src\\DriverFolder\\chromedriver.exe");

		driver = new ChromeDriver();
		Thread.sleep(3000);
		return driver;
	}

	public static void get_URL(String url) {
		try {
			driver.get(url);
			driver.manage().window().maximize();
		} catch (Exception e) {
			e.printStackTrace();

		}
		System.out.println("URL passed");

	}

	public static void get_Navigate(String option, String url) {

		try {
			if (option.equalsIgnoreCase("to")) {
				driver.navigate().to(url);

			} else if (option.equalsIgnoreCase("back")) {
				driver.navigate().back();
			} else if (option.equalsIgnoreCase("forward")) {
				driver.navigate().forward();
			} else if (option.equalsIgnoreCase("refresh")) {
				driver.navigate().refresh();
			} else {
				System.out.println("Navigate Option Invalid");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void get_Close() {
		driver.close();
	}

	public static void get_Quit() {
		driver.quit();
	}

	public static void get_Title() {
		driver.getTitle();

	}

	public static void get_Page_Source() {
		driver.getPageSource();
	}

	public static void get_Current_URL() {
		driver.getCurrentUrl();
	}

	public static void text_Area(WebElement element, String value) {
		element.sendKeys(value);
	}

	public static void click_Option(WebElement element) {
		element.click();
	}

	public static void clear_Option(WebElement element) {
		element.clear();
	}

	public static void element_Is_Enable(WebElement element) {
System.out.println(element.isEnabled());
	}
	
	public static void element_Is_Displayed(WebElement element) {
System.out.println(element.isDisplayed());
	}
	public static void element_Is_Selected(WebElement element) {
System.out.println(element.isSelected());
	}
	
public static void select_Option(String option, String value, WebElement element) {

	Select sc=new Select(element);
	try {
	if (option.equalsIgnoreCase("byIndex")) {
		int parseInt= Integer.parseInt(value);
		sc.selectByIndex(parseInt);
	} else if (option.equalsIgnoreCase("byValue")) {
		sc.selectByValue(value);
	} else if (option.equalsIgnoreCase("byVisibleText")) {
		sc.selectByVisibleText(value);
	} else {
System.out.println("Select Option Invalid ");
	}

	}catch (Exception e) {
e.printStackTrace();
	}
}

public void deSelect_Option(WebElement element, String option, String value) {

	Select sc=new Select(element);
	try {
	if (option.equalsIgnoreCase("byIndex")) {
		int parseInt=Integer.parseInt(value);
		sc.deselectByIndex(parseInt);
		
	} else if (option.equalsIgnoreCase("ByValue")) {
		sc.deselectByValue(value);
	} else if (option.equalsIgnoreCase("byVisibleText")) {
		sc.deselectByVisibleText(value);
		
	} else if (option.equalsIgnoreCase("all")) {
		sc.deselectAll();
	} else {
System.out.println("Deselect option Invalid");
	} 

	}catch (Exception e) {
e.printStackTrace();
	}

}

	
	
	
public static void actions_Operation(WebElement element, String option, WebElement source, WebElement target) {

	Actions ac=new Actions(driver);
try {	
	if (option.equalsIgnoreCase("click")) {
		ac.click(element).build().perform();
	} else if (option.equalsIgnoreCase("doubleClick")) {
		ac.doubleClick(element).build().perform();
	} else if (option.equalsIgnoreCase("clickAndHold")) {
		ac.clickAndHold(element).build().perform();
	} else if (option.equalsIgnoreCase("rightClick")) {
		ac.contextClick(element).build().perform();
	} else if (option.equalsIgnoreCase("moveToElement")) {
		ac.moveToElement(element).build().perform();
	} else if (option.equalsIgnoreCase("dragAndDrop")) {
		ac.dragAndDrop(source, target).build().perform();
	} else if (option.equalsIgnoreCase("release")) {
		ac.release(element).build().perform();
	} else {
System.out.println("Action Operaation InValid");
	}

	}catch (Exception e) {
e.printStackTrace();
}

	}


public static void frame_Concept(WebElement inner_Frame, String option, WebElement outter_Frame) {
	
try {	
	if (option.equalsIgnoreCase("singleFrame")) {
		
		driver.switchTo().frame(inner_Frame);
		
	} else if (option.equalsIgnoreCase("mutipleFrame")) {
		
		driver.switchTo().frame(outter_Frame);
		driver.switchTo().frame(inner_Frame);
	} else {
System.out.println("Frame Concept Invalid");
	}

}catch (Exception e) {
e.printStackTrace();
}	
	

}


public static void alert_Concepts(String option, String value) {

	Alert a=driver.switchTo().alert();
	try {
		if (option.equalsIgnoreCase("ok")) {
			a.accept();
		} else if (option.equalsIgnoreCase("dismiss")) {
			a.dismiss();
		} else if (option.equalsIgnoreCase("prompt")) {
			a.sendKeys(value);
			a.accept();
		} else {
			System.out.println("Alert Concepts Invalid");
		} 
		}catch (Exception e) {
e.printStackTrace();
}
	
	} 

	}

	
	
	
	
	





	

	


	




	
	

	
	
	

