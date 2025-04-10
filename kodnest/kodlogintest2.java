package kodnest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import kodnest.pages.Loginpage;

public class kodlogintest2 {
	WebDriver driver;
    String baseurl = "https://app.kodnest.com/login";
    Loginpage loginpage;
    
    @BeforeClass
    public void setup() {
    	driver = new ChromeDriver();
    	driver.get(baseurl);
    	driver.manage().window().maximize();
    	loginpage = new Loginpage(driver);
    }
    @Test (priority = 1)
    public void testblankemailandpass() {
    	loginpage.loginclick();
    	Assert.assertEquals(loginpage.getemailrequirederror(), "Email is required");
    	Assert.assertEquals(loginpage.getpasswordreqerror(), "Please enter your password");
    }
    @Test (priority = 2)
    public void testinvalidemail() {
    	loginpage.enteremail("nikhil1303+gmail.com");
    	loginpage.loginclick();
    	Assert.assertEquals(loginpage.getinvalidemailerror(), "Invalid email format");
    }
    @Test (priority = 3)
    public void unregisteredformat() throws InterruptedException {
    	loginpage.enteremail("nikhilnikki103@gmail.com");
    	loginpage.enterpass("nikhil@123");
    	loginpage.loginclick();
    	Thread.sleep(2000);
    	Assert.assertEquals(loginpage.getusernotfounderror(), "User not found with this email address");	
    }
    @Test (priority = 4)
    public void registeredmailandinvalidpass() throws InterruptedException {
    	
    	loginpage.enteremail("nikhilnikki1303@gmail.com");
    	loginpage.enterpass("nikhil@12");
    	loginpage.loginclick();
    	Thread.sleep(2000);
    	Assert.assertEquals(loginpage.getincrctcredentialerror(), "Incorrect Credentials");	
    }
    @Test (priority = 5)
    public void registeredformat() {
    	loginpage.enteremail("nikhilnikki1303@gmail.com");
    	loginpage.enterpass("nikhil@123");
    	loginpage.loginclick();
    	System.out.println("home page loaded");
    }
    @AfterMethod
    public void refresh() {
    	driver.navigate().refresh();
    }
}

