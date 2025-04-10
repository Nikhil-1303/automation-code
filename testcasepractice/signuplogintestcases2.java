package testcasepractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import testcasepages.UserRegistrationpage;

public class signuplogintestcases2 {
	WebDriver driver;
	String baseurl = "https://automationexercise.com/";
	UserRegistrationpage userregistrationpage;
	
	@BeforeClass
	public void setup() {
		driver = new ChromeDriver();
		driver.get(baseurl);
		driver.manage().window().maximize();
		userregistrationpage = new UserRegistrationpage(driver);
	}
	
	@Test (priority = 1)
	public void SignupLogin() {
		userregistrationpage.clickingonsignin();
	}  
	
	@Test (priority = 2)
	public void newusersignupvisible() {
		userregistrationpage.titlechecker();	
	}
	
	@Test (priority = 3)
	public void registerfield() {
		userregistrationpage.userdetailfill("nikita g");
		userregistrationpage.userdetailfill1("krizznikki132@gmail.com");
		userregistrationpage.regbuttonclick();
	}
	
	@Test (priority = 4)
	public void accountinfotitle() {
		userregistrationpage.userinfotitlechcker();
	}
	
	@Test (priority = 5)
	public void userdtails() {
		Actions act = new Actions(driver);
		userregistrationpage.enteruserspass("nikki13");
		userregistrationpage.enteruserdetails();
		userregistrationpage.selectdayscheckbox();
		userregistrationpage.selectmonthscheckbox();
		userregistrationpage.selectyearscheckbox();
		userregistrationpage.selectcheckbox();
		userregistrationpage.selectcheckbox1();
	}
	
	@Test (priority = 6)
	public void addressfield() {
		Actions act1 = new Actions(driver);
		userregistrationpage.enterfirstname("nikki");
		userregistrationpage.enterlastname("krizz");
		userregistrationpage.enteraddressfield("mysore");
		userregistrationpage.countrydropdwn();
		userregistrationpage.enterstatename("karnataka");
		userregistrationpage.entercityname("bangalore");
		userregistrationpage.enterzipcodename("560062");
		userregistrationpage.entermobilenum("13950865");
		userregistrationpage.createaccountbutton();
	}
	
	@Test (priority = 7)
	public void acccreatedtitle() {
		userregistrationpage.acccreatedtitlechecker();
		userregistrationpage.continuebutton1click();
	}
	
	@Test (priority = 8)
	public void usershomepage() {
		userregistrationpage.usernametitlechecker();
	}
	
	@Test (priority = 9)
	public void deleteaccount() {
		userregistrationpage.delbuttonclick();
		userregistrationpage.delaccounttitlechecker();
		driver.quit();
	}
}
