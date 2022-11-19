package FrequentlyAskedJavaProgram;

public class CountNumberEVENODD_inNumber {

	public static void main(String[] args) {

		int number = 7020000;

		int reminder = 0;

		int EVENCount = 0;
		int ODDCount = 0;
		while (number	 != 0) {

			reminder = number % 10;

			number = number / 10;

			if (reminder % 2 == 0) {
				EVENCount++;
			} else {
				ODDCount++;
			}
		}
		System.out.println("EVENCount: "+EVENCount);
		System.out.println("ODDCount: "+ODDCount);
	}

}
