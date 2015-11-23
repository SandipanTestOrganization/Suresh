package suresh.shoehope.pages.women;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Cartpage.Cart_page;
import suresh.shoeshope.browser.Browser;

public class HighHeelsPage {
	public static String heels="Black Heels";
	
	public static boolean  IsAt(){
		return Browser.Driver().getTitle().equals("High Heels - ShoeFactory");
	}
	
	public static WebElement WaitforWebobjectstoload(By locator,int seconds){
		return (new WebDriverWait(Browser.Driver(),seconds)).until(ExpectedConditions.visibilityOfElementLocated(locator));
		
	}
	
	public static String Addtocart(String heels){
		
	    String heelname=Browser.Driver().findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div[2]/ul/li[1]/div/div[2]/h5/a")).getText();
		
		if(heelname.equals(heels)){
		
		Actions  addaction= new Actions(Browser.Driver());
		addaction.moveToElement(WaitforWebobjectstoload(By.xpath("/html/body/div/div[2]/div/div[3]/div[2]/ul/li[1]/div/div[1]/div/a[1]"), 2000)).build().perform();
		addaction.moveToElement(WaitforWebobjectstoload(By.xpath("/html/body/div/div[2]/div/div[3]/div[2]/ul/li[1]/div/div[2]/div[2]/a[1]/span"), 2000)).click().build().perform();
		
		}
		return heelname;
	
			
		}
	

	   public static boolean IsAtHighheelspagewith_continueshopping() {
		WaitforWebobjectstoload(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[4]/div[1]/div[2]/div[4]/span"), 1000).click();
		
		return Browser.Driver().getTitle().equals("High Heels - ShoeFactory");
		
		
	}

	public static Cart_page Proceedtocheckout() {
		Actions  addaction= new Actions(Browser.Driver());
		addaction.moveToElement(WaitforWebobjectstoload(By.xpath("/html/body/div/div[2]/div/div[3]/div[2]/ul/li[1]/div/div[1]/div/a[1]"), 2000)).build().perform();
		addaction.moveToElement(WaitforWebobjectstoload(By.xpath("/html/body/div/div[2]/div/div[3]/div[2]/ul/li[1]/div/div[2]/div[2]/a[1]/span"), 2000)).click().build().perform();
		WaitforWebobjectstoload(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[4]/div[1]/div[2]/div[4]/a"), 1000).click();
		Cart_page cartpage= new Cart_page();
		return cartpage;
	}
	  
	   }
					
				
	

