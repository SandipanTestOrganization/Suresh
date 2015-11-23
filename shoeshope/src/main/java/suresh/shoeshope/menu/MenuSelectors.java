package suresh.shoeshope.menu;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import suresh.shoehope.uimap.MenuSelectorLocators;
import suresh.shoeshope.browser.Browser;
import suresh.shoeshope.menu.Menus.SubMenu;

public class MenuSelectors {
	
	
/*	static String women_xPath = "//html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[1]/a";
	static String women_heels_xPath = ".//*[@id='block_top_menu']/ul/li[1]/ul/li[1]/a";
	static String women_heels_highheels_xPath = "/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[1]/ul/li[1]/ul/li[1]/a";
	static String women_heels_Lowheels_xPath="/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[1]/ul/li[1]/ul/li[2]/a";
	static String women_lowheels_xpath	="/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[1]/ul/li[1]/ul/li[2]/a";
	static String women_ppointedheels_xpath="/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[1]/ul/li[1]/ul/li[3]/a";
	static String women_sandels_xpath="/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[1]/ul/li[2]/a";
	static String women_wedgeheels_xpath="/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[1]/ul/li[1]/ul/li[4]/a";
	static String women_regulars_xpath="/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[1]/ul/li[2]/ul/li[1]/a";
	static String women_kitten_xpath="/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[1]/ul/li[2]/ul/li[2]/a";
	static String women_shoes_xpath="/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[1]/ul/li[3]/a";
	static String women_shoes_casualshoes_xpath="/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[1]/ul/li[3]/ul/li[1]/a";
	static String women_shoes_sportsshoes_xpath="/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[1]/ul/li[3]/ul/li[2]/a";
	static String women_sh_formals_xpath="/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[1]/ul/li[3]/ul/li[3]/a";
	static String women_sh_ethnicshoes_xpath="/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[1]/ul/li[3]/ul/li[4]/a";
	static String Mens_Xpath="/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[2]/a";
	
	static String Mens_Shoes_xpath="/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[2]/ul/li[1]/a";
	static String Mens_Shoes_CASULASHOES_Xpath="/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[2]/ul/li[1]/ul/li[1]/a";
	static String Mens_Shoes_FORMALSHOES_xpath="/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[2]/ul/li[1]/ul/li[2]/a";
	
	static String Mens_Shoes_SEMIFORMALS_xpath="/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[2]/ul/li[1]/ul/li[3]/a";
	static String Mens_Sneaker_xapth="/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[2]/ul/li[2]/a";
	static String Mens_Regulars_xpath="/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[2]/ul/li[2]/ul/li/a";
	static String Mens_outdoorshoesh_xpath="/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[2]/ul/li[2]/ul/li/a";
	static String Mens_runningsshoes_xapth="/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[2]/ul/li[3]/ul/li[2]/a";
	static String Mens_indoorsportsshoes_Xpath="/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[2]/ul/li[3]/ul/li[3]/a";
	static String Mens_trainingsshoes_xpath="/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[2]/ul/li[3]/ul/li[3]/a";
	static String Mens_lofers_xapth="/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[2]/ul/li[4]/a";
	static String Mens_atheletics_xpath="/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[2]/ul/li[3]/a";
	static String kids_xpath="/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[3]/a";
	static String kids_boys_xpath="/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[3]/ul/li[1]/a";
	static String kids_boots_xpath="/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[3]/ul/li[1]/ul/li[1]/a";
	static String kids_casualshoes_xpath="/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[3]/ul/li[1]/ul/li[2]/a";
	static String kids_flipflops_xpath="/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[3]/ul/li[1]/ul/li[3]/a";
	static String kids_sandels_xpath="/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[3]/ul/li[1]/ul/li[3]/a";
	static String kids_sschoolshoes_xapth="/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[3]/ul/li[1]/ul/li[5]/a";
	static String kids_sportshoes_xpath="/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[3]/ul/li[1]/ul/li[6]/a";
	static String kids_Girls_xapth="/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[3]/ul/li[2]/a";
	static String kids_Girlssandels_xapth="/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[3]/ul/li[2]/ul/li[1]/a";
	static String kids_girlsclogs_xpath="/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[3]/ul/li[2]/ul/li[2]/a";
	static String kids_girldsflats_xpath="/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[3]/ul/li[2]/ul/li[3]/a";
	static String kids_girls_sportscasualshoes_xpath="/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[3]/ul/li[2]/ul/li[4]/a";
	static String kids_kids="/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[3]/ul/li[3]/a"; */

	
	
	public static WebElement  waitforElement(By locator,int seconds)
	{
		return (new WebDriverWait(Browser.webDriver,seconds)).until(ExpectedConditions.visibilityOfElementLocated(locator));
		
	}
	public static void Select(Menus Topmenu, SubMenu Subitems){
		
		switch (Topmenu) {
		case Women:
			 Actions WAction= new Actions(Browser.Driver()).moveToElement(waitforElement(By.xpath(MenuSelectorLocators.women_xPath), 1000));
			 WAction.build().perform();
			  switch (Subitems) {
			  case NONE:
				  WAction.click().build().perform();
					break;
			   case WOMEN_HEELS:
				   WAction.moveToElement(waitforElement(By.xpath(MenuSelectorLocators.women_heels_xPath), 1000)). click().build().perform();
					 break;
				
			   case  WOMEN_HEELS_HIGHHEELS :
				   WAction.moveToElement(waitforElement(By.xpath(MenuSelectorLocators.women_heels_highheels_xPath), 1000));
				   WAction.click().build().perform();
				   break;
			   
			   case WOMEN_HEELS_LOWHEELS:
				   WAction.moveToElement(waitforElement(By.xpath(MenuSelectorLocators.women_heels_Lowheels_xPath), 1000));
				   WAction.click().build().perform();
				   break;
				  
			   case WOMEN_HEELS_POINTEDHEELS:
				   WAction.moveToElement(waitforElement(By.xpath(MenuSelectorLocators.women_pointedheels_xpath), 1000));
				   WAction.click().build().perform();
				   break;
			   case WOMEN_HEELS_WEDGEHEELS:
				   WAction.moveToElement(waitforElement(By.xpath(MenuSelectorLocators.women_wedgeheels_xpath), 1000));
				   WAction.click().build().perform();
				   break;
			   case WOMEN_SANDALS_KITTEN :
				   WAction.moveToElement(waitforElement(By.xpath(MenuSelectorLocators.women_kittensandels_xpath), 1000));
				   WAction.click().build().perform();
				   break;
			   case WOMEN_SANDALS_REGULLAR :
				   WAction.moveToElement(waitforElement(By.xpath(MenuSelectorLocators.women_regularssandels_xpath), 1000));
				   WAction.click().build().perform();
				   break;
				   
			   case WOMEN_SHOES_CASUALSHOE :
				   WAction.moveToElement(waitforElement(By.xpath(MenuSelectorLocators.women_shoes_casualshoes_xpath), 1000));
				   WAction.click().build().perform();
				   break;
			   case  WOMEN_SHOES_SPORTSHOES :
				   WAction.moveToElement(waitforElement(By.xpath(MenuSelectorLocators.women_shoes_sportsshoes_xpath), 1000));
				   WAction.click().build().perform();
				   break;
			   case WOMEN_SHOES_FORMALSHOES :
				   WAction.moveToElement(waitforElement(By.xpath(MenuSelectorLocators.women_shoes_formalshoes_xpath), 1000));
				   WAction.click().build().perform();
				   break;
			   case  WOMEN_SHOES_ETHINICSHOES:
				   WAction.moveToElement(waitforElement(By.xpath(MenuSelectorLocators.women_shoes_ethnicshoes_xpath), 1000));
				   WAction.click().build().perform();
				   break;
			   case WOMEN_SANDALS:
				   WAction.moveToElement(waitforElement(By.xpath(MenuSelectorLocators.women_sandels_xpath), 1000));
				   WAction.click().build().perform();
				   break;
			   case WOMEN_SHOES:
				   WAction.moveToElement(waitforElement(By.xpath(MenuSelectorLocators.women_shoes_xpath), 1000));
				   WAction.click().build().perform();
				   break;
			    default:
				break;
			}
			break;

		    default:
			break;
		}
	switch (Topmenu) {
	case Men:
		 Actions MenAction= new Actions(Browser.Driver()).moveToElement(waitforElement(By.xpath(MenuSelectorLocators.Mens_Xpath), 1000));
		 MenAction.build().perform();
		 switch (Subitems) {
		case NONE:
			MenAction. click().build().perform();
			break;
		case MEN_SHOES :
			MenAction.moveToElement(waitforElement(By.xpath(MenuSelectorLocators.Mens_Shoes_xpath), 1000));
			MenAction.click().build().perform();
			break;
		case MEN_SHOES_CASULASHOES:
			MenAction.moveToElement(waitforElement(By.xpath(MenuSelectorLocators.Mens_Shoes_CASULASHOES_Xpath), 1000));
			MenAction.click().build().perform();
			break;
		case MEN_SHOES_FORMALSHOES:
			MenAction.moveToElement(waitforElement(By.xpath(MenuSelectorLocators.Mens_Shoes_FORMALSHOES_xpath), 1000));
			MenAction.click().build().perform();
			break;
		case MEN_SHOES_SEMIFORMALS :
			MenAction.moveToElement(waitforElement(By.xpath(MenuSelectorLocators.Mens_Shoes_SEMIFORMALS_xpath), 1000));
			MenAction.click().build().perform();
			break;
		case MEN_SNEAKERS :
			MenAction.moveToElement(waitforElement(By.xpath(MenuSelectorLocators.Mens_Sneaker_xapth), 1000));
			MenAction.click().build().perform();
			break;
		case MEN_ATHELETICS :
			MenAction.moveToElement(waitforElement(By.xpath(MenuSelectorLocators.Mens_atheletics_xpath), 1000));
			MenAction.click().build().perform();
			break;
		case MEN_LOAFERS :
			MenAction.moveToElement(waitforElement(By.xpath(MenuSelectorLocators.Mens_lofers_xapth), 1000));
			MenAction.build().perform();
			break;
		case  MEN_SNEAKERS_REGULARS:
			MenAction.moveToElement(waitforElement(By.xpath(MenuSelectorLocators.Mens_Regulars_xpath), 1000));
			MenAction.click().build().perform();
			break;
		case MEN_ATHELETICS_OUTDOORANDHIKINGSHOES :
			MenAction.moveToElement(waitforElement(By.xpath(MenuSelectorLocators.Mens_outdoorshoesh_xpath), 1000));
			MenAction.click().build().perform();
			break;
		case MEN_ATHELETICS_RUNNINGSHOES :
			MenAction.moveToElement(waitforElement(By.xpath(MenuSelectorLocators.Mens_runningsshoes_xapth), 1000));
			MenAction.click().build().perform();
			break;
		case  MEN_ATHELETICS_INDOORSPORTSHOES:
			MenAction.moveToElement(waitforElement(By.xpath(MenuSelectorLocators.Mens_indoorsportsshoes_Xpath), 1000));
			MenAction.click().build().perform();
			break;
		case  MEN_ATHELETICS_TRANNINGSHOES:
			MenAction.moveToElement(waitforElement(By.xpath(MenuSelectorLocators.Mens_trainingsshoes_xpath), 1000));
			MenAction.click().build().perform();
			break;
		
		default:
			break;
		}
		break;

	default:
		break;
	}
	switch (Topmenu) {
	case Kids:
		Actions KidsAction= new Actions(Browser.Driver()).moveToElement(waitforElement(By.xpath(MenuSelectorLocators.kids_xpath), 1000));
		KidsAction.build().perform();
		switch (Subitems){
		
		
		case NONE:
			KidsAction.click().build().perform();
		break;
		case KIDS_BOYS:
			KidsAction.moveToElement(waitforElement(By.xpath(MenuSelectorLocators.kids_boys_xpath), 1000));
			KidsAction.click().build().perform();
			break;
		case KIDS_BOYS_BOOTS:
			KidsAction.moveToElement(waitforElement(By.xpath(MenuSelectorLocators.kids_boots_xpath), 1000));
			KidsAction.click().build().perform();
			break;
		case KIDS_BOYS_CASUALSHOE:
			KidsAction.moveToElement(waitforElement(By.xpath(MenuSelectorLocators.kids_casualshoes_xpath), 1000));
			KidsAction.click().build().perform();	
			break;
		case KIDS_BOYS_FLIPFLOPS:
			KidsAction.moveToElement(waitforElement(By.xpath(MenuSelectorLocators.kids_flipflops_xpath), 1000));
			KidsAction.click().build().perform();
			break;
		case KIDS_BOYS_SANDELS:
			KidsAction.moveToElement(waitforElement(By.xpath(MenuSelectorLocators.kids_sandels_xpath), 1000));
			KidsAction.click().build().perform();
			break;
		case KIDS_BOYS_SCHOOLSHOES:
			KidsAction.moveToElement(waitforElement(By.xpath(MenuSelectorLocators.kids_sschoolshoes_xapth), 1000));
			KidsAction.click().build().perform();
			break;
		case KIDS_BOYS_SPORTSHOES:
			KidsAction.moveToElement(waitforElement(By.xpath(MenuSelectorLocators.kids_sportshoes_xpath), 1000));
			KidsAction.click().build().perform();
			break;
		case KIDS_GIRLS:
			KidsAction.moveToElement(waitforElement(By.xpath(MenuSelectorLocators.kids_Girls_xapth), 1000));
			KidsAction.click().build().perform();
			break;
		case KIDS_GIRLS_SANDELS:
			KidsAction.moveToElement(waitforElement(By.xpath(MenuSelectorLocators.kids_Girlssandels_xapth), 1000));
			KidsAction.click().build().perform();
			break;
		case KIDS_GIRLS_CLOGS:
			KidsAction.moveToElement(waitforElement(By.xpath(MenuSelectorLocators.kids_girlsclogs_xpath), 1000));
			KidsAction.click().build().perform();
			break;
		case KIDS_GIRLS_FLATANDBELLIES:
			KidsAction.moveToElement(waitforElement(By.xpath(MenuSelectorLocators.kids_girldsflats_xpath), 1000));
			KidsAction.click().build().perform();
			break;
		case KIDS_GIRLS_SPORTSANDCASUALSHOES:
			KidsAction.moveToElement(waitforElement(By.xpath(MenuSelectorLocators.kids_girls_sportscasualshoes_xpath), 1000));
			KidsAction.click().build().perform();
			break;
		
			

		default:
			break;
		}
		
		break;

	default:
		break;
	}
	}
	
	
 
	

}
