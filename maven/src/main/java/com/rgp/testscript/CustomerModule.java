package com.rgp.testscript;


import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.rgp.generic.BaseClass;
import com.rgp.generic.FileLib;
import com.rgp.pom.CreateNewCustomerPage;
import com.rgp.pom.HomePage;
import com.rgp.pom.TasksListPage;

@Listeners(com.rgp.generic.ListenerImplementation.class)
public class CustomerModule extends BaseClass {
	
	@Test
	public void addAndDeleteCustomer() throws InterruptedException, EncryptedDocumentException, IOException
	{
		int time = 1000;
		Thread.sleep(time);
		HomePage h = new HomePage(driver);
		h.clickTasksTab();Thread.sleep(time);
		TasksListPage t = new TasksListPage(driver);
		t.getAddNewDropDown().click();Thread.sleep(time);
		t.getAddNewCustomerTab().click();Thread.sleep(time);
		CreateNewCustomerPage c = new CreateNewCustomerPage(driver);
		FileLib f = new FileLib();
		 String custName = f.ReadDataFromExcel("addAndDeleteCustomer",1 , 1); Thread.sleep(time);
		 c.getCustNameTbx().sendKeys(custName); Thread.sleep(time);
		 String custDescription = f.ReadDataFromExcel("addAndDeleteCustomer",1 , 2); Thread.sleep(time);
		 c.getAddDescTbx().sendKeys(custDescription);Thread.sleep(time);
		 c.getSelCustDropDown().click(); Thread.sleep(time);
		 c.getOurCompany().click(); Thread.sleep(time);
		 c.getCreateCustomer().click();Thread.sleep(time);
		 t.getCustSearchTbx().sendKeys(custName); Thread.sleep(time);
		 t.getCustMatchLink().click();Thread.sleep(time);
		 t.getSetngBtn().click(); Thread.sleep(time);
		 t.getActnsBtn().click();Thread.sleep(time);
		 t.getDelBtn().click(); Thread.sleep(time);
		 t.getProjDeletePermBtn().click(); Thread.sleep(time);
		 
		 
	}
	
	public void display()
	{
		System.out.println("Calling display method");	}
}
