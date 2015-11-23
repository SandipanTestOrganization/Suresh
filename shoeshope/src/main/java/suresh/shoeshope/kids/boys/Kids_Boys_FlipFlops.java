package suresh.shoeshope.kids.boys;

import suresh.shoeshope.browser.Browser;

public class Kids_Boys_FlipFlops {
	public  boolean IsAt(){
		return Browser.Driver().getTitle().equals("Flip Flops - ShoeFactory");

     }

}
