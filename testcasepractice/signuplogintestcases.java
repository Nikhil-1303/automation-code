package testcasepractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class signuplogintestcases {
	WebDriver driver;
	String baseurl = "https://automationexercise.com/";
	
	@BeforeClass
	public void setup() {
		driver = new ChromeDriver();
		driver.get(baseurl);
		driver.manage().window().maximize();
		;
	}
	@Test (priority = 1)
	public void SignupLogin() {
		WebElement signinloginclick = driver.findElement(By.xpath("//a[@href=\"/login\"]"));
		signinloginclick.click();
	}
	@Test (priority = 2)
	public void newusersignupvisible() {
		WebElement isfieldvisible = driver.findElement(By.xpath("//h2[text()='New User Signup!']"));
		System.out.println("user signup title : " + isfieldvisible.isDisplayed() + " is visible");
	}
	@Test (priority = 3)
	public void registerfield() {
		WebElement namebox = driver.findElement(By.xpath("//input[@name='name']"));
		namebox.sendKeys("nikitha g");
		WebElement Emailbox = driver.findElement(By.xpath("//input[@data-qa='signup-email']"));
		Emailbox.sendKeys("krizznikki132@gmail.com");
		WebElement buttonclick = driver.findElement(By.xpath("//button[@data-qa='signup-button']"));
		buttonclick.click();
	}
	@Test (priority = 4)
	public void accountinfotitle() {
		WebElement titlevisible = driver.findElement(By.xpath("//b[text()='Enter Account Information']"));
		System.out.println("account info title : " + titlevisible.isDisplayed() + " is visible");
	}
	@Test (priority = 5)
	public void userdtails() {
		Actions act = new Actions(driver);
		WebElement title = driver.findElement(By.id("id_gender1")); 
		title.click();
		WebElement passwordfield = driver.findElement(By.id("password"));
		passwordfield.sendKeys("nikki");
		WebElement daysbox = driver.findElement(By.id("days"));
		act.click(daysbox).sendKeys(Keys.ENTER)
						  .sendKeys(Keys.ARROW_DOWN)
						  .sendKeys(Keys.ARROW_DOWN)	
						  .sendKeys(Keys.ARROW_DOWN)
						  .build().perform();
		WebElement monthsbox = driver.findElement(By.id("months"));
		act.click(monthsbox).sendKeys(Keys.ENTER)
							.sendKeys(Keys.ARROW_DOWN)
							.sendKeys(Keys.ARROW_DOWN)	
							.sendKeys(Keys.ARROW_DOWN)
							.sendKeys(Keys.ARROW_DOWN)
							.build().perform();
		WebElement yearbox = driver.findElement(By.id("years"));
		act.click(yearbox).sendKeys(Keys.ENTER)
						  .sendKeys(Keys.ARROW_DOWN)
						  .sendKeys(Keys.ARROW_DOWN)	
						  .sendKeys(Keys.ARROW_DOWN)
						  .sendKeys(Keys.ARROW_DOWN)
						  .build().perform();
		WebElement chckbox = driver.findElement(By.id("newsletter"));
		chckbox.click();
		WebElement chckbox2 = driver.findElement(By.id("optin"));
		chckbox2.click();
	}
	@Test (priority = 6)
	public void addressfield() {
		Actions act1 = new Actions(driver);
		WebElement firstnamebox = driver.findElement(By.id("first_name"));
		firstnamebox.sendKeys("nikki");
		WebElement lastnamebox = driver.findElement(By.id("last_name"));
		lastnamebox.sendKeys("krizz");
		WebElement addressbox = driver.findElement(By.id("address1"));
		addressbox.sendKeys("nikki");
		WebElement countrybox = driver.findElement(By.id("country"));
		act1.click(countrybox).sendKeys(Keys.ENTER)
							  .sendKeys(Keys.ARROW_DOWN)
							  .sendKeys(Keys.ARROW_DOWN)
							  .build().perform();
		WebElement statebox = driver.findElement(By.id("state"));
		statebox.sendKeys("karnataka");
		WebElement citybox = driver.findElement(By.id("city"));
		citybox.sendKeys("bangalore");
		WebElement zipcodebox = driver.findElement(By.id("zipcode"));
		zipcodebox.sendKeys("560062");
		WebElement mobilenumberbox = driver.findElement(By.id("mobile_number"));
		mobilenumberbox.sendKeys("908649562");
		WebElement createbutton = driver.findElement(By.xpath("//button[@data-qa=\"create-account\"]"));
		createbutton.click();
	}
	@Test (priority = 7)
	public void acccreatedtitle() {
		WebElement createdtitlevisible = driver.findElement(By.xpath("//b[text()='Account Created!']"));
		System.out.println("Account is created : " + createdtitlevisible.isDisplayed() + " is visibe");
		WebElement continuebutton = driver.findElement(By.xpath("//a[@data-qa=\"continue-button\"]"));
		continuebutton.click();
	}
	@Test (priority = 8)
	public void usershomepage() {
		WebElement usernamevisible = driver.findElement(By.xpath("//li/a/b[text()='nikitha g']"));
		System.out.println("user name is visible :" + usernamevisible.isDisplayed());
	}
	@Test (priority = 9)
	public void deleteaccount() {
		WebElement accdeleted = driver.findElement(By.xpath("//a[@href=\"/delete_account\"]"));
		accdeleted.click();
		WebElement accdeltitle = driver.findElement(By.xpath("//h2/b[text()='Account Deleted!']"));
		System.out.println("Successfully deleted : " + accdeltitle.isDisplayed());
		driver.quit();
	}
}
