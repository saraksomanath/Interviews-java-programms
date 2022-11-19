import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CharNumberSort {

	public static void main(String[] args) {

		int[] numbers = { 2, 4, 5, 6, 3, 2, 5 };

		List<Integer> UniNumber = new ArrayList<Integer>();

		for (int i = 0; i < numbers.length; i++) {

			if (UniNumber.contains(numbers[i])) {

				System.out.println("number is exist");
			} else {
				UniNumber.add(numbers[i]);
			}

		}

		for (Integer integer : UniNumber) {

			System.out.println(integer);
		}
		Collections.sort(UniNumber);

		for (Integer integer1 : UniNumber) {
			System.out.print(integer1 + "  ");
		}
		
		
		System.out.println("***********************************************************************************************************");

	int number[]= {2,3,4,1,4,5,6,1,0,2};
		
		Set<Integer> set=new HashSet<Integer>();
		
		for (int i = 0; i < number.length; i++) {
			
			set.add(number[i]);
			
		}
	
	//	Collections.sort(set);
	
		System.out.println(set);
	}

}
