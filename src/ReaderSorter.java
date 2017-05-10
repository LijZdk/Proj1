import java.util.*;


public class ReaderSorter {
	
	public static void main(String []args){
		
		Reader anagrams = new Reader();
		anagrams.reading();
		String[] sortedArray = new String[anagrams.anagram.size()];
		Map<String, ArrayList<String>> anas = new HashMap<String, ArrayList<String>>();
		for(int i = 0; i < anagrams.anagram.size() ; i++){
			
		sortedArray[i] = anagrams.sortit(anagrams.anagram.get(i));
			
		}
		String key;
		ArrayList<String> temp;
		for (int i = 0; i < sortedArray.length; i++){
			key = sortedArray[i];
			if (!anas.containsKey(key)){
				temp = new ArrayList<String>();
				temp.add(anagrams.anagram.get(i));
				for(int j=i+1; j< sortedArray.length; j++){
					if(key.equals(sortedArray[j])){
						temp.add(anagrams.anagram.get(j));
					}
					
					
				}
				anas.put(key, temp);
			}
			
			
		}
		

		
	}

}
