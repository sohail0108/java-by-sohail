package com.javabysohail;

public class LanguageFundamentals {
	void m1(){
		int a=15; 
		System.out.println(a);
	}

	public static void main(String[] args) {
		// 1)Tokens:
//		Smallest logical unit in java programming is called as "Lexeme".
//		The Collection of Lexemes come under a particular group is called as "Token"
//		int a=b+c*d;
//		Lexemes: int, a, =, b,+, c, *, d, ;-----> 9
//		Tokens:
//		 1)Data Types: int
//		 2)Identifiers: a, b, c, d
//		 3)Operators: =, +, "*
//		 4)Special Symbol: ;
//		Types of tokens: 4
		
//		Identifiers:
//			Identifier is a name assigned to the programming elements like variables, methods,
//			classes, abstract classes, interfaces,.....
//			EX:
//			int ----> Data Types
//			a ------> variable[Identifier]
//			= ------> Operator
//			10 -----> constant
//			; ------> Terminator
//			To provide identifiers in java programming, we have to use the following rules and
//			regulations.
//			Identifiers should not be started with any number, identifiers may be started with an
//			alphabet, '_' symbol, '$' symbol, but, the subsequent symbols may be a number, an
//			alphabet, '_' symbol, '$' symbol.


		int a=10;  // no error
	//  float a=22.22f;  error same identifier in same scope
		System.out.println(a);
		LanguageFundamentals l=new LanguageFundamentals ();
		l.m1();
           
	}
	
}
