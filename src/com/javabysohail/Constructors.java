package com.javabysohail;


class A {
	/*  
	   B()  ---- error return type is missing
	   {
           System.out.println("A-Con");
       }
        
        If we provide constructor name other than class name then compiler will rise an error like
		"Invalid Method declaration, return type required", because, compiler has treated the
		provided constructor as normal java method without the return type, but, for methods
		return is mandatory.
		
    */
	void A() // ----- treated as normal method
	{ 
	        System.out.println("A-Con");
    }
	
	/* 
	   static A() // Illegal modifier for the constructor in type A; only public, protected & private are permitted
	   {
	    System.out.println("A-Con");
	   }
	   
	   If we provide the access modifiers like static, final,... to the constructors then Compiler
	   will rise an error like "modifier xxx not allowed here".
	   
	   private A() // The constructor A() is not visible
 		{
 			System.out.println("A-Con");
 		}
 		
 		If we declare constructor as "private" then that constructor is available upto the
		respective class only, not available to out side of the respective class.
		In this context, If we want to create object for the respective class then it is possible inside
		the same class only.
	 */

}

class Employee1 {
    String eid;
    String ename;
    float esal;
    String eaddr;

    Employee1() { // 0-arg constructor
        eid = "E-253";
        ename = "sohail";
        esal = 50000.0f;
        eaddr = "Hyd";
    }
    
    Employee1(String emp_Id, String emp_Name, float emp_Sal, String emp_Addr)  // parameterized constructor
     {
       eid=emp_Id;
       ename=emp_Name;
       esal=emp_Sal;
       eaddr=emp_Addr;
     } 


    public void getEmpDetails() {
        System.out.println("Employee Details");
        System.out.println("-----------------------");
        System.out.println("Employee Id :" + eid);
        System.out.println("Employee Name :" + ename);
        System.out.println("Employee Salary :" + esal);
        System.out.println("Employee Address :" + eaddr);
    }
}

class Add {
    int i, j, k;
    
    Add() {
    }
    
    Add(int i1) {
        i = i1;
    }
    
    Add(int i1, int j1) {
        i = i1;
        j = j1;
    }
    
    Add(int i1, int j1, int k1) {
        i = i1;
        j = j1;
        k = k1;
    }
    
    void add() {
    	System.out.println("-----------------------");
        System.out.println("Addition :" + (i + j + k));
    }
}

public class Constructors  {

	public static void main(String[] args) {
		
	/*
		1) Constructor is a java feature; it can be used to create Object.
		2) The role of the constructors in Object creation is to provide initial values inside the object.
		3) In java applications, Constructors are executed exactly at the time of creating objects,
		not before creating objects and not after creating objects.
		4) The main utilization of constructors is to provide initializations for class level variables
		mainly instance variable.
		5) Constructors must have same name of the respective class.
		6) Constructors are not having return types.
		7) Constructors are not allowing the access modifiers like static, final,...
		8) Constructors are able to allow the access modifiers like public, protected,<default>
		and private.
		9) Constructors are allowing 'throws' keyword in its syntax to bypass exceptions from
		present constructor to the caller
		
		
	
	    If we provide return type to the constructors then Compiler will not rise any error and
		JVM will not rise any exception and JVM will not provide any output, because, the
		provided constructor is converted as normal java method. In this context, if we access the
		provided constructor as normal java method then it will be executed as like normal java
		method.

		
		There are two types constructors in java
		1) Default Constructors
		2) User Defined Constructors 

		1)Default Constructors:
		      If we have not provided any constructor explicitly in java class then compiler will
		      provide a 0-arg constructor automatically, here the compiler provided 0-arg
			  constructor is called as "Default Constructor".
			  If we provide any constructor explicitly then compiler will not provide any default
		      constructor.

		2)User Defined Constructors:
			1. These constructors are provided by the developers as per their application requirements.
			2. If we provide any constructor explicitly without parameters then that constructor is called as 0-arg constructor.
			3. If we provide any constructor with at least one parameter then that constructor is called as parameterized Constructor.
		
		Constructor Overloading:
			If we declare more than one constructor with the same name and with the different
			parameter list then it is called as "Constructor Overloading".
			
			Constructor chaining occurs when one constructor calls another constructor within the same class or the superclass. 
			This can be done using this() for the current class and super() for the superclass.
	*/
		 A a = new A();
		 a.A();
		
		 Employee1 emp1=new Employee1(); // 0-arg constructor
		 emp1.getEmpDetails();
		
		 Employee1 emp2=new Employee1("E-333", "Rahul", 80000.0f, "Hyd"); // parameterized constructor
		 emp2.getEmpDetails();
		 
		 Add a1 = new Add();
	        a1.add();
	        
	     Add a2 = new Add(10);
	        a2.add();
	        
	     Add a3 = new Add(10, 20);
	        a3.add();
	        
	     Add a4 = new Add(10, 20, 30);
	        a4.add();
	}

}
