package suresh.shoehope.pages.women;

import suresh.shoeshope.browser.Browser;

public class LowHeelsPage {
	public boolean  IsAt(){
		return Browser.Driver().getTitle().equals("Low Heels - ShoeFactory");
	}

}
