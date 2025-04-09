package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;
import utils.Log;

public class LoginTest extends BaseTest {
	
	@Test
	public void testValidLogin() {
		
		Log.info("Starting Login test..");
		LoginPage loginPage = new LoginPage(driver);
		
		Log.info("Adding credentials..");
		loginPage.enterUsername("admin@yourstore.com");
		loginPage.enterPassword("admin");
		loginPage.clickLogin();
		
		System.out.println("Title of the page is "+ driver.getTitle());
		Assert.assertEquals(driver.getTitle(), "Just a moment...");
	}

}
