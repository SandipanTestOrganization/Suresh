package suresh.shoeshope.women.shoes;

import suresh.shoeshope.browser.Browser;

public class WomenShoes {
	
	public boolean IsAt(){
		return Browser.Driver().getTitle().equalsIgnoreCase("Shoes - ShoeFactory");
	}
	
	public WomenCasualShoes casualshoes(){
		WomenCasualShoes womencasaulshoes= new WomenCasualShoes();
		return womencasaulshoes;
	}
	
	public WomenFormalShoes formalshoes(){
		WomenFormalShoes womenformalshoes= new WomenFormalShoes();
		return womenformalshoes;
	}
	
	public WomenEthnicShoes ethnicshoes(){
		WomenEthnicShoes womenethnicshoes= new WomenEthnicShoes();
		return womenethnicshoes;
	}
	public WomenSportShoes sportsshoes(){
		WomenSportShoes womenwportwshoes= new WomenSportShoes();
		return womenwportwshoes;
	}
	
}
