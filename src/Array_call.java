import java.util.LinkedList;
import java.util.List;

public class Array_call {

	public static void main(String[] args) {
		System.out.println("even number:");
		List<Integer> even = new LinkedList<Integer>();
		//insert data into array
		for (int i = 1; i <= 50; i++) {
			if (i % 2 == 0) {
				// System.out.print(i + " ");
				even.add(i);
			}
		}	

		for (int i : even) {
			System.out.print(i + " ");
		}

		System.out.println(even);
		
		System.out.println("local update********");
	}

}
