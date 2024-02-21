package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IsEnabled {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	WebElement Element = driver.findElement(By.xpath("//input[@name=\"email\"]"));
	boolean Result = Element.isEnabled();
	if (Result == true) {
		System.out.println("Enabled");
	} else {
		System.out.println("Not Enabled");
	}
	driver.close();
}
}
