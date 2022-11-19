package stringProgram;

public class StartFromEndString {

	public static void main(String[] args) {
String str = "java is important for automation";   //automation for imortant is java
		
		String str1="";

		String [] array=str.split(" ");
		
		for (int i = array.length-1; i >= 0; i--) {
			
			str1=str1+ array[i]+" ";
		}
		
		System.out.println(str1);

	}

}
