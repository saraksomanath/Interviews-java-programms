
public class Palindrome {

	public static void main(String[] args) {
		String original = "tat";
		String riverse = "";

		for (int i = original.length() - 1; i >= 0; i--) {

			riverse = riverse + original.charAt(i);
		}

		System.out.println("reverse is:" + riverse);

		if (original.equals(riverse)) {

			System.out.println("The String or number is palindrome");
		} 
		else {
			System.out.println("The  String or  number is not a palindrome");
		}

	}
}