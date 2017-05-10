import java.util.Scanner;

public class Task5 {
	
	int []array = {1,2,3,4,5,6,7,8,9,10};
	
	//task6
	public void theSum(int a, int b, int g){
	
	if(a == 0){
		for (int i = 0; i < 10; i++)
			System.out.println(array[i] *= 10);
	}else if(b == 0){
		for (int i = 0; i < 10; i++)
			System.out.println(array[i] *= 10);

	}else if(g%2 == 0){
			int c = a + b;
			System.out.println(c);
	}else{
			int c = a * b;
			System.out.println(c);
	}
		
		
	}
	
	public static void main(String []args){
		
		
		Task5 t5 = new Task5();
	
		Scanner s = new Scanner(System.in);
		
		System.out.println("Insert two int values and I will give u the sum: ");
		
		int one = s.nextInt();
		
		int two = s.nextInt();
		
		System.out.println("Insert an even number, I will add the previous values together. Add an odd number I will multiply these numbers: ");
		
		int three = s.nextInt();
		
		s.close();
		
		t5.theSum(one, two, three);
	
		
		
		
		
	}
	
	
}
