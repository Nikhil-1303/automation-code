package pageclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class socialmedialinkpage {
	WebDriver driver;
	WebElement pinterestlink = driver.findElement(By.className("header_soc_pinterest"));
	WebElement twitlink = driver.findElement(By.className("header_soc_twitter"));
	WebElement linkedlink = driver.findElement(By.className("header_soc_linkedin"));
	WebElement googlelink = driver.findElement(By.className("header_soc_google"));
	WebElement fblink = driver.findElement(By.className("header_soc_facebook"));
}
