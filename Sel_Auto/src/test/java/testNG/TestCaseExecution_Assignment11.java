package testNG;

import java.io.File;
import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Test;

public class TestCaseExecution_Assignment11 {

	WebDriver driver;

	@Test
	public void TC_01() throws Exception {
		
		driver = new SafariDriver();
		driver.get("https://opencart-prf.exense.ch/index.php?route=account/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[contains(@class,'btn-primary')]")).click();
		
		File scrn1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(scrn1,
				new File("/Users/vivek/eclipse-workspace/Sel_Auto/Screenshots/TestCaseExecution_Assignment11_img01.png"));
		//driver.close();
	}
		
	

	@Test
	public void TC_02() throws Exception {
	//driver = new SafariDriver();
//		driver.get("https://opencart-prf.exense.ch/index.php?route=account/login");
		//driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@placeholder = 'E-Mail Address']")).sendKeys("hello");
		driver.findElement(By.xpath("//input[@placeholder = 'Password']")).sendKeys("1234");
		driver.findElement(By.xpath("//input[contains(@class,'btn-primary')]")).click();
		
		File scrn2 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(scrn2,
				new File("/Users/vivek/eclipse-workspace/Sel_Auto/Screenshots/TestCaseExecution_Assignment11_img02.png"));
		//driver.close();
	}

		
	

	@Test
	public void TC_03() throws Exception {
//	driver = new SafariDriver();
//		driver.get("https://opencart-prf.exense.ch/index.php?route=account/login");
//		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@placeholder = 'E-Mail Address']")).sendKeys("asingh@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder = 'Password']")).sendKeys("1234");
		driver.findElement(By.xpath("//input[contains(@class,'btn-primary')]")).click();
		
		File scrn3 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(scrn3,
				new File("/Users/vivek/eclipse-workspace/Sel_Auto/Screenshots/TestCaseExecution_Assignment11_img03.png"));
		//driver.close();
	}
	
	

	@Test
	public void TC_04() throws Exception {
//		driver = new SafariDriver();
//		driver.get("https://opencart-prf.exense.ch/index.php?route=account/login");
//		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@placeholder = 'E-Mail Address']")).sendKeys("asingh@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder = 'Password']")).sendKeys("1234");
		driver.findElement(By.xpath("//input[contains(@class,'btn-primary')]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"column-right\"]/div/a[13]")).click();
		driver.quit();

	}

}
