package com.elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectingPackagePage {
	@FindBy(xpath = "//a[text()='Almaty']")
	private WebElement bookLinkPageOpened;

	@FindBy(xpath = "//a[text()='2N Kuala Lumpur']")
	private WebElement cruisePageOpened;

	@FindBy(xpath = "//a[text()='Inspiration']")
	private WebElement honeyLinkOpened;

	@FindBy(xpath = "//a[text()='Oman']")
	private WebElement airIndiaPage;

	@FindBy(xpath = "//span[text()='Book @1']")
	private WebElement bookLink;

	@FindBy(xpath = "//span[text()='Cruise']")
	private WebElement cruiseLink;

	@FindBy(xpath = "//span[text()='Honeymoon']")
	private WebElement honeyLink;

	@FindBy(xpath = "//span[text()='Air India Express Holidays']")
	private WebElement airIndiaLink;

	public WebElement getBookLinkPageOpened() {
		return bookLinkPageOpened;
	}

	public WebElement getCruisePageOpened() {
		return cruisePageOpened;
	}

	public WebElement getHoneyLinkOpened() {
		return honeyLinkOpened;
	}

	public WebElement getAirIndiaPage() {
		return airIndiaPage;
	}

	public void bookLinkClick() {
		 bookLink.click();
	}

	public void cruiseLinkClick() {
		 cruiseLink.click();
	}

	public void honeyLinkClick() {
		 honeyLink.click();
	}

	public void airIndiaLinkClick() {
		 airIndiaLink.click();
	}

	public SelectingPackagePage(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}

}
