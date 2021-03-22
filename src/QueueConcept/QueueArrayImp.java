package QueueConcept;

public class QueueArrayImp
{
	int capacity=0;
	int queueArray[];
	int front;
	int rear;
	int currentSize;
	
	public QueueArrayImp(int sizeOfQueue)
	{
		this.capacity=sizeOfQueue;
		front=0;
		rear=-1;
		queueArray=new int[this.capacity];
			
	}
	public void printQueue()
	{
		
		
		for(int i=front;i<=currentSize;i++)
		{
			System.out.println(queueArray[i]);
		}
		System.out.println("****************");
	}
	
	// this method is used to add element in the queue
	public void enqueue(int data)
	{
		if(isFull())
		{
			System.out.println("hey, queue is full, can't insert the data");
			
		}
		else
		{
			rear+=1;
			
			//if(rear==capacity-1)
			if(rear==capacity)
			{
				rear=0;
				
			}
			else
			{
			queueArray[rear]=data;
			currentSize++;
			
			System.out.println(data +" added to the queue");
			
			}
		}
		
		
	}
	
	//this method is used to remove the element from the front of the queue
	public void dequeue()
	{
		if(isEmpty())
		{
			System.out.println("Hey, queue is empty, can not delete element");
		}
		else
		{
			front++;
			
			if(front==capacity-1)
			{
				System.out.println(queueArray[front-1] +" removed from the queue");
				front=0;
			}
			else
			{
				System.out.println(queueArray[front-1] +" removed from the queue");
			
			}
			currentSize--;	
		
		}
	}
	
	public boolean isFull()
	{
		if(currentSize==capacity)
			return true;
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
	
	public static void main(String[] args)
	{
		QueueArrayImp obj= new QueueArrayImp(5);
		
		obj.enqueue(10);
		obj.enqueue(20);
		//System.out.println("current size :"+obj.currentSize);
		obj.dequeue();
		//System.out.println("current size after first dequeue :"+obj.currentSize);
		obj.enqueue(40);
		//System.out.println("current size :"+obj.currentSize);
		obj.enqueue(330);
		//System.out.println("current size :"+obj.currentSize);
		obj.enqueue(350);
		//System.out.println("current size :"+obj.currentSize);
		//obj.enqueue(254);
		obj.printQueue();
		
		obj.dequeue();
	}
}
