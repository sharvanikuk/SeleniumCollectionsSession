package ListConcept;

public class StackWithLinkedList
{

	Node head;
	
	class Node
	{
		int value;
		Node next;
	}
	
	StackWithLinkedList()
	{
		head=null;
		
	}
	
	//push : add value to the beginning of the list
	
	public void push(int value)
	{
		Node extraHead=head;
		head=new Node();
		head.value=value;
		head.next=extraHead;
	}
	
	public int pop()
	{
		if(head==null)
		{
			System.out.println("stack is empty");
		}
		int value=head.value;
		head=head.next;
		return value;
	}
	
	public static void printList(Node head)
	{
		Node temp=head;
		while(temp!=null)
		{
			System.out.println(temp.value+" ");
			temp=temp.next;
		}
		
	}
	public static void main(String args[])
	{
		StackWithLinkedList stackLL=new StackWithLinkedList();
		//System.out.println(stackLL.pop());
		stackLL.push(10);
		stackLL.push(20);
		stackLL.push(30);
		stackLL.push(60);
		stackLL.push(90);
		
		System.out.println("Element removed or popped from stack :" +stackLL.pop());
		System.out.println("Element removed or popped from stack :" +stackLL.pop());
		
		stackLL.push(45);
		System.out.println("Element removed or popped from stack :" +stackLL.pop());
		
		printList(stackLL.head);
	}
	
	
}
