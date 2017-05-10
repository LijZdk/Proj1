import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Person {
	
	
		String name;
		int age;
		String jobTitle;
		
	
	
	
	public String getName(){
		
		  return name;
		
	}
	
	public int getAge(){
		
		return age;
		
	}
	
	public String getJobTitle(){
		
		
		return jobTitle;
		
	}
	
	public void setName(String n){
		
		name = n;
		//System.out.println(name);
		
	}
	
	public void setAge(int a){
		
		age = a;
		//System.out.println(age);
		
		
	}
	
	public void setJobTitle(String jt){
		
		jobTitle = jt;
		//System.out.println(jobTitle);
		
	}
	
	public static void main(String []args){
		
		Person ps1 = new Person();
		Person ps2 = new Person();
		Person ps3 = new Person();
		Person ps4 = new Person();
		Person ps5 = new Person();
		
		ps1.setName("John");
		ps2.setName("Gregg");
		ps3.setName("Marcus");
		ps4.setName("Phillip");
		ps5.setName("Marvin");
		
		ps1.setAge(14);
		ps2.setAge(22);
		ps3.setAge(45);
		ps4.setAge(55);
		ps5.setAge(30);
		
		ArrayList <String> persons = new ArrayList<String>();
		
		persons.add(ps1.getName());
		persons.add(ps2.getName());
		persons.add(ps3.getName());
		persons.add(ps4.getName());
		persons.add(ps5.getName());
		
		try {
			FileWriter writer = new FileWriter("output.txt");
			for(String per : persons){
				writer.write(per);
			}
			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		
	}

}
