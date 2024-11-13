package com.stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.Reporter;

import com.elementRepository.PaymentPage;
import com.utilPackage.DriverFactory;
import com.utilityClasses.FileUtility;
import com.utilityClasses.WebDriverUtility;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Payment {
	WebDriver driver = new DriverFactory().getDriver();
	WebDriverUtility driverUtility = new WebDriverUtility();
	FileUtility fileUtility = new FileUtility();
	Actions act = new Actions(driver);
	PaymentPage paymentPage = new PaymentPage(driver);

	/**
	 * This method help use select package and to handle with all the popups
	 * 
	 * @throws InterruptedException occurs when we use threads
	 */
	@When("Select the package from the list of packages")
	public void select_the_package_from_the_list_of_packages() throws InterruptedException {
		Thread.sleep(4000);
		paymentPage.assistancePopUpClick();
		Reporter.log("Assistance popup is closed", true);
		act.scrollByAmount(0, 500).perform();
		Thread.sleep(3000);
		paymentPage.imageLinkClick();
		Reporter.log("clicked on the image of package", true);
		Thread.sleep(3000);
		paymentPage.secondPopUpClick();
		Reporter.log("Sale popup is closed", true);
		Thread.sleep(2000);
		paymentPage.clickOnWithFlightClick();
		System.out.println("HELLO");
		driverUtility.switchToTabOnTitle(driver, "Holiday Package");

		if (driver.getTitle().equals("Your Dream Goa Getaway - Best Price Guaranteed!")) {
			Reporter.log("selected package with flight", true);
		} else {
			Reporter.log("selected package with flight", true);
		}

		Thread.sleep(4000);
		paymentPage.clickOnSkipClick();

		paymentPage.assisPopUpClick();
		act.scrollByAmount(0, 500).perform();
		Assert.assertTrue(paymentPage.getGalleryPage().isDisplayed());
		Reporter.log("package details page is opened..", true);
	}

	/**
	 * This method helps us to click on payment
	 * 
	 * @throws Exception occurs when getting data from properties files
	 */
	@When("click on payment")
	public void click_on_payment() throws Exception {
		paymentPage.proceedToPaymentClick();
		Assert.assertTrue(paymentPage.getPaymentButtonValidate().isDisplayed());
		Reporter.log("payment Button is clicked", true);

	}

	/**
	 * This method help us to add all the details of travellers
	 * 
	 * @throws Exception occurs when getting data from properties files in this case
	 */
	@When("add the traveller details and click on submit")
	public void add_the_traveller_details_and_click_on_submit() throws Exception {
		String firstName = fileUtility.getDataFromPropertiesFiles("firstName1");
		String lastName = fileUtility.getDataFromPropertiesFiles("lastName");
		paymentPage.addTravellerClick1();
		paymentPage.getFirstName().sendKeys(firstName);
		paymentPage.getLastName().sendKeys(lastName);

		paymentPage.ddClick();
		act.sendKeys(Keys.ARROW_DOWN).perform();
		act.sendKeys(Keys.ENTER).perform();
		paymentPage.mmClick();
		act.sendKeys(Keys.ARROW_DOWN).perform();
		act.sendKeys(Keys.ENTER).perform();
		paymentPage.yyyyClick();
		act.sendKeys(Keys.ARROW_DOWN).perform();
		act.sendKeys(Keys.ENTER).perform();
		paymentPage.genderSelectClick();
		act.sendKeys(Keys.ARROW_DOWN).perform();
		act.sendKeys(Keys.ARROW_DOWN).perform();
		act.sendKeys(Keys.ENTER).perform();
		paymentPage.addTravellerClick();

	}

	/**
	 * This method verifies the final results
	 */
	@Then("Verify the results")
	public void verify_the_results() {
		Assert.assertTrue(paymentPage.getCompletedText().isDisplayed());
		Reporter.log("traveller details were added successfully", true);

	}

}
