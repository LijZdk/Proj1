import java.io.*;
import java.util.*;

public class Reader {
	
	ArrayList <String> anagram = new ArrayList<String>();
	
	public void reading(){
		String line;
		BufferedReader br;
		try {		
			br = new BufferedReader(new FileReader("C:\\Users\\Administrator\\Desktop\\Thisfile.txt"));
			while ((line = br.readLine()) != null){
				anagram.add(line);
			}	
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public String sortit(String ano){
		
		char[] chars = ano.toCharArray();
		Arrays.sort(chars);
		String sorted = new String(chars);
		return sorted;

	}
	

}


