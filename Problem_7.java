import java.util.*;
import java.io.*;
public class Problem_7{
	 public static void main(String[] args) throws FileNotFoundException
	   {
	      Scanner fileScanner = new Scanner(new File("C:/Users/Muniat/Desktop/Test/Muniat.txt"));
	      fileScanner.useDelimiter("[^A-Za-z0-9]");
	      ArrayList<String> words = new ArrayList<String>();
	      while (fileScanner.hasNext())
	      { 
	         String word = fileScanner.next();
	        
	           words.add(word);
	         
	      }
	
 	Set<String> set = new HashSet<String>(words);
	 HashMap<String, Integer> hmap = new HashMap<String, Integer>();
	
	  for (String r : set) {
         hmap.put(r,Collections.frequency(words, r));

}
 Map<String,Integer> map = new TreeMap<String,Integer>(hmap); 
         System.out.println("After Sorting:");
         Set set2 = map.entrySet();
         Iterator iterator2 = set2.iterator();
         while(iterator2.hasNext()) {
              Map.Entry me2 = (Map.Entry)iterator2.next();
              System.out.print(me2.getKey() + ": ");
              System.out.println(me2.getValue());
         }
 	
		 fileScanner.close();
	   }

}