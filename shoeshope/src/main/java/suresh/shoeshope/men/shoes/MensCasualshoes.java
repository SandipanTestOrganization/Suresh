package suresh.shoeshope.men.shoes;

import suresh.shoeshope.browser.Browser;

public class MensCasualshoes {
	
	public boolean IsAt(){
		return Browser.Driver().getTitle().equals("Casual Shoes - ShoeFactory");

}
}