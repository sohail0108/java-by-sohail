package com.javabysohail;

public class Switch {
	/*switch
	'if' is able to provide single condition checking by default, but, switch is able to provide
	multiple conditions checkings
	
	We will utilize switch programming element in "Menu Driven" Applications.
	 */
	
	public static void main(String[] args)
	{
	    int i=10;
	    switch(i)
	    {
	        case 5:
	        	System.out.println("Five");
	        	break;
	        case 10:
	        	System.out.println("Ten");
	        	break;
	        case 15:
	        	System.out.println("Fifteen");
	        	break;
	        case 20:
	        	System.out.println("Twenty");
	        	break;
	        default:
	        	System.out.println("Default");
	        	break;
		 }
	    
	    
	    	char c='B';
	    	switch(c)
	    	{
	    		case 'A':
	    			System.out.println("Five");
	    			break;
	    		case 'B':
	    			System.out.println("Ten");
	    			break;
	    		case 'C':
	    			System.out.println("Fifteen");
	    			break;
	    		case 'D':
	    			System.out.println("Twenty");
	    			break;
	    		default:
	    			System.out.println("Default");
	    			break;
	    	} 

	    	String str="BBB";
	    	switch(str)
	    	 {
	          	case "AAA":
	          		System.out.println("AAA");
	          		break;
	          	case "BBB":
	          		System.out.println("BBB");
	          		break;
	          	case "CCC":
	          		System.out.println("CCC");
	          		break;
	          	case "DDD":
	          		System.out.println("DDD");
	          		break;
	          	default:
	    			System.out.println("Default");
	    			break;
	    	 } 
	    	/*In switch, all cases and default are optional, we can write switch with out cases and
	    	with default, we can write switch with cases and with out default, we can write switch
	    	with out both cases and default.*/
	
	    	
	    		int i1=10;
	    		 switch(i1)
	    		 {
	    		 	default:
	    		 		System.out.println("Default");
	    		 		break;
	    		 } 

	 	    	/*
	    		 
	    		          In switch, "break" statement is optional, we can write switch with out break statement, in
	    		 this context, JVM will execute all the instructions continuously right from matched case
	    		 until it encounter either break statement or end of switch.
	 	    	 
	 	    	 */
	
	
	    		 int i3=10;
	    		  switch(i3)
	    		{
	    		   case 5:
	    			   System.out.println("Five");
	    		
	    		   case 10:
	    			   System.out.println("Ten");
	    		
	    		   case 15:
	    			   System.out.println("Fifteen");
	    		
	    		   case 20:
	    			   System.out.println("Twenty");
	    		
	    		   default:
	    			   System.out.println("Default");
	    		 } 
	  	//	  In switch, all case values must be provided with in the range of the data type which we  provided as parameter to switch.
	
	    		  
	    		  byte b=126;
	    		   switch(b)
	    		   {
	    		     case 125:
	    		    	 System.out.println("125");
	    		    	 break;
	    		     case 126:
	    		    	  System.out.println("126");
	    		    	  break;
	    		     case 127:
	    		    	  System.out.println("127");
	    		    	 break;
	    		  //    case 128:
	    		  //  	 System.out.println("128");
	    		  //  	  break;
	    		    	 default:
	    		    	 System.out.println("Default");
	    		    	  break;
	    		   } 
	    		  
	    		  
	
	}

}
