package com.javabysohail;

public class IterativeStatements {

	public static void main(String[] args) {

    	/*Iterative Statements:
			These statements are able to allow JVM to execute a set of instructions repeatedly on the
			basis of a particular condition.
			
			for Syntax: for(Expr1; Expr2; Expr3)
 				{
 						----instructions-----
 				}
				Expr1-----> 1 time
				Expr2-----> 11 times
				Expr3-----> 10 times
				Body -----> 10 times

			
			*/
		
		for(int i=0;i<10;i++)
		 {
			 System.out.println(i);
		 } 
		
	     int i=0;
      	 for(;i<10;i++)
		 {
	         System.out.println(i);
		 }
	

      	for(System.out.println("Hello"); i < 10; i++)  // for loop with print and condition
      	{
      	    System.out.println(i);  //  Print the value of i
      	}
		
		
    /* 	for (int i = 0, float f = 0.0f; i < 10 && f < 10.0f; i++, f++)
     
    	Java does not allow different data types (like int and float) to be declared together in
       	the same for loop initialization block.
      	{
      		 System.out.println(i+" "+f);
      	}
    */
      	for(int i1=0, j=0 ;i1<10 && j<10; i1++,j++)
      		 {
      		System.out.println(i1+" "+j);
      	 } 
		
		
      	/*  	for(int i2=0; ;i2++)           // Status: No Compilation Error
      		 {
      		 System.out.println(i2);   // OUTPUT: Infinite Loop
      		 }
      	*/
      	
      	
      	
      	/*    	for(int i3=0; System.out.println("Hello") ;i3++)  Status: Compilation Error
      	   {
      	   		Reason: In for loop, Expr2 is optional, we can write for loop even without Expr2, if we
				write for loop without Expr2 then for loop will take "true" value as Expr2 and it will make
      	   		for loop as an infinite loop. If we want to write any statement as Expr2 then that
				statement must be boolean statement, it must return either true value or false value.
      	   
      	  		System.out.println(i3);
      		}  
      	
      	*/
		
      	
      	
      	
      	System.out.println("Before Loop");

        for (int j = 0; j <= 0 || j >= 0; j++) {
            System.out.println("Inside Loop");
        }

        System.out.println("After Loop");
        
        /* 
        
        	The program will print "Before Loop" once.
        	Then, it will enter an infinite loop, continuously printing "Inside Loop" forever, because 
        	the condition i <= 0 || i >= 0 is always true.
        	The "After Loop" statement will never be printed.
        	
        
        
            System.out.println("Before Loop");
         	for(int i5=0;;i5++)
         	{
        	 	System.out.println("Inside Loop");
         	}
       		System.out.println("After Loop"); Status: Compilation Error, Unreachable Statement

           
            Deciding whether a loop as an infinite loop or not is completely depending on the
            conditional expression, if the conditional expression is constant expression and it returns
            true value always then compiler will recognize the provided loop as an infinite loop. If the
            conditional expression is variable expression then compiler will not recognize the
            provided loop as an infinite loop even the loop is really infinite loop.
         
         */
         
         for(int j=0;j<10;)              //Status: No Compilation Error
         {   
        	 System.out.println(j);      //OUTPUT: 0 ,1 ..... 9
        	 j=j+1;
         }
         
         for(int j=0;j<10;System.out.println("Hello")) //Status: No Compilation Error
         {
        	 System.out.println(j);     
        	 j=j+1;
          } 
         
      /*  
         Output: 0
         Hello
         1
         Hello
         ----
         ----
         9
         Hello 
        
         In for loop, Expr3 is optional, we can write for loop without expr3, we can provide
		 any statement as expr3, but, it is suggestible to provide loop variable
		 increment/decrement kind of statements as expr3.
       
       
       
          for(;;) Status: Compilation Error
         
          for(;;);
         
          Status: No Compilation Error
          OUTPUT: No Output, but, JVM will be in infinite loop
         
          for(;;)
        	 {
        	
        	 } 
        	 	
         Status: No Compilation Error
		 OUTPUT: No Output, but, JVM will be in infinite loop

		"for-Each" loop provided by JDK5.0 version.
		Syntax:
		
		for(Array_Data_Type var: Array_Ref_Var)
		{
 			----
		}
        


        	 
         */
         
         
         int[] a={1,2,3,4,5};
         for(int x: a)            // for-each loop used to Access the elements of arrays 
          {
        	 System.out.println(x);
          } 
         
         for(int j=0;j<a.length;j++)
        	 {
        	 System.out.println(a[j]);
        	} 
       
         /*
             While Loop:
        	 In java applications, when we are not aware the no of iterations in advance before writing
        	 loop there we have to utilize 'while' loop.
        	 
        	 
        	 Syntax:
				while(Condition)
				{
 						---instructions-----
				}
  
         */
         
          int i1=0;
          while(i1<10)
          {
        	  System.out.println(i1);
        	  i1=i1+1;
          }
        
       /*
          while()  ----------- Status: Compilation Error  Reason: Conditional Expression is mandatory.
          {
        	   System.out.println(i);
        	   i=i+1;
          }
         
         
           System.out.println("Before Loop");
           while(true)
           {
          		System.out.println("Inside Loop");
           }
           System.out.println("After Loop"); ---------- Status: Compilation Error, Unreachable Statement.
  
         
       */
           
          System.out.println("Before Loop");
          int j=0;
          while(j<=0 || j>=0)
           {
        	  System.out.println("Inside Loop"); // ----- infinite loop
           }
          System.out.println("After Loop"); 
          
       /*    
            
            do-while
            
            While loop is not giving any guarantee to execute loop body minimum one time.
			do-while loop will give guarantee to execute loop body minimum one time.
            
            In case of while, first, conditional expression will be executes, if it returns true
			then only loop body will be executed.
			
			In case of do-while loop, first loop body will be executed then condition will be executed.
            
            In case of while loop, condition will be executed for the present iteration.
			In case of do-while loop, condition will be executed for the next iteration.
			
            Syntaxes:
            
			while(Condition)
			{
 					---instructions-----
			}
			
			
			do
			{
 				---instructions---
			}
			While(Condition):

       */
          
          int j1=0;
          do
          {
        	  System.out.println(j1);
        	  j1=j1+1;
          }
          while (j1<10); 
     
       /* 
           
          System.out.println("Before Loop");
          do
          {
             System.out.println("Inside Loop");
          }
          while (true);
          System.out.println("After Loop");  // Status: Compilation Error, Unreachable Statement
     
       */ 
     
          
      
          
          
          
          
          
          
          
          
	}

}
