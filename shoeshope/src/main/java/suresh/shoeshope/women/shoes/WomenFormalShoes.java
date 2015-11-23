package suresh.shoeshope.women.shoes;

import suresh.shoeshope.browser.Browser;

public class WomenFormalShoes {
	public boolean  IsAt(){
		return Browser.Driver().getTitle().equals("Formal Shoes - ShoeFactory");
	}

}
