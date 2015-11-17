package suresh.shoeshope.menu;




public class Topmenubar 
{
	
	          public static class Women
 {
		      public static void Select()
		      {
		       MenuSelectors.Select(Menus.Women, Menus.SubMenu.NONE);
		      }
		
		      public static class Heels
	{

			   public static void Select() 
			      {
			      MenuSelectors.Select(Menus.Women, Menus.SubMenu.WOMEN_HEELS);
				  }
			   public static class HighHeels
			   {
				  public static void Select()
				
				  {
				  MenuSelectors.Select(Menus.Women, Menus.SubMenu.WOMEN_HEELS_HIGHHEELS);	
				  }
			   }
			   public static class Lowheels
			   {
				   public static void Select()
				   {
					 MenuSelectors.Select(Menus.Women, Menus.SubMenu.WOMEN_HEELS_LOWHEELS);  
				   }
			   }
			   public static class pointedHeels
			   {
				   public static void Select()
				   {
					 MenuSelectors.Select(Menus.Women, Menus.SubMenu.WOMEN_HEELS_POINTEDHEELS);  
				   }
			   }
			   public static class WedgeHeels
			    {
				   public static void Select()
				   {
					 MenuSelectors.Select(Menus.Women, Menus.SubMenu.WOMEN_HEELS_WEDGEHEELS);  
				   }
			    }
			   
				
	}
		     public static class Sandels
		     
		     {
			       public static void Select()
			     {
				 MenuSelectors.Select(Menus.Women, Menus.SubMenu.WOMEN_SANDALS);  
			     }
			   public static class Regular
			    {
				    public static void Select()
				   {
					 MenuSelectors.Select(Menus.Women, Menus.SubMenu.WOMEN_SANDALS_REGULLAR);  
				   }
			    }
			   public static class Kitten
			   {
				   public static void Select()
				   {
					 MenuSelectors.Select(Menus.Women, Menus.SubMenu.WOMEN_SANDALS_KITTEN);  
				   }
			   }
		   }
		       public static class Shoes
		       {
				   public static void Select()
				   {
					 MenuSelectors.Select(Menus.Women, Menus.SubMenu.WOMEN_SHOES);  
				   }
				   public static class Sportshoes
				   {
					   public static void Select()
					   {
						 MenuSelectors.Select(Menus.Women, Menus.SubMenu.WOMEN_SHOES_SPORTSHOES);  
					   }
				   }
				   public static class casualshoes
				   {
					   public static void Select()
					   {
						 MenuSelectors.Select(Menus.Women, Menus.SubMenu.WOMEN_SHOES_CASUALSHOE);  
					   }
				   }
				   public static class Formalshoes
				   {
					   public static void Select()
					   {
						 MenuSelectors.Select(Menus.Women, Menus.SubMenu.WOMEN_SHOES_FORMALSHOES);  
					   }
				   }
				   public static class Ethnicshoes
				   {
					   public static void Select()
					   {
						 MenuSelectors.Select(Menus.Women, Menus.SubMenu.WOMEN_SHOES_ETHINICSHOES);  
					   }
				   }
			   }
			
       }
	       public static class Men
	    
    {
	    	
	    	   public static void Select()
	    	   {
	    		    MenuSelectors.Select(Menus.Men, Menus.SubMenu.NONE);	
	    	    }
	    	    public static class Shoes
	     {
	    		public static void Select()
	    		{
	    			MenuSelectors.Select(Menus.Men, Menus.SubMenu.MEN_SHOES);
	    		}
	    		public static class Casualshoes
	    		{
		    		public static void Select()
		    		{
		    			MenuSelectors.Select(Menus.Men, Menus.SubMenu.MEN_SHOES_CASULASHOES);
		    		}
		    	}
		    	public static class Formalshoes
		    	{
		    		public static void  Select()
		    		{
		    			MenuSelectors.Select(Menus.Men, Menus.SubMenu.MEN_SHOES_FORMALSHOES);
		    		}
		    	}
		    	public static class Semiformal
		    	{
		    		public static void Select()
		    		{
		    			MenuSelectors.Select(Menus.Men, Menus.SubMenu.MEN_SHOES_SEMIFORMALS);
		    		}
		    		
		    		
		    	}
	    		
	    }
	    	
              public static class Sneaker
        {
            	  public static void Select()
  	    		    {
  	    			MenuSelectors.Select(Menus.Men, Menus.SubMenu.MEN_SNEAKERS);
  	    		    }
            	  public static class regulars
            	  {
                  	public static void Select()
        	    		{
        	    			MenuSelectors.Select(Menus.Men, Menus.SubMenu.MEN_SNEAKERS_REGULARS);
        	    		}
                  	
                  }
	   }
            
            public static class Atheletics
            
       {
            	 public static void Select()
  	    		 {
  	    			MenuSelectors.Select(Menus.Men, Menus.SubMenu.MEN_ATHELETICS);
  	    		 }
            	public static class outdoorshoes
            	  {
                	public static void Select()
      	    		{
      	    			MenuSelectors.Select(Menus.Men, Menus.SubMenu.MEN_ATHELETICS_OUTDOORANDHIKINGSHOES);
      	    		}
                	
                }
    		   public static class runningshoes
    		   {
    			public static void Select()
    	    		{
    	    			MenuSelectors.Select(Menus.Men, Menus.SubMenu.MEN_ATHELETICS_RUNNINGSHOES);
    	    		}
    			
    		  }
    		public static class indoorshoes
    		{
    			public static void Select()
    	    		{
    	    			MenuSelectors.Select(Menus.Men, Menus.SubMenu.MEN_ATHELETICS_INDOORSPORTSHOES);
    	    		}
    			
    		}
    		 public static class trainingshoes
    		 {
    			public static void Select()
    	    		{
    	    			MenuSelectors.Select(Menus.Men, Menus.SubMenu.MEN_ATHELETICS_TRANNINGSHOES);
    	    		}
             }
            	
         }
            
		   public  static class loafers
		 
	    {
			 public static void Select()
	    		{
	    			MenuSelectors.Select(Menus.Men, Menus.SubMenu.MEN_LOAFERS);
	    		}
			 
	    }
   }
	    
            public static class kids
   {
    	
    		public static void Select()
	    		{
	    			MenuSelectors.Select(Menus.Kids, Menus.SubMenu.NONE);
	    		}
    	//}
    	
    public static class boys{
    	public static void Select()
		{
			MenuSelectors.Select(Menus.Kids, Menus.SubMenu.KIDS_BOYS);
		}
    	public static class boots{
        	public static void Select()
    		{
    			MenuSelectors.Select(Menus.Kids, Menus.SubMenu.KIDS_BOYS_BOOTS);
    		}
        
           }
        public static class Casualshoes{
        	public static void Select()
    		{
    			MenuSelectors.Select(Menus.Kids, Menus.SubMenu.KIDS_BOYS_CASUALSHOE);
    		}
        
           }
        public static class Flipflops{
        	public static void Select()
    		{
    			MenuSelectors.Select(Menus.Kids, Menus.SubMenu.KIDS_BOYS_FLIPFLOPS);
    		}
        
           }
        public static class Sandels{
        	public static void Select()
    		{
    			MenuSelectors.Select(Menus.Kids, Menus.SubMenu.KIDS_BOYS_SANDELS);
    		}
        
           }
        public static class SchoolShoes{
        	public static void Select()
    		{
    			MenuSelectors.Select(Menus.Kids, Menus.SubMenu.KIDS_BOYS_SCHOOLSHOES);
    		}
        
           }
        public static class Sportrsshoes{
        	public static void Select()
    		{
    			MenuSelectors.Select(Menus.Kids, Menus.SubMenu.KIDS_BOYS_SPORTSHOES);
    		}
        
           }
    }
    public static class Girls{
    	public static void Select()
		{
			MenuSelectors.Select(Menus.Kids, Menus.SubMenu.KIDS_GIRLS);
		}
    	public static class clogs{
        	public static void Select()
    		{
    			MenuSelectors.Select(Menus.Kids, Menus.SubMenu.KIDS_GIRLS_CLOGS);
    		}
        
           }
        public static class Flats{
        	public static void Select()
    		{
    			MenuSelectors.Select(Menus.Kids, Menus.SubMenu.KIDS_GIRLS_FLATANDBELLIES);
    		}
        
           }
        public static class Sportscasualshoes{
        	public static void Select()
    		{
    			MenuSelectors.Select(Menus.Kids, Menus.SubMenu.KIDS_GIRLS_SPORTSANDCASUALSHOES);
    		}
        	
        
           }
    
       }
    
    
    
  }
}
		



