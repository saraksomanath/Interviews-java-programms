
public class Fibona_seriese {

	public static void main(String[] args) {
		
		int a=0;
		int b=1;
		int c;
		int n=11;
		
		for(int i=1;i<n;i++) {
			
			System.out.print(a+" ");
			c=a+b;     
			a=b;
			b=c;
		}

	}

}
