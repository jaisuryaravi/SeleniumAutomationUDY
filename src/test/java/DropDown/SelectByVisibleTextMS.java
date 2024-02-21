package DropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectByVisibleTextMS {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	driver.get("http://ironspider.ca/forms/dropdowns.htm");
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,2700)");
	WebElement element = driver.findElement(By.xpath("//select[@name=\"coffee2\"]"));
	Select Slc = new Select(element);
	List<WebElement> options = Slc.getOptions();
	for (int i = 0; i < options.size(); i++) {
		if (options.get(i).getAttribute("label").equals("Milk (2%)")) {
			options.set(i, element).click();
		}
	}
}
}
