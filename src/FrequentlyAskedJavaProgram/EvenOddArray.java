package FrequentlyAskedJavaProgram;

import java.util.ArrayList;
import java.util.List;

public class EvenOddArray {

	public static void main(String[] args) {
		int[] array = { 2, 3, 4, 5, 6, 7, 8 };

		List <Integer> even=new ArrayList<Integer>();
		List <Integer> odd=new ArrayList<Integer>();
		for (int i = 0; i < array.length; i++) {

			if (array[i] % 2 == 0) {
				//System.out.println(array[i] + " is even element");
				even.add(array[i]);
			}
			else {
				//System.out.println(array[i] + " is odd element");
				odd.add(array[i]);
			}
		}

		System.out.println(even);
		System.out.println(odd);
	}

}
