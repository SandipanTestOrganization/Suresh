package suresh.shoeshope.men;

import suresh.shoeshope.browser.Browser;

public class MenLoafers {
	public  boolean IsAt(){
		return Browser.Driver().getTitle().equals("Loafers - ShoeFactory");
	
	 
	}
	
	

}
