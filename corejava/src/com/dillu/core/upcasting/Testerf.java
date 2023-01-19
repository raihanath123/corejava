package com.dillu.core.upcasting;

public class Testerf {
	
	public static void main(String[] args) {
		
	
	
	B b1=new B();
	b1.test1();
    b1.test2();
    F f1=new B();//upcasting
    f1.test1();
    //a1.test2();CE
}

}
