package collection;

import java.util.HashSet;

public class HashSetStudy {

	public static void main(String[] args)
	{
		HashSet<Object>hs=new HashSet<Object>();
		hs.add("Pune");
		hs.add(12);
		hs.add(12.1);
		hs.add("Pune");
		hs.add(null);
		hs.add('A');
		hs.add(null);
		hs.add(true);
		
		System.out.println(hs);
		System.out.println(hs);
		System.out.println(hs);
		
		System.out.println(hs.add("Pune"));
		System.out.println(hs.add("Pune1"));
		
		//traversing through set
		
		//doesnot support ---->
		
		
		
		
		

	}

}
