package com.stepDefinition;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;

import com.elementRepository.BookExplorerPage;
import com.elementRepository.SelectingPackagePage;
import com.utilPackage.DriverFactory;
import com.utilityClasses.FileUtility;

import io.cucumber.java.en.When;

public class SelectingPackages {
	WebDriver driver = new DriverFactory().getDriver();
	FileUtility fileUtility =new FileUtility();
	SelectingPackagePage selectPackage=new SelectingPackagePage(driver);
	/**
	 * 
	 * @param locationData it provides the data on which we have to perform click operation
	 * @throws Exception occurs when getting data from properties files
	 */
	@When("user clicks on {int} packages")
	public void user_clicks_on_packages(Integer locationData) throws Exception {
		String locData = fileUtility.getDataFromExcel("ScenarioOutLine2", locationData, 0);
		switch (locData) {
		case "Book @1":
			selectPackage.bookLinkClick();
			Thread.sleep(2000);
            Assert.assertTrue(selectPackage.getBookLinkPageOpened().isDisplayed());
			Reporter.log("User is clicked on Book Explorer", true);
			break;

		case "Cruise":
			selectPackage.cruiseLinkClick();
			Thread.sleep(2000);
			Assert.assertTrue(selectPackage.getCruisePageOpened().isDisplayed());
			Reporter.log("User is clicked on Cruise Explorer", true);
			break;
		case "Honeymoon":
			selectPackage.honeyLinkClick();
			Thread.sleep(2000);
			Assert.assertTrue(selectPackage.getHoneyLinkOpened().isDisplayed());
			Reporter.log("User is clicked on Honeymoon Explorer", true);
			break;
		case "Air India Express Holidays":
			selectPackage.airIndiaLinkClick();
			Thread.sleep(2000);
			Assert.assertTrue(selectPackage.getAirIndiaPage().isDisplayed());
			Reporter.log("Kerala Packages are displayed", true);
			break;

		}
		
	}
			
}




