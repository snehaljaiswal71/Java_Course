package com.polymorphism;

class veriables{
	
	int a=10;    // in case of veriables always it happen on compilation time
	// so it will take object of parent not child
	
}

public class Override extends veriables {
	
	int a=20;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      veriables v=new Override();
      System.out.println(v.a);
	}

}
