import java.util.Stack;

public class StackCollections {

	public static void main(String[] args) {
	 int a[] ={1,2,3,4,5,6};
	 Stack<Integer> stack= new Stack<>();
	
	 for(int i=0;i<a.length;i++)
	 {
		 
		 stack.push(a[i]);
	 }
	 
	 System.out.println(stack.peek() + " -->");
	 
	 
	 
     while(!stack.isEmpty()){
	System.out.println(stack.pop());
        }
	}

}
