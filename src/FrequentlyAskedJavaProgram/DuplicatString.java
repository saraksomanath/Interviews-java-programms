package FrequentlyAskedJavaProgram;

public class DuplicatString {

	public static void main(String[] args) {

		String str[] = { "java", "python", "c++", "c","c" };

		int flage = 0;
		for (int i = 0; i < str.length; i++) {
			for (int j = i + 1; j < str.length; j++) {

				if (str[i] == str[j]) {
					System.out.println(str[i] + " duplicate  found");
					flage = 1;
				}

			}

		}
		if (flage == 0) {
			System.out.println("Element not found");
		}
	}

}
