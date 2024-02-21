package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetCssValue {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	driver.get("https://www.google.com/");
	WebElement Logo = driver.findElement(By.xpath("//img[@class=\"lnXdpd\"]"));
	System.out.println("Maximum Height: "+Logo.getCssValue("max-height"));
	System.out.println("Maximum Width: "+Logo.getCssValue("max-width"));
	System.out.println("Font Size: "+Logo.getCssValue("font-size"));
	System.out.println("Font Family: "+Logo.getCssValue("font-family"));
	System.out.println("Color: "+Logo.getCssValue("color"));
	driver.close();
	
}
}
