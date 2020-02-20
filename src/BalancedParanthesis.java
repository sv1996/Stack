 
import java.util.Scanner;
import java.util.Stack;
public class BalancedParanthesis {
	public static boolean matchCharacterInPair(char ch1 , char ch2){
		if(ch1=='('  && ch2==')'){
			return true;
		}
		else if(ch1=='{'  && ch2=='}'){
			return true;
		}
		else if(ch1=='['  && ch2==']'){
			return true;
		}
		else{
			return false;
		}
	}
	
	public static boolean checkBalanced(String exp) {
		 Stack<Character> stk = new Stack<Character>();
		 if(exp.length()==0){
			 return true;
		 }
   for(int i=0;i<exp.length();i++)
   {
	if(exp.charAt(i)=='{'  || exp.charAt(i)=='[' || exp.charAt(i)=='('){
		stk.push(exp.charAt(i));
		}
	else if(exp.charAt(i)=='}'  || exp.charAt(i)==']' || exp.charAt(i)==')'){
		if(stk.isEmpty()){
			return false;
		}

        /* Pop the top element from stack, if  
           it is not a pair parenthesis of character  
           then there is a mismatch. This happens for  
           expressions like {(}) */
		else if(!matchCharacterInPair(stk.pop() , exp.charAt(i))){
			return false;
		}
	}
	
  } // for loop 
   if(stk.isEmpty()){
		return true;
	}
	else{
		return false;
	}
	
     }
		
public static void main(String[] args) {
		 Scanner s =new Scanner(System.in);
		 String str=s.nextLine();
		boolean ans= checkBalanced(str);
	    if(ans){
	        System.out.print("balanced");
	        }
	        else{
	        System.out.print("not balanced");  
	         } 

	}

}





 
    
 
 