package com.javabysohail;

public class TypeCasting {

	public static void main(String[] args) {
		/* The process of converting data from one data type to another data type is called as "TypeCasting".
		There are two types of type castings are existed in java.
		1.Primitive data Types Type Casting
		2.User defined Data Types Type Casting
		*/
		/*Implicit Type Casting:
			The process of converting data from lower data type to higher data type is called as
			Implicit Type Casting.

			If we want to perform implicit type casting in java applications then we have to assign
			lower data type variables to higher data type variables.*/
		byte b=10;
		int i = b;
		System.out.println(b+" "+i);//Type Checking is the responsibility of compiler and Type Casting is the responsibility of JVM.
		
		
		/* int in=10;
		   byte by=in;
		   System.out.println(in+" "+by);*/
		
		
		/*  byte b=65;
		    char c=b;
		    System.out.println(b+" "+c); */
		
		/*char c='A';
		short s=c;  //byte and short internal data representations are not compatible to convert into char.
		System.out.println(c+" "+s); */
		
		char c='A';
		int i1=c;
	    System.out.println(c+" "+i1); // A 65
	    
	   /* byte b1=128;  //type mismatch int to byte
	      System.out.println(b1); */
	    
	   /* byte b1=60;
	      byte b2=70;
	      byte b3=b1+b2;
	      System.out.println(b3);*/
		
	  /* byte b1=30;
	   byte b2=30;
	   byte b3=b1+b2;              //    X,Y and Z are three primitive data types X+Y=Z
	   System.out.println(b3);*/   // If X and Y belongs to {byte, short, int} then Z should be int.   
	                               // If either X or Y or both X and Y belongs to {long, float, double} then Z should be higher(X,Y).
		
		
		
	    long l=10;
	    float f=l;
	    System.out.println(l+" "+f); //10 10.0

		
	   /*
	     
	     float f1=22.22f;  
	     long l=f1;
	     System.out.println(f1+" "+l);
		
	     float data type is higher when compared with long data type so that,
	     we are able to assign long variable to float variable directly, but, we are unable to
	     assign float variable to long variable directly. 
	  
	   */
		
	    
	    /*
	       
	        Explicit Type Casting:
	        
	    	The process of converting data from higher data type to lower data type is called as Explicit Type Casting.
	    	To perform explicit type casting we have to use the following pattern.
	    	P a = (Q) b;
	    	(Q) -- Cast operator
	    	Where P and Q are two primitive data types, where Q must be either same as P or lower
	    	than P as per implicit type casting chart.
	    	
	    */
	    
	     int i2=10;
	     byte b1=(byte)i2;
	     System.out.println(i2+" "+b1);
	    
	     int i3=10;
	     short s=(short)i3;
	     System.out.println(i3+" "+s);
	     
	     
	     byte b2=65;
	     char c1=(char)b2;
	     System.out.println(b2+" "+c1);
	     
	     char c2='A';
	     byte b3=(byte)c2;
	     System.out.println(c2+" "+b3);
	     
	     
	     char c3='A';
	     short s2=(short)c3;
	     System.out.println(c3+" "+s2); 
	    
	     
	     short s3=65;
	     // char c4=(byte)s; // cannot convert byte to char
	     char c4=(char)(byte)s;
	     System.out.println(s3+" "+c4); 
	     
	     byte b4=30;
	     byte b5=30;
	     // byte b6=(byte)b4+b5;
	     byte b6=(byte)(b4+b5);
	     System.out.println(b6);
	     
	     
	     double d=22.22;
	     byte b7=(byte)(short)(int)(long)(float)d;
	     byte b8=(byte)d;
	     System.out.println(b7+" "+b8); 
	     
	     int i4=130;
	     byte b9=(byte)i4;
	     System.out.println(b9); // -126 Reason: REf Diagram 
	     
	     
	     
	     
	     
	}

}
