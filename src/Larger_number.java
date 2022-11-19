
public class Larger_number {

	public static void main(String[] args) {

		int larg = 0;
		int[] arrays = { 10, 22, 44, 65, 69 };

		for (int i = 0; i < arrays.length; i++) {

			if (arrays[i] > larg) {

				larg = arrays[i];
			}
		}

		System.out.println(larg + " larger number");
	}

}
