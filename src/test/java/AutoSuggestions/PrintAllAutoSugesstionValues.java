package AutoSuggestions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PrintAllAutoSugesstionValues {
	public static void main(String[] args) {
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
		List<WebElement> Elements = driver.findElements(By.xpath("//span[contains(text(),\"agile\")]"));
		for (int i = 0; i < Elements.size(); i++) {
			System.out.println("Suggested Elements are: "+i+ " "+Elements.get(i).getText());
		}
		driver.close();
	}
}
