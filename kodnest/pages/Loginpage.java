package kodnest.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Loginpage {
	WebDriver driver;
	public Loginpage(WebDriver driver1) {
		this.driver = driver1;
	}
	By emailinput = By.id("email-input");
	By passwordinput = By.id("password-input");
	By logininput = By.id("login-submit-button");
	By emailreqerror = By.xpath("//p[@id='email-error' and text() = 'Email is required']");
	By passreqerror = By.xpath("//p[@id='password-error' and text() = 'Please enter your password']");
	By invalidemailerror = By.xpath("//p[@id='email-error' and text() = 'Invalid email format']");
	By usernotfounderror = By.xpath("//div[@data-title= '' and text() = 'User not found with this email address']");
	By incrctcredentialerror = By.xpath("//div[@data-title= '' and text() = 'Incorrect Credentials']");
	
	public void enteremail( String email) {
		WebElement emailfield = driver.findElement(emailinput);
		emailfield.clear();
		emailfield.sendKeys(email);
	}
	public void enterpass( String pass) {
		WebElement emailfield = driver.findElement(passwordinput);
		emailfield.clear();
		emailfield.sendKeys(pass);
	}
	public void loginclick() {
		driver.findElement(logininput).click();
	}
	public String getemailrequirederror() {
		return driver.findElement(emailreqerror).getText();
	}
	public String getpasswordreqerror() {
		return driver.findElement(passreqerror).getText();
	}
	public String getinvalidemailerror() {
		return driver.findElement(invalidemailerror).getText();
	}
	public String getusernotfounderror() {
		return driver.findElement(usernotfounderror).getText();
	}
	public String getincrctcredentialerror() {
		return driver.findElement(incrctcredentialerror).getText();
	}
}
