package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import utils.Log;

public class BaseTest {
	
	protected WebDriver driver;
	
	@BeforeMethod
	public void SetUp() {
		Log.info("Starting Webdriver..");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		Log.info("Navigating to URL ..");
		driver.get("https://admin-demo.nopcommerce.com/login");
	}

	@AfterMethod
	public void TearDown() {
		if(driver != null) {
			Log.info("Closing Browser..");
			driver.quit();
		}
	}
}
