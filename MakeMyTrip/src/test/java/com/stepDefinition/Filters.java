package com.stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.Reporter;

import com.elementRepository.FilterPage;
import com.utilPackage.DriverFactory;
import com.utilityClasses.FileUtility;
import com.utilityClasses.WebDriverUtility;

import io.cucumber.java.en.When;

public class Filters {
	WebDriver driver = new DriverFactory().getDriver();
	WebDriverUtility driverUtility = new WebDriverUtility();
	FileUtility fileUtility = new FileUtility();
	Actions act = new Actions(driver);
	FilterPage filterPage = new FilterPage(driver);

	/**
	 * This method helps us to select the package 
	 * @throws InterruptedException occurs when we are using Threads
	 */
	@When("Select the package for the trip")
	public void select_the_package_for_the_trip() throws InterruptedException {
		Thread.sleep(4000);
		// handling the popups
		filterPage.assistancePopUpClick();
		act.scrollByAmount(0, 300).perform();
	}

	/**
	 * This method performs the click operation on such button
	 */
	@When("click on search button")
	public void click_on_search_button() {
		filterPage.searchButtonClick();
		Assert.assertTrue(filterPage.getSearchPageopened().isDisplayed());
		Reporter.log("clicked on Search button successfully", true);
	}

	/**
	 * This method helps us to add the filters to the package
	 * @throws InterruptedException occurs when dealing with threads
	 */
	@When("now add filters of price duration of stay")
	public void now_add_filters_of_price_duration_of_stay() throws InterruptedException {
		filterPage.clickOnFlightClick();
		Assert.assertTrue(filterPage.getFlightSelected().isDisplayed());
		Reporter.log("with flight filter is applied", true);
        WebElement element = filterPage.getMovingToFlight();
		act.moveToElement(element).click().perform();
		filterPage.dropdownClick();
		filterPage.priceSelectionClick();
		Reporter.log("price range is selected from the package");
		Assert.assertTrue(filterPage.getFilterChecking().isDisplayed());
		Reporter.log("filters are applied");
	}

}
