package suresh.shoeshope.kids;

import suresh.shoeshope.browser.Browser;
import suresh.shoeshope.kids.boys.Kids_Boys_Boots;
import suresh.shoeshope.kids.boys.Kids_Boys_FlipFlops;
import suresh.shoeshope.kids.boys.Kids_Boys_Sandels;
import suresh.shoeshope.kids.boys.Kids_Boys_SchoolShoes;
import suresh.shoeshope.kids.boys.Kids_Boys_SportShoes;
import suresh.shoeshope.kids.boys.Kids_boys_CasualShoes;

public class Kids_Boys {
	
	public boolean IsAt(){
		return Browser.Driver().getTitle().equals("Boys - ShoeFactory");

     }

	
   public  Kids_Boys_Boots Boysboots(){
	Kids_Boys_Boots boots= new Kids_Boys_Boots();
	return boots;
   }
   public  Kids_boys_CasualShoes CasualShoes(){
	   Kids_boys_CasualShoes casualShoes= new Kids_boys_CasualShoes();
		return casualShoes;
	   }
   public  Kids_Boys_FlipFlops FlipFlops(){
	   Kids_Boys_FlipFlops flipflops= new Kids_Boys_FlipFlops();
		return flipflops;
	   }
   public  Kids_Boys_Sandels Sandels(){
	   Kids_Boys_Sandels sandels= new Kids_Boys_Sandels();
		return sandels;
	   }
   public  Kids_Boys_SchoolShoes SchoolShoes(){
	   Kids_Boys_SchoolShoes schoolshoes= new Kids_Boys_SchoolShoes();
		return schoolshoes;
	   }
   public  Kids_Boys_SportShoes Sportshoes(){
	   Kids_Boys_SportShoes sportshoes= new Kids_Boys_SportShoes();
	return sportshoes;
		
	   }
}
