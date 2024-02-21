package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetLocation {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	driver.get("https://www.google.com/");
	WebElement Element = driver.findElement(By.xpath("//img[@class=\"lnXdpd\"]"));
	Point Location = Element.getLocation();
	int Xaxis = Location.getX();
	System.out.println("X Axis: "+Xaxis);
	int Yaxis = Location.getY();
	System.out.println("Y Axis: "+Yaxis);
	driver.close();
}
}
