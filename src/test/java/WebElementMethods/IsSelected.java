package WebElementMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IsSelected {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	driver.findElement(By.xpath("//a[text () = \"Create new account\"]")).click();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	WebElement Element = driver.findElement(By.xpath("//input[@name=\"sex\" and @value=\"1\"]"));
	boolean Result = Element.isSelected();
	if (Result == true) {
		System.out.println("Selected");
	} else {
		System.out.println("Not Selected");
	}
	driver.close();
}
}
