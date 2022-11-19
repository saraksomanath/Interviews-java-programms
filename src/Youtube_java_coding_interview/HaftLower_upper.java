package Youtube_java_coding_interview;

public class HaftLower_upper {

	
	//half string lowercase and another half is in upperCase
	public static void main(String[] args) {
		
		String str="this is automation testing this is automation testing";
		
		int mid=str.length()/2;
		String lowerCase="";
		String upperCase="";
		for (int i=0;i<str.length();i++) {
			
			if (i<mid) {
				lowerCase=lowerCase+str.charAt(i);
			}
			else {
				upperCase=upperCase+str.charAt(i);
			}
		}

		System.out.println(lowerCase.toLowerCase() + upperCase.toUpperCase());
	}

}
