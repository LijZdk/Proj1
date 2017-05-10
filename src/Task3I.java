import java.util.Scanner;

public class Task3I {

	public void isitSummmer(int a, boolean b){
		
		boolean isSummer = b;
		if (isSummer = true){
			if(a >= 60 && a <= 100){
				
				System.out.print("its Summer!!" + isSummer);
				
			}else{System.out.println("It isnt summer"  + isSummer);}
		} else if(isSummer = false){
			if(a >= 60 && a <= 90){
				
				System.out.println("its quite hot!"  + isSummer);
				
			}else{
				
				
				System.out.println("mehh, whens summer starting! "  + isSummer);
			}
			
			
		}
		
		
		
	}
	
	
	public static void main(String []args){
		
		Task3I ts3 = new Task3I();
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Insert an int temprature and boolean isSummer (true or false): ");
		
		int one = s.nextInt();
		
		boolean two = s.nextBoolean();
		
		ts3.isitSummmer(one, two);
		
		
	}
	
	
}
