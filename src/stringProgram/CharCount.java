package stringProgram;

import java.util.HashMap;

public class CharCount {

	public static void main(String[] args) {
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();

		String str = "somanath sarak";

		char[] chars = str.toCharArray();
	

		System.out.println();
		for (int i = 0; i < chars.length; i++) {

			if (map.containsKey(chars[i])) {
				int count = map.get(chars[i]);
				
				map.put(chars[i], count + 1);
			} else {
				map.put(chars[i], 1);
			}
		}
		System.out.println(map);
	
	}

}
