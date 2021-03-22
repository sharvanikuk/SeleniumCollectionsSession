package ArrayListConcept;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class SynchronizedArrayList {

	public static void main(String[] args)
	{
	
		//1.  Collections.synchronizedList
		
		List<String> st=Collections.synchronizedList(new ArrayList<String>());
		
		st.add("Java");
		st.add("Python");
		st.add("Ruby");

		//add, remove -- we dont need explicit sychronization
		//to fetch/traverse values from this list-- we have to use explicity synchronization
		
		
		synchronized (st)
		{
			Iterator<String> it=st.iterator();
			while(it.hasNext())
			{
				System.out.println(it.next());
			}
		}
		
		//2.  copyOnWriteArrayList  -- its a class: Thread-safe/synchronized already
		CopyOnWriteArrayList<String> empList=new CopyOnWriteArrayList<String>();
		empList.add("Tom");
		empList.add("Steve");
		empList.add("Katy");
		
		//we dont need explicity synchronization for any operation: add/remove/traverse
		
		Iterator<String> it=empList.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}

}
