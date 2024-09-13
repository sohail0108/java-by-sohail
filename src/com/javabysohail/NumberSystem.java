package com.javabysohail;

public class NumberSystem {
	public static void main (String [] args){
		/*Binary Number Systems [BASE-2]:
			If we want to represent numbers in Binary number system then we have to use 0's and
			1's, but, the number must be prefixed with either '0b' or '0B'.*/
	
	int a=10;        //-----> It is not binary number, it is decimal num.
	int b=0b10;      //---> valid
	int c=0B1010;    //---> valid
	//int d=0b1012;  //---> Invalid, 2 symbol is not binary numbers alphabet.

	/* Octal Number Systems [BASE-8]:
		If we want to prepare numbers in Octal number System then we have to use the symbols
		like 0,1,2,3,4,5,6 and 7, but, the number must be prefixed with '0'[zero].*/
	
	int d=10;        // ------> It is decimal nhumber, it is not octal number.
	int e=012345;    //---> Valid
	//int f=O234567;   //---> Invalid, number is prefixed with O, not zero
	int g=04567;     //----> Valid
	//int h=05678;     //----> Invalid, 8 is not octal number systems alphabet.
	
			/*Decimal Number Systems [BASE-10]:
			If we want to represent numbers in Decimal number system then we have to use the
			symbols like 0,1,2,3,4,5,6,7,8 and 9 and number must not be prefixed with any symbols.*/


	int h=10;   //----> Valid
	//int i=12h; // ----> invalid only digits 0 to 9
	
	/*Hexa Decimal Number Systems [BASE-16]:
		If we want to prepare numbers in Hexa decimal number system then we have to use the
		symbols like 0,1,2,3,4,5,6,7,8,9, a,b,c,d,e and f, but the number must be prefixed with
		either '0x' or '0X'.*/
	
	int j=10;           //-----> It is not hexa decimal number, it is decimal number.
	int k=0x102345;     // ---> Valid
	int l=0X56789;          //---> Valid
	int m=0x89abcd;       //---> valid
	//int n=0x9abcdefg;      //----> Invalid, 'g' is not in hexa decimal alphabet. 
	
	System.out.println(a);
	System.out.println(b);
	System.out.println(c);
	System.out.println(d);
	System.out.println(e);
	System.out.println(g);
	System.out.println(h);
	System.out.println(j);
	System.out.println(k);
	System.out.println(l);
	System.out.println(m);
	
	}
}
