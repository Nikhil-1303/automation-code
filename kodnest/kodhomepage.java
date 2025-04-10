package kodnest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class kodhomepage {
	 WebDriver driver;
	 String baseurl = "https://app.kodnest.com/my-learning/home";
	 
	 @BeforeClass
	  public void setup() {
		driver = new ChromeDriver();
		driver.get(baseurl);
		driver.manage().window().maximize();
	  }
	 @Test (priority = 1)
	 public void login() throws InterruptedException {
		WebElement loginfield = driver.findElement(By.id("email-input"));
		loginfield.clear();
		loginfield.sendKeys("nikhilnikki1303@gmail.com");
		WebElement passfield = driver.findElement(By.id("password-input"));
		passfield.clear();
		passfield.sendKeys("nikhil@123");
		WebElement loginbutton = driver.findElement(By.id("login-submit-button"));
		loginbutton.click();
		Thread.sleep(2000);

	 }
	 
	  @Test (priority = 2)
	 public void liveEnabled() {
		WebElement enabled = driver.findElement(By.xpath("//span[@class='flex items-center font-semibold whitespace-nowrap']"));
		System.out.println(enabled.isDisplayed());
	 }
	  @Test (priority = 3)
	 public void nameofmentor() {
		WebElement actualname = driver.findElement(By.className("mb-0 text-muted text-[12px] mt-1 font-medium truncate"));
		 Assert.assertEquals(actualname, "Mentor:Deeptanshu Kumar");
	 }
	 
}
