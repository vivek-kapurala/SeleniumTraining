package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterClass;

public class Assgn_11_2 {
	WebDriver driver;
  
	@BeforeClass
	  public void beforeClass()
	{
		driver = new SafariDriver();
		driver.manage().window().maximize();
	  }
	
	
	@Test

public void A_TC_01() throws Exception {
		
		driver.get("https://opencart-prf.exense.ch/index.php?route=account/login");
		driver.findElement(By.xpath("//input[contains(@class,'btn-primary')]")).click();
		Thread.sleep(4000);
	    File scrn1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(scrn1,
				new File("/Users/vivek/eclipse-workspace/Sel_Auto/Screenshots/Asgn11_img1.png"));
		driver.close();

	}
	
	
	@Test
	public void B_TC_02() throws Exception 
	{
		driver.get("https://opencart-prf.exense.ch/index.php?route=account/login");
		driver.findElement(By.xpath("//input[@placeholder = 'E-Mail Address']")).sendKeys("hello");
		driver.findElement(By.xpath("//input[@placeholder = 'Password']")).sendKeys("1234");
		driver.findElement(By.xpath("//input[contains(@class,'btn-primary')]")).click();
		Thread.sleep(4000);
		File scrn2 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(scrn2,
				new File("/Users/vivek/eclipse-workspace/Sel_Auto/Screenshots/Asgn11_img2.png"));
		driver.close();

	}
	
	
	
	@Test
	public void C_TC_03() throws Exception 
	
	{
		driver.get("https://opencart-prf.exense.ch/index.php?route=account/login");
		driver.findElement(By.xpath("//input[@placeholder = 'E-Mail Address']")).sendKeys("asingh@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder = 'Password']")).sendKeys("1234");
		driver.findElement(By.xpath("//input[contains(@class,'btn-primary')]")).click();
		Thread.sleep(4000);
		File scrn3 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(scrn3,
				new File("/Users/vivek/eclipse-workspace/Sel_Auto/Screenshots/Asgn11_img2.png"));
		driver.close();

	}

  

  

  @AfterClass
  public void afterClass() 
  {
	  driver.quit();
  }

}
