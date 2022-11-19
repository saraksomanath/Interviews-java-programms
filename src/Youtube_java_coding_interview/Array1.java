package Youtube_java_coding_interview;

public class Array1 {

	public static void main(String[] args) {

		int arr1[] = { 1, 2, 4, 5, 7, 8, 9, 22 };

		evenAndOdd(arr1);

	}

	public static void evenAndOdd(int arr[]) {

		int a[] = new int[arr.length];

		int index = 0;
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] % 2 == 0) {

				a[index] = arr[i];
				index++;
			}
		}

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] % 2 != 0) {

				a[index] = arr[i];
				index++;
			}
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(a[i]+" ");
		}
	}
}
