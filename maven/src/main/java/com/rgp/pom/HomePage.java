package com.rgp.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	@FindBy(id="logoutLink")
	private WebElement logoutbtn;
	@FindBy(linkText="USERS")
	private WebElement usersTab;
	@FindBy(linkText="TASKS")
	private WebElement tasksTab;
	
	public HomePage (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void logout()
	{
		logoutbtn.click();
	}
	
	public void clickUsersTab()
	{
		usersTab.click();
	}
	
	public void clickTasksTab()
	{
		tasksTab.click();
	}
	

}
