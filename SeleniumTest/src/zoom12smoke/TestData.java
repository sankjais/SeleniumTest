package zoom12smoke;

import org.openqa.selenium.WebDriver;

import crossbrowser.CreateDriver;
import readuserdata.ExcelUtils;

public class TestData {

	String username, password, LoginURL = "http://staging.zoom12.com/#/", DashboardURL="http://staging.zoom12.com/#/planetvelocity/dashboard/getDashboard";

	static {
		// TODO Auto-generated constructor stub
		System.setProperty("webdriver.chrome.driver",
				"D:\\SANKET DATA\\Eclipse\\eclipse\\extDriver\\chrome\\chromedriver.exe");
		System.setProperty("webdriver.gecko.driver",
				"D:\\SANKET DATA\\Eclipse\\eclipse\\extDriver\\gecko\\geckodriver.exe");
		System.setProperty("webdriver.ie.driver",
				"D:\\SANKET DATA\\Eclipse\\eclipse\\extDriver\\IE\\IEDriverServer.exe");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Long starttime = System.currentTimeMillis(), endtime;
		Login user = new Login();

		try {
			WebDriver driver = null;
			ExcelUtils dd;
			dd = new ExcelUtils("D:\\zoom12User.xlsx", "zoom12Users");
			TestData data = new TestData();
			data.username = dd.getCellDataasstring(1, 0);
			data.password = dd.getCellDataasstring(1, 1);
			System.out.println("colums are = " + dd.excel_get_columns());
			System.out.println("rows are = " + (dd.excel_get_rows() - 1));
			int row = dd.excel_get_rows();
			int col = dd.excel_get_columns();
			driver = CreateDriver.chrome(driver);
			user.userLogin(data, driver);

			/*
			 * for (int r = 1; r < row; r++) { System.out.println(); for (int c = 0; c <
			 * col; c++) {
			 * 
			 * System.out.print(dd.getCellDataasstring(r, c) + "   "); }
			 * 
			 * }
			 */

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		finally {
			endtime = System.currentTimeMillis();
			System.out.println("total time for exection all thread " + (endtime - starttime) / 6000 + " Seconds");
		}

	}

}
