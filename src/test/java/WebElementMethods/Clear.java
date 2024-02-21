package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Clear {
public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	driver.get("https://www.google.com/");
	WebElement SearchBox = driver.findElement(By.xpath("//textarea[@jsname=\"yZiJbe\"]"));
	SearchBox.sendKeys("Google");
	Thread.sleep(2000);
	SearchBox.clear();
	Thread.sleep(2000);
	driver.close();	
}
}
