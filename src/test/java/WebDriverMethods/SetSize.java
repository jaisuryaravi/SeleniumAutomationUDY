package WebDriverMethods;

import org.openqa.selenium.Dimension ;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SetSize {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	Dimension Dmn = new Dimension(500, 500);
	driver.manage().window().setSize(Dmn);
}
}
