package suresh.shoeshope.men.Atheleltics;

import suresh.shoeshope.browser.Browser;

public class MenRunningshoes {
	public boolean IsAt(){
		return Browser.Driver().getTitle().equals("Running Shoes - ShoeFactory");
	}

}
