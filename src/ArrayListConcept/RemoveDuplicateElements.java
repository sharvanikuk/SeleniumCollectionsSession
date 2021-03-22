package ArrayListConcept;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateElements {

	public static void main(String[] args) 
	{
	
		ArrayList<Integer> numbers=new ArrayList<Integer>(Arrays.asList(1,2,3,2,2,3,1,4,5,6,1,7,8,9,7));
		System.out.println("ArrayList");
		System.out.println("*******");
		System.out.println(numbers);
		//LinkedHashSet
		
		LinkedHashSet<Integer> linkedHashSet=new LinkedHashSet<Integer>(numbers);
		System.out.println("LinkedHashSet");
		System.out.println("**************");
		System.out.println(linkedHashSet);
		
		System.out.println("Numbers Without Duplicates");
		System.out.println("******************************");
		ArrayList<Integer> numberListWithoutDuplicate=new ArrayList<Integer>(linkedHashSet);
		
		System.out.println(numberListWithoutDuplicate);
		
		//2.  JDK 8 - stream:
		ArrayList<Integer> marksList=new ArrayList<Integer>(Arrays.asList(1,2,3,2,2,3,1,4,5,6,1,7,8,9,7));
		List<Integer> marksListUnique=marksList.stream().distinct().collect(Collectors.toList());
		System.out.println(marksListUnique);
		
	}

}
