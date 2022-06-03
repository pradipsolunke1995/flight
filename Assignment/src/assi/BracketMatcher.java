package assi;

import java.util.Scanner;
import java.util.Stack;

public class BracketMatcher {
	
	/*{}()
	({()})
	{}(
	[]*/
	
	static boolean result;

	public static void main(String []argh)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("insert brackets");
		BracketMatcher c= new BracketMatcher();
		while (sc.hasNext()) {
			String input=sc.next();
			for (int i = 0; i < input.length(); i++) {
				String f= "";
				char b = input.charAt(i);
				f= f+b;
				  result= c.test(f);
			}
         
          System.out.println(result);
		}
        
		
	}
    boolean test(String input){
         Stack <String> s= new Stack<String>();
           if(input.equals("{")){
            s.add(input);
           }
           else if(input.equals("}")){
            s.remove("{");
            
           }
           if(input.equals("(")){
           s.add(input);
           }
           else if(input.equals(")")){
        	   s.remove("(");
           }
           if(input.equals("[")){
           s.add(input);
           }
           else if(input.equals("]")){
        	   s.remove("[");
           }
           boolean ans=s.isEmpty();
           return ans;
    }
}
