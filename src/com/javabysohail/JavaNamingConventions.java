package com.javabysohail;

//All java package names must be provided in lower case letters

public class JavaNamingConventions {
	
	/* All class names , abstract class names, interface names and enum names must be started
	   with upper case letter and the sub sequent symbols must also be upper case letters */
			
		 class InnerClass{
	
		/*	All java methods must start with lower case letter , but, the sub sequent symbols must be
	        upper case letters  */
			 
			 
			 /*		All java variables must be started with lower case letters, but, the subsequent symbols
				must be upper case letters. */
				
				int empId=53;
				
				String empName=new String("abc"); //----> Valid
				
                // string str=new string("abc");-----> Invalid
				
				
                // All java Constant variables must be provided in Upper Case letters.
				final float EMP_SALARY =25000;
	 
	  public void empDetails() {
		System.out.println("-------------------");
		
		System.out.println("emp id"+empId);
		System.out.println("emp Name"+empName);
		System.out.println("emp salary"+EMP_SALARY);
		
		System.out.println("-------------------");
	}
		
	}
	

	public static void main(String[] args) {
 
		
		JavaNamingConventions outer = new JavaNamingConventions();
		
//		JavaNamingConventions.InnerClass inner=outer.new InnerClass(); -------- for non static inner class 
//		JavaNamingConventions.InnerClass inner=new JavaNamingConventions.InnerClass();//---- for static inner class
		
		
		JavaNamingConventions.InnerClass inner=outer.new InnerClass();
		inner.empDetails();
	}

}
