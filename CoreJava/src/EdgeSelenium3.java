import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class EdgeSelenium3 {

	public static void main(String[] args) {
		
    System.setProperty("webdriver.edge.driver","C:\\Users\\Maria  Jose Araya\\Desktop\\Selenium\\drivers\\MicrosoftWebDriver.exe");
	InternetExplorerDriver driver = new InternetExplorerDriver ();
	driver.get("http://www.google.com");
	}

}
