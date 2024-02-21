package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathPrecedingSibling {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://portal2.passportindia.gov.in/AppOnlineProject/user/RegistrationBaseAction?request_locale=en");
		WebElement Element = driver.findElement(By.xpath("//option[@value=\"5\"]//preceding-sibling::option[1]"));
		System.out.println("Located Element Is: "+Element.getText());
		driver.close();

		//	The elements which are present above the specified element, under same parent
		//	are called as following-sibling.
		//	Ex:
		//	select[@option=’m’]/preceding-sibling::option J,F
		//	select[@option=’m’]/preceding-sibling::option[1] F
		//	select[@option=’m’]/preceding-sibling::option[2] J
	}
}
