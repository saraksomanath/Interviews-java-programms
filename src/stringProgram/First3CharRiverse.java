package stringProgram;

public class First3CharRiverse {

	public static void main(String[] args) {
		String str = "somanath sarak";

		String first3Char = str.substring(0, 3);
		String remaining = str.substring(4, 14);

		StringBuilder sb1 = new StringBuilder(first3Char);

		System.out.println(sb1.reverse() + remaining);

	}

}
