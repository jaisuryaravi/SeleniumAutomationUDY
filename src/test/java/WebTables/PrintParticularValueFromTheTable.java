package WebTables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PrintParticularValueFromTheTable {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	driver.get("https://www.nseindia.com/resources/exchange-communication-holidays");
	WebElement Element = driver.findElement(By.xpath("//table[@id=\"holidayTable\"]/tbody/tr[3]/td[2]"));
	String Result = Element.getText();
	System.out.println(Result);
	driver.close();
}
}
