package suresh.shoeshope.pages;

import suresh.shoeshope.browser.Browser;

public class HomePage {

	public static String baseURL = "http://182.72.246.194/prestashop_1.6.1.1/prestashop/";
	public static String homeTitle = "ShoeFactory";
	
	public static void GoTo() {
		Browser.Driver().navigate().to(baseURL);
	}

	public static boolean IsAtHomePage() {
		return Browser.Driver().getTitle().equals(homeTitle);
	}

	public static HeaderPage Header() {
		// TODO Auto-generated method stub
		HeaderPage headerPage = new HeaderPage();
		return headerPage;
	}

	

	
}
