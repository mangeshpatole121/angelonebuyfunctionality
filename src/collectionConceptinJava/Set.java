package collectionConceptinJava;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Set 

{
	public static void main(String[] args) 
	{
		HashSet a = new HashSet();
		a.add(10);
		a.add(20);
		a.add(null);
		a.add(null);
		a.add(50);
		a.add("mangesh");
		a.add("maggy");
		a.add(1.0);
		a.add(10.5);
		a.add(10);
		a.add(20);
		
	
		System.out.println(	a.size());
		System.out.println(a);
		
		LinkedHashSet lhs = new LinkedHashSet();
		lhs.add(10);
		lhs.add(20);
		lhs.add(null);
		lhs.add(null);
		lhs.add(50);
		lhs.add("mangesh");
		lhs.add("maggy");
		lhs.add(1.0);
		lhs.add(10.5);
		lhs.add(10);
		lhs.add(20);
		System.out.println(lhs);
	}
}
