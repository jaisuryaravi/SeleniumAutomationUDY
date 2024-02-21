package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetTagName {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	driver.get("https://www.google.com/");
	WebElement Element = driver.findElement(By.xpath("//textarea[@jsname=\"yZiJbe\"]"));
	String Tagname = Element.getTagName();
	System.out.println("Element TagName Is : "+Tagname);
	driver.close();
}
}
