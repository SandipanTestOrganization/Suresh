package suresh.shoeshope.kids;

import suresh.shoeshope.browser.Browser;
import suresh.shoeshope.kids.girls.Girls_Clogs;
import suresh.shoeshope.kids.girls.Girls_FlatandBellies;
import suresh.shoeshope.kids.girls.Girls_Sandels;
import suresh.shoeshope.kids.girls.Girls_SportsandCasuals;

public class Kids_girls {
	
	
	
	public boolean IsAt(){
		return Browser.Driver().getTitle().equals("Girls - ShoeFactory");

     }

	
   public  Girls_FlatandBellies Flatandbellies(){
	   Girls_FlatandBellies flatsandbellies= new Girls_FlatandBellies();
	return flatsandbellies;
   }
   public  Girls_Clogs Clogs(){
	   Girls_Clogs clogs= new Girls_Clogs();
		return clogs;
	   }
   public  Girls_Sandels Sandels(){
	   Girls_Sandels sandels= new Girls_Sandels();
		return sandels;
	   }
   public  Girls_SportsandCasuals SportsandCasuals(){
	   Girls_SportsandCasuals sportsandCasuals= new Girls_SportsandCasuals();
		return sportsandCasuals;
	   }

}
