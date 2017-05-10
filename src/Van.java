
public class Van extends Vehicle{

	
	String whatVehicle = "Van";
	double price = 30.00; 
	
	
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
