package suresh.shoeshope.pages;

import suresh.shoeshope.browser.Browser;
import suresh.shoeshope.men.MenAtheletics;
import suresh.shoeshope.men.MenLoafers;
import suresh.shoeshope.men.MenShoes;
import suresh.shoeshope.men.MenSneakers;

public class MenPage {
	public static boolean IsAt(){
		return Browser.Driver().getTitle().equals("Men - ShoeFactory");
	
	 
	}
	
	public static  MenShoes Menshoes(){
		MenShoes shoes=new MenShoes();
		return shoes;
				
	}
	public static   MenLoafers Menloafers(){
		MenLoafers loafers= new MenLoafers();
		return loafers;
	}
	
	public static   MenSneakers Mensneakers(){
		MenSneakers sneakers = new MenSneakers();
		return sneakers;
	}
	public static  MenAtheletics Menathelethicsshoes(){
		MenAtheletics Athelethicshoes= new MenAtheletics();
		return Athelethicshoes;
	}
	
	

}
