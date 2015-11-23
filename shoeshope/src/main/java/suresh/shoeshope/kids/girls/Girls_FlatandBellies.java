package suresh.shoeshope.kids.girls;

import suresh.shoeshope.browser.Browser;

public class Girls_FlatandBellies {
	
	public boolean IsAt(){
		return Browser.Driver().getTitle().equals("Flats and bellies - ShoeFactory");

     }


}
