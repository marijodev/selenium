import org.openqa.selenium.chrome.ChromeDriver;

/*
 * In 2006 a plucky engineer at 
 * Google named Simon Stewart started work
 * on a project he called WebDriver.
 * Google had long been a heavy user of
 * Selenium, but testers had to work around 
 * the limitations of the product. 
 * Simon wanted a testing tool that spoke 
 * directly to the browser using the ‘native’ 
 * method for the browser and operating system,
 * thus avoiding the restrictions of a sandboxed 
 *  Javascript environment. 
 */
public class ChromeSelenium3 {
public static void main(String[] args) {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Maria  Jose Araya\\Desktop\\Selenium\\drivers\\chromedriver_win32\\chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();	
			driver.get("http://www.google.com");
}
}
