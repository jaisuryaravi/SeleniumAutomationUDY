package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathDescendant {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	driver.get("https://portal2.passportindia.gov.in/AppOnlineProject/user/RegistrationBaseAction?request_locale=en");
	WebElement Element = driver.findElement(By.xpath("//html//select[@id=\"dcdrLocation\"]//descendant::option[5]"));
	System.out.println("Located Element is: "+Element.getText());
	driver.close();
	
	//	Navigate from one element to any of it’s child present on the webpage.
	//	Ex: /html/descendant::option[1]
}
}
