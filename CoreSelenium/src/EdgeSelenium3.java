import org.openqa.selenium.edge.EdgeDriver;

public class EdgeSelenium3 {

	public static void main(String[] args) {
		
    System.setProperty("webdriver.edge.driver","C:\\Users\\Maria  Jose Araya\\Desktop\\Selenium\\drivers\\MicrosoftWebDriver.exe");
	EdgeDriver driver = new EdgeDriver ();
	driver.get("http://www.google.com");
	}

}
