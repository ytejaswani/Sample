package com.stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.Reporter;

import com.elementRepository.AddingActivitiesPage;
import com.utilPackage.DriverFactory;
import com.utilityClasses.FileUtility;
import com.utilityClasses.WebDriverUtility;

import io.cucumber.java.en.When;

public class AddingActivitiesToPackage {
	WebDriver driver = new DriverFactory().getDriver();
    WebDriverUtility driverUtility = new WebDriverUtility();
	FileUtility fileUtility = new FileUtility();
    Actions act = new Actions(driver);
    AddingActivitiesPage addingActivities=new AddingActivitiesPage(driver);
    
     
    /**
     * This method is used to select package with flights.
     * @throws InterruptedException occurs when we are using threads
     */
    
	@When("Now select package from package by clicking  flights and check with title")
	public void now_select_package_from_package_by_clicking_flights_and_check_with_title() throws InterruptedException {
		Thread.sleep(4000);
		
        //closing the getAssistance popup
		addingActivities.assistPopUpClick();
		Reporter.log("Assistance popup is closed",true);

		act.scrollByAmount(0, 500).perform();
		Thread.sleep(3000);
        
		//clicking on the image
		addingActivities.imageLinkClick();
		Assert.assertTrue(addingActivities.getClickOnWithFlight().isDisplayed());
		Reporter.log("clicked on the image of package",true);
		Thread.sleep(3000);
		
        //Sale popup is closed
		addingActivities.secondPopUpClick();
		Reporter.log("Sale popup is closed",true);
		Thread.sleep(2000);
		
        //select the package with flight
		addingActivities.clickOnWithFlightClick();
        driverUtility.switchToTabOnTitle(driver, "Holiday Package");
        
        //two different packages are present to get both the titles
		if (driver.getTitle().equals("Your Dream Goa Getaway - Best Price Guaranteed!")) {
			Reporter.log("selected package with flight", true);
		} else {
			Reporter.log("selected package with flight", true);
	    }
        Thread.sleep(4000);
		addingActivities.getClickOnSkip().click();
        addingActivities.secondAssistPopUpClick();
		act.scrollByAmount(0, 500).perform();
		Assert.assertTrue(addingActivities.getGalleryPage().isDisplayed());
		Reporter.log("package details page is opened..",true);
	}

	/**
	 * This method is used to remove flights before navigating to the payment
	 */
	@When("user is able to select or remove the flights and update package")
	public void user_is_able_to_select_or_remove_the_flights_and_update_package() {
		
		addingActivities.transferLinkClick();
		Reporter.log("clicked on the flights and transfer link",true);
		addingActivities.removeLinkClick();
		Reporter.log("removed the flight",true);
		addingActivities.updatePackageClick();
		Reporter.log("updated the package",true);
		addingActivities.flightRemovedClick();
		Assert.assertTrue(addingActivities.getFlightRemovedMessage().isDisplayed());
		Reporter.log("flight is removed from the package",true);
	}

	/**
	 * This method is used to see the details of the hotel room
	 * @throws InterruptedException occurs when we are using threads
	 */
	@When("User is able to see the details of the Hotel rooms")
	public void user_is_able_to_see_the_details_of_the_hotel_rooms() throws InterruptedException {
		driverUtility.waitForElementPresent(driver, addingActivities.getClickOnHotels());
		addingActivities.clickOnHotelsClick();
		Reporter.log("clicked on the hotels");
		WebElement changeRoom = addingActivities.getChangeRoom();
		act.moveToElement(changeRoom).click();
		Assert.assertTrue(addingActivities.getChangeRoom().isDisplayed());
		Reporter.log("Details of the room were displayed",true);

	}

}
