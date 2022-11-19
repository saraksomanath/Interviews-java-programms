
public class Duplic_char {

	public static void main(String[] args) {

		String str = "somanathsarak";

		int count = 1;
		char[] chars = str.toCharArray();

		for (int i = 0; i < str.length(); i++) {

			for (int j = i + 1; j < str.length()-1; j++) {

				if (chars[i] == chars[j]) {

					System.out.print(chars[j]);
					break;
				}
				
			}
			
		}

	}

}
