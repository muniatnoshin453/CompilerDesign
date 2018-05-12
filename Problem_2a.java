import java.util.Scanner;
public class Problem_2a {
	public static void main(String[] args){

		String a,b;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the first String");
		a=scan.nextLine();
		System.out.println("Enter the second String");
		b=scan.nextLine();
		System.out.println("The concatenate String is '"+a.concat(b)+"'");
		scan.close();
	}
	
}
