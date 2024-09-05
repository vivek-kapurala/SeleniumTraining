package practice;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class Asgn11 {
	WebDriver driver;

	@BeforeClass
	public void beforeClass() {
		driver = new SafariDriver();
		driver.manage().window().maximize();
	}

	@Test
	public void tc_01() throws Exception {
		
		driver.get("https://opencart-prf.exense.ch/index.php?route=account/login");
		driver.findElement(By.xpath("//input[contains(@class,'btn-primary')]")).click();
		Thread.sleep(4000);
	}

	
		
	@Test
	public void tc_02() throws Exception 
	{
		//driver.get("https://opencart-prf.exense.ch/index.php?route=account/login");
		driver.findElement(By.xpath("//input[@placeholder = 'E-Mail Address']")).sendKeys("hello");
		driver.findElement(By.xpath("//input[@placeholder = 'Password']")).sendKeys("1234");
		driver.findElement(By.xpath("//input[contains(@class,'btn-primary')]")).click();
		Thread.sleep(4000);
	}

	
	@Test
	public void tc_03() throws Exception 
	
	{
		//driver.get("https://opencart-prf.exense.ch/index.php?route=account/login");
		driver.findElement(By.xpath("//input[@placeholder = 'E-Mail Address']")).sendKeys("asingh@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder = 'Password']")).sendKeys("1234");
		driver.findElement(By.xpath("//input[contains(@class,'btn-primary')]")).click();
		Thread.sleep(4000);
	}
	
	@AfterMethod
	public void afterMethod() throws Exception 
	{
		Date ts = new Date();
		DateFormat abc = new SimpleDateFormat("MMMddyyyy_HHmmss");
		String timestamp = abc.format(ts);
		
		File scrn = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(scrn,
				new File("/Users/vivek/eclipse-workspace/Sel_Auto/Screenshots/Asgn11_img"+timestamp+".png"));
		//driver.close();

	}
	
	
	
	
	@AfterClass
	public void afterClass() 
	{
		driver.quit();
	}

}
