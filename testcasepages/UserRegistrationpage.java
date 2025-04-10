package testcasepages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class UserRegistrationpage {
	WebDriver driver;
	public UserRegistrationpage(WebDriver driver1) {
		this.driver = driver1;
	}
	By signin = By.xpath("//a[@href=\"/login\"]");
	By signintitle = By.xpath("//h2[text()='New User Signup!']");
	By inputname = By.xpath("//input[@name='name']");
	By inputemail = By.xpath("//input[@data-qa='signup-email']");
	By signinbuttonclick = By.xpath("//button[@data-qa='signup-button']");
	By accountinfotitle = By.xpath("//b[text()='Enter Account Information']");
	By gendercheckbox = By.id("id_gender1");
	By inputpass = By.id("password");
	By daysdropdown = By.id("days");
	By monthdropdown = By.id("months");
	By yeardropdown = By.id("years");
	By newslettercheckbox = By.id("newsletter");
	By optincheckbox = By.id("optin");
	By inputfirstname = By.id("first_name");
	By inputlastname = By.id("last_name");
	By inputaddress = By.id("address1");
	By inputcountry = By.id("country");
	By inputstate = By.id("state");
	By inputcity = By.id("city");
	By inputzipcode = By.id("zipcode");
	By inputphno = By.id("mobile_number");
	By createbuttonclick = By.xpath("//button[@data-qa=\"create-account\"]");
	By acccreatedtitle = By.xpath("//b[text()='Account Created!']");
	By continuebuttonclick = By.xpath("//a[@data-qa=\"continue-button\"]");
	By usernametitle = By.xpath("//li/a/b[text()='nikita g']");
	By deletebuttonclick = By.xpath("//a[@href=\"/delete_account\"]");
	By accdeletetitle = By.xpath("//h2/b[text()='Account Deleted!']");
	
	public void clickingonsignin() {
		driver.findElement(signin).click();
	}
	public void titlechecker() {
		WebElement visible = driver.findElement(signintitle);
		System.out.println("Sign in title is visible : " + visible.isDisplayed());
	}
	public void userdetailfill(String name) {
		WebElement typename = driver.findElement(inputname);
		typename.sendKeys(name);
	}
	public void userdetailfill1(String email) {
		WebElement typeemail = driver.findElement(inputemail);
		typeemail.sendKeys(email);
	}
	public void regbuttonclick() {
		driver.findElement(signinbuttonclick).click();;
		
	}
	public void userinfotitlechcker() {
		WebElement usertitlecheck = driver.findElement(accountinfotitle);
		usertitlecheck.isDisplayed();
	}
	public void enteruserdetails() {
		WebElement sexcheckbox = driver.findElement(gendercheckbox);
		sexcheckbox.click();
	}
	public void enteruserspass (String pass) {
		WebElement enterpassvalue = driver.findElement(inputpass);
		enterpassvalue.sendKeys(pass);
	}
	public void selectdayscheckbox() {
		Actions act = new Actions(driver);
		WebElement dayscheckbox = driver.findElement(daysdropdown);
		act.click(dayscheckbox).sendKeys(Keys.ENTER)
		  						.sendKeys(Keys.ARROW_DOWN)
		  						.sendKeys(Keys.ARROW_DOWN)	
		  						.sendKeys(Keys.ARROW_DOWN)
		  						.build().perform();
	}
	public void selectmonthscheckbox() {
		Actions act = new Actions(driver);
		WebElement monthsscheckbox = driver.findElement(monthdropdown);
		act.click(monthsscheckbox).sendKeys(Keys.ENTER)
		  						.sendKeys(Keys.ARROW_DOWN)
		  						.sendKeys(Keys.ARROW_DOWN)	
		  						.sendKeys(Keys.ARROW_DOWN)
		  						.sendKeys(Keys.ARROW_DOWN)
		  						.build().perform();
	}
	public void selectyearscheckbox() {
		Actions act = new Actions(driver);
		WebElement yearscheckbox = driver.findElement(yeardropdown);
		act.click(yearscheckbox).sendKeys(Keys.ENTER)
		  						.sendKeys(Keys.ARROW_DOWN)
		  						.sendKeys(Keys.ARROW_DOWN)	
		  						.sendKeys(Keys.ARROW_DOWN)
		  						.sendKeys(Keys.ARROW_DOWN)
		  						.build().perform();
	}
	public void selectcheckbox() {
		driver.findElement(newslettercheckbox).click();
	}
	public void selectcheckbox1() {
		driver.findElement(optincheckbox).click();
	}
	public void enterfirstname(String name1) {
		driver.findElement(inputfirstname).sendKeys(name1);
	}
	public void enterlastname(String name2) {
		driver.findElement(inputlastname).sendKeys(name2);
	}
	public void enteraddressfield(String address2) {
		driver.findElement(inputaddress).sendKeys(address2);
	}
	public void countrydropdwn() {
		Actions act = new Actions(driver);
		WebElement selectcountry = driver.findElement(inputcountry);
		act.click(selectcountry).sendKeys(Keys.ENTER)
								.sendKeys(Keys.ARROW_DOWN)
								.sendKeys(Keys.ARROW_DOWN)
								.build().perform();
	}
	public void enterstatename(String state) {
		driver.findElement(inputstate).sendKeys(state);
	}
	public void entercityname(String city) {
		driver.findElement(inputcity).sendKeys(city);
	}
	public void enterzipcodename(String zipcode) {
		driver.findElement(inputzipcode).sendKeys(zipcode);
	}
	public void entermobilenum(String number) {
		driver.findElement(inputphno).sendKeys(number);
	}
	public void createaccountbutton() {
		driver.findElement(createbuttonclick).click(); 
	}
	public void acccreatedtitlechecker() {
		WebElement visible1 = driver.findElement(acccreatedtitle);
		System.out.println("Account created  title is visible : " + visible1.isDisplayed());
	}
	public void continuebutton1click() {
		driver.findElement(continuebuttonclick).click();;
	}
	public void usernametitlechecker() {
		WebElement visible2 = driver.findElement(usernametitle);
		System.out.println("User name title is visible : " + visible2.isDisplayed());
	}
	public void delbuttonclick() {
		driver.findElement(deletebuttonclick).click();;
	}
	public void delaccounttitlechecker() {
		WebElement visible3 = driver.findElement(accdeletetitle);
		System.out.println("Account deleted  title is visible : " + visible3.isDisplayed());
	}
}
