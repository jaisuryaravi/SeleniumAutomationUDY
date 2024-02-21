package DropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PrintAllTheOptions {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	driver.get("https://portal2.passportindia.gov.in/AppOnlineProject/user/RegistrationBaseAction?request_locale=en");
	WebElement DropDown = driver.findElement(By.xpath("//select[@name=\"dcdrLocation\"]"));
	Select slc = new Select(DropDown);
	List<WebElement> options = slc.getOptions();
	for (int i = 0; i < options.size(); i++) {
		System.out.println("List Of Options: "+i+ " "+options.get(i).getText());
	}
	driver.close();
}
}
