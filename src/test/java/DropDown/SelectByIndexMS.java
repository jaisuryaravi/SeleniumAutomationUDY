package DropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectByIndexMS {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	driver.get("http://ironspider.ca/forms/dropdowns.htm");
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,2700)");
	WebElement MultiSelect = driver.findElement(By.xpath("//select[@name=\"coffee2\"]"));
	Select slc = new Select(MultiSelect);
	List<WebElement> options = slc.getOptions();
	for (int i = 0; i < options.size(); i++) {
		slc.selectByIndex(i);
	}
	driver.close();
}
}
