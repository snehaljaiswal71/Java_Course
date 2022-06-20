package com.java;


// Single Inheriatnce
class Parents {
	
	int phone_number = 45368122;          // variables 

	static void car() {                       // () methods    //non static method into static method   create object
                                                         // static into static use suing class name
		System.out.println("parent car..");  // Regi
	}
}
public class Child extends Parents {    // extends is keyword

	void phone() {

		System.out.println("child phone ...");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     // Parents p=new Parents(); // created object of parent class     // referance of parent
    //  p.car();                   // calls the parent methods
      Parents.car();
                                   // object we can create using new objects
      Child ch=new Child();
      ch.car();   // calling from  child class method to parent class
      ch.phone();
      
	}
	
	//Parent p1=new Parents();

}
