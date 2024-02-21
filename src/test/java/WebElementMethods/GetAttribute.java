package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetAttribute {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	driver.get("https://www.google.com/");
	WebElement Element = driver.findElement(By.xpath("//textarea[@jsname=\"yZiJbe\"]"));
	String AttributeValue = Element.getAttribute("src");
	System.out.println("Attribute Value is: "+AttributeValue);
	
	Element.sendKeys("Google Search");
	String EnteredInput = Element.getAttribute("value");
	System.out.println("Entered Input Is :"+EnteredInput);
	driver.close();
}
}
