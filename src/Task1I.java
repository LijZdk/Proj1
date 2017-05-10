import java.util.Scanner;

public class Task1I {
	
	public void blackJack(int a, int b){
		int bj = 21;
		if (a > bj){
			
			System.out.println("0");
			
		}else if (b > bj){
			
			System.out.println("0");
			
		}else{
			if( a > 0 && b > 0){
				if(a >= b) {
				
				System.out.println(a);
				
			}else{
				
				System.out.println(b);
				
			}
			
			
		}else{System.out.println("NO ZEROS");}
			
			
		}
		
		
	}
	
	
	public static void main(String args[]){
		
		
		Task1I ts1 = new Task1I();
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Insert two int values and we'll play blackjack: ");
		
		int one = s.nextInt();
		
		int two = s.nextInt();
		
		s.close();
		
		ts1.blackJack(one, two);
		
		
	}

}
