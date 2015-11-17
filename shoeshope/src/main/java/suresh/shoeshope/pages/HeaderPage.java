package suresh.shoeshope.pages;

import org.openqa.selenium.By;

import suresh.shoeshope.browser.Browser;

public class HeaderPage {

	public void SelectSignIn() {
		// TODO Auto-generated method stub
		// Find the sign in button and click it.
		
		Browser.Driver().findElement(By.xpath("/html/body/div/div[1]/header/div[2]/div/div/nav/div[1]/a")).click();
		
	}

}
