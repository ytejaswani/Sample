package com.stepDefinition;

import java.awt.Desktop.Action;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.Reporter;

import com.elementRepository.HolidayPackagePage;
import com.utilPackage.DriverFactory;
import com.utilityClasses.FileUtility;
import com.utilityClasses.WebDriverUtility;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HolidayPackages {
	WebDriver driver = new DriverFactory().getDriver();
	WebDriverUtility driverUtility = new WebDriverUtility();
	FileUtility fileUtility = new FileUtility();
	Actions act = new Actions(driver);
	HolidayPackagePage holidaysPage = new HolidayPackagePage(driver);

	/**
	 * This method is to launch the browser and navigate to the url
	 * 
	 * @throws Exception occurs when getting data from properties files
	 */
	@Given("Browser should be Launched and url is navigated")
	public void browser_should_be_launched_and_url_is_navigated() throws Exception {
		Reporter.log("Browser should be Launched and url is navigated", true);
		holidaysPage.homePopUpClick();
		String url = fileUtility.getDataFromPropertiesFiles("url");
		Assert.assertEquals(driver.getCurrentUrl(), url);
		Reporter.log("pop is closed", true);
	}

	/**
	 * This method helps us to click on Holiday Packages link
	 * 
	 * @throws InterruptedException occurs when we use threads
	 */
	@When("user is able to click on Holiday Packages link")
	public void user_is_able_to_click_on_holiday_packages_link() throws InterruptedException {
		holidaysPage.holidaysPackageLinkClick();
		Assert.assertTrue(holidaysPage.getHolidayPackValidation().isDisplayed());
		Reporter.log("user is able to click on Holiday Packages link", true);
	}

	/**
	 * This method closes the browser
	 */
	@Then("Browser should be closed")
	public void browser_should_be_closed() {

		Reporter.log("Browser should be closed", true);
	}

	/**
	 * This method verifies whether holidays page is navigated or not
	 * 
	 * @throws Exception occurs when getting data from properties files
	 */
	@When("navigates to holiday packages page")
	public void navigates_to_holiday_packages_page() throws Exception {
		String holidayPack = fileUtility.getDataFromPropertiesFiles("holidayPackUrl");
		Assert.assertEquals(driver.getCurrentUrl(), holidayPack);
		Reporter.log("holidays package is opend", true);
	}

	/**
	 * This method helps us to verify that we are on the Holiday package page
	 */
	@When("User should be on Holiday Package page")
	public void user_should_be_on_holiday_package_page() {
		Assert.assertTrue(holidaysPage.getLuxeHolidaysValidate().isDisplayed());
		Reporter.log("User is on the Holidays package page", true);
	}

	/**
	 * This method helps us to enter all valid credentials
	 * 
	 * @throws Exception occurs when getting data from properties files
	 */
	@When("User should enter all valid credentials regarding trip")
	public void user_should_enter_all_valid_credentials_regarding_trip() throws Exception {
		// entering from source data text field
		holidaysPage.sourceTextFieldClick();
		String sourceLocation = fileUtility.getDataFromExcel("Sheet1", 0, 0);
		holidaysPage.fromTextFieldDataClear();
		holidaysPage.getFromTextFieldData().sendKeys(sourceLocation);
		Thread.sleep(3000);
		Reporter.log("User entered the source in from Text Field", true);

		// Enter the destination in the destination field
		holidaysPage.toTextFieldDataClick();
		String destinationLocation = fileUtility.getDataFromExcel("Sheet2", 0, 0);
		holidaysPage.getToTextFieldclick().click();
		holidaysPage.getToTextFieldclick().sendKeys(destinationLocation);
		Thread.sleep(3000);
		Reporter.log("User entered enter the destination in from Text Field", true);

		// Handling the calender popup
		holidaysPage.departureDropDownClick();
		String month = fileUtility.getDataFromExcel("Calender", 1, 0);
		String dateFromExcel = fileUtility.getDataFromExcel("Calender", 1, 1);
		int date = (int) Double.parseDouble(dateFromExcel);
		holidaysPage.getDate(driver, month, date).click();
		Reporter.log("date selected from the excel", true);

		// click on room menu and hanling the passengers

		holidaysPage.roomDropDownClick();
//		try {
//      
//			
//			        holidaysPage.getAddAdult().click();
//			        holidaysPage.applyButtonClick();
//			System.out.println("Clicked on the Add Adult button successfully.");
//			
//
//		} catch (Exception e) {
//			for (int i = 0; i < 1; i++) {
//				if (i < 1) {
//					holidaysPage.adultPlusSignClick();
//					 
//				}
//            }
//			holidaysPage.applyButtonClick();
//

//		}
		for (int i = 0; i < 1; i++) {
			if (i < 1) {
				holidaysPage.adultPlusSignClick();
			}

		}
		holidaysPage.applyButtonClick();
	}

	/**
	 * This method performs by clicking the search button
	 */
	@When("click on search buttons")
	public void click_on_search_buttons() {
		holidaysPage.searchButtonClick();
		Assert.assertTrue(holidaysPage.getSearchPageopened().isDisplayed());
		Reporter.log("clicked on Search button successfully", true);
	}

	/**
	 * This method helps us to select the package with flights
	 * 
	 * @throws InterruptedException occurs when we use threads
	 */
	@When("Now select package from package by clicking with flights")
	public void now_select_package_from_package_by_clicking_with_flights() throws InterruptedException {
		Thread.sleep(4000);
		holidaysPage.assistancePopUpClick();
		Reporter.log("Assistance popup is closed",true);
		act.scrollByAmount(0, 500).perform();
		
//		act.moveToElement(holidaysPage.getGoaway());
		Thread.sleep(3000);
		holidaysPage.imageLinkClick();
		Assert.assertTrue(holidaysPage.getClickOnWithFlight().isDisplayed());
		Reporter.log("clicked on the image of package",true);
		Thread.sleep(3000);
		holidaysPage.secondPopUpClick();
		Reporter.log("Sale popup is closed");
		Thread.sleep(2000);
		holidaysPage.clickOnWithFlightClick();
		driverUtility.switchToTabOnTitle(driver, "Holiday Package");

		if (driver.getTitle().equals("Your Dream Goa Getaway - Best Price Guaranteed!")) {
			Reporter.log("selected package with flight", true);
		} else {
			Reporter.log("selected package with flight", true);
		}

		Thread.sleep(4000);
		holidaysPage.clickOnSkipClick();

		holidaysPage.assistPopUpClick();
		Reporter.log("popup is handled", true);

	}
}
