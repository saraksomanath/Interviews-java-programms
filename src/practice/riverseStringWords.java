package practice;

public class riverseStringWords {

	public static void main(String[] args) {

		String str = "codemind technology";
		String[] s = str.split(" ");
		String riverString = "";
		
		for (String string : s) {
			
			StringBuilder sb = new StringBuilder(string);
			sb.reverse();

			riverString = riverString + sb.toString() + " ";
			
		}

		System.out.println(riverString);
		
	}

}
