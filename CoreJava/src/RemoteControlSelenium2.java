import com.thoughtworks.selenium.DefaultSelenium;

/*
 *  Selenium is an Open source automation tool for WebBases Testing only
 *  Selenium was started on 2004.
 *  Multi Browsers - Platform
 *  
 *  Remote control injects JS on browser - seleniumserver
 *  DefaultSelenium within Selenium interface.
 *  Selenium WebDriver was started on 2006.
 *  Selenium 2.0 -2.53.1
 *  
 *   DEPRECATED. JUST FOR LEARNING
 */

public class RemoteControlSelenium2 {
public static void main(String[] args) {
	DefaultSelenium driver =new  DefaultSelenium(null, 0, null, null);
	driver.start();
	driver.open("http://www.google.com");
     String title= driver.getTitle();
  
}
}
