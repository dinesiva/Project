package org.object;

public class Static {
	
	static int a;				//static variable
	int b;						//instance variable
	public void mi() {
		int c = 0;				//local variable
		a=30;					//local variable
		b=50;					//local variable
		System.out.println(a);
	}
	
	public void m2() {
		a=100;					//local variable
		b=110;					//local variable
	}

	
	public static void main(String[] args) {
		
		System.out.println(a);		//static variable default value 0
		
		Static s = new Static();
		s.mi();						//to call mi method sysout a value 30
		System.out.println(a);		//before scenario mi method call
											//so, now (a) value initialize in static variable 30
		System.out.println(s.b);	//call mi method at the time value are initialize in instance var 50
		
		s.m2();						//m2 method call, those values are initialize in static & instance var
		System.out.println(a);		//static variable now store in 100 - static variable direct call 
		System.out.println(s.b);	//instance variable now store in 110 - inst var obj ref.var name
		
		
		Static s1 = new Static();
		System.out.println(a);		//this is static method (when control exit the class) so value - 100
		System.out.println(s1.b);	//instance variable - 0
	}

}
