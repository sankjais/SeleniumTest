package crossbrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class CreateDriver {

	public static WebDriver chrome(WebDriver driver) {
		driver = new ChromeDriver();
		return driver;
	}

	public static WebDriver firefox(WebDriver driver) {
		driver = new FirefoxDriver();
		return driver;
	}

	public static WebDriver ie(WebDriver driver) {
		driver = new InternetExplorerDriver();
		return driver;
	}

}
