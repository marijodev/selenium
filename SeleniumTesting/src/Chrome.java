import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Chrome {

public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.get("http://gmail.com");
	driver.manage().window().maximize();
	// this will be applied 10 sec to alll element.
    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	// Explicit wait instance
    WebDriverWait wait = new WebDriverWait(driver, 10);
	
    String title = driver.getTitle();
	System.out.println(title);
	
    WebElement username = driver.findElement(By.id("identifierId"));
    username.sendKeys("marijodev@gmail.com");
    
    WebElement nextButton =  driver.findElement(By.xpath("//*[@id='identifierNext']"));
    nextButton.click();
    
    WebElement password = driver.findElement(By.xpath("//*[@id='password']/div[1]/div/div[1]/input"));
    password.sendKeys("asdasdfas");
    
    Thread.sleep(2000); // it is not recomended use this instruction
   driver.findElement(By.xpath("//*[@id='passwordNext']/content")).click();
   
   //It works on firefox without wait
   // Thread.sleep(2000); //wait for chrome 
   System.out.println( wait.until(ExpectedConditions.elementToBeClickable(By.xpath("[@id='password']/div[2]/div[2]"))).getText());
  
 
}
}
