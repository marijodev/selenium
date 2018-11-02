import org.openqa.selenium.ie.InternetExplorerDriver;

public class IESelenium3 {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
	/*DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
	capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
	capabilities.setCapability(InternetExplorerDriver.IGNORE_ZOOM_SETTING, true);*/
    
	System.setProperty("webdriver.ie.driver","C:\\Users\\Maria  Jose Araya\\Desktop\\Selenium\\drivers\\IEDriverServer_Win32_3.14.0\\IEDriverServer.exe");
    InternetExplorerDriver driver = new InternetExplorerDriver(/*capabilities*/);
	driver.get("http://www.gmail.com");
	}

	
}
