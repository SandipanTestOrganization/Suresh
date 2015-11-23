package suresh.shoeshope.women.shoes;

import suresh.shoeshope.browser.Browser;

public class WomenCasualShoes {
	public boolean  IsAt(){
		return Browser.Driver().getTitle().equals("Casual shoes - ShoeFactory");
	}

}
