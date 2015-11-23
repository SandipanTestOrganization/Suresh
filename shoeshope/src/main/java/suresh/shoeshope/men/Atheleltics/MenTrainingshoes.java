package suresh.shoeshope.men.Atheleltics;

import suresh.shoeshope.browser.Browser;

public class MenTrainingshoes {
	public boolean IsAt(){
		return Browser.Driver().getTitle().equals("Training Shoes - ShoeFactory");
	}

}
