package stringProgram;

import java.util.ArrayList;
import java.util.Iterator;

public class CharAt {

	public static void main(String[] args) {

		// Java String charAt(): read char at index
		System.out.println("**************^^^^^^^^^^^*****************");
		String s1 = "java automation";
		System.out.println(s1.charAt(0));

		// we can store char from this string

		char c = s1.charAt(1);
		System.out.println(c);
		// Print Characters Presented at Odd Positions by Using the charAt() Method

		String s2 = "Welcome to Javatpoint portal";

		for (int i = 0; i < s2.length(); i++) {

			if (i % 2 == 0) { // for odd number (i%2!=0)

				System.out.println("Even number char: " + i + " " + s2.charAt(i));

			}
		}

		// Counting Frequency of a character in a String
		String s3 = "Welcome to Javatpoint portal";

		int count = 0;

		for (int i = 0; i < s3.length(); i++)

			if (s3.charAt(i) == 'o') {
				count++;
			}

		System.out.println('o' + "=" + count);
		
		
		
		// counting ovels
		String s4 = "Welcome to Javatpoint portal";
		
		ArrayList<Character> chars=new ArrayList<Character>();;
		
		chars.add('a');
		chars.add('e');
		chars.add('i');
		chars.add('o');
		chars.add('u');
		
		int count1=0;
	
		
		for (int i = 0; i <chars.size() ; i++) {
			for (int j = 0; j <s4.length()  ; j++) {
			
			if (chars.get(i)==s4.charAt(j)) {
				
				count1++;
			}
			
		  }	
	   }
		System.out.println(count1);
		
		
		System.out.println("*****************************************************");
		
		

	}}
