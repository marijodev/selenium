package test;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class TestBrowser {
	

	public static String browser = "firefox"; //excell
	public static WebDriver driver;

	public static void main(String[] args) {
		
	 if (browser.equals("firefox"))
	 {	//System.setProperty("webdriver.gecko.driver","C:\\Users\\Maria  Jose Araya\\Desktop\\Selenium\\drivers\\geckodriver-v0.23.0-win32\\geckodriver.exe");
		 driver = new FirefoxDriver();	 
	 }else if (browser.equals("chrome"))
	 { 	  //System.setProperty("webdriver.chrome.driver","C:\\Users\\Maria  Jose Araya\\Desktop\\Selenium\\drivers\\chromedriver_win32\\chromedriver.exe");
		  driver = new ChromeDriver();
	 } else if(browser.equals("ie"))
	 {  // System.setProperty("webdriver.ie.driver","C:\\Users\\Maria  Jose Araya\\Desktop\\Selenium\\drivers\\IEDriverServer_Win32_3.14.0\\IEDriverServer.exe");
		  driver = new InternetExplorerDriver();	 
	 }
	 
	
		driver.get("http://google.com");
		driver.getTitle();
		driver.click();
		driver.sendKeys();
	}
}
