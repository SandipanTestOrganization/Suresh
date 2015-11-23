package Cartpage;



import org.junit.Assert;
import org.openqa.selenium.By;


import org.openqa.selenium.interactions.Actions;

import suresh.shoehope.pages.women.HighHeelsPage;
import suresh.shoeshope.browser.Browser;

public class Floatingcart { 
	
	
	
	
	    
	
	  
         public static boolean Isaddedsuccessfully() {
        	 
     		
        	Actions  Floataction= new Actions(Browser.Driver());
        	  Browser.Driver().findElement(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[3]/div/a")).click();
        	//Floataction.moveToElement(Browser.Driver().findElement(By.xpath("html/body/div/div[1]/header/div[3]/div/div/div[3]/div/a/span[2]))).build().perform();
        	//Floataction.moveToElement(Browser.Driver().findElement(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[3]/div/div/div/div/dl/dt/span/a"))).build().perform();
		
		//Assert.assertTrue(Browser.Driver().findElement(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[3]/div/a/span[1]")).getText().equals(HighHeelsPage.heels));
		return Browser.Driver().findElement(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[3]/div/div/div/div/dl/dt/div/div[1]/a")).getText().equals(HighHeelsPage.heels);
        	
	}


}
