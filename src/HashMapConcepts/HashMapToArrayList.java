package HashMapConcepts;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class HashMapToArrayList {

	public static void main(String[] args) 
	{
	
		HashMap<String, Integer> compMap=new HashMap<String, Integer>();
		compMap.put("Google",10000);
		compMap.put("Walmart", 20000);
		compMap.put("Amazon", 30000);
		compMap.put("Facebook", 5000);
		compMap.put("Cisco", 15000);
		
		System.out.println("comp map size: "+compMap.size());
		
		Iterator it=compMap.entrySet().iterator();
		
		while(it.hasNext())
		{
			Map.Entry pairs=(Map.Entry) it.next();
			System.out.println(pairs.getKey() +" = "+pairs.getValue());
			
		}
		System.out.println("**********");
		System.out.println("Using Lambda Expression");
		System.out.println("**********");
		compMap.forEach((k,v) -> System.out.println("key= "+k +" value= "+v));
		
		//convert hashmap keys to ArrayList:
		 List<String> compNameList=new ArrayList<String>(compMap.keySet());
		 
		 System.out.println("ArrayList Keys");
		 System.out.println("****************");
		 for(String t : compNameList)
		 {
			 System.out.println(t);
		 }
		 
		 //convert hashmap values into ArrayList
		 System.out.println("Array List values");
		 System.out.println("****************");
		 List<Integer> li1=new ArrayList<Integer>(compMap.values());
		 //System.out.println(li1);
		 
		 for(Integer i1 :li1)
		 {
			 System.out.println(i1);
		 }
	}

}
