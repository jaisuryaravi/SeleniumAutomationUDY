package ScreenShots;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TakeScreenShot {
public static void main(String[] args) throws IOException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	TakesScreenshot tk = (TakesScreenshot) driver;
	File Source = tk.getScreenshotAs(OutputType.FILE);
	File Destination = new File("C:\\Users\\Jaisurya.AGILELABS\\Pictures\\TakeScreenshot\\test1.jpeg");
	FileUtils.copyFile(Source, Destination);
	driver.close();
}
}
