package ListConcept;

import java.util.Collections;
import java.util.Iterator;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) 
	{

		Vector<Integer> myVector=new Vector<Integer>();
		myVector.add(2);
		myVector.add(4);
		myVector.add(6);
		myVector.add(8);
		myVector.add(10);
		myVector.add(12);
		myVector.add(14);
		myVector.add(16);
		
		System.out.println("Printing the Vector");
		System.out.println("*******************");
		System.out.println(myVector);
		
		System.out.println("Print a particular element");
		System.out.println("*************************");
		System.out.println(myVector.get(2));
		
		System.out.println("Remove an element");
		System.out.println("*****************");
		System.out.println(myVector.remove(3));
		
		Vector<Integer> yourVector=new Vector<Integer>();
		yourVector.add(10);
		yourVector.add(11);
		
		System.out.println("Add another object");
		System.out.println("*******************");
		myVector.addAll(myVector);
		System.out.println(myVector);
		
		System.out.println("Print vector using advanced for loop");
		System.out.println("****************************");
		for(Integer e: myVector)
		{
			System.out.println(e);
		}
		
		System.out.println("Print vector using for looop");
		System.out.println("*****************");
		
		for(int p=0;p<myVector.size();p++)
		{
			System.out.println(myVector.get(p));
		}
		
		System.out.println("Print vector using Iterator");
		System.out.println("**************************");
		
		Iterator it=myVector.iterator();
		while(it.hasNext())
		{
		
			System.out.println(it.next());
		}
		
		Collections.sort(myVector);
		System.out.println("Sorted Order :"+myVector);

	}

}
