package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PartialLinkText {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	driver.get("https://www.passportindia.gov.in/AppOnlineProject/user/userLogin");
	driver.findElement(By.partialLinkText("Register (New ")).click();
	driver.findElement(By.id("givenName"));
	driver.close();
}
}
