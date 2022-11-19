package stringProgram;

public class RemoveAllSpacess {

	public static void main(String[] args) {
		
		String str="somanath		 sarak:-	automation";
		
		String removeSpaceString=str.replaceAll("\\t", "");
		
		System.out.println(removeSpaceString);

	}

}
