package suresh.shoeshope.kids.boys;

import suresh.shoeshope.browser.Browser;

public class Kids_Boys_SportShoes {
	public boolean IsAt(){
		return Browser.Driver().getTitle().equals("Sports Shoes - ShoeFactory");

     }
}
