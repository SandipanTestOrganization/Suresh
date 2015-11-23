package suresh.shoeshope.pages;

import suresh.shoeshope.browser.Browser;
import suresh.shoeshope.women.sandels.SandelsPage;
import suresh.shoeshope.women.shoes.WomenShoes;
import suresh.shoehope.pages.women.HeelsPage;
public  class WomenPage {
	
	
	

	public static boolean IsAt() {
		return Browser.Driver().getTitle().equals("Women - ShoeFactory");
		
	}

	public static HeelsPage HeelsPage() {
		HeelsPage heelpage= new HeelsPage();
		return heelpage;
	}
	
	
	public static SandelsPage sandelspage() {
		SandelsPage sandels= new SandelsPage();
		return sandels;
	}
	public static WomenShoes  shoespage(){
		WomenShoes womenshoes=new WomenShoes();
		return womenshoes;
	}
	
	


	

}
