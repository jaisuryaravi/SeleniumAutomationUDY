package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetSize {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	driver.get("https://www.google.com/");
	WebElement Element = driver.findElement(By.xpath("//img[@class=\"lnXdpd\"]"));
	Dimension Size = Element.getSize();
	int Height = Size.getHeight();
	System.out.println("Height: "+Height);
	int Width = Size.getWidth();
	System.out.println("Width: "+Width);
	driver.close();
}
}
