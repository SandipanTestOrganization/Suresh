package suresh.shoeshope.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import suresh.shoeshope.browser.Browser;

public class SignInCommands {

	public String username;
	public String password;
	
	public SignInCommands(String username){
		this.username = username;
	}
	public SignInCommands WithPassword(String password ){
		this.password = password;
		return this;
	}

	public void Login() {
		// TODO Auto-generated method stub
		//Find username and put username
		Waitforme(By.id("email"), 5000).sendKeys(username);
		Waitforme(By.id("passwd"), 5000).sendKeys(password);
		Waitforme(By.id("SubmitLogin"), 5000).click();
		// Find password and put password
		// find sign in button and click
		
	}
	
	public WebElement Waitforme(By locator,int seconds)
	 {
		return(new WebDriverWait(Browser.Driver(), seconds)).until(ExpectedConditions.visibilityOfElementLocated(locator));
		 
	 }
	 
}
