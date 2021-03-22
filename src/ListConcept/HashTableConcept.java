  package ListConcept;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Set;

public class HashTableConcept {

	public static void main(String[] args)
	{
	
		//it is similar to hashmap but its synchronized
		//stores the value on the basis of key-value format
		//key-->Object-->HashCode ---> value
		//it contains only unique values
		//NO null key and values
		
		Hashtable h1=new Hashtable();
		h1.put(1, "Tom");
		h1.put(2, "Test");
		h1.put(3, "Java");
		
		//create a clone copy/shallow copy:
		
		Hashtable h2=new Hashtable();
		h2=(Hashtable)h1.clone();
		
		System.out.println("The values from h1 " +h1);
		System.out.println("The values from h2 "+h2);
		
		h1.clear();
		
		System.out.println("The values from h1 " +h1);
		System.out.println("The values from h2 "+h2);
		
		//contains value:
		Hashtable st=new Hashtable();
		st.put("A", "Sharvnai");
		st.put("B", "QA");
		st.put("C", "Selenium");
		
		if(st.containsValue("Sharvnai"))
			System.out.println("Value is found");
				
		//print all the values from Hashtable using --Enumeration -- elements()
		
		Enumeration e=st.elements();
		System.out.println("Print values from st");
		
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}
		
		//get all the values from hashtable using -- entrySet
		System.out.println("Print values from using entry set");
		
		Set s=st.entrySet();
		System.out.println(s);
		
		Hashtable st1=new Hashtable();
		st1.put("A", "Sharvnai");
		st1.put("B", "QA");
		st1.put("C", "Selenium");
		st1.put("C", "Selenium"); // it contains only unique values
		// st1.put(null, "Selenium"); // null pointer exception
		
		
		System.out.println("Values from st1:");
		System.out.println(st1);
		//check both the hashtables are equal or not:
		
		if(st.equals(st1))
		{
			System.out.println("both are equal");
		}
		
			//get the value from a key:
			System.out.println(st1.get("A"));
			
			//get the hashcode of hashtable object
			System.out.println("The hash code value of st1 : "+st1.hashCode());
			
	
	}
	
	}

