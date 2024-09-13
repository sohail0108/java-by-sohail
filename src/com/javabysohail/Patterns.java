package com.javabysohail;

public class Patterns {

	public static void main(String[] args) {
		
	// ----------------------------------------
		  for(int i = 0; i < 10; i++)
		   {
			  for(int j = 0; j < 10; j++)
			  {
			    System.out.print("*"+" ");
		      }
		       System.out.println();
		   }
		  System.out.println();
		
    // --------------------------------------------
		   for(int i = 0; i < 10; i++)
			 {
			   for(int j = 0; j < 10; j++)
			 {
			   System.out.print(j+" ");
			 }
			 System.out.println();
			 }
		   System.out.println();
		 
	// ---------------------------------------------
		   for(int i = 0; i < 10; i++)
		   {
			   for(int j = 0; j < 10;j++)
			   { 
				   System.out.print(i+" ");
			   }
			   System.out.println();
		   }
		   System.out.println();
		   
	// ----------------------------------------------	   
		   
		   for(int i = 0; i < 10; i++)
		   {
			   for(int j = 9; j>=0;j--)
			   { 
				   System.out.print(j+" ");
			   }
			   System.out.println();
		   }
		   
		   System.out.println();
	// -----------------------------------------------	   
		
		   
		   for(int i = 9; i>=0; i--)
		   {
			   for(int j = 0; j < 10;j++)
			   { 
				   System.out.print(i+" ");
			   }
			   System.out.println();
		   }
		   System.out.println();
	// ----------------------------------------------------	   
		   
		   
		   for(int i = 9; i>=0; i--)
		   {
			   for(int j = 0; j < 10;j++)
			   { 
				   System.out.print(i+" ");
			   }
			   System.out.println();
		   }
		   System.out.println();
		   
	// ---------------------------------------------------------
		   
		   for(int i = 0; i<10; i++)
		   {
			   for(int j = 0; j <10;j++)
			   { 
				   System.out.printf((char)(75-j-1)+" ");
			   }
			   System.out.println();
		   }
		   System.out.println(); 
		   
	// -----------------------------------------------------------	   
		   for(int i = 0; i<10; i++)
		   {
			   for(int j = 0; j <10;j++)
			   { 
				   System.out.printf((char)(i+65)+" ");
			   }
			   System.out.println();
		   }
		   System.out.println(); 
		   
    // -------------------------------------------------------------   
		   
		   
		   for(int i = 0; i<10; i++)
		   {
			   for(int j = 0; j <10;j++)
			   { 
				   System.out.printf((char)(75-i-1)+" ");
			   }
			   System.out.println();
		   }
		   System.out.println(); 
		   
	// -------------------------------------------------------------	   
		   
		 
		   for(int i = 0; i<10; i++)
		   {
			   for(int j = 0; j <10;j++)
			   { 
				   System.out.printf((char)(75-j-1)+" ");
			   }
			   System.out.println();
		   }
		   System.out.println(); 
		   
   // ---------------------------------------------------------------
		   
		   for(int i = 0; i<10; i++)
		   {
			   for(int j = 0; j<i+1;j++)
			   { 
				   System.out.print("* ");
			   }
			   System.out.println();
		   }
		   System.out.println();
		   
	// ---------------------------------------------------------------	   

		   for(int i = 0; i < 10; i++)
			  {
			    for(int  j= 0; j < (9-i); j++)
			    {
			      System.out.print("  ");
			    }
			    for(int k = 0; k <= i; k++)
			    {
			      System.out.print("*"+" ");
			    }
			    System.out.println();
			 } 
		   System.out.println();
// ----------------------------------------------------------------------
		   
		   for(int i = 0; i < 10; i++)
			  {
			   
			    for(int  j= 0; j <i; j++)
			    {
			      System.out.print("  ");
			    }
			    for(int k = 0; k <10-i; k++)
			    {
			      System.out.print(" *"+"");
			    }
			    
			    System.out.println();
			 } 
		   System.out.println();
 // --------------------------------------------------------------	   
		   
		   for(int i = 0; i < 10; i++)
			  {
			   for(int  j= 0; j <10-i; j++)
			    {
			      System.out.print(" *");
			    }
			   for(int  k= 0; k <i; k++)
			    {
			      System.out.print("  ");
			    }
			   System.out.println();
			  }
		    
		    System.out.println();
		   
	// -----------------------------------------------------------------
		    
		    for(int i = 0; i < 10; i++)
			  {
			    for(int  j= 0; j < (9-i); j++)
			    {
			      System.out.print(" ");
			    }
			    for(int k = 0; k <= i; k++)
			    {
			      System.out.print(" *");
			    }
			    System.out.println();
			 } 
		   System.out.println();    
  //-------------------------------------------------------------------	    
		    

		    for(int i = 0; i < 6; i++)
			  {
			    for(int  j= 0; j < (5-i); j++)
			    {
			      System.out.print(" ");
			    }
			    if(i==0) {
			    	System.out.print("*");
			    }
			    
			    for(int k =0; k < 2*i; k++)
			    {
			      System.out.print("*");
			    }
			    System.out.println();
			 } 
		   System.out.println(); 
  //------------------------------------------------------------------
		   
		   
		   for(int i = 0; i < 10; i++)
		   {
			    for(int  j= 0; j < i; j++)
			    {
			    	System.out.print(" ");
                }
       		    for(int k =0; k < 10-i; k++)
			    {
			      System.out.print("* ");
			    }
			    System.out.println();
			 } 
		   System.out.println(); 
//--------------------------------------------------------------------------		   
		   
		   for(int i = 0; i < 6; i++)
		   {
			    for(int  j= 0; j < i; j++)
			    {
			    	System.out.print(" ");
                }
       		    for(int k =0; k < 10-2*i; k++)
			    {
			      System.out.print("*");
			    }
			    
			    if(i==5) {
			    	System.out.print("*");
			    }
			    System.out.println();
			    
			 } 
		   System.out.println(); 
		   
   // --------------------------------------------------------------------
		   
		   for(int i = 0; i < 5; i++)
		   {
			    for(int  j= 0; j < i; j++)
			    {
			    	System.out.print(" ");
                }
       		    for(int k =0; k < 9-2*i; k++)
			    {
			      System.out.print("*");
			    }
			    System.out.println();
			    
			 } 
		   System.out.println(); 
		   
  // --------------------------------------------------------------------	   
		   
		   
		    for(int i = 0; i < 10; i++)
			  {
			    for(int  j= 0; j < (9-i); j++)
			    {
			      System.out.print(" ");
			    }
			    for(int k = 0; k <= i; k++)
			    {
			      System.out.print(" *");
			    }
			    System.out.println();
			 } 

			   for(int i = 0; i < 9; i++)
			   {
				    for(int  j= 0; j <= i; j++)
				    {
				    	System.out.print(" ");
	                }
	       		    for(int k =0; k < 9-i; k++)
				    {
				      System.out.print(" *");
				    }
				    System.out.println();
				 } 
			   System.out.println(); 
	//------------------------------------------------------------------   
		   
			   for(int i = 0; i < 5; i++)
			   {
				  for(int j = 0; j < 10; j++)
				  {
				    System.out.print("*");
			      }
			       System.out.println();
			   }
			   for(int i = 0; i < 5; i++)
			   {
				   for(int j =0; j < 3; j++)
				    {
				      System.out.print(" ");
				    }
				   
				   for(int k = 0; k < 4; k++)
				    {
				       System.out.print("*");
			        }
			       System.out.println();
			   }
			  System.out.println();
			   
	// ------------------------------------------		   

			    for(int i = 0; i < 8; i++)
				  {
				    for(int  j= 0; j < (7-i); j++) 
				    {
				      System.out.print(" ");
				    }
				    for(int k = 0; k <= i; k++)
				    {
				      System.out.print(" *");
				    }
				    System.out.println();
				 } 
		
			    for(int i = 0; i < 7; i++)
			     {
				    for(int j =0; j < 6; j++)
				     {
				      System.out.print(" ");
				     }
				   
				    for(int k = 0; k < 5; k++)
				     {
				       System.out.print("*");
			         }
			        System.out.println();
			     }
			   System.out.println();
			    		  
			   
		   
	}

}
