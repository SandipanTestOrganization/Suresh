package suresh.shoeshope.menu;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


import suresh.shoeshope.browser.Browser;
import suresh.shoeshope.menu.Topmenubar.Men;
import suresh.shoeshope.menu.Topmenubar.Women.Heels.HighHeels;
import suresh.shoeshope.pages.HomePage;
import suresh.shoeshope.pages.KidsPage;
import suresh.shoeshope.pages.MenPage;
import suresh.shoeshope.pages.WomenPage;

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
		Assert.assertTrue(WomenPage.IsAt());
		Topmenubar.Women.Heels.Select();
		Assert.assertTrue(WomenPage.HeelsPage().IsAt());
	
		Topmenubar.Women.Heels.HighHeels.Select();
		Assert.assertTrue(WomenPage.HeelsPage().HighHeels().IsAt());
		Topmenubar.Women.Heels.Lowheels.Select();
	    Assert.assertTrue(WomenPage.HeelsPage().Lowheels().IsAt());
		Topmenubar.Women.Heels.pointedHeels.Select();
		Assert.assertTrue(WomenPage.HeelsPage().pointedheels().IsAt());
	    Topmenubar.Women.Heels.WedgeHeels.Select();
		Assert.assertTrue(WomenPage.HeelsPage().wedgeheels().IsAt());
	    Topmenubar.Women.Sandels.Select();
	    Assert.assertTrue(WomenPage.sandelspage().IsAt());
	  
		Topmenubar.Women.Sandels.Regular.Select();
		Assert.assertTrue(WomenPage.sandelspage().regularsandels().IsAt());
		Topmenubar.Women.Sandels.Kitten.Select();
		Assert.assertTrue(WomenPage.sandelspage().kittnessandels().IsAt());
		
		Topmenubar.Women.Shoes.Select();
		Assert.assertTrue(WomenPage.shoespage().IsAt());
			Topmenubar.Women.Shoes.casualshoes.Select();
		Assert.assertTrue(WomenPage.shoespage().casualshoes().IsAt());
		Topmenubar.Women.Shoes.Sportshoes.Select();
		Assert.assertTrue(WomenPage.shoespage().sportsshoes().IsAt());
		Topmenubar.Women.Shoes.Formalshoes.Select();
		Assert.assertTrue(WomenPage.shoespage().formalshoes().IsAt());
		Topmenubar.Women.Shoes.Ethnicshoes.Select();
		Assert.assertTrue(WomenPage.shoespage().ethnicshoes().IsAt());
		
		
		
		Topmenubar.Men.Select();
		Assert.assertTrue(MenPage.IsAt());
		Topmenubar.Men.Shoes.Casualshoes.Select();
		Assert.assertTrue(MenPage.Menshoes().Menscasualshoes().IsAt());
		Topmenubar.Men.Shoes.Formalshoes.Select();
		Assert.assertTrue(MenPage.Menshoes().Menformalshoes().IsAt());
		Topmenubar.Men.Shoes.Semiformal.Select();
		Assert.assertTrue(MenPage.Menshoes().Mensemiformalshoes().IsAt());
		Topmenubar.Men.Sneaker.Select();
		Assert.assertTrue(MenPage.Mensneakers().IsAt());
		Topmenubar.Men.Sneaker.regulars.Select();
	    Assert.assertTrue(MenPage.Mensneakers().Menregularshoes().IsAt());
		Topmenubar.Men.Atheletics.Select();
		Assert.assertTrue(MenPage.Menathelethicsshoes().IsAt());
		Topmenubar.Men.Atheletics.indoorshoes.Select();
		Assert.assertTrue(MenPage.Menathelethicsshoes().Indoorsportsshoes().IsAt());
		Topmenubar.Men.Atheletics.outdoorshoes.Select();
		//Assert.assertTrue(MenPage.Menathelethicsshoes().Outdoorshoes().IsAt());
		Topmenubar.Men.Atheletics.runningshoes.Select();
		Assert.assertTrue(MenPage.Menathelethicsshoes().Runningshoes().IsAt());
		Topmenubar.Men.Atheletics.trainingshoes.Select();
		Assert.assertTrue(MenPage.Menathelethicsshoes().Trainingshoes().IsAt());
		Topmenubar.Men.loafers.Select();
		//Assert.assertTrue(MenPage.Menloafers().IsAt()); 
		
		Topmenubar.kids.Select();
		Assert.assertTrue(KidsPage.IsAt());
		Topmenubar.kids.boys.Select();
		Assert.assertTrue(KidsPage.Boys().IsAt());
		Topmenubar.kids.boys.boots.Select();
		Assert.assertTrue(KidsPage.Boys().Boysboots().IsAt());
		Topmenubar.kids.boys.Casualshoes.Select();
		Assert.assertTrue(KidsPage.Boys().CasualShoes().IsAt());
		Topmenubar.kids.boys.Flipflops.Select();
		Assert.assertTrue(KidsPage.Boys().FlipFlops().IsAt());
		Topmenubar.kids.boys.SchoolShoes.Select();
		Assert.assertTrue(KidsPage.Boys().SchoolShoes().IsAt());
		Topmenubar.kids.boys.Sportrsshoes.Select();
		Assert.assertTrue(KidsPage.Boys().Sportshoes().IsAt());
		Topmenubar.kids.Girls.Select();
		Assert.assertTrue(KidsPage.Girls().IsAt());
		Topmenubar.kids.Girls.clogs.Select();
		Assert.assertTrue(KidsPage.Girls().Clogs().IsAt());
		Topmenubar.kids.Girls.Flats.Select();
		Assert.assertTrue(KidsPage.Girls().Flatandbellies().IsAt());
		Topmenubar.kids.Girls.Sportscasualshoes.Select();
		Assert.assertTrue(KidsPage.Girls().SportsandCasuals().IsAt());
		
	}

}
