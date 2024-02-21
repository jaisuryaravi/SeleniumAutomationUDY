package WebDriverMethods;

import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Close {
public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	driver.get("https://www.google.com/");
	
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.open('https://www.facebook.com/')");
	new WebDriverWait(driver, Duration.ofSeconds(20)).until(ExpectedConditions.numberOfWindowsToBe(2));
	
	ArrayList<String> Tabs = new ArrayList<String>(driver.getWindowHandles());
	System.out.println(Tabs);
	driver.switchTo().window(Tabs.get(1));
	
	driver.findElement(By.xpath("//input[@name=\"email\"]")).sendKeys("Facebook");
	Thread.sleep(2000);
	driver.close();
	
	driver.switchTo().window(Tabs.get(0));
	driver.findElement(By.xpath("//textarea[@jsname=\"yZiJbe\"]")).sendKeys("Google");
	Thread.sleep(2000);
	driver.close();
	
}
}
