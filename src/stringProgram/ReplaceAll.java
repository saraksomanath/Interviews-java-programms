package stringProgram;

public class ReplaceAll {

	public static void main(String[] args) {

		// example: replace character
		System.out.println("**************example: replace character**************");
		String s1 = "javatpoint is a very good website";

		String replaceChar = s1.replaceAll("o", "e");

		System.out.println(replaceChar);

		// Java String replaceAll() example: replace word
		System.out.println("**************replace word*****************");
		String s2 = "My name is Khan. My name is Bob. My name is Sonoo.";

		String replaceWord = s2.replaceAll("is", "was");
		System.out.println(replaceWord);

		// Java String replaceAll() example: remove white spaces
		System.out.println("**************remove white spaces*****************");
		String s3 = "My name is Khan. My name is Bob.		 My name is Sonoo.";

		String removeWhiteSpace = s3.replaceAll("\\s", "");
		System.out.println(removeWhiteSpace);

		// Java String replaceAll() example: keep numbers
		System.out.println("**************^^^^^^^^^^^*****************");
		String s4 = "My name is Khan. My name is Bob.	@#50 2873!	 My name is Sonoo.";

		String keeep = s4.replaceAll("[^0-9]", "");
		System.out.println(keeep);

		int a = Integer.parseInt(keeep);

		// Java String replaceAll() example: remove symbols and numbers
		System.out.println("**************^^^^^^^^^^^*****************");
		String s5 = "My name is Khan. My name is Bob.	@#50 2873!	 My name is Sonoo.";
		System.out.println(s5.replaceAll("[^a-zA-Z ]", ""));

	}

}
