 
 
public class StackLinkedList {

	public static void main(String[] args) throws  StackFullException {
		 
		StackUsingLikedList stack= new 	StackUsingLikedList();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
   //   	System.out.println(stack.top());
	 	System.out.println(stack.size()+"-->");
		while(!stack.isEmpty()){
			try{
				System.out.println(stack.pop());
			}
		
			catch(StackEmptyException e){
				
			}
		}
		// System.out.print(stack.size());
	}

}
