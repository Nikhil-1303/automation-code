package kodnest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import kodnest.pages.Registerpage;

public class registerform2 {
	WebDriver driver;
	String baseurl = "https://www.kodnest.com/new-batch-lead-capture";
	Registerpage registerpage;
	@BeforeClass
	public void setup() {
		driver = new ChromeDriver();
		driver.get(baseurl);
		driver.manage().window().maximize();
		Actions act = new Actions(driver);
		registerpage = new Registerpage(driver);
	}
	@Test (priority = 1)
	public void namefield() {
		registerpage.entername("nikhil");
		
	}
	@Test (priority = 2)
	public void emailfield() {
		registerpage.enteremail("nikhil@gmail.com");
	
	}
	@Test (priority = 3)
	public void numfield() {
		registerpage.enterphnum("9024756");
		
	}
	@Test (priority = 4)
	public void watsappfield() {
		registerpage.enterwatsnum("91649743");
		
	}
	@Test (priority = 5)
	public void gradyer() {
		WebElement gradyrfield = driver.findElement(By.id("form-field-field_670c01a"));
		gradyrfield.sendKeys(Keys.ENTER);
		gradyrfield.sendKeys(Keys.ARROW_DOWN);
		gradyrfield.sendKeys(Keys.ENTER);
	}
	@Test (priority = 6)
	public void language() {
		WebElement reglang = driver.findElement(By.id("form-field-field_aa6903c"));
		reglang.sendKeys(Keys.ENTER);
		reglang.sendKeys(Keys.ARROW_DOWN);
		reglang.sendKeys(Keys.ENTER);
	}	 
	
}
