
public class Second_large {

	public static void main(String[] args) {

		int [] arrays= {2,3,5,2,5,7,6};

		int large=0;
		int second_large  =0;
		
		for (int i=0;i<arrays.length;i++) {
			
			if(arrays[i]>large) {
				
				second_large=large;
				large=arrays[i];	
			}
			else if (arrays[i] > second_large)
            {
				second_large = arrays[i];
            }
		}

		System.out.println(large +"large");
		System.out.println(second_large +"second_large");
	}

}
