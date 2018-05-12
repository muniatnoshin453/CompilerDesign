import java.util.Scanner;
public class Problem_8 {
	static int isleft(String[] left, String[] right)
	{
	    int f = 0;
	    for (int i = 0; i < left.length; i++) {
	        for (int j = 0; j < right.length; j++)
	        {
	            if (left[i].charAt(0) == right[j].charAt(0)) {
	                System.out.println("Grammar is left recursive");
	                f = 1;
	            }
	        }
	    }
	    return f;
	}

	public static void main(String[] args) {
	    // TODO code application logic here
	    Scanner sc = new Scanner(System.in);
	    System.out.println("enter no of prod");
	    int n = sc.nextInt();
	    //Changes done here::::
	    String[] left = new String[n];
	    String[] right = new String[n];
	    for (int i = 0; i < n; i++) {
	        System.out.println("enter left prod");
	        left[i] = sc.next();
	        System.out.println("enter right prod");
	        right[i] = sc.next();
	    }

	    System.out.println("the productions are");
	    for (int i = 0; i < n; i++) {
	        System.out.println(left[i] + "->" + right[i]);
	    }
	    int flag = 0;
	    flag = isleft(left, right);
	    if (flag == 1) {
	        System.out.println("Removing left recursion");
	    } else {
	        System.out.println("No left recursion");
	    }
	}
	  }
