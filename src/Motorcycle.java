
public class Motorcycle extends Vehicle {
	
	String whatVehicle = "Motorcycle";
	double price = 15.00; 
	

	public String getVehicleType(){
		
		return whatVehicle;
		
	}
	
	
	public void goDrive(){
		
		System.out.println("The " + whatVehicle + " is driving");
		
	}
	
	public void beepHorn(){
		
		System.out.println("The " + whatVehicle + " is beeping");
		
	}
	

}
