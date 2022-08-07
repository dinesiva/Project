package org.object;

public class Static2 {
	static int a;			//static variable
	static int b;			//static variable
	int c;					//instance variable
	private void m1() {
		a=10;				//local variable
		System.out.println(a);
	}
	
	private void m2() {
		a=50;				//local variable
		b=100;				//local variable
	}
	
	public static void main(String[] args) {
		
		System.out.println(a);				//static variable	-	0
		Static2 s = new Static2();
		System.out.println(s.a);			//static variable	-	0
		s.m1();								//m1 method call--sysout(a) 	-	10
		System.out.println(a);				//static variable(previous scenario call a method m1-at 
										//the local variable value store in static variable)	-	10
		System.out.println(s.a);			//same concept of above scenario sysout(a) or sysout(s.a)
		System.out.println(b);				//static variable -	0
	}			
}
