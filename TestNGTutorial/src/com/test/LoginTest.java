package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class LoginTest {

	WebDriver driver =null;
	@BeforeTest
	public void invokeApplication() 
	{  	System.setProperty("webdriver.chrome.driver","C:\\Users\\Maria  Jose Araya\\Desktop\\Selenium\\drivers\\chromedriver_win32\\chromedriver.exe");
	    driver = new ChromeDriver();
		driver.get("https://www.facebook.com");	
	}
	
	@Test(dataProvider="getData")
	public void loginFacebook(String userName, String pass) throws InterruptedException 
	{
		
		WebElement email = driver.findElement(By.id("email"));
		WebElement password = driver.findElement(By.id("pass"));	
		//WebElement button= driver.findElement(By.id("u_0_2"));	
		email.clear();
		password.clear();
		email.sendKeys(userName);
		password.sendKeys(pass);	
		//button.click();
		Actions action = new Actions(driver); action.sendKeys(Keys.ENTER).build().perform();
		//Test
		driver.findElement(By.xpath("//a[contains(text(),'Sign Up')]")).isDisplayed();
		
		Thread.sleep(3000);//3sec
	}
	
	@Test(dataProvider="getData")
	public void testLog(String userName, String pass) 
	{System.out.println("Username is:" + userName  +" and password is :" + pass);
	}
	
	@AfterTest
	public void closeApplication() 
	{	    driver.close();
	}
	
	
	@DataProvider
	public Object[][] getData()
	{
		Object[][] dataSet = new Object[4][2];
		dataSet[0][0]="maria";
		dataSet[0][1]="mariatest";
		
		dataSet[1][0]="mariatesttest";
		dataSet[1][1]="mariatest2";
		
		dataSet[2][0]="mariatesttest3";
		dataSet[2][1]="mariatest3";
		
		dataSet[3][0]="mariatesttest4";
		dataSet[3][1]="mariatest4";
		
		return dataSet; 
	}
	
}
