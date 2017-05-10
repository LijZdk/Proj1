
public class Car extends Vehicle {
	
	String whatVehicle = "Car";
	double price = 20.00; 
	
	
	public String getVehicleType(){
		
		return whatVehicle;
		
	}
	
	
	public void goDrive(){
		
		System.out.println("The " + whatVehicle + " is driving");
		
	}
	
	public void beepHorn(){
		
		System.out.println("The " + whatVehicle + " is driving");
		
	}
	

}
