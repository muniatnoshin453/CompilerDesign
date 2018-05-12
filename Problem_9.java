import java.util.*;
class  Problem_9{
	public static void main(String [] args)
{
	 Scanner sc = new Scanner(System.in);
	    
	  
	    //Changes done here::::
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
System.out.println(left+"->"+ right);
int l=len-1;
	for(i=1;i<len;i++)
{
	char fi=sub[i-1].charAt(0);
	char second=sub[i].charAt(0);
     if(fi==second)
	   { if(sub[i-1].length()<=1)
		fin=fin.concat("E");
	      else
		fin=fin.concat(sub[i-1].substring(1));
		fin=fin.concat("/");
		if(i==l){
		if(sub[i].length()<=1)
			fin=fin.concat("E");
		else
			fin=fin.concat(sub[i].substring(1));


		}
	    }
	else
	{
	System.out.println("No left factoring here ");

	flag=1;
	break;
	}
}
	if(flag==0)
	{
		System.out.println("Left Recursion is ");
		String s=left.concat("'");
		System.out.println(left+"->"+ sub[0].charAt(0)+s);
		System.out.println(s+"->"+fin);
	}

}
}	

	