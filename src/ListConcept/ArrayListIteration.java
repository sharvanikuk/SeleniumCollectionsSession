package ListConcept;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListIteration {

	public static void main(String[] args)
	{
		ArrayList<String> tvSeries=new ArrayList<String>();
		tvSeries.add("Game of Thrones");
		tvSeries.add("Breaking Bad");
		tvSeries.add("The Big Bang Theory");
		tvSeries.add("The Walking Dead");
		tvSeries.add("Prision Break");
		
		//1.  using java 8 with for each loop and lambda expression
		System.out.println("---print using for each with lambda in java 8 ----");
	tvSeries.forEach(shows ->
	{
			System.out.println(shows);
		});

	//2. using Iterator
	System.out.println("--Print using Iterator ---");
	Iterator<String> it=tvSeries.iterator();
	
	while(it.hasNext())
	{
		String s=it.next();
		System.out.println(s);
	}
	
	//3. using Iterator and java 8 forEachRemaining() method
	System.out.println("---print using iterator and java 8 forEachRemaining() method ---");
	
	it=	tvSeries.iterator();
	it.forEachRemaining(shows ->{
		System.out.println(shows);
	});
	
	//4.  using for each loop:
	System.out.println("---print using for each loop ---");
	
	for(String show : tvSeries)
	{
		System.out.println(show);
	}
	
	//5.  using for loop with order/index
	
	System.out.println("---print using for loop with order/index ---");
	
	for(int i=0;i<tvSeries.size();i++)
	{
		System.out.println(tvSeries.get(i));
	}
	
	
	//6.  using a listIterator() to traverse in both the direction
	System.out.println("---using a listIterator() to traverse in both the direction ---");
	ListIterator<String> tvSeriesListIterator=tvSeries.listIterator(tvSeries.size());
	
	while(tvSeriesListIterator.hasPrevious()){
		System.out.println(tvSeriesListIterator.previous());
	}
	}
	

	
	

}
