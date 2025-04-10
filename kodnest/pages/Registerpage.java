package kodnest.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Registerpage {
	WebDriver driver;
	public Registerpage(WebDriver driver1) {
		this.driver = driver1;
	}
	By names = By.id("form-field-name");
	By emails = By.id("form-field-email");
	By phnos = By.id("form-field-field_4fbbd89");
	By watsnos = By.id("form-field-field_8fa87fb");
	By graduation = By.id("form-field-field_670c01a");
	By lang = By.id("form-field-field_aa6903c");
	
	public void entername (String name) {
		WebElement intname = driver.findElement(names);
		intname.sendKeys(name);
	}
	public void enteremail (String email) {
		WebElement intemail = driver.findElement(emails);
		intemail.sendKeys(email);
	}
	public void enterphnum (String phno) {
		WebElement intphnum = driver.findElement(phnos);
		intphnum.sendKeys(phno);
	}
	public void enterwatsnum (String watsno) {
		WebElement intwatsnum = driver.findElement(watsnos);
		intwatsnum.sendKeys(watsno);
	}
}
