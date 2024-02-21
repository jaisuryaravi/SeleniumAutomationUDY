package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathChild {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://portal2.passportindia.gov.in/AppOnlineProject/user/RegistrationBaseAction?request_locale=en");
		WebElement Element = driver.findElement(By.xpath("//select[@id=\"dcdrLocation\"]//child::option[5]"));
		String Result = Element.getText();
		System.out.println("Located Element is: "+Result);
		driver.close();

		//Navigate from one element to it’s immediate child.
		//	Ex: //select//child::option[1]

	}
}
