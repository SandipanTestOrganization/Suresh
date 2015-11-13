package suresh.shoeshope.pages;

import suresh.shoeshope.browser.Browser;

public class HomePage {

	public String baseURL = "http://182.72.246.194/prestashop_1.6.1.1/prestashop/";
	public String homeTitle = "ShoeFactory";
	
	public void GoTo() {
		Browser.Driver().navigate().to(baseURL);
	}

	public boolean IsAtHomePage() {
		return Browser.Driver().getTitle().equals(homeTitle);
	}

	

	
}
