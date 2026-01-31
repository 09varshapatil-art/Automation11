package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pom.FlightBooking;


public class testClass {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver_1 = new ChromeDriver();
		driver_1.get("https://www.goibibo.com/");
		Thread.sleep(2000);
		driver_1.manage().window().maximize();
		Thread.sleep(2000);
		FlightBooking homePage = new FlightBooking(driver_1);
		homePage.clickOnPopUp1();
		homePage.clickOnPopUp2();
		homePage.clickOnRoundTrip();
//		homePage.clickOneWayTrip();
    	homePage.clickOnFrom();
    	homePage.EnterCityName("Pune");
    	homePage.clickOnPune();
    	homePage.clickOnTo();
    	homePage.sendTexttoCity("Nagpur");
    	homePage.clickOnNagpur();
    	homePage.ClickOnFromDate();
    	homePage.clickOnReturnDate();
    	homePage.clickOnSearchBtn();
    	System.out.println("<<<<<<<<<<<<<<<<<<SUCCESSFULLL>>>>>>>>>>>>>>>>");
    	
    	
	//	driver_1.quit();

	}
}
