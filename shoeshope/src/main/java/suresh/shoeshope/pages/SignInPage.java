package suresh.shoeshope.pages;

public class SignInPage {

	//public static String username;
	//public static String password;
	public static SignInCommands LoginAs(String username) {
		SignInCommands signinCmd = new SignInCommands(username);
		return signinCmd;	
		
	}

	public static boolean IsAtSignInPage() {
		// TODO Auto-generated method stub
		return false;
	}

}
