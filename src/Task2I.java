import java.util.Scanner;

public class Task2I {
	
	public void uniqueSum(int a, int b, int c){
		
		int []compare = {a,b,c};
		int g = 0;
		
		for(int i = 0; i < compare.length-1; i++){
			if(compare[i] != compare[i+1]){
				
				g += compare[i]; 
				
				
			}else if(compare[i] == compare[i+1]){
			
				g += 0;
			}
			
			
		}
		
		System.out.println(g);
		
	}
	
	public static void main(String []args){
		
		
		Task2I ts2 = new Task2I();
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Insert three int values: ");
		
		int one = s.nextInt();
		
		int two = s.nextInt();
		
		int three = s.nextInt();
		
		s.close();
		
		ts2.uniqueSum(one, two, three);
		
		
		
		
	}

}
