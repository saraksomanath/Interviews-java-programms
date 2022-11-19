import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Practice {

	public static void main(String[] args) {

		char[] chars = { 'a', 'h', 'h', 'i', 'e', 'i', 'o', 'a' };

		char[] vowels = { 'a', 'e', 'i', 'o', 'u' };

		Map<Character, Integer> map = new HashMap<Character, Integer>();

		for (int i = 0; i < chars.length; i++) {

			for (int j = 0; j < vowels.length; j++) {

				if (chars[i] == vowels[j]) {

					if (map.containsKey(chars[i])) {

						int count = map.get(chars[i]);
						map.put(chars[i], count + 1);
					} else {

						map.put(chars[i], 1);
					}
				}

			}
		}
		System.out.println(map);
	}
}