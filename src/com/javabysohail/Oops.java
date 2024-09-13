package com.javabysohail;

 class Employee
 {
	 /*   Class is a group of elements having common properties and behaviors.
     Object is an individual element among the group of elements having physical
     behaviors and physical properties

Containers in Java:
	Container is a Java element, it able to manage some other programming elements like
	variables, methods, blocks,…..
	There are three types of containers in JAVA.
	1) Class
	2) Abstract Class
	3) Interface

Syntax:
[Access_Modifiers] class Class_Name [extends Super_Class_Name][implements interface_List]
		{
			--- variables-----
			-- methods--------
			----constructors-----
			----blocks------
			---classes-------
			----abstract classes-----
			---interfaces------
			---- enums--------
	 } 
	
	To define scopes to the programming elements, there are four types of access modifiers.
	public, protected, <default> and private
	
	Where public and <default> are allowed for classes, protected and private are not allowed
	for outer classes.
	
	Where private and protected access modifiers are defined on the basis of classes
	boundaries, so that,they are not applicable for classes, they are applicable for members of
	the classes including inner classes.
	
	Where 'class' is a java keyword, it can be used to represent 'Class' object oriented feature.
	Where 'Class_Name' is name is an identifier, it can be used to recognize the classes individually.
	
	Note: In class syntax, extends keyword is able to allow only one super class, but,
	implements keyword is able to allow more than one interface. 
	
	Procedure To Write Classes In Java Applications:
	1) Declare a class by using 'class' keyword.
	2) Declare variables and methods in class as per the requirement.
	3) In main class and in main() method, create object for the respective class.
	4) Access members of the class by using the generated reference variable.
	
	Entities[Student, Customer, Employee,...]-----> classes
	Entities data[sid, sname, saddr,...] ----> variables
	Entities actions or behaviours[add, search, delete,..] ----> methods

	*/
	
 
  String eid="E-111";
  String ename="sohail";
  float esal=25000.0f;
  String eaddr="Hyderabad";
  String eemail="sohail@gmail.com";
  String emobile="91-8888888552";
  
  public void display_Emp_Details() {
	  System.out.println("Employee Details");
	  System.out.println("-------------------"); 
	  System.out.println("Employee Id :"+eid);
	  System.out.println("Employee Name :"+ename);
	  System.out.println("Employee Saslary:"+esal);
	  System.out.println("Employee Address:"+eaddr);
	  System.out.println("Employee Email :"+eemail);
	  System.out.println("Employee Mobile :"+emobile);
	   }
	  } 

  abstract class Abs // class name should not repeat in the same package to other java files
  {
	 /*
	  There are two types of methods.
		1) Concrete methods
		2) Abstract methods
		
	1)  Concrete method is a method, it will have both method declaration and method implementation.
			
			EX: void add(int i, int j)//Method Declaration
 				{// Method implementation started here
                    int k=i+j;
                    System.out.println(k);
                }// Method Implementation ended here
                
     2)  Abstract method is a method, it will have only method declaration.
        
            EX: abstract void add(int i, int j); 

	     Abstract class is a java class, it able to allow zero or more no of concrete methods
         and zero or more no of abstract methods.
	 
    Note:  To declare abstract classes, it is not at all mandatory condition to have at least
           one abstract method, we can declare abstract classes with 0 no of abstract methods,
           but, if we want to declare a method as an abstract method then the respective class
           must be abstract class.

         For abstract classes, we are able to create only reference variables; we are unable to create objects.

         abstract class A {
            ----
           }
         A a = new A();--> Error
         A a = null; --> No Error
         Abstract classes are able to provide more sharability when compared with classes.
	 
    Procedure to use Abstract Classes:
	 
    	1) Declare an abstract class with "abstract".
		2) Declare concrete methods and abstract methods in abstract class as per the requirement.
		3) Declare sub class for abstract class.
		4) Implement abstract methods in sub class.
		5) In main class and in main() method, create object for sub class and declare reference
		   variable either for abstract class or for sub class.
		6) Access abstract class members.
		
	Note: If we declare reference variable for abstract class then we are able to access only
		  abstract class members, but, if we declare reference variable for sub class then we are
          able to access both abstract class members and sub class members.
          
    What are the differences between Concrete Classes and Abstract Classes?
		
		1) Classes are able to allow only concrete methods.
		   Abstract classes are able to allow both concrete methods and abstract methods.
		   
		2) To declare concrete classes, only, 'class' keyword is sufficient.
		   To declare abstract classes we need to use 'abstract’ keyword along with class keyword.
		   
		3) For classes, we are able to create both reference variables and objects,
		   For abstract classes, we are able to create only reference variables; we are unable to create objects
          
        4) Concrete classes will provide less sharability.
		   Abstract classes will provide more sharability    
              
          	 
	 */
	 
  void m1()
  {
  System.out.println("m1-A");
  }
  abstract void m2();
  abstract void m3();
  } 

 
 class B extends Abs  {
	 /* void m1()    if we rewrite the method of abstract class method it will modifies the method even in abstract class method
	 {
	 System.out.println("sub class m1-B");
	 } */
 
 void m2()
  {
  System.out.println("m2-B");
  }
 void m3()
  {
  System.out.println("m3-B");
  }
  void m4()
  {
  System.out.println("m4-B");
  }
  } 
 
 interface I
 { 
  /*
	 Interfaces:
 		Interface is a java feature, it able to allow zero or more no of abstract methods only.
 		For interfaces, we are able to declare only reference variables; we are unable to create objects.
 		In case of interfaces, by default, all the variables as "public static final".
 		In case of interfaces, by default, all the methods are "public and abstract".
 		When compared with classes and abstract classes, interfaces will provide more sharability.
 		
	Procedure to Use interfaces in Java applications:
		1) Declare an interface with "interface" keyword.
		2) Declare variables and methods in interface as per the requirement.
		3) Declare an implementation class for interface by including "implements" keyword.
		4) Provide implementation for abstract methods in implementation class which are declared in interface.
		5) In main class, in main() method, create object for implementation class ,but, declare
		   reference variable either for interface or for implementation class.
		6) Access interface members
 */
	 int x=20;  // public static final
	 void m1(); // public and abstract
	 void m2(); // public and abstract
	 void m3(); // public and abstract
	 
 }

 class C implements I
  { 
    public void m1() 
    {
      System.out.println("m1-C");
    }
    public void m2()
    {
      System.out.println("m2-C");
    }
    public void m3()
    {
      System.out.println("m3-C");
    }
    public void m4()
    {
      System.out.println("m4-C");
    }
 } 

 
public class Oops {

	public static void main(String[] args) {
	
		Employee emp = new Employee();
		emp.display_Emp_Details();
		
	  //A a=new A();--> Error we can not create object for abstract class
		Abs a = new B(); 
		a.m1();
		a.m2();
	    a.m3(); 
	  //a.m4();--> Error if we declare reference variable to abstract class then only abstract class methods can be accessed 
	    
	    B b = new B();
	     b.m1();
	     b.m2();
	     b.m3();
	     b.m4(); 
	     
	   //I i=new I();---> Error
	     I i=new C();
	      System.out.println(I.x);
	   // System.out.println(i.x); // it is recommended to access static variables i.e interface variables in a static way
	      i.m1();
	      i.m2();
	      i.m3();
	    //i.m4();----> Error
	      C c=new C();
	   // System.out.println(c.x);
	      System.out.println(C.x);
	      c.m1();
	      c.m2();
	      c.m3();
	      c.m4();
	      
	/*  Q) What are the differences between Class, abstract Clacss and Interface?
	 
	  1) Class is able to allow concrete methods only.
	     Abstract class is able to allow both concrete methods and abstract methods
	     Interface is able to allow abstract methods only.
	     
	  2) To declare class, only, class keyword is sufficient.
	     To declare abstract class, we have to use "abstract" keyword along with class keyword.
         To declare interface we have to use "interface" keyword explicitly
	  
	  3) For classes only, we are able to create both reference variables and objects.
	     For abstract classes and interfaces, we are able to declare reference variables; we are unable to create objects.

	  4) In case of interfaces, by default, all variables are "public static final".
         In case of classes and abstract classes, no default cases for variables.
         
      5) In case of interfaces, by default, all methods are "public and abstract".
         In case of classes and abstract classes, no default cases for methods.
         
      6) Constructors are allowed in classes and abstract classes.
         Constructors are not allowed in interfaces.
         
      7) Classes are able to provide less sharability.
         Abstract classes are able to provide middle level sharability.
         Interfaces are able to provide more sharability.	  
	*/
	}

}
