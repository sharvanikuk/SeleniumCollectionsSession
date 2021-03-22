package ListConcept;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept {

	public static void main(String[] args)
	{
	
		int a[]=new int[3]; //static array -- size is fixed
		
		//dynamic array -- ArrayList
		//1.  It can contain duplicate values
		//2.  It maintains insertion order
		//3.  It is NOT Synchronized i.e NOT thread safe
		//4.  Allows random access to fetch the element because it stores the values on the basis of indexes
		//4.  
		 ArrayList aList=new ArrayList();
		 
		 aList.add(10); //0th position
		 aList.add(20); //1st position
		 aList.add(30); //2nd position
		 
		 System.out.println(aList.size());
		
		 aList.add(40);
		 aList.add(50);
		 aList.add('a');
		 aList.add(50);
		 aList.add(null);
		
		 System.out.println(aList.size()); //size of ArrayList
		 
		 System.out.println(aList.get(3)); // to get the value from an index
		 
		//to print all the values from ArrayList use: 
		 //1.  for loop
		 //2. using Iterator
		 
		 System.out.println("Values int the array");
		for(int i=0;i<aList.size();i++)
		{
			System.out.println(aList.get(i));
		}
		
		//non generic vs generic:
		
		ArrayList<Integer> ar1=new ArrayList<Integer>();
		
		ar1.add(100);
		
		ArrayList<String> ar2=new ArrayList<String>();
		ar2.add("Welcome");
		ar2.add("Hello");
		
		//ArrayList<E> ar3=new ArrayList<E>();
		
		//Employee class Objects;
		Employee e1=new Employee("Mona",27,"QA");
		Employee e2=new Employee("Tom",33,"Dev");
		Employee e3=new Employee("Peter",29,"Admin");
		
		//create ArrayList
		
		ArrayList<Employee> ar4=new ArrayList<Employee>();
		ar4.add(e1);
		ar4.add(e2);
		ar4.add(e3);
		
		//Iterator to traverse the values
		
		Iterator<Employee> it=ar4.iterator();
		while(it.hasNext())
		{
			Employee emp=it.next();
			System.out.println(emp.name);
			System.out.println(emp.age);
			System.out.println(emp.dept);
		}
	
	
	
	//**************************
	
	//addAll();
	ArrayList<String> ar5=new ArrayList<String>();
	ar5.add("test");
	ar5.add("Selenium");
	ar5.add("QTP");
	
	ArrayList<String> ar6=new ArrayList<String>();
	ar6.add("dev");
	ar6.add("Java");
	ar6.add("JavaScript");
	
	ar5.addAll(ar6);
	
	System.out.println("----------");
	System.out.println("New List");
	System.out.println("=========");
	for(int i=0;i<ar5.size();i++)
	{
		System.out.println(ar5.get(i));
	}
	
	//removeAll()
	ar5.removeAll(ar6);
	System.out.println("----------");
	System.out.println("New List-After removing");
	System.out.println("=========");
	for(int i=0;i<ar5.size();i++)
	{
		System.out.println(ar5.get(i));
	}
	
	
	//retainAll()
	
	ArrayList<String> ar7=new ArrayList<String>();
	ar7.add("test");
	ar7.add("Selenium");
	ar7.add("QTP");
	
	ArrayList<String> ar8=new ArrayList<String>();
	ar8.add("dev");
	ar8.add("test");
	ar8.add("JavaScript");
	
	ar7.retainAll(ar8);
	
	System.out.println("----------");
	System.out.println("New List-After retaining");
	System.out.println("=========");
	for(int i=0;i<ar7.size();i++)
	{
		System.out.println(ar7.get(i));
	}

}
}
