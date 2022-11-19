package Youtube_java_coding_interview;

public class ArrayMissing {

	// missing number from natuaral arr
	// https://youtu.be/ZstvitCUAjE
	public static void main(String[] args) {

		int arr[] = new int[] { 1, 2,4,3, 6, 7, 8, 9, 10 };
		int sum = (10 * 11) / 2; // 55

		int actualSum = 0;
		for (int i = 0; i < arr.length; i++) {

			actualSum = actualSum + arr[i];

		}
		System.out.println("missing number: " + (sum - actualSum));
	}

}
