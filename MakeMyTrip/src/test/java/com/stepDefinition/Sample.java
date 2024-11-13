package com.stepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.Reporter;

import com.elementRepository.SamplePage;
import com.utilPackage.DriverFactory;
import com.utilityClasses.FileUtility;
import com.utilityClasses.WebDriverUtility;

import io.cucumber.java.en.When;

public class Sample {
	WebDriver driver=DriverFactory.getDriver();
	WebDriverUtility driverUtility=new WebDriverUtility();
	FileUtility fileUtility=new FileUtility();
	Actions act;
	SamplePage sample=new SamplePage(driver);
/**
 * 	This method helps us to scroll down to the page
 * @throws Exception 
 */
@When("user should move to the end of the package page to select")
public void user_should_move_to_the_end_of_the_package_page_to_select() throws Exception {
	Thread.sleep(3000);
	act=new Actions(driver);
	act.scrollByAmount(0, 800).perform();
   Thread.sleep(2000);
   act.scrollByAmount(0, 800).perform();
   Thread.sleep(2000);
   act.scrollByAmount(0, 800).perform();
   Thread.sleep(2000);
   act.scrollByAmount(0, 500).perform();
   sample.clickonDubaiPackageClick();
   String dubaiUrl = fileUtility.getDataFromPropertiesFiles("dubaiURL");
   Assert.assertTrue(driver.getCurrentUrl().contains("dubai-vacation-tour-packages.html"),dubaiUrl);
   Reporter.log("reached the Dubai package",true);
}

/**
 * This method help us to see the details of the all packages and offers in selected package
 * @throws InterruptedException occurs when getting data from properties files
 */
@When("scroll down untill user is reached to the details of all packages")
public void scroll_down_untill_user_is_reached_to_the_details_of_all_packages() throws InterruptedException {
	sample.getPopUp().click();
	act.scrollByAmount(0, 800).perform();
	   Thread.sleep(2000);
	   act.scrollByAmount(0, 800).perform();
	   Thread.sleep(2000);
	   act.scrollByAmount(0, 800).perform();
	   Thread.sleep(2000);
	  act.moveToElement( sample.getMoveToDubaiPackages());
	  act.scrollByAmount(0, 600).perform();
	  Assert.assertTrue(sample.getDubaiPageValidate().isDisplayed());
	   Reporter.log("details of all the packages are displayed",true);
}


}
