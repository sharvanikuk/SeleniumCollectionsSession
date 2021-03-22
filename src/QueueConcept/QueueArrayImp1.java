package QueueConcept;

import java.util.ArrayList;
import java.util.Collections;

public class QueueArrayImp1 {

	int capacity;
	int queueArr[];
	int front;
	int rear;
	int currentSize;
	
	
	public QueueArrayImp1(int sizeOfQueue)
	{
		//System.out.println("current size :"+this.currentSize);
		this.capacity=sizeOfQueue;
		front=0;
		rear=-1;
		queueArr=new int[this.capacity];
	}
	
	public boolean isFull()
	{
		if(currentSize==capacity)
		{
			return true;
		}
		else
			return false;
	}
	
	public boolean isEmpty()
	{
		if(currentSize==0)
			return true;
		else
			return false;
	}
	
	public void enqueue(int data)
	{
		if(isFull())
			System.out.println("hey, queue is full, can not insert the data");
		else
		{
			rear++;
			if(rear==capacity-1)
			{
				rear=0;
			}
			queueArr[rear]=data;
			currentSize++;
			System.out.println(data+" is added to the queue");
		}
		
	}
	
	public void dequeue()
	{
		if(isEmpty())
		{
			System.out.println("Hey, queue is empty, can not deelete element ");
		}
		else
		{
			front++;
			if(front==capacity-1)
			{
				System.out.println(queueArr[front-1]+" removed from the queue");
				front=0;
			}
			else
			{
				System.out.println(queueArr[front-1]+" removed from the queue");
			}
			currentSize--;
		}
	}
	public static void main(String[] args)
	{
		
		QueueArrayImp1 obj=new QueueArrayImp1(10);
		obj.enqueue(10);
		obj.enqueue(20);
		obj.dequeue();
	
		
	ArrayList<String> al=new ArrayList<String>();
	al.add("X");
	al.add("A");
	al.add("Z");
	al.add("Y");
	al.add("B");
	al.add("C");
	/*
	Collections.sort(al);
	System.out.println("Sorted Order");
	System.out.println("*************");
	System.out.println(al);
	*/
	Collections.reverse(al);
	System.out.println("Reverse Order");
	System.out.println(al);
	
	Collections.sort(al,Collections.reverseOrder());
	System.out.println("Sorted Reverse Order");
	System.out.println("********************");
	System.out.println(al);
	
	}
  
}
