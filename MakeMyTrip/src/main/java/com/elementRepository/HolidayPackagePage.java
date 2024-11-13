package com.elementRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HolidayPackagePage {
	@FindBy(xpath="//p[text()='Your Dream Goa Getaway - Best Price Guaranteed!']")
	private WebElement goaway;
	
	public WebElement getGoaway() {
		return goaway;
	}

	public WebElement getClickOnWithFlight() {
		return clickOnWithFlight;
	}

	@FindBy(xpath="//span[text()='Book @1']")
	private WebElement holidayPackValidation;
	
	@FindBy(xpath="//span[text()='Luxe Holidays']")
	private WebElement luxeHolidaysValidate;

	public WebElement getLuxeHolidaysValidate() {
		return luxeHolidaysValidate;
	}

	public WebElement getHolidayPackValidation() {
		return holidayPackValidation;
	}

	@FindBy(xpath = "//span[@data-cy='closeModal']")
	private WebElement homePopUp;

	@FindBy(xpath = "//span[text()='Holiday Packages' and @class='headerIconTextAlignment chNavText darkGreyText']")
	private WebElement holidaysPackageLink;

	@FindBy(xpath = "//label[@class='lbl_input makeFlex column latoBold']")
	private WebElement fromTextFieldClick;

	@FindBy(xpath = "//input[@class='citypicker_input']")
	private WebElement fromTextFieldData;

	@FindBy(xpath = "//span[text()='To City/Country/Category']")
	private WebElement toTextFieldData;

	@FindBy(xpath = "//input[@class='dest-search-input removeBoxShadow']")
	private WebElement toTextFieldclick;

	@FindBy(xpath = "//span[@class='appendBottom5 field-label down-arrow ']")
	private WebElement departureDropDown;

	@FindBy(xpath = "//button[text()='Add']")
	private WebElement addAdult;

	@FindBy(xpath = "//div[@data-testid=\"adult-increment-counter\"]")
	private WebElement adultPlusSign;

	@FindBy(xpath = "//p[text()='Experience beaches and sunset']")
	private WebElement searchPageopened;

	@FindBy(xpath = "//div[@class='field-label down-arrow ']")
	private WebElement roomDropDown;

	@FindBy(xpath = "//span[@class='close closeIcon']")
	private WebElement assistPopUp;

	@FindBy(xpath = "//button[text()='SKIP']")
	private WebElement clickOnSkip;

	@FindBy(xpath = "//button[@class='applyBtn applyBtn-enabled']")
	private WebElement applyButton;

	@FindBy(xpath = "//button[text()='Search']")
	private WebElement searchButton;

	@FindBy(xpath = "//span[@class='close closeIcon']")
	private WebElement assistancePopUp;

	@FindBy(xpath = "//div[@class='holidayBody']")
	private WebElement imageLink;
	
	@FindBy(xpath = "//div[@class='intervention-close']")
	private WebElement secondPopUp;
	
	@FindBy(xpath = "//div[text()='With Flight']")
	private WebElement clickOnWithFlight;

	public HolidayPackagePage(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}

	public void homePopUpClick() {
	     homePopUp.click();
	}

	public void holidaysPackageLinkClick() {
		 holidaysPackageLink.click();
	}

	public void sourceTextFieldClick() {
		 fromTextFieldClick.click();
	}

	public WebElement getFromTextFieldData() {
		return fromTextFieldData;
	}
	public void fromTextFieldDataClear() {
		 fromTextFieldData.clear();
	}

	
	public void toTextFieldDataClick() {
		 toTextFieldData.click();
	}

	public WebElement getToTextFieldclick() {
		return toTextFieldclick;
	}

	public void departureDropDownClick() {
		 departureDropDown.click();
	}

	public WebElement getAddAdult() {
		return addAdult;
	}

	public void adultPlusSignClick() {
		 adultPlusSign.click();
	}

	public void assistPopUpClick() {
		 assistPopUp.click();
	}

	public void clickOnSkipClick() {
		 clickOnSkip.click();
	}

	public void applyButtonClick() {
		 applyButton.click();
	}

	public void searchButtonClick() {
		 searchButton.click();
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

	public WebElement getDate(WebDriver driver, String month, int date) {
		return driver.findElement(By.xpath("//div[contains(text(),'" + month + "')]/../..//p[text()='" + date + "']"));
	}

	public void roomDropDownClick() {
		 roomDropDown.click();
	}

	public WebElement getSearchPageopened() {
		return searchPageopened;
	}

}
