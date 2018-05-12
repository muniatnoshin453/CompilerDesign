public class Problem_2f{  
public static void main(String args[]){  
String s1="java string split method ";  
String[] words=s1.split("|");//splits the string based on every character 
//using java foreach loop to print elements of string array  
for(String w:words){  
System.out.println(w);  
}  
}}  