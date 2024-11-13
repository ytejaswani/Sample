package com.elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SamplePage {
	@FindBy(xpath="//span[text()='TOP DOMESTIC AIRLINES']")
	private WebElement dubaiPageValidate;
	
	public WebElement getDubaiPageValidate() {
		return dubaiPageValidate;
	}

	@FindBy(xpath = "//span[@class='close closeIcon']")
	private WebElement popUp;

	@FindBy(xpath = "//span[text()='DUBAI PACKAGES BY THEME']")
	private WebElement moveToDubaiPackages;

	@FindBy(xpath = "//a[text()=' Dubai Tour Packages']")
	private WebElement clickonDubaiPackage;

	public SamplePage(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}

	public WebElement getPopUp() {
		return popUp;
	}

	public void clickonDubaiPackageClick() {
		 clickonDubaiPackage.click();
	}

	public WebElement getMoveToDubaiPackages() {
		return moveToDubaiPackages;
	}

}
