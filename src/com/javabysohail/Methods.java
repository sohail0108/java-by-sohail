package com.javabysohail;

/*
 
	Method is a set of instructions, it will represent a particular action in java applications.
		Syntax:
			[Access_Modifiers] return_Type method_Name([param_List])[throws Exception_List]
			{
 				----- instructions to represent a particular action-----
			}
	Java methods are able to allow the access modifiers like public, protected, <default> ,private,static, final,
	 abstract, native,synchronized, strictfp.

	Where the purpose of return_Type is to specify which type of data the present method is
	returning. In java applications, all primitive data types, all user defined data types and
	'void' are allowed for methods as return types.

	Where "method_name" is an identifier, it can be used to recognize the methods individually.

	Where param_List can be used to pass some input data to the methods in order to perform an action. 
	
	In java applications, we are able to provide all primitive data types and all user defined data types as parameter types.
	
	Where "throws" keyword can be used to bypass or delegate the generated exception from
	present method to caller method of the present method
	
	
	There are two types of methods in Java w.r.t the Object state manipulations.
     1) Mutator Methods
     2) Accessor Methods
     
     Mutator methods are the java methods, which are used to set/modify data in Objects.
      EX: All setXXX(--) methods in Java Bean classes are mutator methods.
      
     Accessor methods are the java methods, which are used to get/access data from Objects.
      EX:All getXXX() methods in java bean classes are Accessor methods
      
     Java bean is a normal java class, it will include properties and the respective setXXX(-) methods and getXXX() methods. 
      
   Variable-Argument Method [Var-Arg method]
       In general, in java applications, if we declare any method with 'n' no of parameters then
       we must access that method with the same 'n' no of parameter values , it is not possible
       to access that method by passing 'n+1' no of parameter values and 'n-1' no of parameter values.
*/

class EmployeeClass{
	private int eid;
	private String ename;
	private float esal;
	private String eaddr;
	
	public void setEid(int eid) {
		this.eid = eid;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public void setEsal(float esal) {
		this.esal = esal;
	}
	public void setEaddr(String eaddr) {
		this.eaddr = eaddr;
	}
	public int getEid() {
		return eid;
	}
	public String getEname() {
		return ename;
	}
	public float getEsal() {
		return esal;
	}
	public String getEaddr() {
		return eaddr;
	}
	
	void add(int i, int j)
     {
		System.out.println(i+j);
	 }
	
	/*	Var-Arg method is a java method including Var-Arg parameter.
	Syntax for Var-Arg Parameter:
	   Data_Type ... Var_Name
	EX: for var-Arg method:
	void m1(int ... a)//int[] a={---- argumentvalues-----}
	{
	 -----
	}
	When we access Var-Arg method with 'n' no of parameter values then all these 'n' no of
	parameter values are stored in the form of Array which is generated from var-ARg
	parameter.*/
	
	void add(int... a) { // varargs (int... a) is internally treated as an int[] array
        System.out.println("No Of Arguments: " + a.length); // Prints the number of arguments
        int result = 0;  
        System.out.print("Argument List: ");
        for (int i = 0; i < a.length; i++) { // Loops through the arguments
            System.out.print(a[i] + " ");  // Prints each argument
            result = result + a[i];  // Adds each argument to the result
        }

        System.out.println();  
        System.out.println("Addition: " + result);  
        System.out.println("----------------------------");  
    }
} 

public class Methods {

	public static void main(String[] args) {
		
		EmployeeClass e=new EmployeeClass();
		e.setEid(111);
		e.setEname("AAA");
		e.setEsal(50000.0f);
		e.setEaddr("Hyd");
		System.out.println(e.getEid());
		System.out.println(e.getEname());
		System.out.println(e.getEsal());
		System.out.println(e.getEaddr());
		
		
		e.add(10, 20); // valid
	//  e.add();  --> Invalid 
	//	e.add(10); --> Invalid 
	//	e.add(10, 20,30); --> Invalid 
		
		e.add();  // No arguments
        e.add(10);  // One argument
        e.add(10, 20);  // Two arguments
        e.add(10, 20, 30);  // Three arguments
	}

}
