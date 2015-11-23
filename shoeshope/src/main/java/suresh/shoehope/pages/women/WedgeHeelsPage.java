package suresh.shoehope.pages.women;

import suresh.shoeshope.browser.Browser;

public class WedgeHeelsPage {
	
	
		public boolean  IsAt(){
			return Browser.Driver().getTitle().equals("Wedge Heels - ShoeFactory");
		}
	

}
