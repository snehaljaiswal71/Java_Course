package com.polymorphism;

class Vehicle {
	
	// If class has multiple methods with same name and  same parameters we can says
	// it`s overriding and we can aehive it via inheritance
	// run- time polymorphism
	void run(){
		System.out.println("vehicle for overriding");
	}
	
}

public class Overide extends Vehicle {
	
	void run(){
		System.out.println("vehicle for overriding in Overide class ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   //    Vehicle v =new Vehicle();    // because we created object of parent 
  //     v.run();                     // parent - parent
       
   //    Overide o=new Overide(); // because we created object of parent 
   //    o.run();                  // child - child
       
       Vehicle v1=new Overide();   // parent -  child
       v1.run();
       
     //  Overide o1=(Overide) new Vehicle();  // child -- parent
     //  o1.run();
	}

}
