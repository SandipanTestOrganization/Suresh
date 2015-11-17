package suresh.shoeshope.pages;

import org.openqa.selenium.By;

import suresh.shoeshope.browser.Browser;

public class MyAccoutPage {
	public static String acctttl="Sandipan Pramanik";
	public static boolean IsAbleToLoginAs( ) {
		
		return Browser.webDriver.findElement(By.xpath("/html/body/div/div[1]/header/div[2]/div/div/nav/div[1]/a/span")).getText().equals(acctttl);
	}

	public static void Signout() {
		Browser.webDriver.findElement(By.xpath("/html/body/div/div[1]/header/div[2]/div/div/nav/div[2]/a")).click();
		
	}

}
