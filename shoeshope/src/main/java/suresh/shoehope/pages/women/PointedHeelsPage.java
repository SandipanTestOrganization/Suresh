package suresh.shoehope.pages.women;

import suresh.shoeshope.browser.Browser;

public class PointedHeelsPage {
	public boolean  IsAt(){
		return Browser.Driver().getTitle().equals("Pointed Heels - ShoeFactory");
	}

}
