package suresh.shoeshope.kids.boys;

import suresh.shoeshope.browser.Browser;

public class Kids_Boys_SchoolShoes {
	public  boolean IsAt(){
		return Browser.Driver().getTitle().equals("School Shoes - ShoeFactory");

     }
}
