package com.elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FilterPage {
	@FindBy(xpath="//span[text()='With Flight']")
	private WebElement flightSelected;
	
	public WebElement getFlightSelected() {
		return flightSelected;
	}
	@FindBy(xpath = "//button[text()='Search']")
	private WebElement searchButton;
	
	@FindBy(xpath = "//p[text()='Experience beaches and sunset']")
	private WebElement searchPageopened; 
	
	public void searchButtonClick() {
		searchButton.click();
	}

	public WebElement getSearchPageopened() {
		return searchPageopened;
	}
	@FindBy(xpath="//span[@class='categoryRating  ']/span[text()='4']")
	private WebElement movingToFlight;
	

	@FindBy(xpath = "//span[@class='close closeIcon']")
	private WebElement assistancePopUp;

	@FindBy(xpath = "//span[@class='icon mmt-chevron-down']")
	private WebElement dropdown;

	@FindBy(xpath = "//ul[@class='sortingDropdown']//li[3]")
	public WebElement priceSelection;

	@FindBy(xpath = "//span[@class='clearAll']")
	public WebElement filterChecking;

	@FindBy(xpath = "//span[text()='With Flight']")
	private WebElement clickOnFlight;

	public void assistancePopUpClick() {
		assistancePopUp.click();
	}

	public void clickOnFlightClick() {
		 clickOnFlight.click();
	}

	public FilterPage(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}

	public void dropdownClick() {
		 dropdown.click();
	}

	public void priceSelectionClick() {
		 priceSelection.click();
	}

	public WebElement getFilterChecking() {
		return filterChecking;
	}
	public WebElement getMovingToFlight() {
		return movingToFlight;
	}
}
