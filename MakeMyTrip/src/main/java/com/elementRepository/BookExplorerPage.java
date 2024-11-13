package com.elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookExplorerPage {
	@FindBy(xpath = "//span[@class='close closeIcon']")
	private WebElement assistancePopUp;
	
	public WebElement getAssistancePopUp() {
		return assistancePopUp;
	}
	public WebElement getOpenedPageValidate() {
		return openedPageValidate;
	}
	@FindBy(xpath="//h1[text()='South India Packages']")
	private WebElement southIndia;
	
	@FindBy(xpath="//span[text()='Explore']")
	private WebElement openedPageValidate;
	
	
	@FindBy(xpath = "//span[text()='Book @1']")
	private WebElement bookExplorerLink;
	
	@FindBy(xpath = "//a[text()='South India']")
	private WebElement southIndiaLink;
	
	@FindBy(xpath = "//ul[@class='hdlRegion__citylist']//a[text()='Kashmir']")
	private WebElement kashmirLink;
	
    @FindBy(xpath = "//ul[@class='hdlRegion__citylist']//a[text()='Goa']")
	private WebElement goaLink;
    
	@FindBy(xpath = "//ul[@class='hdlRegion__citylist']//a[text()='Kerala']")
	private WebElement Kerala;

	public BookExplorerPage(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}
	public WebElement getSouthIndia() {
		return southIndia;
	}


	public void southIndiaLinkClick() {
		southIndiaLink.click();
	}


	public void bookExplorerLinkClick() {
		bookExplorerLink.click();
	}

	

	public WebElement getKashmirLink() {
		return kashmirLink;
	}

	public WebElement getGoaLink() {
		return goaLink;
	}
	public void goaLinkClick() {
		goaLink.click();
	}

	public WebElement getKerala() {
		return Kerala;
	}
	public void keralaLinkClick() {
		Kerala.click();
	}

}
