package suresh.shoeshope.men.shoes;

import suresh.shoeshope.browser.Browser;

public class MenSemiformalshoes {
	public boolean IsAt(){
		return Browser.Driver().getTitle().equals("Semi Formals - ShoeFactory");

      }
}