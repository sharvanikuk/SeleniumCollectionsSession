package ListConcept;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapConcept {

	public static void main(String[] args)
	{
	
		//HashMap is a class implements Map Interface
		//extends AbstractMap
		//it contains only UNIQUE elements
		//stores the values in the form of : key-value pair
		//it may have ONE NULL key and multiple null values
		//it contains no order
		//hashmap is non-synchronized -- not thread safe
		//concurrent modification exception -- Failfast condition
		//
		
		HashMap<Integer, String> hm=new HashMap<Integer, String>();
		
		hm.put(1, "Selenium");
		hm.put(2, "QTP");
		hm.put(3, "TestComplete");
		hm.put(4, "RFT");
		hm.put(5, "RFT");
		
		
		System.out.println(hm.get(1));
		System.out.println(hm.get(4));
		
		System.out.println("print using keyset");
		System.out.println("****************");
		for(  Object k: hm.keySet())
		{
			System.out.println(k);
		}
		
		System.out.println("Print using entrySet()");
		System.out.println("*********************");
		
		for(Entry m: hm.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
		hm.remove(3);
		System.out.println(hm);
		
		HashMap<Integer, Employee> hemp=new HashMap<Integer, Employee>();
		Employee e1=new Employee("Tom",25,"Admin");
		Employee e2=new Employee("Peter",26,"QA");
		Employee e3=new Employee("Steve",27,"Dev");
		
		hemp.put(1, e1);
		hemp.put(2, e2);
		hemp.put(3, e3);
		
		//traverse the hashmap:
		
		for(Entry<Integer,Employee> m : hemp.entrySet())
		{
				int k=m.getKey();
				Employee e=m.getValue();
				
				System.out.println(k+" Info");
				System.out.println(e.name+" "+e.age+" "+e.dept);
		}

	}

}
