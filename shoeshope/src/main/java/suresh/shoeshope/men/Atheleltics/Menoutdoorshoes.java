package suresh.shoeshope.men.Atheleltics;

import suresh.shoeshope.browser.Browser;

public class Menoutdoorshoes {
	public boolean IsAt(){
		return Browser.Driver().getTitle().equalsIgnoreCase("Outdoor &amp; Hiking Shoes - ShoeFactory");
	}

}
