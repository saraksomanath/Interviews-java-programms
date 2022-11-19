import java.util.Scanner;

public class Swip_two_number {

	public static void main(String[] args) {


		// by third variable------------------------------------------------------------------
		
		int a=20;
		int b=30;
		
		int temp;
		System.out.println("before swip a:"+a);
		System.out.println("before swip b:"+b);
		
		temp=a;
		a=b;
		b=temp;
		System.out.println("after swip a:"+a);
		System.out.println("after swip b:"+b);
		
		
		// not using third var------------------------------------------------------
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter value x:");
		int x=sc.nextInt();
		
	
		System.out.println("Enter value y:");
		int y=sc.nextInt();
		
		System.out.println("before swip x: "+x);
		System.out.println("before swip y: "+y);
		
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println("after swip x:"+x);
		System.out.println("after swip y:"+y);
	}

}
