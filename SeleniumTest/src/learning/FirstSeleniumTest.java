package learning;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import crossbrowser.CreateDriver;

public class FirstSeleniumTest {
	static {
		// TODO Auto-generated constructor stub
		System.out.println("1");
		System.setProperty("webdriver.chrome.driver",
				"D:\\SANKET DATA\\Eclipse\\eclipse\\extDriver\\chrome\\chromedriver.exe");
		System.setProperty("webdriver.gecko.driver",
				"D:\\SANKET DATA\\Eclipse\\eclipse\\extDriver\\gecko\\geckodriver.exe");
		System.setProperty("webdriver.ie.driver",
				"D:\\SANKET DATA\\Eclipse\\eclipse\\extDriver\\IE\\IEDriverServer.exe");

	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = null;
		driver = CreateDriver.chrome(driver);

		// WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.google.co.in/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(1000);
		driver.close();
	}

}
