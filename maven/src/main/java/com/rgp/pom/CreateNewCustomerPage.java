 package com.rgp.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewCustomerPage {
	@FindBy(id="customerLightBox_nameField")
	private WebElement custNameTbx;
	@FindBy(xpath="//textarea[@class='inputFieldWithPlaceholder']")
	private WebElement addDescTbx;
	@FindBy(xpath="//button[text()='-- Select an active customer to import information from --']")
	private WebElement selCustDropDown;
	@FindBy(xpath="//a[text()='Our Company']")
	private WebElement ourCompany;
	@FindBy(id="customerLightBox_commitBtn")
	private WebElement createCustomer;
	
	public CreateNewCustomerPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public WebElement getCustNameTbx() {
		return custNameTbx;
	}
	public WebElement getAddDescTbx() {
		return addDescTbx;
	}

	public WebElement getSelCustDropDown() {
		return selCustDropDown;
	}



	public WebElement getOurCompany() {
		return ourCompany;
	}

	public WebElement getCreateCustomer() {
		return createCustomer;
	}

}
