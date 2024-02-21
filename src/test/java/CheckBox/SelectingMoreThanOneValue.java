package CheckBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectingMoreThanOneValue {
public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	driver.get("https://www.ironspider.ca/forms/checkradio.htm");
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,250)");
	List<WebElement> ListOfValues = driver.findElements(By.xpath("//input[@type=\"checkbox\"]"));
	for (int i = 0; i < ListOfValues.size(); i++) {
		ListOfValues.get(i).click();
	}
	Thread.sleep(3000);
	driver.close();
}
}
