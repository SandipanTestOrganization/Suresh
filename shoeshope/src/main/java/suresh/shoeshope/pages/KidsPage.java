package suresh.shoeshope.pages;

import suresh.shoeshope.browser.Browser;
import suresh.shoeshope.kids.Kids_girls;
import suresh.shoeshope.kids.Kids_Boys;
import suresh.shoeshope.kids.Kids_shoes;


public class KidsPage {
	
	
	public static boolean IsAt(){
		return Browser.Driver().getTitle().equals("Kids - ShoeFactory");

     }
	public static  Kids_Boys  Boys(){
		Kids_Boys boysshoes= new Kids_Boys();
		return boysshoes;
	}
	
	public static Kids_girls   Girls(){
		Kids_girls girlsshoes = new Kids_girls ();
		return girlsshoes;
	}
	public static  Kids_shoes Kids(){
		Kids_shoes kidshoes= new Kids_shoes();
		return kidshoes;
	}
}
