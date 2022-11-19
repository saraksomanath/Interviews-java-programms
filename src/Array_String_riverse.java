
public class Array_String_riverse {

	public static void main(String[] args) {

		String[] str = { "somanath", "aishwarya", "anvi" };
/*
		for (int i = 0; i < str.length; i++) {

			String str1 = str[i];

			for (int j = str1.length() - 1; j >= 0; j--) {

				System.out.print(str1.charAt(j));

			}

			System.out.println("");
		}

		// length haft string
		for (int i = 0; i < str.length; i++) {

			String str2 = str[i];
			for (int j = 0; j < str2.length() / 2; j++) {

				System.out.print(str2.charAt(j));
			}

			System.out.println("");
		}
		
		*/
		System.out.println(str);
		System.out.println(str.hashCode());
		
		System.out.println(str.toString());
		
		System.out.println(str.clone());
		
	}

}
