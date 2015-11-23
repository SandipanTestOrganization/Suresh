package suresh.shoeshope.women.sandels;

import suresh.shoeshope.browser.Browser;

public class SandelsPage {
	  public boolean IsAt(){
		  return Browser.Driver().getTitle().equals("Sandals - ShoeFactory");
	  }
	
	public Regularsandelspage  regularsandels(){
	 
	Regularsandelspage  regularsandelspage= new Regularsandelspage();
	return regularsandelspage;
}
	public KittensandelsPage  kittnessandels(){
		 
		KittensandelsPage  kittensandelspage= new KittensandelsPage();
		return kittensandelspage;
	
}
}