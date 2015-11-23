package suresh.shoehope.pages.women;

import suresh.shoeshope.browser.Browser;

public class HeelsPage {
	
	public boolean IsAt(){
		return Browser.Driver().getTitle().equals("Heels - ShoeFactory");
		
	}
	
	public HighHeelsPage HighHeels(){
		HighHeelsPage highheelspage= new HighHeelsPage();
		return highheelspage;
		
		
	}
	
	public LowHeelsPage Lowheels(){
		LowHeelsPage lowheelspage=new LowHeelsPage();
		return lowheelspage;
		
	}
	
   public PointedHeelsPage pointedheels(){
	   PointedHeelsPage poinntedheelspage=new PointedHeelsPage();
	   return poinntedheelspage;
   }
    public WedgeHeelsPage wedgeheels(){
    	WedgeHeelsPage  wedgeHeelsPage= new WedgeHeelsPage();
    	return wedgeHeelsPage;
    	
    }

}
