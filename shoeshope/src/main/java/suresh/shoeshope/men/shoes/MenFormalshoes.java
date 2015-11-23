package suresh.shoeshope.men.shoes;

import suresh.shoeshope.browser.Browser;

public class MenFormalshoes {
	public boolean IsAt(){
		return Browser.Driver().getTitle().equals("Formal Shoes - ShoeFactory");

}
}