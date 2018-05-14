import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class Problem_4 {
	 public static void main(String[] args) throws FileNotFoundException, IOException {
	        FileReader fr = new FileReader("C:/Users/Muniat/Desktop/Test/Muniat.txt");
	        BufferedReader br = new BufferedReader(fr);
	        String buffer;
	        String fulltext="";
	        while ((buffer = br.readLine()) != null) {
	            System.out.println(buffer);
	            fulltext += buffer;
	        }
	        br.close();
	        fr.close();
	    }

}
