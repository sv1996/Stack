

class Node {
     int data;
     Node next;
     Node(int data){
    	this.data=data;
    	next=null;
      }
	
}
public class StackUsingLikedList {
private Node head;
private int size;  // linkedlist size
public StackUsingLikedList(){
      head=null;
      size=0;
	}


public int size(){
	return size;
}
public	int top() throws StackEmptyException{
		if(size()==0){
			// stackempty exception
		//	StackEmptyException e =new 	StackEmptyException();
		//	throw e;
			throw new StackEmptyException();
		}
		return head.data;
	}

public	boolean isEmpty(){
	if(size()==0){
		return true;
	}
	else{
		return false;
	}
	}
	
public	void push(int element){
		Node newNode=new Node(element);
		newNode.next=head;
		head=newNode;
		size++;
}
	
public	int pop() throws StackEmptyException
	{
		if(size()==0){
			// throw stackempty exception
			StackEmptyException e =new 	StackEmptyException();
			throw e;
		}
		int result=head.data;
		head=head.next;
		size--;
		return result;
	}

 




}