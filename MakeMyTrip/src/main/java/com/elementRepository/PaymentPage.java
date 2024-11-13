package com.elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaymentPage {
	@FindBy(xpath="//div[@id='viewGallery']")
	private WebElement galleryPage;
	
	@FindBy(xpath="(//div[@class='makeFlex row hrtlCenter relative']/h4)[1]")
	private WebElement paymentButtonValidate;
	
	public WebElement getPaymentButtonValidate() {
		return paymentButtonValidate;
	}

	public WebElement getGalleryPage() {
		return galleryPage;
	}

	public void setGalleryPage(WebElement galleryPage) {
		this.galleryPage = galleryPage;
	}

	@FindBy(xpath = "//span[@class='close closeIcon']")
	private WebElement assistancePopUp;

	@FindBy(xpath = "//div[@class='holidayBody']")
	private WebElement imageLink;

	@FindBy(xpath = "//div[@class='intervention-close']")
	private WebElement secondPopUp;

	@FindBy(xpath = "//div[text()='With Flight']")
	private WebElement clickOnWithFlight;

	@FindBy(xpath = "//button[text()='SKIP']")
	private WebElement clickOnSkip;

	@FindBy(xpath = "//span[text()='PROCEED TO PAYMENT']")
	private WebElement proceedToPayment;

	@FindBy(xpath = "(//p[text()='Add Traveller'])[1]")
	private WebElement addTraveller1;

	@FindBy(xpath = "//input[@name='FIRST_NAME']")
	private WebElement firstName;

	@FindBy(xpath = "//input[@name='LAST_NAME']")
	private WebElement lastName;

	@FindBy(xpath = "//span[@class='close closeIcon']")
	private WebElement assisPopUp;
	
	@FindBy(xpath = "//div[text()='DD']")
	private WebElement dd;
	
	@FindBy(xpath = "//div[text()='MM']")
	private WebElement mm;
	
	@FindBy(xpath = "//div[text()='YYYY']")
	private WebElement yyyy;
	
	@FindBy(xpath = "(//div[@class='react-select-formV2__value-container react-select-formV2__value-container--has-value css-1hwfws3'])[3]")
	private WebElement genderSelect;
	
	@FindBy(xpath = "//button[text()='Add Traveller']")
	private WebElement addTraveller;
	
	@FindBy(xpath = "//span[text()='COMPLETE']")
	private WebElement completedText;

	public PaymentPage(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}

	public void assistancePopUpClick() {
		 assistancePopUp.click();
	}

	public void imageLinkClick() {
		 imageLink.click();
	}

	public void secondPopUpClick() {
		 secondPopUp.click();
	}

	public void clickOnWithFlightClick() {
		 clickOnWithFlight.click();
	}

	public void clickOnSkipClick() {
		 clickOnSkip.click();
	}

	public void proceedToPaymentClick() {
		 proceedToPayment.click();
	}

	public void addTravellerClick1() {
		 addTraveller1.click();
	}

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public void assisPopUpClick() {
		 assisPopUp.click();
	}

	public void ddClick() {
		 dd.click();
	}

	public void mmClick() {
		 mm.click();
	}

	public void yyyyClick() {
		 yyyy.click();
	}

	public void genderSelectClick() {
		 genderSelect.click();
	}

	public void addTravellerClick() {
		 addTraveller.click();
	}

	public WebElement getCompletedText() {
		return completedText;
	}

}
