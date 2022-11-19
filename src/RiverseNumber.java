
public class RiverseNumber {

	public static void main(String[] args) {
		int number = 1234;

		int riverse = 0;

		while (number != 0) {

			riverse = riverse * 10 + number % 10; // 4 40+3=43 // 430+2=432 //4320+1=4321
			number = number / 10; // 123 // 12 // 1 //0

		}

		int number1 = 1234;
		StringBuffer bf = new StringBuffer(String.valueOf(number1));
		bf.reverse();

		System.out.println("number riverse by StringBuffer:" + bf);

		int number2 = 1234;

		StringBuilder sb1 = new StringBuilder(String.valueOf(number2));
		
		
		sb1.reverse();
		
		System.out.println("number riverse by StringBuilder:" + sb1);

	}
}
