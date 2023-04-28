package collectionConceptinJava;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
public class Set_iterator
{
	public static void main(String[] args) {
		//bcoz there is no iinndex inSet
		
		Set a= new HashSet();
		
		a.add(100);
		a.add(200);
		a.add(300);
		a.add("manngesh");
		a.add(500);
		a.add(20.20);
		a.add(700);
		a.add('c');
//		System.out.println(a);
		
	
		Iterator it =  a.iterator();
//		System.out.println(it.next());
//		System.out.println(it.next());
//		System.out.println(it.next());
//		System.out.println(it.next());
//		System.out.println(it.next());
//		System.out.println(it.next());
		
		for(int i=1;i<=a.size();i++)
		{
			System.out.println(it.next());
		}
		
		
		LinkedHashSet b = new LinkedHashSet(); 
		
		b.add(10);
		b.add(20);
		b.add(10);
		b.add(30);
		b.add(40);
		b.add(50);
		b.add(60);
		
		System.out.println(b);
		Iterator it1 = b.iterator();

//		System.out.println(it1.next());
//		System.out.println(it1.next());
//		System.out.println(it1.next());
//		System.out.println(it1.next());
//		System.out.println(it1.next());
//		System.out.println(it1.next());
		
		
		for (int i=1;i<=b.size();i++)
		{
			System.out.println(it1.next());
		}
		System.out.println("iterator is used becouse there is no any indexing for set");
		
		
		
		
		


		
	}
}
