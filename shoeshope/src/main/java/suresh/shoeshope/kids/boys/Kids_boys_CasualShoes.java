package suresh.shoeshope.kids.boys;

import suresh.shoeshope.browser.Browser;

public class Kids_boys_CasualShoes {
	public  boolean IsAt(){
		return Browser.Driver().getTitle().equals("Casual Shoes - ShoeFactory");

     }
}
