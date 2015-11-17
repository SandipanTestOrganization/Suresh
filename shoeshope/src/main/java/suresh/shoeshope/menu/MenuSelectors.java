package suresh.shoeshope.menu;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import suresh.shoeshope.browser.Browser;
import suresh.shoeshope.menu.Menus.SubMenu;

public class MenuSelectors {
	
	
	static String women_xPath = "//html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[1]/a";
	static String women_heels_xPath = ".//*[@id='block_top_menu']/ul/li[1]/ul/li[1]/a";
	static String women_heels_highheels_xPath = "/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[1]/ul/li[1]/ul/li[1]/a";
	static String women_heels_Lowheels_xPath="/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[1]/ul/li[1]/ul/li[2]/a";
	static String women_lh	="/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[1]/ul/li[1]/ul/li[2]/a";
	static String women_ph="/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[1]/ul/li[1]/ul/li[3]/a";
	static String women_sandels="/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[1]/ul/li[2]/a";
	static String women_wh="/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[1]/ul/li[1]/ul/li[4]/a";
	static String women_r="/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[1]/ul/li[2]/ul/li[1]/a";
	static String women_k="/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[1]/ul/li[2]/ul/li[2]/a";
	static String women_s="/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[1]/ul/li[3]/a";
	static String women_sh_cs="/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[1]/ul/li[3]/ul/li[1]/a";
	static String women_sh_ss="/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[1]/ul/li[3]/ul/li[2]/a";
	static String women_sh_fs="/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[1]/ul/li[3]/ul/li[3]/a";
	static String women_sh_es="/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[1]/ul/li[3]/ul/li[4]/a";
	static String Mens_Xpath="/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[2]/a";
	
	static String Mens_Shoes_xpath="/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[2]/ul/li[1]/a";
	static String Mens_Shoes_CASULASHOES_Xpath="/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[2]/ul/li[1]/ul/li[1]/a";
	static String Mens_Shoes_FORMALSHOES_xpath="/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[2]/ul/li[1]/ul/li[2]/a";
	
	static String Mens_Shoes_SEMIFORMALS_xpath="/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[2]/ul/li[1]/ul/li[3]/a";
	static String Mens_Sneaker="/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[2]/ul/li[2]/a";
	static String Mens_Regulars="/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[2]/ul/li[2]/ul/li/a";
	static String Mens_oh="/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[2]/ul/li[2]/ul/li/a";
	static String Mens_rs="/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[2]/ul/li[3]/ul/li[2]/a";
	static String Mens_iss="/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[2]/ul/li[3]/ul/li[3]/a";
	static String Mens_ts="/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[2]/ul/li[3]/ul/li[3]/a";
	static String Mens_lofers="/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[2]/ul/li[4]/a";
	static String Mens_ath="/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[2]/ul/li[3]/a";
	static String kids="/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[3]/a";
	static String kids_boys="/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[3]/ul/li[1]/a";
	static String kids_k_b="/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[3]/ul/li[1]/ul/li[1]/a";
	static String kids_cs="/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[3]/ul/li[1]/ul/li[2]/a";
	static String kids_ff="/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[3]/ul/li[1]/ul/li[3]/a";
	static String kids_s="/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[3]/ul/li[1]/ul/li[3]/a";
	static String kids_ss="/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[3]/ul/li[1]/ul/li[5]/a";
	static String kids_sps="/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[3]/ul/li[1]/ul/li[6]/a";
	static String kids_G="/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[3]/ul/li[2]/a";
	static String kids_Gs="/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[3]/ul/li[2]/ul/li[1]/a";
	static String kids_gc="/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[3]/ul/li[2]/ul/li[2]/a";
	static String kids_fb="/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[3]/ul/li[2]/ul/li[3]/a";
	static String kids_scs="/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[3]/ul/li[2]/ul/li[4]/a";
	static String kids_kids="/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[3]/ul/li[3]/a";
	
	
	
	public static WebElement  waitforElement(By locator,int seconds)
	{
		return (new WebDriverWait(Browser.webDriver,seconds)).until(ExpectedConditions.visibilityOfElementLocated(locator));
		
	}
	public static void Select(Menus Topmenu, SubMenu Subitems){
		
		switch (Topmenu) {
		case Women:
			 Actions mh1= new Actions(Browser.Driver()).moveToElement(waitforElement(By.xpath(women_xPath), 1000));
			 mh1.build().perform();
			  switch (Subitems) {
			  case NONE:
				  mh1.click().build().perform();
					break;
			   case WOMEN_HEELS:
				   Actions mh2= new Actions(Browser.Driver()).moveToElement(waitforElement(By.xpath(women_heels_xPath), 1000));
					 mh2.click().build().perform();
				
			   break;
				
			   case  WOMEN_HEELS_HIGHHEELS :
				   Actions mh3= new Actions(Browser.Driver()).moveToElement(waitforElement(By.xpath(women_heels_highheels_xPath), 1000));
					 mh3.click().build().perform();
				   break;
			   
			   case WOMEN_HEELS_LOWHEELS:
				   Actions mh4= new Actions(Browser.Driver()).moveToElement(waitforElement(By.xpath(women_heels_Lowheels_xPath), 1000));
					 mh4.click().build().perform();
				   break;
				  
			   case WOMEN_HEELS_POINTEDHEELS:
				   Actions mh18= new Actions(Browser.Driver()).moveToElement(waitforElement(By.xpath(women_ph), 1000));
					 mh18.click().build().perform();
				   break;
			   case WOMEN_HEELS_WEDGEHEELS:
				   Actions mh19= new Actions(Browser.Driver()).moveToElement(waitforElement(By.xpath(women_wh), 1000));
					 mh19.click().build().perform();
				   break;
			   case WOMEN_SANDALS_KITTEN :
				   Actions mh20= new Actions(Browser.Driver()).moveToElement(waitforElement(By.xpath(women_k), 1000));
					 mh20.click().build().perform();
				   break;
			   case WOMEN_SANDALS_REGULLAR :
				   Actions mh275= new Actions(Browser.Driver()).moveToElement(waitforElement(By.xpath(women_r), 1000));
					 mh275.click().build().perform();
				   break;
				   
			   case WOMEN_SHOES_CASUALSHOE :
				   Actions mh21= new Actions(Browser.Driver()).moveToElement(waitforElement(By.xpath(women_sh_cs), 1000));
					 mh21.click().build().perform();
				   break;
			   case  WOMEN_SHOES_SPORTSHOES :
				   Actions mh22= new Actions(Browser.Driver()).moveToElement(waitforElement(By.xpath(women_sh_ss), 1000));
					 mh22.click().build().perform();
				   break;
			   case WOMEN_SHOES_FORMALSHOES :
				   Actions mh23= new Actions(Browser.Driver()).moveToElement(waitforElement(By.xpath(women_sh_fs), 1000));
					 mh23.click().build().perform();
				   break;
			   case  WOMEN_SHOES_ETHINICSHOES:
				   Actions mh24= new Actions(Browser.Driver()).moveToElement(waitforElement(By.xpath(women_sh_es), 1000));
					 mh24.click().build().perform();
				   break;
			   case WOMEN_SANDALS:
				   Actions mh265= new Actions(Browser.Driver()).moveToElement(waitforElement(By.xpath(women_sandels), 1000));
					 mh265.click().build().perform();
			    default:
				break;
			}
			break;

		    default:
			break;
		}
	switch (Topmenu) {
	case Men:
		 Actions mh5= new Actions(Browser.Driver()).moveToElement(waitforElement(By.xpath(Mens_Xpath), 1000));
		 mh5.build().perform();
		 switch (Subitems) {
		case NONE:
			mh5. click().build().perform();
			break;
		case MEN_SHOES :
			Actions mh6= new Actions(Browser.Driver()).moveToElement(waitforElement(By.xpath(Mens_Shoes_xpath), 1000));
			 mh6.build().perform();
			break;
		case MEN_SHOES_CASULASHOES:
			Actions mh7= new Actions(Browser.Driver()).moveToElement(waitforElement(By.xpath(Mens_Shoes_CASULASHOES_Xpath), 1000));
			 mh7.build().perform();
			break;
		case MEN_SHOES_FORMALSHOES:
			Actions mh8= new Actions(Browser.Driver()).moveToElement(waitforElement(By.xpath(Mens_Shoes_FORMALSHOES_xpath), 1000));
			 mh8.build().perform();
			break;
		case MEN_SHOES_SEMIFORMALS :
			Actions mh9= new Actions(Browser.Driver()).moveToElement(waitforElement(By.xpath(Mens_Shoes_SEMIFORMALS_xpath), 1000));
			 mh9.build().perform();
			break;
		case MEN_SNEAKERS :
			Actions mh10= new Actions(Browser.Driver()).moveToElement(waitforElement(By.xpath(Mens_Sneaker), 1000));
			 mh10.build().perform();
			break;
		case MEN_ATHELETICS :
			Actions mh11= new Actions(Browser.Driver()).moveToElement(waitforElement(By.xpath(Mens_ath), 1000));
			 mh11.build().perform();
			break;
		case MEN_LOAFERS :
			Actions mh12= new Actions(Browser.Driver()).moveToElement(waitforElement(By.xpath(Mens_lofers), 1000));
			 mh12.build().perform();
			break;
		case  MEN_SNEAKERS_REGULARS:
			Actions mh13= new Actions(Browser.Driver()).moveToElement(waitforElement(By.xpath(Mens_Regulars), 1000));
			 mh13.build().perform();
			break;
		case MEN_ATHELETICS_OUTDOORANDHIKINGSHOES :
			Actions mh14= new Actions(Browser.Driver()).moveToElement(waitforElement(By.xpath(Mens_oh), 1000));
			 mh14.build().perform();
			break;
		case MEN_ATHELETICS_RUNNINGSHOES :
			Actions mh15= new Actions(Browser.Driver()).moveToElement(waitforElement(By.xpath(Mens_rs), 1000));
			 mh15.build().perform();
			break;
		case  MEN_ATHELETICS_INDOORSPORTSHOES:
			Actions mh16= new Actions(Browser.Driver()).moveToElement(waitforElement(By.xpath(Mens_iss), 1000));
			 mh16.build().perform();
			break;
		case  MEN_ATHELETICS_TRANNINGSHOES:
			Actions mh17= new Actions(Browser.Driver()).moveToElement(waitforElement(By.xpath(Mens_ts), 1000));
			 mh17.build().perform();
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
		Actions mh25= new Actions(Browser.Driver()).moveToElement(waitforElement(By.xpath(kids), 1000));
		 mh25.build().perform();
		switch (Subitems){
		
		
		case NONE:
			mh25.click().build().perform();
		break;
		case KIDS_BOYS:
			Actions mh255= new Actions(Browser.Driver()).moveToElement(waitforElement(By.xpath(kids_boys), 1000));
			 mh255.build().perform();
			break;
		case KIDS_BOYS_BOOTS:
			Actions mh26= new Actions(Browser.Driver()).moveToElement(waitforElement(By.xpath(kids_k_b), 1000));
			 mh26.build().perform();
			break;
		case KIDS_BOYS_CASUALSHOE:
			Actions mh27= new Actions(Browser.Driver()).moveToElement(waitforElement(By.xpath(kids_cs), 1000));
			 mh27.build().perform();
			break;
		case KIDS_BOYS_FLIPFLOPS:
			Actions mh28= new Actions(Browser.Driver()).moveToElement(waitforElement(By.xpath(kids_ff), 1000));
			 mh28.build().perform();
			break;
		case KIDS_BOYS_SANDELS:
			Actions mh29= new Actions(Browser.Driver()).moveToElement(waitforElement(By.xpath(kids_s), 1000));
			 mh29.build().perform();
			break;
		case KIDS_BOYS_SCHOOLSHOES:
			Actions mh30= new Actions(Browser.Driver()).moveToElement(waitforElement(By.xpath(kids_ss), 1000));
			 mh30.build().perform();
			break;
		case KIDS_BOYS_SPORTSHOES:
			Actions mh31= new Actions(Browser.Driver()).moveToElement(waitforElement(By.xpath(kids_sps), 1000));
			 mh31.build().perform();
			break;
		case KIDS_GIRLS:
			Actions mh32= new Actions(Browser.Driver()).moveToElement(waitforElement(By.xpath(kids_G), 1000));
			 mh32.build().perform();
			break;
		case KIDS_GIRLS_SANDELS:
			Actions mh33= new Actions(Browser.Driver()).moveToElement(waitforElement(By.xpath(kids_Gs), 1000));
			 mh33.build().perform();
			break;
		case KIDS_GIRLS_CLOGS:
			Actions mh34= new Actions(Browser.Driver()).moveToElement(waitforElement(By.xpath(kids_gc), 1000));
			 mh34.build().perform();
			break;
		case KIDS_GIRLS_FLATANDBELLIES:
			Actions mh35= new Actions(Browser.Driver()).moveToElement(waitforElement(By.xpath(kids_fb), 1000));
			 mh35.build().perform();
			break;
		case KIDS_GIRLS_SPORTSANDCASUALSHOES:
			Actions mh36= new Actions(Browser.Driver()).moveToElement(waitforElement(By.xpath(kids_scs), 1000));
			 mh36.build().perform();
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
