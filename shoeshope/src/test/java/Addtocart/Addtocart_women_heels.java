package Addtocart;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import Cartpage.Floatingcart;
import suresh.shoehope.pages.women.HeelsPage;
import suresh.shoehope.pages.women.HighHeelsPage;
import suresh.shoeshope.add.Mainmenu.Women.Heels;
import suresh.shoeshope.browser.Browser;
import suresh.shoeshope.menu.Topmenubar;
import suresh.shoeshope.menu.Topmenubar.Women.Heels.HighHeels;
import suresh.shoeshope.pages.HomePage;


public class Addtocart_women_heels {
	
	@Before
	public void init(){
		Browser.Open();
	}
	
	
	@Test
	public void Add_heels_to_cart(){
		HomePage.GoTo();
		Topmenubar.Women.Heels.HighHeels.Select();
	    HighHeelsPage.Addtocart("Black Heels");
	    Assert.assertTrue(HighHeelsPage.IsAtHighheelspagewith_continueshopping());
	    Assert.assertTrue(HighHeelsPage.Proceedtocheckout().Isaddedsuccessfully());
	    //Floatingcart.Isaddedsuccessfully();
	    Assert.assertTrue(Floatingcart.Isaddedsuccessfully());
	
		
	}

}