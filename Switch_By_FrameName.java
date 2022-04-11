package ABC_MVS_Frames;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import CommonUtil.TestBrowser;

public class Switch_By_FrameName {
	
	
	static WebDriver driver;
	

	@Test
	public void Login_Test() throws Exception
	{
		
	System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
	driver =new ChromeDriver();
	driver.manage().window().maximize() ;
	driver.get("http://www.bhavasri.com/Frames/AllContacts.html");
	
	driver.switchTo().frame("Google_ContactForm");
	findElement(By.name("firstname")).sendKeys("Mutyala");
	findElement(By.name("lastname")).sendKeys("Suresh");
	findElement(By.name("subject1")).sendKeys("Mutyala Suresh");
	driver.switchTo().defaultContent();
	
	
	
	driver.switchTo().frame("Amazon_ContactForm");
	findElement(By.name("firstname")).sendKeys("Srujana");
	findElement(By.name("lastname")).sendKeys("TCS");
	findElement(By.name("subject")).sendKeys("Srujana TCS");
	driver.switchTo().defaultContent();
	
	
//	driver.switchTo().frame("Google_ContactForm");
	//findElement(By.name("firstname")).clear();
	//findElement(By.name("firstname")).sendKeys("Suresh");
	
//	findElement(By.name("lastname")).clear();
//	findElement(By.name("lastname")).sendKeys("Selenium Trainer");
	
	//findElement(By.name("subject1")).clear();
	//findElement(By.name("subject1")).sendKeys("Dharamja - Selenium Trainer");
	//driver.switchTo().defaultContent();
	
	//driver.quit();
	
}
	
	
	
	 public  WebElement findElement(By by) throws Exception 
		{
					
			WebElement elem = driver.findElement(by);  
			
			if (driver instanceof JavascriptExecutor) 
			{
			 ((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid red'", elem);
		 
			}
			return elem;
		}

	
	
	
	
	

}
