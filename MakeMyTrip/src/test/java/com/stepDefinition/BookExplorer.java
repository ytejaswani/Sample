package com.stepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.Reporter;

import com.elementRepository.BookExplorerPage;
import com.utilPackage.DriverFactory;
import com.utilityClasses.FileUtility;
import com.utilityClasses.WebDriverUtility;

import io.cucumber.java.en.When;

public class BookExplorer {
	WebDriver driver = new DriverFactory().getDriver();
    FileUtility fileUtility = new FileUtility();
    WebDriverUtility driverUtility = new WebDriverUtility();
	BookExplorerPage bookExplore=new BookExplorerPage(driver);
	Actions act=new Actions(driver);
	
	/**
	 * This method help us to click on BookExplorer link
	 */
	@When("User should click on BookLink")
	public void user_should_click_on_book_link() {
		bookExplore.bookExplorerLinkClick();
    }

	/**
	 * 
	 * @param locationData it passes the web element on which we have to perform click action
	 * @throws Exception occurs when we are using threads
	 */
	@When("user clicks on {int} inside BookMenu")
	public void user_clicks_on_inside_book_menu(Integer locationData) throws Exception {
		String locData = fileUtility.getDataFromExcel("Sheet3", locationData, 0);
		switch (locData) {
		case "South India":
			bookExplore.southIndiaLinkClick();
		    Thread.sleep(2000);
		    driverUtility.switchToTabOnTitle(driver, "Holiday Packages");
		    Assert.assertEquals(driver.getTitle(),"Holiday Packages");
            Reporter.log("South India Packages are displayed", true);
			break;

		case "Goa":
			bookExplore.goaLinkClick();
			Thread.sleep(2000);
			driverUtility.switchToTabOnTitle(driver, "Holiday Packages");
			Assert.assertEquals(driver.getTitle(),"Holiday Packages");
			Reporter.log("Goa Packages are displayed", true);
			break;
		case "Kerala":
			bookExplore.keralaLinkClick();
			Thread.sleep(2000);
			driverUtility.switchToTabOnTitle(driver, "Holiday Packages");
			Assert.assertEquals(driver.getTitle(),"Holiday Packages");
			Reporter.log("Kerala Packages are displayed", true);
			break;

		}
		
	}

}
