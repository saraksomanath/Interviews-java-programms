import java.util.LinkedList;
import java.util.List;

public class Even_odd_prime {

	public static void main(String[] args) {

		System.out.println("even number:");

		for (int i = 1; i <= 50; i++) {

			if (i % 2 == 0) {

				System.out.print(i + " ");

				List<Integer> even = new LinkedList<Integer>();
				for (int j = 0; i < 50; i++) {
					even.add(j);

				}
			}
		}

		System.out.println("\nodd number:");
		for (int i = 1; i < 50; i++) {

			if (i % 2 != 0) {

				System.out.print(i + " ");
				List<Integer> odd = new LinkedList<Integer>();
				for (int j = 0; i < 50; i++) {
					odd.add(j);

				}
			}
		}
//sum of number

		System.out.println("\nsum of number:");
		int num = 10;
		int sum = 0;
		for (int i = 1; i <= num; i++) {

			sum = sum + i;
		}
		System.out.println(sum);

	}

}
