 package stringProgram;

public class StringBuffer1 {

	public static void main(String[] args) {

		String str = "codemind technology";

		String[] array = str.split(" ");

		String riverseWordString = "";
		for (String string : array) {

			StringBuilder sb = new StringBuilder(string);

			sb.reverse();

			// System.out.println(sb);
			riverseWordString = riverseWordString + sb.toString() + " ";

		}
		// System.out.println(riverseWordString);

		int count = 0;
		String s1 = "somanath sarak";
		char[] chars = s1.toCharArray();
		char[] ovel = { 'a', 'i', 'e', 'o', 'u' };
		System.out.println(chars.length);
		for (int i = 0; i < chars.length; i++) {

			for (int j = 0; j < ovel.length; j++) {
				if (chars[i] == ovel[j]) {

					System.out.println(chars[i] + "  is ovels from string s1");
					count++;
				}
			}

		}
		System.out.println(count);
	}

}
