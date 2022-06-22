package com.polymorphism;

class Test {
	// compile time poly-morphism
	// If a class has multiple methods with same name and different parameters we
	// we can say it`s  overloading 
	// when overloading happens :- it happens on compilation level
	// checks on compile and runtime as well
	void demo(int a){    //()  methods 
		System.out.println("display demo with a");
	}
	
	void demo(int a, int b){
		System.out.println("display demo with a and b");
	}
	
	void display(){     // not overloading
		System.out.println("displaying something");
	}
	
	
}

public class Overload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Test t=new Test();
      t.demo(10);
      t.demo(10, 10);
	}

}
