package suresh.shoeshope.women.shoes;

import suresh.shoeshope.browser.Browser;

public class WomenEthnicShoes {
	public boolean  IsAt(){
		return Browser.Driver().getTitle().equals("Ethnic Shoes - ShoeFactory");
	}

}
