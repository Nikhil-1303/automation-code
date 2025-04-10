package testcasepractice;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class loginpagetest {
	WebDriver driver;
	String baseurl = "https://automationexercise.com/";

@BeforeClass
public void setup() {
	driver = new ChromeDriver();
	driver.get(baseurl);
	driver.manage().window().maximize();;
	}
@Test (priority = 1)
public void signuplogintest() {
	WebElement signinloginclick = driver.findElement(By.xpath("//a[@href=\"/login\"]"));
	signinloginclick.click();
}
@Test (priority = 2)
public void regwithexistingemailtest() {
	WebElement namefield = driver.findElement(By.xpath("//input[@data-qa=\"signup-name\"]"));
	namefield.sendKeys("nirmu g");
	WebElement emailfield = driver.findElement(By.xpath("//input[@data-qa=\"signup-email\"]"));
	emailfield.sendKeys("nirmu@gmail.com");
	WebElement signinbutton = driver.findElement(By.xpath("//button[@data-qa=\"signup-button\"]"));
	signinbutton.click();
	String alreadyexisterror = driver.findElement(By.xpath("//p[text()='Email Address already exist!']")).getText();
	Assert.assertEquals(alreadyexisterror, "Email Address already exist!");
	}
@Test (priority = 3)
public void invalidinputlogintest() {
	WebElement emailsend = driver.findElement(By.xpath("//input[@data-qa=\"login-email\"]"));
	emailsend.sendKeys("krizz123@gmail.com");
	WebElement passend = driver.findElement(By.xpath("//input[@data-qa=\"login-password\"]"));
	passend.sendKeys("krizz@13");
	WebElement loginbox = driver.findElement(By.xpath("//button[@data-qa=\"login-button\"]"));
	loginbox.click();
	String actualincorrecterror = driver.findElement(By.xpath("//p[text()='Your email or password is incorrect!']")).getText();
	Assert.assertEquals(actualincorrecterror, "Your email or password is incorrect!");
	}
@Test (priority = 4)
public void validinputlogintest() {
	WebElement emailsend = driver.findElement(By.xpath("//input[@data-qa=\"login-email\"]"));
	emailsend.clear();
	emailsend.sendKeys("krizz123@gmail.com");
	WebElement passend = driver.findElement(By.xpath("//input[@data-qa=\"login-password\"]"));
	passend.clear();
	passend.sendKeys("krizz@123");
	WebElement loginbox = driver.findElement(By.xpath("//button[@data-qa=\"login-button\"]"));
	loginbox.click();
	}
@Test (priority = 5)
public void usershomepage() {
	WebElement namevisible = driver.findElement(By.xpath("//a/b[text()='krizz']"));
	System.out.println("user name is visible :" + namevisible.isDisplayed());
	}
@Test (priority = 6)
public void productpage() {
	WebElement prodpage = driver.findElement(By.xpath("//a[@href=\"/products\"]"));
	prodpage.click();
	
	WebElement firstproduct = driver.findElement(By.xpath("//a[@href=\"/product_details/1\"]"));
	firstproduct.click();
	WebElement prodname = driver.findElement(By.xpath("//h2[text()='Blue Top']"));
	System.out.println("product name :" + prodname.getText());
	WebElement prodcatgory = driver.findElement(By.xpath("//p[text()='Category: Women > Tops']"));
	System.out.println("category :" + prodcatgory.getText());
	WebElement price = driver.findElement(By.xpath("//span[text()='Rs. 500']"));
	System.out.println("price of product :" + price.getText());
	WebElement availability = driver.findElement(By.xpath("//p[b[text()='Availability:'] and contains(text(), 'In Stock')]"));
	System.out.println("product availability :" + availability.getText());
	WebElement prodcondition = driver.findElement(By.xpath("//p[b[text()='Condition:'] and contains(text(), ' New')]"));
	System.out.println("condition of product :" + prodcondition.getText());
	WebElement prodbrand = driver.findElement(By.xpath("//p[b[text()='Brand:'] and contains(text(), ' Polo')]"));
	System.out.println("brand of product :" + prodbrand.getText());
	}
@Test (priority = 7)
public void searchprodtest() {
	WebElement prodpage = driver.findElement(By.xpath("//a[@href=\"/products\"]"));
	prodpage.click();
	WebElement search = driver.findElement(By.xpath("//input[@id='search_product']"));
	search.sendKeys("tshirt");
	WebElement searchbutton = driver.findElement(By.xpath("//button[@id='submit_search']"));
	searchbutton.click();
}
@Test (priority = 8)
public void addcart() {
	WebElement prodpage = driver.findElement(By.xpath("//a[@href=\"/products\"]"));
	prodpage.click();
	WebElement addprod1 = driver.findElement(By.xpath("//a[@data-product-id=\"1\"]"));
	addprod1.click();
	WebElement cartbutton = new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='btn btn-success close-modal btn-block']")));
	cartbutton.click();
	WebElement addprod2 = driver.findElement(By.xpath("//a[@data-product-id=\"2\"]"));
	addprod2.click();
	WebElement cartbutton1 = new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='btn btn-success close-modal btn-block']")));
	cartbutton1.click();
	driver.findElement(By.xpath("//a[@href=\"/view_cart\"]")).click();
	WebElement prodpriceverify = driver.findElement(By.xpath("//td[@class=\"cart_price\"]/p"));
	System.out.println(prodpriceverify.getText());
	WebElement quantityverify = driver.findElement(By.xpath("//button[@class=\"disabled\"]"));
	System.out.println(quantityverify.getText());
	WebElement totpriceverify = driver.findElement(By.xpath("//p[@class=\"cart_total_price\"]"));
	System.out.println(totpriceverify.getText());
	WebElement prod2priceverify = driver.findElement(By.xpath("//tr[@id=\"product-2\"]//td[@class=\"cart_price\"]/p"));
	System.out.println(prod2priceverify.getText());
	WebElement prod2quantityverify = driver.findElement(By.xpath("//tr[@id=\"product-2\"]//button[@class=\"disabled\"]"));
	System.out.println(prod2quantityverify.getText());
	WebElement totprod2priceverify = driver.findElement(By.xpath("//tr[@id=\"product-2\"]//td[@class=\"cart_total\"]/p"));
	System.out.println(totprod2priceverify.getText());
}
@Test (priority = 9)
public void quantitycheck()  {
	WebElement prodpage = driver.findElement(By.xpath("//a[@href=\"/products\"]"));
	prodpage.click();
	for(int i=1; i <= 5;i++) {
	WebElement addprod1 = driver.findElement(By.xpath("//a[@data-product-id=\"1\"]"));
	addprod1.click();
	WebElement cartbutton1 = new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='btn btn-success close-modal btn-block']")));
	cartbutton1.click();
	}
	driver.findElement(By.xpath("//a[@href=\"/view_cart\"]")).click();
	String quantityverify = driver.findElement(By.xpath("//button[@class=\"disabled\"]")).getText();
	System.out.println(quantityverify);
}
}