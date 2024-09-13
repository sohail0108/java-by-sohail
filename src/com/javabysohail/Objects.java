package com.javabysohail;

class Employee2 {
    String eid = "E-111";
    String ename = "Sohail";
    float esal = 50000.0f;
    String eaddr = "Hyd";
    String eemail = "sohail@gmail.com";
    String emobile = "91-8080088840";

    // Override toString() method to return employee details as a string
    public String toString() {
        return "Employee Details\n" +
               "------------------------\n" +
               "Employee Id     : " + eid + "\n" +
               "Employee Name   : " + ename + "\n" +
               "Employee Salary : " + esal + "\n" +
               "Employee Address: " + eaddr + "\n" +
               "Employee Email  : " + eemail + "\n" +
               "Employee Mobile : " + emobile;
    }
}

class A1 {
    // No additional methods or properties, using the default methods from Object class 
	//which is default super class for every class
}

public class Objects {
/*
	 
	 Q)What is the Requirement to Create Objects in Java?
			1) To store entities data temporarily in java applications we need objects.
			2) To Access the members of any particular class we need objects.
			
			If we want to create Objects we have to use the following syntax.
			Class_Name ref_Var = new Class_Name([param_List]);
			EX:
			class A{
			----
			}
			A a = new A();
			
	 JVM will analyze minimum memory required by analyzing all variables and their data types size 
	 then JVM will send the minimal memory required and class bytecode to heap manager as it finds new keyword and constructor 
	 then heap manager creates a obj with given required size in heap memory and returns hashcode to JVM
	 then JVM convert the hashcode into hexadecimal value known as reference value 
	 that reference value is assigned to reference variable which is provided while creating the object
	 
	In Java applications, there is a common and default super class for each and every java
    [predefined classes and user defined classes] that is "java.lang.Object" class, where
    java.lang.Object class contains the following 11 methods in order to share to all java classes.
			1) hashCode()
			2) toString()
			3) getClass()
			4) clone()
			5) equals(Object obj)
			6) finalize()
			7) wait()
			8) wait(long time)
			9) wait(long time, int time)
			10) notify()
			11) notifyAll()	
*/
	 public static void main(String[] args) {
	        A1 a = new A1(); // Creating an instance/object  of class A
	        
	        // Using hashCode() method
	        int hashCode = a.hashCode(); 
	        System.out.println("Object HashCode: " + hashCode);
	        
	        // Using toString() method
	        String ref = a.toString();
	        System.out.println("Object Reference: " + ref);
	        
	     /* 
	        In java applications, when we pass a particular class object reference variable as
	        parameter to System.out.println(-) method then JVM will access toString() over the
	        provided reference variable internally.
	     
	     */
	        System.out.println(a.toString()); 
	        System.out.println(a);// internally it is System.out.println(a.toString()); 
	        
	        Employee2 emp = new Employee2();
	        // Print the employee object, which will call the toString() method implicitly
	       
	        System.out.println(emp); // searches toString method in class if it present then it execute the method 
	                                 // if it is not present in given class it searches in default super class that 
	                                 // is java.lang.Object
	        
     /*   
      
           Note: In Java, some predefined classes like String, StringBuffer, Exception, Thread, all
	        wrapper classes, all Collection classes are not depending on Object class toString()
	        method, they are having their own toString() method inorder to display their own data.
	        
	        
     */
	        
	       String str=new String("abc");
	       System.out.println(str);   //their own implementation of toString method
	       
	       Exception e=new Exception("My Own Exception");
	       System.out.println(e);      //their own implementation of toString method
	     
	       Thread t=new Thread();
	       System.out.println(t);
	      
	       Integer in=new Integer(10);
	       System.out.println(in);    //their own implementation of toString method
	      
	       java.util.ArrayList al=new java.util.ArrayList();
	       al.add("AAA");
	       al.add("BBB");
	       al.add("CCC");
	       al.add("DDD");
	       System.out.println(al);  //their own implementation of toString method
	        
	       /*  
	          
	            In JAVA, there are two types of Objects.
	            1) 1.Immutable Objects
	            2) 2.Mutable Objects
	            
	            
	      Immutable Objects are Java objects; they will not allow modifications on their content.
		  If we are trying to perform operations over immutable objects content then data is
		  allowed for operations, but, the resultant data is not stored back in original object, the
          modified data will be stored by creating new Object.
          
          EX: All String class objects are immutable objects.
          All Wrapper class objects are immutable Objects.
          
          
          Mutable Objects are java objects, they will allow modifications on their content directly.
			EX: By default, all JAVA objects are mutable objects.
			EX: StringBuffer
			
	      Q) What is the difference between Object and instance?
          Object is a memory unit to store data.
          Instance is a copy or layer of values existed in an object at a particular point of time. 
	        
	      */
 
	       String str1 = new String("java ");
	        String str2 = str1.concat("By "); // creating separate object for str2 and str1 will not be modified
	        String str3 = str2.concat("Sohail");// creating separate object for str3 and str2 will not be modified
	        System.out.println(str1);
	        System.out.println(str2); 
	        System.out.println(str3); 
	        System.out.println();
	        
	        StringBuffer sb1 = new StringBuffer("Java ");
	        StringBuffer sb2 = sb1.append("By ");
	        StringBuffer sb3 = sb2.append("Sohail");
	        System.out.println(sb1);
	        System.out.println(sb2);
	        System.out.println(sb3);
	       
	    }
	
}
