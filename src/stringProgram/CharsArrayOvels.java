package stringProgram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CharsArrayOvels {

	public static void main(String[] args) {

		 char [] chars= {'a','v','a','e','i','o',' ','i','d'}; // we are not use this
		// because array is not accept null
		 
		
		 String str ="aeio";
		 for(char c:chars ) {
			 
			 
			 if(str.contains(String.valueOf(c))) {
				 
				 System.out.println(c);
			 }
		 }
		 System.out.println("*****************************");
		List <Character> list=new  ArrayList<>();
		
		List<Character> vowels=new ArrayList<>();
		
		vowels.add('a');
		vowels.add('e');
		vowels.add('i');
		vowels.add('o');
		vowels.add('u');
		
		for (Character character : chars) {
			
			
			list.add(character);
		}

		for (Character character : list) {
			
			if(!(vowels.contains(character))) {
				
				list.remove(character);
				
			}
			
			
		}
		System.out.println("&&&&&&&&&&&&&&");
		
		for (Character character : list) {
			System.out.print(character+" ");
		}
	}

}
