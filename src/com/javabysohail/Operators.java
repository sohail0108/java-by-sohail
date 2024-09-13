package com.javabysohail;

public class Operators {
	public static void main(String[] args) {
		
//		1) Arithmetic Operators:
//			 +, -, *, /, %, ++, --
		
		/*2) Assignment Operators:
			 =, +=, -=, *=, /=, %=,.....
			 
		  3) Comparison Operators:
			 ==, !=, <, >, <=, >=,.....
			 
		  4) Boolean Logical Operators:
			   &, |, ^
			
		  5) Bitwise Logical Operators:
			 &, |, ^, <<, >>,...
			
		  6) Short-Circuit Operators:
			 &&, ||
			
		 7. Ternary Operator:
			 Expr1? Expr2: Expr3;
			 
		*/
		
 //	Arithmetic Operators: +, -, *, /, %, ++, --
		
		
		int a=10;
		

		int b=5;
		
		int sum = a + b;          // Addition  Operator (+)
		System.out.println("Sum: " + sum); 
		
		int difference = a - b;    // Subtraction Operator (-)
		System.out.println("Difference: " + difference);  
		
		int product = a * b;      // Multiplication Operator (*)
		System.out.println("Product: " + product);  
		
		int quotient = a / b;     // Division Operator (/)
		System.out.println("Quotient: " + quotient);  
		
		int remainder = a % b;    //  Modulus Operator (%)
		System.out.println("Remainder: " + remainder); 
		
		
		System.out.println(a);    //10
		System.out.println(a++);  //10
		System.out.println(++a);  //12
		System.out.println(a--);  //12
		System.out.println(--a);  //10
		System.out.println(a);    //10
		System.out.println(++b-++b); //-1

		int c=5;
		System.out.println((--c+--c)*(++c-c--)+(--c+c--)*(++c+c++));		//((4+3) x (4-4)) +(( 2+2 )x (2+2))
		System.out.println(c); // 3
		int a3=10;
		  
		System.out.println(++a3);  //11
		System.out.println(a3++);  // 11
		System.out.println(a3);     // 12
		System.out.println(++a3+a3+++--a3+a3--); // 13 + 13 +13+ 13 
		System.out.println(a3); // 12
		  
		System.out.println(--a3+a3+++a3--+a3--+a3--+a3++); //11 + 11 + 12 + 11 +10 + 9
	    System.out.println(a3); // 10
		 

		  
	 // Assignment Operators: =, +=, -=, *=, /=, %=
		  
		    
		  
		  int x=10;  // Basic = operator
		
		  x += 5;    // equivalent to x = x + 5
		  System.out.println("Value after += operation: " + x);
		  
		  x -= 7;    // equivalent to x = x - 7
		  System.out.println("Value after -= operation: " + x);
		  
		  x *= 6;    // equivalent to x = x * 6
		  System.out.println("Value after *= operation: " + x);
		  
		  x /= 4;    // equivalent to x = x / 4
		  System.out.println("Value after /= operation: " + x);
		  
		  x %= 7;    // equivalent to x = x % 7
		  System.out.println("Value after %= operation: " + x);
		  
		  
		  // Swapping logic
	        a += b;  // a = a + b
	        b = a - b;  // b = a - b (original value of a)
	        a -= b;  // a = a - b (original value of b)

	        System.out.println("After swapping: a = " + a + ", b = " + b);
		  
	        
            //  GCD logic
	        
	        int a2 = 56, b3 = 98;
	        while (a2 != b3) {
	            if (a2 > b3) {
	                a2 -= b3;  // a2 = a2 - b3
	            } else {
	                b3 -= a2;  // b3 = b3 - a2
	            }
	        }

	        System.out.println("GCD is: " + a);
	        
	     
	       //    Checking power of 2
	        
	        int n = 16;
	        boolean isPowerOfTwo = (n & (n - 1)) == 0;

	        if (isPowerOfTwo && n > 0) {
	            System.out.println(n + " is a power of 2");
	        } else {
	            System.out.println(n + " is not a power of 2");
	        }
	        
	        
	        
	        
    // Comparison Operators: ==, !=, <, >, <=, >=,.....
		     a=5;
		     b=5;
		     
	        // Checking equality
	        boolean isEqual = (a == b);
	        System.out.println("Is a equal to b? " + isEqual);  // Output: true
	        
	        b=10;
	        boolean isNotEqual = (a != b);
	        System.out.println("Is a not equal to b? " + isNotEqual);  // Output: true
	        
	        boolean isLess = (a < b);
	        System.out.println("Is a less than b? " + isLess);  // Output: true
	        
	        boolean isGreater = (a > b);
	        System.out.println("Is a greater than b? " + isGreater);  // Output: false
	        
	        boolean isLessOrEqual = (a <= b);
	        System.out.println("Is a less than or equal to b? " + isLessOrEqual);  // Output: true
	        
	        boolean isGreaterOrEqual = (a >= b);
	        System.out.println("Is a greater than or equal to b? " + isGreaterOrEqual);  // Output: false
	        
		  
	//  Boolean Logical Operators: &, |, ^
		  
		 boolean b1=true;
		 boolean b2=false;

 		System.out.println(b1&b1);//true
 		System.out.println(b1&b2);//false
 		System.out.println(b2&b1);//false
 		System.out.println(b2&b2);//false

 		System.out.println(b1|b1);//true
 		System.out.println(b1|b2);//true
 		System.out.println(b2|b1);//true
 		System.out.println(b2|b2);//false

 		System.out.println(b1^b1);//false
 		System.out.println(b1^b2);//true
 		System.out.println(b2^b1);//true
 		System.out.println(b2^b2);//false
	
 		
  //   Bitwise Logical Operators: &, |, ^, <<, >>,...
 		
 		
 		int d=10;
 		int e=2;
 		System.out.println(d&e);
 		System.out.println(d|e);
 		System.out.println(d^e);
 		System.out.println(d<<e);
 		System.out.println(d>>e); 
 		
 		
  //	Short-Circuit Operators: &&, ||
 		
 		int f=10;
 			 int g=10;
 			if( (f++ == 10) | (g++ == 10) )
 			{
 			System.out.println(f+" "+g);//OUTPUT: 11 11
 			 }
 			 int h=10;
 			 int i=10;
 			 if( (h++ == 10) || (i++ == 10) )
 			{
 			 System.out.println(h+" "+i);//OUTPUT: 11 10
 			}
 			 
 			int j=10,k=10;
 			if( (j++ != 10) &(k++ != 10) )
 			{
 		
 			 }
 			System.out.println(j+" "+k);//OUTPUT: 11 11
 			 int l=10;
 			 int m=10;
 			 if( (l++ !=10) && (m++ !=10) )
 			{
 			 
 			}
 			System.out.println(l+" "+m);//OUTPUT: 11 10
 			

 			
 			
 			
 	 //  Ternary Operator: Expr1? Expr2: Expr3;
 			
 			 int i1 = 5;
 	        int j1 = 10;

 	        // Using ternary operator to find the minimum value
 	        int min = (i1 < j1) ? i1 : j1;

 	        System.out.println("The minimum value is: " + min);  // Output: The minimum value is: 5
 	      
 	        
 	        int number = 7;

 	        // Using ternary operator to check if number is even or odd
 	        String result = (number % 2 == 0) ? "Even" : "Odd";

 	        System.out.println("The number is: " + result);  // Output: The number is: Odd
 			
 	       int num = -5;

 	        // Using nested ternary operator to check if the number is positive, negative, or zero
 	        String res = (num > 0) ? "Positive" : (num < 0) ? "Negative" : "Zero";

 	        System.out.println("The number is: " + res);  // Output: The number is: Negative
 			
 			
	}

}
