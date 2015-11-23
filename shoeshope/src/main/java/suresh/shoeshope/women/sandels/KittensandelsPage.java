package suresh.shoeshope.women.sandels;

import suresh.shoeshope.browser.Browser;

public class KittensandelsPage {
	
		public boolean  IsAt(){
			return Browser.Driver().getTitle().equals("Kitten - ShoeFactory");

}
}