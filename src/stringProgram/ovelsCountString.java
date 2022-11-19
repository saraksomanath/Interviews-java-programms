package stringProgram;

import java.util.HashMap;

public class ovelsCountString {

	public static void main(String[] args) {

		String str = "java is used to automation java is best for selenium";
		
		char []ovels= {'a','e','i','o','u'};
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		char[] strArray = str.toCharArray();
		for (int i = 0; i < strArray.length; i++) {
			
			for (int j = 0; j < ovels.length; j++) {
				
				if(strArray[i]==ovels[j]) {
					
					if(map.containsKey(strArray[i])) {
						
						int count =map.get(strArray[i]);
						
						map.put(strArray[i], count+1);
						
					}
					else {
						map.put(strArray[i], 1);
					}
				}
				
			}
		}

		System.out.println(map);
	}

}
