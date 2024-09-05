package auto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Fblogin_testNG {
  @Test
  public void f() {
	  WebDriver driver;
		//launch the chrome browser
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("adcdef23457tyhf@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("adcdefjhfdgkjhgkj");
		driver.findElement(By.name("login")).click();
  }
}
