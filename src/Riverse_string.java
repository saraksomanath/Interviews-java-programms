
public class Riverse_string {

	public static void main(String[] args) {
		String str = "Automation";

		//by using StringBuilder
		StringBuilder bf = new StringBuilder();

		bf.append(str);
		bf = bf.reverse();
		System.out.println(bf);

		//by using convert string to toCharArray()
		//////////////////////////////////////////////////

		char[] chars = str.toCharArray();

		int len = chars.length;

		for (int i = len - 1; i >= 0; i--) {

			System.out.print(chars[i]);
		}
		
		// by charAt(...) in CharSequence
		///////////////////////////////////////
		System.out.println();

		String riverse = "";

		for (int i = len - 1; i >= 0; i--) {

			riverse=riverse+ str.charAt(i);
		}
		
		System.out.println(riverse);

	}

}
