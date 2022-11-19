package FrequentlyAskedJavaProgram;

public class SumNumber {

	public static void main(String[] args) {
		int number=1234;
		int sum=0;
		int rem=0;
		
		while(number!=0) {
			
			rem=number%10;
			
			number=number/10;
			
			sum=sum+rem;
		}

		System.out.println(sum);
		
		int sum1=0;
		for(int i=0;i<=10;i++) {
			
			sum1=sum1+i;
		}
		System.out.println("sum of  first ten number: "+sum1);
	}

}
