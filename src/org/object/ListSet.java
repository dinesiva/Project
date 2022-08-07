package org.object;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class ListSet {
	
	public static void main(String[] args) {

		System.out.println("========List to Set============");
		List l = new ArrayList();
		
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(70);
		l.add(80);
		l.add(90);
		l.add(95);
		
		Set s = new LinkedHashSet();
	
		s.add(40);
		s.add(50);
		s.add(60);

		 boolean ListSet = l.addAll(s);	// set to List
		 System.out.println(l);

		boolean SetList = s.addAll(l);		// list to set
		System.out.println(s);

System.out.println("=========List Length==========");

		int size = l.size();
		System.out.println(size);

System.out.println("======last index value in list======");

		int lastIndexvalue = l.lastIndexOf(95);
		System.out.println(lastIndexvalue);

System.out.println("====print first 5 values in list======");

		for (int i = 0; i < 4; i++) {
			System.out.println(l.get(i));
		}
System.out.println("=====Middle index value in list========");

		Object object = l.get(l.size() / 2);
		System.out.println(object);

System.out.println("======print last 5 index value in list======");

		for (int i = l.size() - 1; i > l.size() - 5; i--) {
			System.out.println(l.get(i));
		}
System.out.println("======alternate nummber in list=========");

		for (int i = 0; i < l.size(); i = i + 2) {
			System.out.println(l.get(i));
		}
System.out.println("=====iterate the list for loop=======");

		for (int i = 0; i < l.size(); i++) {
			System.out.println(l.get(i));
		}
System.out.println("=====Enhanced for loop=======");
		for (Object a : l) {
			System.out.println(a);
		}
System.out.println("first index value in list======");
		Object Firstindex = l.get(0);
		System.out.println(Firstindex);
	}

}
