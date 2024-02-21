package KeyBoardActionUsingSendKeys;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyBoardActionSendKeys {
public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	driver.get("https://www.google.com/");
	driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@role=\"presentation\"]")));
	driver.findElement(By.xpath("//button[@jsname=\"ZUkOIc\"]")).click();
	driver.switchTo().defaultContent();
	WebElement Element = driver.findElement(By.xpath("//textarea[@jsname=\"yZiJbe\"]"));
	Element.sendKeys("Google");
	Element.sendKeys(Keys.CONTROL,"a");
	Thread.sleep(2000);
	Element.sendKeys(Keys.RETURN);
	Thread.sleep(3000);
	driver.close();
}
}
