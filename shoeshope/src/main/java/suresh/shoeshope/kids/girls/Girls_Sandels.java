package suresh.shoeshope.kids.girls;

import suresh.shoeshope.browser.Browser;

public class Girls_Sandels {
	
	public boolean IsAt(){
		return Browser.Driver().getTitle().equals("Sandels - ShoeFactory");

     }


}
