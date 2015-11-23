package suresh.shoeshope.kids.girls;

import suresh.shoeshope.browser.Browser;

public class Girls_SportsandCasuals {
	
	public boolean IsAt(){
		return Browser.Driver().getTitle().equals("Sporsts and Casual Shoes - ShoeFactory");

     }


}
