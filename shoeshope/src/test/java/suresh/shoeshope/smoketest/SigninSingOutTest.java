package suresh.shoeshope.smoketest;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import suresh.shoeshope.browser.Browser;
//import junit.framework.Assert;
import suresh.shoeshope.pages.HomePage;
import suresh.shoeshope.pages.MyAccoutPage;
import suresh.shoeshope.pages.SignInPage;

public class SigninSingOutTest {

	@Before
	public void Init()
	{
		Browser.Open();
	}
	
	@After
	public void Cleanup(){
		Browser.Close();
		
	}
	
	@Test
	public void Can_Signin_And_SignOut()
	{
		HomePage.GoTo();
		HomePage.Header().SelectSignIn();
		SignInPage.LoginAs("sandipan@proconstructor.com").WithPassword("password12!@").Login();
		Assert.assertTrue(MyAccoutPage.IsAbleToLoginAs());
		
		MyAccoutPage.Signout();
		//Assert.assertTrue(SignInPage.IsAtSignInPage());
	}
}
