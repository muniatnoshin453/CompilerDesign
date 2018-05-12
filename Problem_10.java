
import java.util.Scanner;
public class Problem_10 {

public static void main(String[] args) {
	     Scanner sc = new Scanner(System.in);
	    
	  
	    
	    String left  ;
	    String right;
	    
	    System.out.println("enter left prod ");
	    left  = sc.nextLine();
	    System.out.println("enter right prod");
	    right = sc.nextLine();
	    String fin=" ";
	int flag=0;
	String [] sub=right.split("/");
	int len=sub.length;
	int i;
	System.out.println("Left Most Derivation : .." );
	System.out.println(left +"->"+sub[0]);
	String first=sub[1].concat(sub[0].substring(1));
	System.out.println("\t ->"+first+"   \tEquvalently we can get.... \n");
	
	for(i=2;i<len;i++)
	{
		first=first.replace("E",sub[i]);
	}
	System.out.println("\t ->"+first  );



System.out.println("Right Most Derivation : .." );

	System.out.println(left +"->"+sub[0]);
sub[0]=sub[0].substring(0,sub[0].length()-1);
String second=sub[0].concat(sub[len-1]);
	System.out.println("\t ->"+second+"   \tEquvalently we can get.... \n");
	for(i=1;i<len;i++)
	{
		second=second.replace("E",sub[i]);
	}
	System.out.println("\t ->"+second  );

}}