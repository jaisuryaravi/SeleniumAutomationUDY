package JavaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScrollToSpecficElement {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	driver.get("https://about.google/");
	JavascriptExecutor js = (JavascriptExecutor) driver;
	WebElement Element = driver.findElement(By.xpath("//a[contains(text(),\"View all our commitments\")]"));
	js.executeScript("arguments[0].scrollIntoView(true)", Element);
}
}
