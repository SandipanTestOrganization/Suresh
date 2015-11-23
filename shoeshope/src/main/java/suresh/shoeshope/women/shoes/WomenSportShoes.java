package suresh.shoeshope.women.shoes;

import suresh.shoeshope.browser.Browser;

public class WomenSportShoes {
	public boolean  IsAt(){
		return Browser.Driver().getTitle().equals("Sports Shoes - ShoeFactory");
	}

}
