package kodnest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class registerform {
	WebDriver driver;
	String baseurl = "https://www.kodnest.com/new-batch-lead-capture";
	
	@BeforeClass
	public void setup() {
		driver = new ChromeDriver();
		driver.get(baseurl);
		driver.manage().window().maximize();
		Actions act = new Actions(driver);
	}
	@Test (priority = 1)
	public void namefield() {
		WebElement regname = driver.findElement(By.id("form-field-name"));
		regname.sendKeys("nikhil");
	}
	@Test (priority = 2)
	public void emailfield() {
		WebElement regemailfield = driver.findElement(By.id("form-field-email"));
		regemailfield.sendKeys("nikhilnikki1303@gmail.com");
	}
	@Test (priority = 3)
	public void numfield() {
		WebElement regnumfield = driver.findElement(By.id("form-field-field_4fbbd89"));
		regnumfield.sendKeys("0972357");
	}
	@Test (priority = 4)
	public void watsappfield() {
		WebElement regwatsnum = driver.findElement(By.id("form-field-field_8fa87fb"));
		regwatsnum.sendKeys("22540756");
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
