package suresh.shoeshope.menu;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import suresh.shoeshope.browser.Browser;
import suresh.shoeshope.pages.HomePage;

public class MenuTest {
	
	
	@Before
	public void init()
	    {
		Browser.Open();
		}
	@After
	public void close()
	{
	//Browser.Close();	
	}
	
	@Test
	public  void Goto_Menu_Bar() {
		HomePage.GoTo();
		Topmenubar.Women.Select();
		Topmenubar.Women.Heels.Select();
	
		Topmenubar.Women.Heels.HighHeels.Select();
		Topmenubar.Women.Heels.Lowheels.Select();
		Topmenubar.Women.Heels.pointedHeels.Select();
		Topmenubar.Women.Heels.WedgeHeels.Select();
		Topmenubar.Women.Sandels.Select();
		Topmenubar.Women.Sandels.Regular.Select();
		Topmenubar.Women.Sandels.Kitten.Select();
		
		Topmenubar.Women.Shoes.Select();
		Topmenubar.Women.Shoes.casualshoes.Select();
		Topmenubar.Women.Shoes.Sportshoes.Select();
		Topmenubar.Women.Shoes.Formalshoes.Select();
		Topmenubar.Women.Shoes.Ethnicshoes.Select();
		
		
		
		Topmenubar.Men.Select();
		Topmenubar.Men.Shoes.Casualshoes.Select();
		Topmenubar.Men.Shoes.Formalshoes.Select();
		Topmenubar.Men.Shoes.Formalshoes.Select();
		Topmenubar.Men.Sneaker.Select();
		Topmenubar.Men.Sneaker.regulars.Select();
		Topmenubar.Men.Atheletics.Select();
		Topmenubar.Men.Atheletics.indoorshoes.Select();
		Topmenubar.Men.Atheletics.outdoorshoes.Select();
		Topmenubar.Men.Atheletics.runningshoes.Select();
		Topmenubar.Men.Atheletics.trainingshoes.Select();
		Topmenubar.Men.loafers.Select();
		
		Topmenubar.kids.Select();
		Topmenubar.kids.boys.Select();
		Topmenubar.kids.boys.boots.Select();
		Topmenubar.kids.boys.Casualshoes.Select();
		Topmenubar.kids.boys.Flipflops.Select();
		Topmenubar.kids.boys.SchoolShoes.Select();
		Topmenubar.kids.boys.Sportrsshoes.Select();
		Topmenubar.kids.Girls.Select();
		Topmenubar.kids.Girls.clogs.Select();
		Topmenubar.kids.Girls.Flats.Select();
		Topmenubar.kids.Girls.Sportscasualshoes.Select();
		
	}

}
