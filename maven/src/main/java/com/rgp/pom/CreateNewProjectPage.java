package com.rgp.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewProjectPage {
	
	@FindBy(id="projectPopup_projectNameField")
	private WebElement projectName;
	@FindBy(xpath="//button[text()='-- Please Select Customer to Add Project for  --']")
	private WebElement custDropDown;
	@FindBy(xpath="//a[text()='Our Company']")
	private WebElement ourCompany;
	@FindBy (id="projectPopup_projectDescriptionField")
	private WebElement projDescTbx;
	@FindBy(xpath="//span[text()='Create Project']")
	private WebElement createProjBtn;
	
	public CreateNewProjectPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	public WebElement getProjectName() {
		return projectName;
	}

	public WebElement getCustDropDown() {
		return custDropDown;
	}

	public WebElement getOurCompany() {
		return ourCompany;
	}

	public WebElement getProjDescTbx() {
		return projDescTbx;
	}

	public WebElement getCreateProjBtn() {
		return createProjBtn;
	}
	

}
