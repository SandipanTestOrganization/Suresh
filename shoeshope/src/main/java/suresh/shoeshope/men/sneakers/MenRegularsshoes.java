package suresh.shoeshope.men.sneakers;

import suresh.shoeshope.browser.Browser;

public class MenRegularsshoes{
	
	public boolean IsAt(){
		return Browser.Driver().getTitle().equals("Regulars - ShoeFactory");
		
		
	}
}
