package DropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetAllSelectedOptions {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://portal2.passportindia.gov.in/AppOnlineProject/user/RegistrationBaseAction?request_locale=en");
		WebElement DropDown = driver.findElement(By.xpath("//select[@id=\"dcdrLocation\"]"));
		Select slc = new Select(DropDown);
		slc.selectByIndex(4);
		Thread.sleep(2000);
		List<WebElement> allSelectedOptions = slc.getAllSelectedOptions();
		for (int i = 0; i < allSelectedOptions.size(); i++) {
			System.out.println(allSelectedOptions.get(i).getText());
		}
		driver.close();
	}
}
