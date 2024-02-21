package HandlingMultipleElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleMultipleElements {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	driver.get("https://portal2.passportindia.gov.in/AppOnlineProject/user/RegistrationBaseAction?request_locale=en");
	List<WebElement> ListOfElements = driver.findElements(By.xpath("//select[@name=\"dcdrLocation\"]/option"));
	for (int i = 0; i < ListOfElements.size(); i++) {
		System.out.println("Located Element: "+i+ " "+ListOfElements.get(i).getText());
	}
	driver.close();
}
}
