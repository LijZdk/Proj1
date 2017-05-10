
public class PaintWizard {
	
	
	public static void main(String []args){
		
		Paint a = new Paint("CheapoMax",19.99,10,20);
		Paint b = new Paint("AverageJoes",17.99,11,15);
		Paint c = new Paint("DuluxourousPaints",25.00,20,10);
		
		double []p = {a.whichIsCheaper(),b.whichIsCheaper(),c.whichIsCheaper()};
		
		double hNum = 0.00;
		double lNum;
		
 		for(int g=0; g < p.length; g++){
			
			lNum = p[g];
			
			if (lNum > hNum){
					
				hNum = p[g];
				
			}
	}
 		System.out.println(hNum);

	
	}
}
