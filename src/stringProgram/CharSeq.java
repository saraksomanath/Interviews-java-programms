package stringProgram;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CharSeq {

	public static void main(String[] args) {
		char[] chars= {'c','b','a','i'};
		
		List<Character> list=new ArrayList<Character>();
		

		for (int i = 0; i < chars.length; i++) {
			
			list.add(chars[i]);
		}
		
		System.out.println(list);
		
		Collections.sort(list);
		
		System.out.println(list);
	}

}
