package suresh.shoeshope.smoketest;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import suresh.shoeshope.browser.Browser;
import suresh.shoeshope.pages.Pages;
import suresh.shoeshope.logger.SHOELogger;

public class HomePageTest {

	//SHOELogger logger; 
	
	@Before
	public void Init(){
		Browser.Open();
		//SHOELogger.Log("Browser Opening successfully");
	}
	@After
	public void Cleanup(){
		Browser.Close();
		//SHOELogger.Log("Browser closed successfully");
	}
	@Test
	public void Can_Go_To_HomePage_Test(){
		//SHOELogger.Log("Can_Go_To_HomePage_Test Started");
		Pages.HomePage().GoTo();
		Assert.assertTrue(Pages.HomePage().IsAtHomePage());
		//SHOELogger.Log("Can_Go_To_HomePage_Test Completed");
		//System.out.println(Pages.HomePage().IsAtHomePage());
	}
}
