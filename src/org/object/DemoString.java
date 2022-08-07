package org.object;

public class DemoString {
	
	public static void main(String[] args) {
		
		String s = "Java Application";
		String s1 = "";
		
		int length = s.length();
		System.out.println(length);						//To find the length of the String 
		
		boolean empty = s1.isEmpty();
		System.out.println(empty);						//To check with double quotes, it's empty or not, return boolean value
		
		char charAt = s.charAt(5);
		System.out.println(charAt);						//TO pass index value, to get the character of the index
		
		int indexOf = s.indexOf('a');
		System.out.println(indexOf);					//To pass any chracter, to get the 1st index position of the character
		
		int lastIndexOf = s.lastIndexOf('a');
		System.out.println(lastIndexOf);				//TO pass any character, to get the last index position of the character
		
		String upperCase = s.toUpperCase();
		System.out.println(upperCase);					//In this case, To change the given String into upper case
		
		String lowerCase = s.toLowerCase();
		System.out.println(lowerCase);					//In this case, to change the given String into lower case
		
		boolean startsWith = s.startsWith("Ja");
		System.out.println(startsWith);					//TO check start with particular character
		
		boolean endsWith = s.endsWith("ion");
		System.out.println(endsWith);					//TO check ends with particular character

		boolean contains = s.contains("a");
		System.out.println(contains);					//TO check particular character is present or not in the given String
		
		String s2 = "Java";
		String s3 = "java";
		
		boolean equals = s2.equals(s3);
		System.out.println(equals);						//To compare the two String it give boolean value, it consider case sensitive
		
		boolean equalsIgnoreCase = s2.equalsIgnoreCase(s3);
		System.out.println(equalsIgnoreCase);			//compare the two String it's give boolean value, ignoring a case sensitive
		
		String concat = s2.concat(s3);
		System.out.println(concat);						//TO join the two String
		
		String replace = s3.replace("j", "J");
		System.out.println(replace);					//TO replace the particular character of String
	System.out.println(" ");	
		String replaceAll = s3.replaceAll(s3, "Program");
		System.out.println(replaceAll);					//TO replace the complete String
		
		String s4 = " java ";
		
		String trim = s4.trim();
		System.out.println(trim);						//In before & after trim the space
		
		String substring = s2.substring(2);
		System.out.println(substring);					//cut the Strring vvalue based on index
		
		String substring2 = s2.substring(2, 4);
		System.out.println(substring2);					//Consider with prefix index & ingore in suffix index
		
		int compareTo = s2.compareTo(s3);
		System.out.println(compareTo);					//Give ASCI value
		

//Literal String		
		String s11 = "Java";
		String s12 = "Maven";
		String s13 = "Java";
		
		int identityHashCode = System.identityHashCode(s11);
		System.out.println(identityHashCode);
		
		int identityHashCode2 = System.identityHashCode(s12);
		System.out.println(identityHashCode2);
		
		int identityHashCode3 = System.identityHashCode(s13);
		System.out.println(identityHashCode3);
		
//Non-Literal String
		String s14 = new String("Java");
		String s15 = new String("Maven");
		String s16  = new String("Java");
		
		int identityHashCode4 = System.identityHashCode(s14);
		System.out.println(identityHashCode4);
		
		int identityHashCode5 = System.identityHashCode(s15);
		System.out.println(identityHashCode5);
		
		int identityHashCode6 = System.identityHashCode(s16);
		System.out.println(identityHashCode6);
		
//Immutable - non changeable
		String s17 = "Java";
		String s18 = "Maven";
		
		String concat2 = s17.concat(s18);
		System.out.println(concat2);								//JavaMaven
		
		int identityHashCode7 = System.identityHashCode(s17);
		System.out.println(identityHashCode7);						//653305407
		
		int identityHashCode8 = System.identityHashCode(s18);
		System.out.println(identityHashCode8);						//1130478920
		
		int identityHashCode9 = System.identityHashCode(concat2);
		System.out.println(identityHashCode9);						//1227229563 
		
//Mutable - changeable
		StringBuilder s19 = new StringBuilder("Java");
		StringBuilder s20 = new StringBuilder("Maven");
		
		StringBuilder append = s19.append(s20);
		System.out.println(append);								//JavaMaven
		
		int identityHashCode10 = System.identityHashCode(s19);
		System.out.println(identityHashCode10);						//1982791261
		
		int identityHashCode11 = System.identityHashCode(s20);
		System.out.println(identityHashCode11);						//1562557367
		
		int identityHashCode12 = System.identityHashCode(append);
		System.out.println(identityHashCode12);						//1982791261
		
		
		
		
		
		
		
		
		
		
	}

}
