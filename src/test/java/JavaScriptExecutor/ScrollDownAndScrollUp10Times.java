package JavaScriptExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScrollDownAndScrollUp10Times {
public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	driver.get("https://about.google/");
	JavascriptExecutor js = (JavascriptExecutor) driver;
	for (int i = 0; i < 20; i++) {
		js.executeScript("window.scrollBy(0,100)");
		Thread.sleep(500);
	}
	for (int i = 0; i < 20; i++) {
		js.executeScript("window.scrollBy(0,-100)");
		Thread.sleep(500);
	}
	Thread.sleep(1000);
	driver.close();
}
}
