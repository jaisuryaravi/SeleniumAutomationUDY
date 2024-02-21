package AutoSuggestions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectingValuesFromAutoSeggestion {
public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	driver.get("https://www.google.com/");
	driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@role=\"presentation\"]")));
	driver.findElement(By.xpath("//button[@jsname=\"ZUkOIc\"]")).click();
	driver.switchTo().defaultContent();
	driver.findElement(By.xpath("//textarea[@jsname=\"yZiJbe\"]")).sendKeys("agile");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	List<WebElement> Elements = driver.findElements(By.xpath("//span[contains(.,\"agile\")]"));
	try {
	for (int i = 0; i < Elements.size(); i++) {
		if (Elements.get(i).getText().equals("agile model")) {
			Elements.get(i).click();
		}
	}
	} catch (Exception e) {
		System.out.println();
	}
	Thread.sleep(4000);
	driver.close();
}
}
