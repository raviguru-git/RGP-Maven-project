package com.rgp.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UsersListPage {
	
@FindBy(id="//div[@id='createUserDiv']")
private WebElement clickAddUsrBtn;
@FindBy(id="userDataLightBox_firstNameField")
private WebElement firstNameTbx;
@FindBy(id="userDataLightBox_lastNameField")
private WebElement lastNameTbx;
@FindBy(id="userDataLightBox_emailField")
private WebElement emailTbx;
@FindBy(id="userDataLightBox_usernameField")
private WebElement userNameTbx;
@FindBy(id="userDataLightBox_passwordField")
private WebElement pwdTbx;
@FindBy(id="userDataLightBox_passwordCopyField")
private WebElement reTypePwdTbx;
@FindBy(xpath="//div[@class='greyButton withIcon commitBtn']")
private WebElement SubmitBtn;
@FindBy(xpath="//li[@class='firstWarning']/../../../div[1]/span[2]")
private WebElement createdUserLink;
@FindBy(id="userDataLightBox_deleteBtn")
private WebElement delUserBtn;

public UsersListPage(WebDriver driver) 
{
	PageFactory.initElements(driver, this);
}

public WebElement getClickAddUsrBtn() {
	return clickAddUsrBtn;
}

public WebElement getFirstNameTbx() {
	return firstNameTbx;
}

public WebElement getLastNameTbx() {
	return lastNameTbx;
}

public WebElement getEmailTbx() {
	return emailTbx;
}

public WebElement getUserNameTbx() {
	return userNameTbx;
}

public WebElement getPwdTbx() {
	return pwdTbx;
}

public WebElement getReTypePwdTbx() {
	return reTypePwdTbx;
}

public WebElement getSubmitBtn() {
	return SubmitBtn;
}

public WebElement getCreatedUserLink() {
	return createdUserLink;
}

public WebElement getDelUserBtn() {
	return delUserBtn;
}
	

	
}
