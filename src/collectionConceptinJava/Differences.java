package collectionConceptinJava;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Differences {
	public static void main(String[] args)
	{
		List a = new ArrayList();
		
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(40);
		a.add(50);
		a.add("forArraylist");
		a.add(10.5);
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(null);
		a.add(null);
		a.add(null);
		System.out.println(a);		
		
		HashSet hs = new HashSet();
		hs.add(10);
		hs.add(20);
		hs.add(30);
		hs.add(40);
		hs.add(50);
		hs.add("forArraylist");
		hs.add(10.5);
		hs.add(10);
		hs.add(20);
		hs.add(30);
		hs.add(null);
		hs.add(null);
		hs.add(null);
		System.out.println(hs);

		
		Set st = new HashSet();
	
		st.add(10);
		st.add("forArraylist");
		st.add(10.5);
		st.add(10);
		st.add(20);
		st.add(30);
		st.add(null);
		st.add(null);
		st.add(null);
		System.out.println(st);	
		System.out.println(st.size());
		
//		no indexing
//		set cant repace
//		cant get indexthr
		
	}

}
