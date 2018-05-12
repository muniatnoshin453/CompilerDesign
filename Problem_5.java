import java.util.*;
import java.io.*;
public class Problem_5 {
	 public static void main(String[] args) throws FileNotFoundException
	   {
	      Scanner fileScanner = new Scanner(new File("C:/Users/Muniat/Desktop/Test/Muniat.txt"));
	      fileScanner.useDelimiter("[^A-Za-z0-9]");
	      ArrayList<String> words = new ArrayList<String>();
	      while (fileScanner.hasNext())
	      { 
	         String word = fileScanner.next();
	         if (!words.contains(word))
	         {
	           words.add(word);
	         }
	      }
	      Collections.sort(words);
	      System.out.println("There are " +  words.size() + " unique word(s)");
	      System.out.println("These words are:");
	      for (Iterator<String> it = words.iterator(); it.hasNext();) 
	      {
	          String f = it.next();
	          System.out.println(f);
	      }
	      fileScanner.close();
	   }

}