import org.openqa.selenium.firefox.FirefoxDriver;
/* Selenium 3 is a merging of Selnium and WebDriver
 * It includes a driver by each browser.
 * The driver comunicates with the browser,
 * using the  api(REST API PROTOCOL) with the browser(internal classes), 
 */
public class FirefoxSelenium3 {
public static void main(String[] args) {
	System.setProperty("webdriver.gecko.driver","C:\\Users\\Maria  Jose Araya\\Desktop\\Selenium\\drivers\\geckodriver-v0.23.0-win32\\geckodriver.exe");
	FirefoxDriver driver = new FirefoxDriver();
	driver.get("http://www.gmail.com");
    
}
}
