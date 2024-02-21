package DropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IsMultiple {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	driver.get("https://portal2.passportindia.gov.in/AppOnlineProject/user/RegistrationBaseAction?request_locale=en");
	WebElement DropDown = driver.findElement(By.xpath("//select[@id=\"dcdrLocation\"]"));
	Select slc = new Select(DropDown);
	boolean Result = slc.isMultiple();
	if (Result == true) {
		System.out.println("MultiSelect Field");
	} else {
		System.out.println("Dropdown Field");
	}
	driver.close();
}
}
