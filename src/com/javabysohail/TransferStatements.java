package com.javabysohail;

public class TransferStatements {

	public static void main(String[] args) {
		
	 /* 
	    
	    These statements are able to bypass flow of execution from one instruction to another
		instruction.
		EX: 1.break 2.continue 3.return
	   
	   1.break:
	    	 break statement will bypass flow of execution to outside of the loops or outside of
			 the blocks by skipping the remaining instructions in the current iteration and by
		     skipping all the remaining iterations.

	 
	 */
		
		for(int i=0;i<10;i++)
		{
			if(i==5)
			{
		       break;
			}
	   
			System.out.println(i); 
		} 
		/*
		 
		 	Status: No Compilation Error
			Output:
		 	0
		 	1
		 	2
		 	3
		 	4
	
	    */
		
		
		System.out.println("Before loop");

		for(int i = 0; i < 10; i++) {
			System.out.println(i); 
		    if(i == 5) {
		        System.out.println("Inside loop, before break");
		        break;
		        //  System.out.println("Inside loop, after break"); // Unreachable code
		        
		       // Status: Compilation Error, unreachable Statement
		       // Reason: If we provide any statement immediately after break statement then that
		       // statement is Unreachable Statement, where compiler will rise an error
		    }
		}

		System.out.println("After Loop");
		
		for(int i=0;i<10;i++)   // Outer loop
		 {
		  for(int j=0;j<10;j++)  // Nested Loop
		   { 
			  if(j==5)
				 {
				  break;
				 }
			  System.out.println(i+" "+j);
		   }
		   // Out side of nested Loop
	    } 
		
		/*
		 
		   If we provide "break" statement in nested loop then that break statement is
		   applicable for only nested loop, it will not give any effect to outer loop.
		   
		   In the above context, if we want to give break statement effect to outer loop , not to the
		   nested loop then we have to use "Labeled break" statement.
		 
		 
		*/
		
		l1:for(int i=0;i<10;i++)// Outer loop
			{ 
			     for(int j=0;j<10;j++)// Nested Loop
				 {
				   if(j==5)
				   {
				      break l1;
			       }
				   System.out.println(i+" "+j);
				 }
				 // Out side of nested Loop
		    }
			//Out side of outer loop 
		/*
		  
		  2) Continue:
				This transfer statement will bypass flow of execution to starting point of the loop by
				skipping all the remaining instructions in the current iteration in order to continue
				with next iteration.

		   
		 */
		
		
		for (int i = 0; i < 10; i++) {
		    if (i == 5) {
		        continue;
		    }
		    System.out.println(i);
		}
		
		
		
		System.out.println("before Loop");
		for (int i = 0; i < 10; i++) {
		    if (i == 5) {
		        System.out.println("Inside Loop, before continue");
		        continue;
		      //   System.out.println("Inside Loop, After continue"); // Unreachable code
		      //   Status: Compilation Error, Unreachable Statement.
		      //   Reason: If we provide any statement immediately after continue statement then that
		      //   statement is unreachable statement, where compiler will rise an error.        
		    }
		}

		System.out.println("After loop");
		
		
		for (int i = 0; i < 10; i++) {
		    for (int j = 0; j < 10; j++) {
		        if (j == 5) {
		            continue; // Skips the iteration when j equals 5
		        }
		        System.out.println(i + " " + j);
		    }
		}
		
			
	}

}
