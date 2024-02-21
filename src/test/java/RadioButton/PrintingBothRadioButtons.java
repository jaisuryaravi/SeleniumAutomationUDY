package RadioButton;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PrintingBothRadioButtons {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	driver.get("https://portal2.passportindia.gov.in/AppOnlineProject/user/RegistrationBaseAction?request_locale=en");
	List<WebElement> Element = driver.findElements(By.xpath("//td[@colspan=\"2\"]/fieldset/span/label"));
	for (int i = 0; i < Element.size(); i++) {
		System.out.println(Element.get(i).getText());
	}
	driver.close();
}
}
