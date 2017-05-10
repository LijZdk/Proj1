
abstract class Vehicle {
	
	String carName;
	String carReg;
	int yearOfMake;
	double price;
	String whatVehicle;
	
	public String getName(){
		
		return carName;
		
	}
	
	public String getReg(){
		
		
		return carReg;
		
	}
	
	public int getYearOfMake(){
		
		return yearOfMake;
		
	}
	
	
	public void setName(String a){
		
		carName = a;
		
	}
	
	public void setReg(String b){
		
		carReg = b;
		
	}
	
	public void setYearOfMake(int c){
		
		yearOfMake = c;
		
	}
	
	abstract public String getVehicleType();
	
	abstract public void goDrive();
	
	abstract public void beepHorn();
	
	
	
}
