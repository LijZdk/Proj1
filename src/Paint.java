
public class Paint {

	String paintName;
	double price;
	int coverage;
	int size;
	
	public Paint(String pName, double p, int cov, int s){
		String paintName = pName;
		double price = p;
		int coverage = cov;
		int size = s * coverage;
	}
	
	public double whichIsCheaper(){
		double c = price / size;
		return c;
	}
}
