package suresh.shoeshope.men;

import suresh.shoeshope.browser.Browser;
import suresh.shoeshope.men.Atheleltics.MenIndoorsportsshoes;
import suresh.shoeshope.men.Atheleltics.MenRunningshoes;
import suresh.shoeshope.men.Atheleltics.MenTrainingshoes;
import suresh.shoeshope.men.Atheleltics.Menoutdoorshoes;

public class MenAtheletics {
	public boolean IsAt(){
		return Browser.Driver().getTitle().equals("Atheletics - ShoeFactory");
	}
		
	public MenIndoorsportsshoes Indoorsportsshoes(){
		MenIndoorsportsshoes indoorsportsshoes= new MenIndoorsportsshoes();
		return indoorsportsshoes;
		
	}
	public MenRunningshoes Runningshoes(){
		MenRunningshoes runningshoes= new MenRunningshoes();
		return runningshoes;
	}
	public MenTrainingshoes Trainingshoes(){
		MenTrainingshoes trainingshoes= new MenTrainingshoes();
		return trainingshoes;
	}
	public Menoutdoorshoes Outdoorshoes(){
		Menoutdoorshoes outdoorshoes= new Menoutdoorshoes();
		return outdoorshoes;
	}
	
}
