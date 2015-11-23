package suresh.shoeshope.women.sandels;

import suresh.shoeshope.browser.Browser;

public class Regularsandelspage {
	
		public boolean  IsAt(){
			return Browser.Driver().getTitle().equals("Regular - ShoeFactory");

}
}