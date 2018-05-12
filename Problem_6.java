import java.util.*;
import java.io.*;
public class Problem_6{
	 public static void main(String[] args) throws FileNotFoundException
	   {
	      Scanner fileScanner = new Scanner(new File("C:/Users/Muniat/Desktop/Test/Muniat.txt"));
	      //fileScanner.useDelimiter("[^A-Za-z0-9]");
	      ArrayList<String> words = new ArrayList<String>();
	      while (fileScanner.hasNext())
	      { 
	         String word = fileScanner.next();
	        
	           words.add(word);
	         
	      }
	
 	Set<String> set = new HashSet<String>(words);
	
   	 for (String r : set) {
        System.out.println(r + ": " + Collections.frequency(words, r));}
 	
		 fileScanner.close();
	   }

}