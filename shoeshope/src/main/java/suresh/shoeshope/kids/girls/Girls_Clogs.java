package suresh.shoeshope.kids.girls;

import suresh.shoeshope.browser.Browser;

public class Girls_Clogs {
	
	public boolean IsAt(){
		return Browser.Driver().getTitle().equals("Clogs - ShoeFactory");

     }


}
