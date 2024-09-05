package testNG;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Test;

public class FirstTestNG_Assignment {
	@Test
	public void f() throws Exception {

		WebDriver driver;

		driver = new SafariDriver();

		driver.get("https://practice.automationtesting.in/my-account/");

		driver.manage().window().maximize();
		Thread.sleep(10000);

		//driver.findElement(By.xpath("(//li[@id='menu-item-1215'])")).click();

		//driver.findElement(By.xpath("(//li[@id='menu-item-50'])")).click();

		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("abc@y.com");

		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Baburao^3974");

		driver.findElement(By.xpath("//input[@value='Login']")).click();
		Thread.sleep(5000);

		String msg = driver.findElement(By.xpath("//strong[text()='abc62']")).getText();
		System.out.println(msg);

		String allTxt = driver.findElement(By.xpath("//div[@class='woocommerce-MyAccount-content']")).getText();
		System.out.println(allTxt);

		driver.findElement(By.xpath(
				"//li[@class='woocommerce-MyAccount-navigation-link woocommerce-MyAccount-navigation-link--customer-logout']"))
				.click();

		
		//take scrn shot
		File abz = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(abz, new File("/Users/vivek/eclipse-workspace/Sel_Auto/Screenshots/xyz.png"));
		
		
	}
}
