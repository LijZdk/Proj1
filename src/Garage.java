import java.util.ArrayList;

public class Garage {
	
	ArrayList<Vehicle> GarageList = new ArrayList<Vehicle>();
	String garageName = "The Top Boy Garage";
	
	public String getGarageName(){
		
		return garageName;
		
	}
	
	public void addtoGarage(Vehicle v, double p){
		
		if(p == v.price){
			GarageList.add(v);
		}else if(p > v.price){
			GarageList.add(v);
			double c = (p - v.price);
			System.out.println("Here is your change: " + c);
		}else{
			System.out.println("The amount needed is £20.00 to add to garage");
		}
	}
	
	public void removeFromGarage(Vehicle v, String Vtype){
		
		if(GarageList.contains(v)){
			GarageList.remove(v);
			System.out.println( v.getVehicleType() + " has been removed.");
		}
	}
	
	public void getGarageList(){
		
		for(int i = 0; i < GarageList.size(); i++){
			System.out.println(GarageList.get(i).getVehicleType());	
		}
	}

	
	public void EmptyGarage(){
		
		GarageList.removeAll(GarageList);
		System.out.println("Garage is empty");
		
	}

}
