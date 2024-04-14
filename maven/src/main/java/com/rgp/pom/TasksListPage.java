package com.rgp.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TasksListPage {
	@FindBy(xpath="//div[text()='Add New']")
	private WebElement addNewDropDown;
	@FindBy(xpath="//div[@class='item createNewCustomer ellipsis']")
	private WebElement AddNewCustomerTab;
	@FindBy(xpath="//div[@class='item createNewProject ellipsis']")
	private WebElement createNewProjectTab;
	@FindBy(xpath=("//input[@placeholder=\"Start typing name ...\"]"))
	private WebElement custSearchTbx;
	@FindBy(xpath="//span[@class=\"highlightToken\"]")
	private WebElement custMatchLink;
	@FindBy(xpath="(//div[@class='editButton available'])[last()]")  // Ensure () are closed for this xpath, since indexing is used.
	private WebElement setngBtn;
	@FindBy(xpath="//div[contains(@class,'edit_customer')]//div[text()='ACTIONS']")
	private WebElement actnsBtn;
	@FindBy(xpath="//div[contains(@class,'edit_customer')]//div[text()='Delete']")
	private WebElement delBtn;
	
	@FindBy(xpath="//div[contains(@class,'edit_project_sliding_panel sliding_panel')]//div[text()='ACTIONS']")
	private WebElement prjctActionBtn;
	
	@FindBy(xpath="//div[contains(@class,'edit_project_sliding_panel sliding_panel')]//div[text()='Delete']")
	private WebElement projDeleteBtn;
	
	@FindBy(xpath="//span[text()='Delete permanently']")
	private WebElement projDeletePermBtn;
	
	public TasksListPage (WebDriver driver){
		
		PageFactory.initElements(driver, this);

	}

	public WebElement getAddNewDropDown() {
		return addNewDropDown;
	}

	public WebElement getAddNewCustomerTab() {
		return AddNewCustomerTab;
	}

	public WebElement getCreateNewProjectTab() {
		return createNewProjectTab;
	}

	public WebElement getCustSearchTbx() {
		return custSearchTbx;
	}

	public WebElement getCustMatchLink() {
		return custMatchLink;
	}

	public WebElement getSetngBtn() {
		return setngBtn;
	}

	public WebElement getActnsBtn() {
		return actnsBtn;
	}

	public WebElement getDelBtn() {
		return delBtn;
	}

	public WebElement getPrjctActionBtn() {
		return prjctActionBtn;
	}

	public WebElement getProjDeleteBtn() {
		return projDeleteBtn;
	}

	public WebElement getProjDeletePermBtn() {
		return projDeletePermBtn;
	}
	
	
	
	}
	
	
	
	
	
	
	
	


