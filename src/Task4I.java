
public class Task4I {
	
	public static void main(String []args){
		
		Car v1 = new Car();
		Van v2 = new Van();
		Motorcycle v3 = new Motorcycle();
		Garage g = new Garage();
		
		g.addtoGarage(v1, v1.price);
		g.addtoGarage(v2, v2.price);
		g.addtoGarage(v3, v3.price);
		
		System.out.println(g.getGarageName());
		
		g.getGarageList();
		
		g.removeFromGarage(v2, "Van");
		
		g.getGarageList();
		
		g.EmptyGarage();
		
		
	}

}
