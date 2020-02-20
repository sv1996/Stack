
public class StackUsingArray {
     
	private int data[];
    private int top; // is the index of topmost element of stack
	public StackUsingArray()
	{
		data=new int[10];
		top=-1;
	}
	public StackUsingArray(int capacity)
	{
		data=new int[capacity];
		top=-1;
	}
	public boolean isEmpty(){  // not a static function
		return ( top== -1);
//		if(top ==-1){
//			return true;
//		}else{
//			return false;
//		}
//		
	}
	public int size(){
		return top+1;
	}
    public int top() throws StackEmptyException
{
	
	if(size()==0){
		// StackEmptyException
		StackEmptyException e = new StackEmptyException();
		throw e;
	}
	return data[top];
}
	public void push(int elem) throws StackFullException{
		if(size() == data.length){
			// stack full exception
			 StackFullException e= new  StackFullException();
			 throw e;
		}
		top++;
		data[top] = elem;
	}
	
	public int pop() throws StackEmptyException{
		if(size()==0){
			// StackEmptyException
			StackEmptyException e = new StackEmptyException();
			throw e;
			
		}
		
		
		
		int temp=data[top];
		top--;
		return temp;
		
	}
	
	
	

	
	

}
