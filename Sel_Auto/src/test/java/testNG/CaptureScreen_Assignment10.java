package testNG;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Test;

public class CaptureScreen_Assignment10 {
	@Test
	public void f() throws Exception {
		WebDriver driver;
		driver = new SafariDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(4000);

		// take scrn shot
		File abz = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(abz, new File("/Users/vivek/eclipse-workspace/Sel_Auto/Screenshots/assign_10_orngHRM_img01.png"));

		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(4000);

		// take scrn shot
		File abz1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(abz1, new File("/Users/vivek/eclipse-workspace/Sel_Auto/Screenshots/assign_10_orngHRM_img02.png"));
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//span[@class='oxd-userdropdown-tab']")).click();
		Thread.sleep(8000);
		
		driver.findElement(By.linkText("Logout")).click();
		
		
		
		

	}
}
