package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathAncestor {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	driver.get("https://portal2.passportindia.gov.in/AppOnlineProject/user/RegistrationBaseAction?request_locale=en");
	driver.findElement(By.xpath("//option[@value=\"5\"]//ancestor::html"));
	driver.close();
	
	//	Navigate from one element to any of it’s parent present on the webpage.
	//	Ex: //select[@option=’j’]/ancestor::html
}
}
