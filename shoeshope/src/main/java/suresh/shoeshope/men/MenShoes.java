package suresh.shoeshope.men;

import suresh.shoeshope.browser.Browser;
import suresh.shoeshope.men.shoes.MenFormalshoes;
import suresh.shoeshope.men.shoes.MenSemiformalshoes;
import suresh.shoeshope.men.shoes.MensCasualshoes;



public class MenShoes {
	
	public  boolean IsAt(){
		return Browser.Driver().getTitle().equals("Shoes - ShoeFactory");
		
	}
	public MenFormalshoes Menformalshoes(){
		MenFormalshoes formalshoes= new MenFormalshoes();
		return formalshoes;
		
	}
	public MensCasualshoes Menscasualshoes(){
		MensCasualshoes casualshoes= new MensCasualshoes();
		return casualshoes;
	}
	public MenSemiformalshoes Mensemiformalshoes(){
		MenSemiformalshoes semiformalshoes= new MenSemiformalshoes();
		return semiformalshoes;
	}
	

}
