package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathParent {
public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	driver.get("https://portal2.passportindia.gov.in/AppOnlineProject/user/RegistrationBaseAction?request_locale=en");
	driver.findElement(By.xpath("//option[@value=\"5\"]//parent::select")).click();
	Thread.sleep(3000);
	driver.close();
	
	//	Navigate from one element to it’s immediate parent.
	//	Ex: //select[@option=’j’]//parent::select
}
}
