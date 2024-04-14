package com.rgp.generic;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.rgp.pom.HomePage;
import com.rgp.pom.LoginPage;



public class BaseClass {
	
	public static WebDriver driver;
	FileLib f = new FileLib();
	
	@BeforeTest
	public void openBrowser() throws IOException {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		String url = f.readDataFromConfigFile("url");
		driver.get(url);
		Reporter.log("Open Browser", true);		
		
	}
	
	@BeforeMethod
	public void login() throws IOException
	{	
		LoginPage lp=new LoginPage(driver);
		String un = f.readDataFromConfigFile("un");
		String pwd = f.readDataFromConfigFile("pwd");
		lp.login(un, pwd);
		Reporter.log("login",true);
		
	}
	
	@AfterMethod
	public void logout() throws InterruptedException
	{	
		HomePage h=new HomePage(driver);
		h.logout();
		Reporter.log("logout",true);
	}
	@AfterTest
	public void closeBrowser()
	{
		driver.quit();
		Reporter.log("closeBrowser",true);
	}
	
	
	
	
	
	
//	public void demo() {
//		driver.close();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5000));
//		wait.until(ExpectedConditions.titleIs("www.google.com"));
//
//		for (int i=0 ; i< 1000; i++)
//		{
//			try {
//				driver.findElement(By.id("d1")).click();
//				break;
//			}
//			catch (Exception e)
//			{
//			   System.out.println(e);
//			};
//		}
	
	
	}


