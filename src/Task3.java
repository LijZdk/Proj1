
import java.util.*;



public class Task3 {

	//Task4 
	public String youThere(String a){
		
		return a;
		
	}
	
	
	public static void main(String []args){
		
		Task3 t3 = new Task3();
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Insert String value: ");
		
		String b = s.nextLine();
		
		s.close();
		
		System.out.println(t3.youThere(b));
		
		
	}
	
}
