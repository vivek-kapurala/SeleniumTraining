package auto;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.By.ByName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.Select;

public class FbLogin {

	public static void main(String[] args) throws Exception {
/*		//create a wweb driver object
		WebDriver driver;
		//launch the chrome browser
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("adcdef23457tyhf@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("adcdefjhfdgkjhgkj");
		driver.findElement(By.name("login")).click();
		driver.quit();
		
		
*/
		
  		// create a web object - named "driver"
		WebDriver driver;
		
		//launch the chrome browser
		//driver = new ChromeDriver();
		
		//getting the URL of the target site
		//driver.get("https://www.google.com/");
		
		//maximise the window
		//driver.manage().window().maximize();
		
		//find the element by web locater - in this case id
		//driver.findElement(By.id("APjFqb")).sendKeys("face book");
		
		//clicking in the search box
		// driver.findElement(By.name("btnK")).click();
 
		
		
	/*	WebDriver autologin;
		autologin = new ChromeDriver();
		autologin.get("https://login.yahoo.com/manage_account?pspid=159600001&activity=mail-direct&.lang=en-IN&.intl=in&src=ym&signin=true&done=https%3A%2F%2Fmail.yahoo.com%2Fd&eid=100");
		autologin.manage().window().maximize();
		autologin.findElement(By.name("username")).sendKeys("vivek_kapurala@yahoo.com");
		autologin.findElement(By.name("signin")).click();
		autologin.findElement(By.name("password")).sendKeys("ohhhyahhh");
		autologin.findElement(By.name("verifyPassword")).click();
 */

		
		// Assignment -5
/* 
 
		
 
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		
		Thread.sleep(10000);
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[3]/ul/li/span")).click();
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[3]/ul/li/ul/li[4]/a")).click();
		
		*/
		
// Assignment -6
		
/*		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://collegeweeklive.com/go-signup/");	
		driver.manage().window().maximize();
		Thread.sleep(10000);
		driver.findElement(By.name("firstName")).sendKeys("Vivek");
		Select citizenship = new Select(driver.findElement(By.id("country")));
		citizenship.selectByVisibleText("CANADA");
		*/
		
		
		// Assignment-10: BOOK-FLT-TKT-USING-XPATH
		
		driver = new SafariDriver();
		driver.get("https://blazedemo.com");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		Select departure_city = new Select(driver.findElement(By.name("fromPort")));
		departure_city.selectByVisibleText("San Diego");
		
		Select destination_city = new Select(driver.findElement(By.name("toPort")));
		destination_city.selectByVisibleText("New York");
		
		driver.findElement(By.xpath("//input[@value='Find Flights']")).click();
		
		

		driver.findElement(By.xpath("(//input[@type='submit'])[1]")).click();
		
		
		
		driver.findElement(By.xpath("(//input[@value='Purchase Flight'])")).click();
		
		
		
		
		
		
	}

}
