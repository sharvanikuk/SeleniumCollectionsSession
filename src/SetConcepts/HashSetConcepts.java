package SetConcepts;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetConcepts {

	public static void main(String[] args) 
	{
	
			Set<String> hs=new HashSet<String>();
			
			hs.add("Alpha");
			hs.add("testing");
			hs.add("Beta");
			hs.add("Gama");
			//hs.add(null);
			
			System.out.println(hs);

			//using for each
			System.out.println("Using for each to print");
			System.out.println("***********************");
			for(String s :hs)
			{
				System.out.println(s);
			}
			
			//using Iterator
			System.out.println("Using Iterator to print");
			System.out.println("***********************");
			Iterator<String> it=hs.iterator();
			while(it.hasNext())
			{
				System.out.println(it.next());
			}
			System.out.println(hs.contains("testing"));
			
			hs.remove("Beta");
			System.out.println(hs);
			
			Set<Integer> first=new HashSet<Integer>();
			first.addAll(Arrays.asList(new Integer[]{1,3,4,5,6,8,9,10}));
			
			Set<Integer> second=new HashSet<Integer>();
			second.addAll(Arrays.asList(new Integer[]{1,2,3,5,6,7,9}));
			
			//get the union:
			
			Set<Integer> union=new HashSet<Integer>(first);
			union.addAll(second);
			
			System.out.println(union);
			
			System.out.println("**************");
			
			//get the intersection:
			
			Set<Integer> intersection=new HashSet<Integer>(first);
			intersection.retainAll(second);
			System.out.println(intersection);
			
			//get the differences:
			
			Set<Integer> diff=new HashSet<Integer>(first);
			diff.removeAll(second);
			System.out.println("**************");
			System.out.println(diff);
			
			
			
			
	}

}
