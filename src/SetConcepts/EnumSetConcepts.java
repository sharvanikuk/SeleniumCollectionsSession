package SetConcepts;

import java.util.EnumSet;
import java.util.Iterator;

public class EnumSetConcepts {

	//its not synchronized
	//its a highly performance java collection member
	//faster than HashSet
	//all the methods are implemented using bitwise arithmetic operations
	
	enum Lang
	{
		JAVA,
		CSharp,
		JAVASCRIPT,
		PYTHON,
		RUBY
	}
	public static void main(String[] args)
	{
	
		//created a new enumset using enum
		EnumSet<Lang> langs=EnumSet.allOf(Lang.class);
		System.out.println(langs);
		
		//empty enum set:
		EnumSet<Lang> l=EnumSet.noneOf(Lang.class);
		
		//range(e1,e2);
		EnumSet<Lang> enumRange=EnumSet.range(Lang.JAVA, Lang.JAVASCRIPT);
		System.out.println(enumRange);
		
		//of:
		EnumSet<Lang> cSharpEnum=EnumSet.of(Lang.CSharp);
		System.out.println(cSharpEnum);
		
		EnumSet<Lang> multipleEnum=EnumSet.of(Lang.JAVA,Lang.RUBY);
		System.out.println(multipleEnum);
		
		//add and addAll()
		
		EnumSet<Lang> Lang1=EnumSet.allOf(Lang.class);
		EnumSet<Lang> Lang2=EnumSet.noneOf(Lang.class);
		System.out.println("Lang1: allOf()");
		System.out.println("******************");
		System.out.println(Lang1);
		System.out.println("Lang2: noneOf()");
		System.out.println("******************");
		System.out.println(Lang2);
		
		Lang2.add(Lang.JAVASCRIPT);
		Lang2.addAll(Lang1);
		System.out.println("Lang2: addAll()");
		System.out.println("***********");
		System.out.println(Lang2);
		
		//how to iterate EnumSet: iterator
		
		EnumSet<Lang> fullLang=EnumSet.allOf(Lang.class);
		Iterator<Lang> it=fullLang.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		//remove() and removeAll();
		
		EnumSet<Lang> newLang=EnumSet.allOf(Lang.class);
		System.out.println(newLang);
		
		boolean b=newLang.remove(Lang.CSharp);
		System.out.println(b);
		
		System.out.println(newLang);
		
		boolean b1=newLang.removeAll(newLang);
		System.out.println(b1);
		System.out.println(newLang);
		
	}

}
