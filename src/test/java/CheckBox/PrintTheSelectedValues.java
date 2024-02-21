package CheckBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PrintTheSelectedValues {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.ironspider.ca/forms/checkradio.htm");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)");
		List<WebElement> Element = driver.findElements(By.xpath("//input[@type=\"checkbox\"]"));
		for (int i = 0; i < Element.size(); i++) {
			if (Element.get(i).getAttribute("value").equals("yellow") || Element.get(i).getAttribute("value").equals("orange")) {
				Element.get(i).click();
			}
			if (Element.get(i).isSelected()) {
				System.out.println("The Selected Values: "+Element.get(i).getAttribute("value"));
			}
		}
		Thread.sleep(2000);
		driver.close();
	}
}
