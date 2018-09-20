package zoom12smoke;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login {
	static boolean flag = true;

	public static boolean userLogin(TestData data, WebDriver driver) {
		Long starttime = System.currentTimeMillis(), endtime;
		WebDriverWait wait = new WebDriverWait(driver, 20000);
		try {
			driver.manage().timeouts().implicitlyWait(20000,TimeUnit.SECONDS);
			driver.get(data.LoginURL);
			Thread.sleep(5000);
			driver.manage().window().maximize();
			Thread.sleep(2000);
			if (driver.getCurrentUrl().equalsIgnoreCase(data.LoginURL)) {
				if (driver.getTitle().contains("Zoom12")) {
					System.out.println("Login page loaded successful");
					WebElement i=driver.findElement(By.id("name"));
					i.sendKeys(data.username);
					driver.findElement(By.id("password")).sendKeys(data.password);
					driver.findElement(By.id("login")).click();
					Thread.sleep(20000);
					if(driver.getCurrentUrl().contains(data.DashboardURL))
					{
						System.out.println("user login sucessful");
					}
					else {
						System.out.println("user unable to login");
						flag=false;
					}
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
				}
			} else {
				System.out.println("Unable to load login page.");
				flag = false;
			}
			
			driver.close();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		finally {
			if (flag == true) {
				System.out.println("login testcase pass");
				endtime = System.currentTimeMillis();
				System.out.println("total time for exection Login testcase " + (endtime - starttime) / 6000 + " Seconds");
			} else {
				System.out.println("login test case fail");
				driver.close();
			}
		}
		return flag;

	}

}
