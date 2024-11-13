package com.elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddingActivitiesPage {
	@FindBy(xpath="//p[@id='Flight_changeLog']")
	private WebElement flightRemovedMessage;
	
	@FindBy(xpath="//span[@class='close closeIcon']")
	private WebElement secondAssistPopUp;
	
	
	@FindBy(xpath="//div[@id='viewGallery']")
	private WebElement galleryPage;
	
	@FindBy(xpath = "//span[@class='close closeIcon']")
	private WebElement assistancePopUp;

	@FindBy(xpath = "//div[@class='holidayBody']")
	private WebElement imageLink;

	@FindBy(xpath = "//div[@class='intervention-close']")
	private WebElement secondPopUp;

	@FindBy(xpath = "//div[text()='With Flight']")
	private WebElement clickOnWithFlight;

	public WebElement getClickOnWithFlight() {
		return clickOnWithFlight;
	}

	public void setClickOnWithFlight(WebElement clickOnWithFlight) {
		this.clickOnWithFlight = clickOnWithFlight;
	}

	public WebElement getSecondAssistPopUp() {
		return secondAssistPopUp;
	}

	public WebElement getImageLink() {
		return imageLink;
	}

	public WebElement getSecondPopUp() {
		return secondPopUp;
	}

	public WebElement getTransferLink() {
		return transferLink;
	}

	public WebElement getRemoveLink() {
		return removeLink;
	}

	public WebElement getUpdatePackage() {
		return updatePackage;
	}

	public WebElement getFlightRemoved() {
		return flightRemoved;
	}

	@FindBy(xpath = "//button[text()='SKIP']")
	private WebElement clickOnSkip;

	@FindBy(xpath = "//li[text()='Flights']")
	private WebElement transferLink;

	@FindBy(xpath = "//span[text()='Remove'][1]")
	private WebElement removeLink;

	@FindBy(xpath = "//button[text()='YES, REMOVE']")
	private WebElement updatePackage;

	@FindBy(xpath = "//p[@id='Flight_changeLog']")
	private WebElement flightRemoved;

	@FindBy(xpath = "//li[text()='Hotel']")
	private WebElement clickOnHotels;

	@FindBy(xpath = "//span[text()='Change']")
	private WebElement changeRoom;

	public AddingActivitiesPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getFlightRemovedMessage() {
		return flightRemovedMessage;
	}

	public WebElement getGalleryPage() {
		return galleryPage;
	}


	public WebElement getAssistancePopUp() {
		return assistancePopUp;
	}
	public void assistPopUpClick() {
		assistancePopUp.click();
	}

	public void imageLinkClick() {
		imageLink.click();
	}
	
	public void secondAssistPopUpClick() {
		secondAssistPopUp.click();
	}


	public void secondPopUpClick() {
		secondPopUp.click();
	}

	public void clickOnWithFlightClick() {
		clickOnWithFlight.click();
	}

	public WebElement getClickOnSkip() {
		return clickOnSkip;
	}

	public void transferLinkClick() {
		transferLink.click();
	}

	public void removeLinkClick() {
		removeLink.click();
	}

	public void updatePackageClick() {
		 updatePackage.click();
	}

	public void flightRemovedClick() {
		flightRemoved.click();
	}

	public WebElement getClickOnHotels() {
		return clickOnHotels;
	}
	public void clickOnHotelsClick() {
		clickOnHotels.click();
	}

	public WebElement getChangeRoom() {
		return changeRoom;
	}

}
