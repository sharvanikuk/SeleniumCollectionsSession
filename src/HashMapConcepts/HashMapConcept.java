package HashMapConcepts;

import java.util.HashMap;
import java.util.Map;

public class HashMapConcept {

	public static void main(String[] args)
	{
	
			Map<String, Integer>marks=new HashMap<String, Integer>();
			marks.put("Tom", 100);
			marks.put("Dick", 200);
			marks.put("Harry", 300);
			marks.put("Paul", 400);
			marks.put("Tom", 600);
			
			marks.put(null, 500);
			marks.put(null, 700);
			marks.put("Tom", 900);
			
			

	}

}
