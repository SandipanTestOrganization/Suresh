package Cartpage;


import org.openqa.selenium.By;

import suresh.shoehope.pages.women.HighHeelsPage;
import suresh.shoeshope.browser.Browser;

public class Cart_page {

	public boolean Isaddedsuccessfully() {
		 
		
		//Assert.assertTrue(Browser.Driver().findElement(By.xpath("")).getText().equals(HighHeelsPage.heels));
		return Browser.Driver().findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div[2]/table/tbody/tr/td[2]/p/a")).getText().equals(HighHeelsPage.heels);
	}

}
