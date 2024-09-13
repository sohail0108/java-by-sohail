package com.javabysohail;

public class JavaStatements {
	 public static boolean isEven(int number) {
	        return number % 2 == 0;
	    }

	    public static boolean incrementAndCheck(int number) {
	        number++;
	        System.out.println(number);
	        return number > 10;
	    }

	public static void main(String[] args) {
		
		/*int i=10;
		  int j;
		  if(i==10)
		 {
		   j=20;
	     }
		  System.out.println(j); */ //Compilation Error, Variable j might not have been initialized.

		int i=10;
		int j;
		if(i==10)
		 {
		   j=20;
		 }
		else
		{
		   j=30;
	    }
		System.out.println(j); 
		

		/* int i1=10;
           int j1;
           if(i1==10)
           {
			j1=20;
 			}
 			else if(i1==20)
			{
              j1=30;
            }
          System.out.println(j1); Compilation Error, Variable j might not have been initialized.
        
        */ 
		

         int i2=10;
         int j1;
         if(i2==10)
          {
           j1=20;
          }
         else if(i==20)
         { 
        	 j1=30;
         }
         else
         {
        	j1=40;
         }
         System.out.println(j1);
         
         
		
          final int i3=10;
          int j2;
          if(i3 == 10)
           {
            j2=20;
           }
          System.out.println(j2);
         
           
           
           int j3;
           if(true)
           {
            j3=20;
           }
          System.out.println(j3); 
         
         /* 
          In java applications, only class level variables are having default values, local variables
          are not having default values. If we declare local variables in java applications then we
          must provide initializations for that local variables explicitly, if we access any local
          variable with out having initialization explicitly then compiler will rise an error like
          "Variable x might not have been initialized".
          
          */
          
       //   if(System.out.println("Hello")) { }
          
          if (isEven(4)) {
              System.out.println("Even number");
          }
         
          int x = 10;
          if(x > 5)   // nested if 
              if(x > 8)
                  System.out.println(x+" is greater than 8");
              else
                  System.out.println(x+" is greater than  5");
         
          
          int a;
          if((a = 5) > 3) {
              System.out.println("Assignment and comparison in the same line");
          }
          
          if (x > 5 && x++ < 10) {
        	    System.out.println("Short-circuit behavior");
        	}
          
          int x1 = 10;
          if(x1++ == 10) {
              System.out.println("First");
          }
          if(x1 == 11) {
              System.out.println("Second");
          }
          
          
          if (incrementAndCheck(10)) {
              System.out.println("Condition is true");
          }
          
          
          int x2 = 10, y = 5;
          boolean y1;
		  if (y1=(x2> y )) {
              System.out.println("True");
              System.out.println("y1 = "+y1);
          } else {
              System.out.println("False");
          } 
		
		/*  if (x > y >z) {
			    System.out.println("True");
			} else {
			    System.out.println("False");
			}*/
		  
		  double a1 = 0.1 + 0.2; // a1=0.30000000000000004
		  if (a1 == 0.3) {
		      System.out.println("Equal");
		  } else {
		      System.out.println("Not Equal");
		  }
		  
		  
		
		//System.out.println(number);
		  
		  int a2 = 5, b = 10, c = 15;
		  if (a2 < b && b < c || a2++ > c) {
		      System.out.println("Condition 1");
		  } else if (a2 < c && b > c) {
		      System.out.println("Condition 2");
		  } else {
		      System.out.println("Condition 3");
		  }
		  System.out.println(a2);// 5 short circuit operation only one condition is checked if it is false then checks another
		  
		  int number = 7;
		  if ((number & 1) == 0) {
		      System.out.println("Even");
		  } else {
		      System.out.println("Odd");
		  }
		  
		  boolean xb = false;
		  boolean yb = true;
		  if (xb = yb == false) {  
			  System.out.println("xb "+xb);
			  System.out.println("yb "+yb);
		      System.out.println("True ");
		  } else {
			  System.out.println("xb "+xb);
			  System.out.println("yb "+yb);
		      System.out.println("False");
		  }

		  
		  int a3 = Integer.MAX_VALUE;
		  int b3 = Integer.MIN_VALUE;
		  if (a3 + b3 == 0) {
		      System.out.println("Equal");
		  } else {
		      System.out.println("Not Equal");
		  }
		  
		  
	}

}
