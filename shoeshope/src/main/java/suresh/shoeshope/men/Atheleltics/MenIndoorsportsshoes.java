package suresh.shoeshope.men.Atheleltics;

import suresh.shoeshope.browser.Browser;

public class MenIndoorsportsshoes {
	public boolean IsAt(){
		return Browser.Driver().getTitle().equals("Indoor Sports Shoes - ShoeFactory");
	}

}
