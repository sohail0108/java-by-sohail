package com.javabysohail;

public class DataTypes {
 	byte b;
    short s;
    int i;
    long l;
    float f;
    double d;
    char c;
    boolean bool;
    String str;
	public static void main(String[] args) {
		
			int n=10;   //--> int will provide 4 bytes of memory to store 10 value. 
			 System.out.println(n);
			//			byte o=130;---> Invalid
			
			byte p=125; //---> Valid
			 System.out.println(p);
			 
		//'byte' data type is providing a particular range for its variables like -128 to 127, in
		// this range only we have to assign values to byte variables. 
			
		/*      Integral data types/ Integer Data types:
				 byte ------> 1 bytes ----> 0
				 short------> 2 bytes-----> 0
				 int--------> 4 bytes-----> 0
				 long-------> 8 bytes-----> 0
				Non-Integral Data Types:
				 float------> 4 bytes----> 0.0f
				 double-----> 8 bytes----> 0.0
				Non-Numeric Data types:
				 char ---------> 2 bytes---> ' ' [single space]
				 boolean-------> 1 bit-----> false
				
			 2. User defined data types / Secondary Data types
					All classes, all abstract classes, all interfaces, all arrays,......
					
					
		 */
			System.out.println(Byte.MIN_VALUE+"----->"+Byte.MAX_VALUE);             //-128----->127
			System.out.println(Short.MIN_VALUE+"---->"+Short.MAX_VALUE);            //-32768---->32767
			System.out.println(Integer.MIN_VALUE+"----->"+Integer.MAX_VALUE);       //-2147483648----->2147483647
			System.out.println(Long.MIN_VALUE+"----->"+Long.MAX_VALUE);             //-9223372036854775808----->9223372036854775807
			System.out.println(Float.MIN_VALUE+"----->"+Float.MAX_VALUE);           //1.4E-45----->3.4028235E38
			System.out.println(Double.MIN_VALUE+"----->"+Double.MAX_VALUE);         //  4.9E-324----->1.7976931348623157E308
			System.out.println(Character.MIN_VALUE+"----->"+Character.MAX_VALUE);   // []
			//System.out.println(Boolean.MIN_VALUE+"----->"+Boolean.MAX_VALUE);     //---> Error 
			
			
			
			DataTypes d=new DataTypes();
			
			 
	        System.out.println("Default byte: " + d.b);   	      //Default byte: 0
	        System.out.println("Default short: " + d.s);  	      //Default short: 0
	        System.out.println("Default int: " + d.i);       	  //Default int: 0
	        System.out.println("Default long: " + d.l);		      //Default long: 0
	        System.out.println("Default float: " + d.f);          //Default float: 0.0
	        System.out.println("Default double: " + d.d);         //Default double: 0.0
	        System.out.println("Default char: '" + d.c + "'");    //Default char: ''
	        System.out.println("Default boolean: " + d.bool);     // Default boolean: false
	        System.out.println("Default String: " + d.str);       //Default String: null
			
			
			
			
	        /*local variables (variables declared inside functions or methods) are not automatically 
	        initialized with default values. Therefore, trying to use them without explicit initialization leads to errors. 
	        Here’s a breakdown of the problem and how to resolve it.*/
	        
	        


			
			
			
	}

}
