package suresh.shoeshope.men;

import suresh.shoeshope.browser.Browser;
import suresh.shoeshope.men.sneakers.MenRegularsshoes;


public class MenSneakers {
	
	public boolean IsAt(){
		return Browser.Driver().getTitle().equals("Sneakers - ShoeFactory");
		
		
	}
	
	public MenRegularsshoes Menregularshoes(){
		MenRegularsshoes regularsshoes= new MenRegularsshoes();
		return regularsshoes;
	}

}
