package stringProgram;

import java.util.HashMap;

public class WordsCount {

	public static void main(String[] args) {

		HashMap<String, Integer> map = new HashMap<String, Integer>();

		String str = "java is used to automation java is best for selenium";

		String[] strArray = str.split(" ");

		for (int i = 0; i < strArray.length; i++) {

			if (map.containsKey(strArray[i])) {
				int count = map.get(strArray[i]);
				
				map.put(strArray[i], count+1);
			}
			else {
				map.put(strArray[i], 1);
			}
		}
		System.out.println(map);

	}

}
