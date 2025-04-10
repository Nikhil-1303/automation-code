package kodnest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class kodlogintest {
	WebDriver driver;
    String baseurl = "https://app.kodnest.com/login";
    
    @BeforeClass
    public void setup() {
    	driver = new ChromeDriver();
    	driver.get(baseurl);
    	driver.manage().window().maximize();
    }
    @Test (priority = 1)
    public void testblankemailandpass() {
    	WebElement loginclick = driver.findElement(By.id("login-submit-button"));
    	loginclick.click();
    	String actualemailerror = driver.findElement(By.xpath("//p[@id='email-error' and text() = 'Email is required']")).getText();
    	Assert.assertEquals(actualemailerror, "Email is required");
    	String actualpasserror = driver.findElement(By.xpath("//p[@id='password-error' and text() = 'Please enter your password']")).getText();
    	Assert.assertEquals(actualpasserror, "Please enter your password");
    }
    @Test (priority = 2)
    public void testinvalidemail() {
    	WebElement emailbox = driver.findElement(By.id("email-input"));
    	emailbox.sendKeys("nikhilnikki1303+gmail.com");
    	WebElement loginclick = driver.findElement(By.id("login-submit-button"));
    	loginclick.click();
    	String actualinvalidemailerror = driver.findElement(By.xpath("//p[@id='email-error' and text() = 'Invalid email format']")).getText();
    	Assert.assertEquals(actualinvalidemailerror, "Invalid email format");
    }
    @Test (priority = 3)
    public void unregisteredformat() throws InterruptedException {
    	WebElement emailbox = driver.findElement(By.id("email-input"));
    	emailbox.sendKeys("nikhilnikki103@gmail.com");
    	WebElement passbox = driver.findElement(By.id("password-input"));
    	passbox.sendKeys("nikhil@123");
    	WebElement loginclick = driver.findElement(By.id("login-submit-button"));
    	loginclick.click();
    	Thread.sleep(2000);
    	String actualusernotfounderror = driver.findElement(By.xpath("//div[@data-title= '' and text() = 'User not found with this email address']")).getText();
    	Assert.assertEquals(actualusernotfounderror, "User not found with this email address");	
    }
    @Test (priority = 4)
    public void registeredmailandinvalidpass() throws InterruptedException {
    	WebElement emailbox = driver.findElement(By.id("email-input"));
    	emailbox.sendKeys("nikhilnikki1303@gmail.com");
    	WebElement passbox = driver.findElement(By.id("password-input"));
    	passbox.sendKeys("nikhil@12");
    	WebElement loginclick = driver.findElement(By.id("login-submit-button"));
    	loginclick.click();
    	Thread.sleep(2000);
    	String actualwrongpasserror = driver.findElement(By.xpath("//div[@data-title= '' and text() = 'Incorrect Credentials']")).getText();
    	Assert.assertEquals(actualwrongpasserror, "Incorrect Credentials");	
    }
    @Test (priority = 5)
    public void registeredformat() {
    	WebElement emailbox = driver.findElement(By.id("email-input"));
    	emailbox.sendKeys("nikhilnikki1303@gmail.com");
    	WebElement passbox = driver.findElement(By.id("password-input"));
    	passbox.sendKeys("nikhil@123");
    	WebElement loginclick = driver.findElement(By.id("login-submit-button"));
    	loginclick.click();
    	System.out.println("home page loaded");
    }
    @AfterMethod
    public void refresh() {
    	driver.navigate().refresh();
    }
}
