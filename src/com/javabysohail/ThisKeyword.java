package com.javabysohail;

class Test1 {
    int i = 10;
    int j = 20;

    Test1(int i, int j) {
        System.out.println(i + " " + j);
        System.out.println(this.i + " " + this.j);
    }
}

class User {
    private String uname;
    private String upwd;

    public void setUname(String uname) {
        this.uname = uname;
    }

    public void setUpwd(String upwd) {
        this.upwd = upwd;
    }

    public String getUname() {
        return uname;
    }

    public String getUpwd() {
        return upwd;
    }
}

class Test2 {
    void m1() {
        System.out.println("m1-A");
    }

    void m2() {
        System.out.println("m2-A");
        m1();
        this.m1();
    }
}

class Test3 {
	Test3() {
        this(10);
       // this(22.22f); -----Constructor call must be the first statement in a constructor
        System.out.println("A-0-arg-con");
       // this(10); ------ Constructor call must be the first statement in a constructor

     /* 
        
        NOTE: If we want to access current class constructor by using 'this' keyword then the
        respective 'this' statement must be provided as first statement, if we have not provided
        'this' statement as first statement or more than one 'this' statement then compiler will rise an 
        error like 'call to this must be first statement in constructor'.
       
     */
    }

	Test3(int i) {
        this(22.22f);
        System.out.println("A-int-param-con");
    }

	Test3(float f) {
        this(33.3333);
        System.out.println("A-float-param-con");
    }

	Test3(double d) {
        System.out.println("A-double-param-con");
    }
	
	void test3(){
		//this(10); --------Constructor call must be the first statement in a constructor
		System.out.println("m1-A"); 

		/*NOTE: If we want to refer current class constructor by using 'this' keyword then the
		respective 'this' statement must be provided in the current class another constructor only,
		not in normal Java methods. If we violate this condition then compiler will rise an error
		like 'call to this must be first statement in constructors'.*/
	}
	
}

class Test4{
	Test4 getRef1() {
		Test4 t4 = new Test4();
        return t4;
    }

	Test4 getRef2() {
        return this;
    }
}

public class ThisKeyword {

	public static void main(String[] args) {
		/* 
		'this' Keyword:
			'this' is a Java keyword, it can be used to represent current class object.
			In Java applications, we are able to utilize 'this' keyword in the following 4 ways.
			1) To refer current class variable
			2) To refer current class methods
			3) To refer current class constructors
			4) To refer current class object

		1) To Refer Current Class Variables:
			If we want to refer current class variables by using 'this' keyword then we have to use
			the following syntax.
			this.var_Name
		
		    In Java applications, if we provide same set of variables at local and at class level
			and if we access that variables then JVM will give first priority for local variables, if local
			variables are not available then JVM will search for that variables at class level, even at
			class level also if that variables are not available then JVM will search at super class level.
			At all the above locations, if the specified variables are not available then compiler will
			rise an error.
	   2) To Refer Current Class Method:
		  If we want to refer current class method by using 'this' keyword then we have to use the following syntax.
 
          this.method_Name([param_List]);
          Note: To access current class methods, it is not required to use any reference variable and
                any keyword including 'this', directly we can access.
            
       3) To Refer Current Class Constructors:
 		  If we want to refer current class constructor by using 'this' keyword then we have to

 		  use the following syntax.
 				this([param_List]);
 	   4) To Return Current Class Object:
			To return current class object by using 'this' keyword then we have to use the following

			syntax.
 				return this;
		*/
		
		Test1 t1 =new Test1(30,40);
		  User u = new User();
	      u.setUname("abc");
	      u.setUpwd("abc123");

	      System.out.println("User Login Details");
	      System.out.println("----------------------");
	      System.out.println("User Name :" + u.getUname());
	      System.out.println("Password :" + u.getUpwd());
	      System.out.println("----------------------");
		     
	      Test2 t2=new Test2();
	      t2.m2();
	      System.out.println("----------------------");
	      
	      Test3 t3=new Test3();
	      System.out.println("----------------------");
	      
	      Test4 t4=new Test4();
	      System.out.println(t4); //com.javabysohail.Test4@6f539caf
	      System.out.println();

	      System.out.println(t4.getRef1()); // com.javabysohail.Test4@79fc0f2f
	      System.out.println(t4.getRef1()); // com.javabysohail.Test4@50040f0c
	      System.out.println(t4.getRef1()); // com.javabysohail.Test4@2dda6444
	      
	   /*
	       
	      In the above program, for every call of getRef1() method JVM will encounter "new"
	      keyword, JVM will create new Object for class A every time and JVM will return new
	      object reference value every time. This approach will increase no. of objects in Java
	      application, it will not provide Objects re-usability, it will provide object duplication, it is
	      not suggestible in application development.
	      
	   */
	      System.out.println();

	      System.out.println(t4.getRef2()); // com.javabysohail.Test4@6f539caf
	      System.out.println(t4.getRef2()); // com.javabysohail.Test4@6f539caf
	      System.out.println(t4.getRef2()); // com.javabysohail.Test4@6f539caf
	      
	  /*
	   
	      In the above program, for every call of getRef2() method JVM will encounter "return this"
	      statement, JVM will not create new Object for class A every time, JVM will return the
	      same reference value on which we have called getRef2() method. This approach will
	      increase Objects re-usability.
	      
      */
	}

}
