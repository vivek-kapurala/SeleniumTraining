package testNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Test;






/* 
 * 1.open application
 * 2.test logo presence
 * 3.login
 * 4.close
 */

public class OrangeHRM_logo_validation {
	WebDriver driver;
	
	@Test
	void openapp()
	{
		driver = new SafariDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
	}
	
	@Test(priority=1)
	void testlogo() throws Exception
	{
		Thread.sleep(3000);
	boolean status = driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
	System.out.println("logo displayed"+status);
	}
	
	@Test(priority=2)
	void login()
	{
	    //driver.findElements(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		//driver.findElements(By.xpath("//input[@nplaceholder='Password']")).sendKeys("admin123");
		
	}
	
/*	@Test(priority=4)
	void closeapp()
	{
		
		
	}
	
	
	*/

}
