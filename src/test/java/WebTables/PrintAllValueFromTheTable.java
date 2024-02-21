package WebTables;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PrintAllValueFromTheTable {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.nseindia.com/resources/exchange-communication-holidays");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		List<WebElement> Rows = driver.findElements(By.xpath("//table[@id=\"holidayTable\"]/tbody/tr"));
		for (int i = 0; i < Rows.size(); i++) {
			List<WebElement> Columns = driver.findElements(By.xpath("//table[@id=\"holidayTable\"]/tbody/tr/td"));
			for (int j = 0; j < Columns.size(); j++) {
				System.out.println(Columns.get(j).getText());
			}
			System.out.println();
		}
	}
}
