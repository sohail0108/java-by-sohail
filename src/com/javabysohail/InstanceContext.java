package com.javabysohail;

class C1{
    int i = m1();

    C1() {
        System.out.println("C-Con");
    }

    int m1() {
        System.out.println("M1-C");
        return 10;
    }
}class D {
    int j = m1();
    
    int m2() {
        System.out.println("m2-D");
        return 10;
    }

    D() {
        System.out.println("D-con");
    }

    int m1() {
        System.out.println("m1-D");
        return 20;
    }

    int i = m2();
}
class E {
    E() {
        System.out.println("E-CON");
    }

    {
        System.out.println("IB-E");
    }

    int m1() {
        System.out.println("m1-E");
        return 10;
    }

    int i = m1();
}

class F {
    int m1() {
        System.out.println("m1-F");
        return 10;
    }

    {
        System.out.println("IB-F");
    }

    int i1 = m2();

    F() {
        System.out.println("F-con");
    }

    int i2 = m1();

    {
        System.out.println("IB1-F");
    }

    int m2() {
        System.out.println("m2-F");
        return 20;
    }
}

public class InstanceContext {

	public static void main(String[] args) {
  /*
		In Java, for every class loading a separate context will be created called as Static Context
		and for every Object a separate context will be created called as Instance context.
		In Java, instance context is represented in the form of the following elements.
		1) Instance Variables
		2) Instance Methods
		3) Instance Blocks

	1) Instance Variables:
		 Instance Variable is a normal Java variable, whose values will be varied from one
		  instance to another instance of an object.
		  
		 Instance Variable is a variable, which will be recognized and initialized just before
		   executing the respective class constructor.
		   
		 In Java applications, instance variables must be declared at class level and non-static,
		  instance variables never be declared as local variables and static variables.
		  
		 In Java applications, instance variables data will be stored in Object memory that is in
		  "Heap Memory".
		  
		  
	2) Instance Methods: 
	       Instance Method is a normal Java method, it is a set of instructions, it will represent an action of an entity.
	
	       In Java applications, instance methods will be executed when we access that method.
	       In Java applications, all the methods won’t be executed without the method call.
  
	3) Instance Block:
 		   Instance Block is a set of instructions which will be recognized and executed just
		   before executing the respective class constructors.

 		   Instance Block as are having the same power of constructors, it can be used as like constructors. 
 		   
 		   	  Syntax:
				{
 					---instructions----
				}
				When an object is created:
					Static initialization blocks (if any) are executed first.
					Instance initialization blocks are executed, in the order they appear.
					The constructor of the class is executed.
					Instance variables are initialized according to their declaration order and any assignments 
					in the initialization blocks or constructor.
	  */
		 C1  c = new C1();
		 System.out.println("----------------------");
		 D d=new D();
		 System.out.println("----------------------");
		 E e= new E();
		 System.out.println("----------------------");
		 F f = new F();
	}

}