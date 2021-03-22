package ListConcept;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListConcept {

	public static void main(String[] args)
	{
		
		LinkedList<String> ll=new LinkedList<String>();
		ll.add("Selenium");
		ll.add("QTP");
		ll.add("Java");
		ll.add("RPA");
		ll.add("RFT");
		
		System.out.println("Contents of LinkedList :"+ll);
		
		//addFirst
		ll.addFirst("Sharvani");
		
		//addLast()
		ll.addLast("Kukke");
		
		System.out.println("Contents of LinkedList :"+ll);
		
		
		//get:
		System.out.println(ll.get(0));
		System.out.println(ll.get(1));
		
		//set
		ll.set(0, "Automation");
		System.out.println(ll.get(0));
		System.out.println(ll);
		
		//remove first and last element:
		ll.removeFirst();
		ll.removeLast();
		
		System.out.println(ll);
		
		//remove specific element:
		ll.remove(1);
		System.out.println(ll);

		//to print all the values of LinkedList:
		//1.  for loop
		//2.  advance for loop
		//3.  Iterator
		//4.  while loop
		
		System.out.println("Using for loop :");
		System.out.println("****************");
		for(int n=0;n<ll.size();n++)
		{
			System.out.println(ll.get(n));
		}
		
		System.out.println("USing Advance for Loop");
		System.out.println("***********************");
		for(String str:ll)
		{
			System.out.println(str);
		}
		
		System.out.println("Using Iterator");
		System.out.println("**************");
		
		Iterator<String> it=ll.iterator();
		while(it.hasNext())
		{
			String s=it.next();
			System.out.println(s);
		}
		
		//Using while loop
		System.out.println("Using while loop");
		System.out.println("****************");
		int num=0;
		while(ll.size()>num)
		{
			System.out.println(ll.get(num));
			num++;
		}
	}

}
