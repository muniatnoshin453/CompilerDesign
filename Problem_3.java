import java.util.Scanner;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;


public class Problem_3 {
	public static void main(String[] args){
		
		
		Scanner scan=new Scanner(System.in);
		
		String[] x=new String[100];
		System.out.println("Enter the 3-AC code :");
		int i=1;
		do{
		x[i]=scan.nextLine();
		
        ScriptEngine engine = new ScriptEngineManager().getEngineByExtension("js");
        try {
            Object result = engine.eval(x[i]);
 
            System.out.println(x[i] + " = " + result);
        }
        catch (ScriptException e) {
            e.printStackTrace();
        }
		
		}while(i<=10);
		
		scan.close();
	
	}
	

}
