package com.practice;

public class Array {

	public static void main(String[] args) {
		
		int a[] = new int[10];
		
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[1]=200;
		
		int length = a.length;
		System.out.println(length);
		
		for (int i = 0; i < length; i++) {
			System.out.println(a[i]);
		}
		
	}
}
