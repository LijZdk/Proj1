import java.util.Scanner;

public class IsPrime {

	public static void main(String []args){
		
		IsPrime ip = new IsPrime();
		
		Scanner s = new Scanner(System.in);
		
		long n = s.nextLong();
		
		for(long i = 2; i<n;i++){
			if(n%i==0){
				System.out.println(n);
			}
			
		}
		
		
	}
	
}
