package collection;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.ListIterator;
import java.util.Vector;

public class Vectorstudy {

	public static void main(String[] args) 
	{
		Vector<Object> v=new Vector<Object>();
		ArrayList<Object> at=new ArrayList<Object>();
		v.add("Alka");
		v.add(true);
		v.add(null);
		v.add(null);
		v.add("Good");
		v.add(12);
		v.add(12.23);
		
		System.out.println(v);
		v.add(1, "Morning" );
		System.out.println(v);
		
		v.addFirst("Pune");
		v.addLast("MH");
		System.out.println(v);
		
		System.out.println(v.size());
		System.out.println(v.capacity());
		
		//v clear
		
		Object v1=v.clone();
		System.out.println(v1);
		
		System.out.println(v.contains("Pune123"));
		System.out.println(v.elementAt(1));
		
		v.ensureCapacity(25);
	    System.out.println(v.capacity());
	    System.out.println(v.equals(v1));
	    
	    System.out.println(v.get(0));
		
	    System.out.println(v.indexOf(12));
	    
	    v.insertElementAt("Mumbai", 1);
	    
	    System.out.println(v);
	    
	    //v.clear
	    System.out.println(v.isEmpty());
	    System.out.println(v.lastIndexOf("Good"));
	    
	    System.out.println(v.remove(0));
	    System.out.println(v);
	    
	    //v.set(0, "INDIA");
	    System.out.println(v.set(0, "INDIA"));
	    
	  //for
	  //for each
	  //iterator
	  //list iterator
	    
		for(Object a:v)//for each
		{
			System.out.println(a);
		}
		
		System.out.println("=================================");
		
		ListIterator<Object>lit=v.listIterator();
		while(lit.hasNext())
		{
			System.out.println(lit.next());
		}
		
		System.out.println("============reverse=========");
		
		while(lit.hasPrevious())
		{
			System.out.println(lit.previous());
		}
         
		System.out.println("==========================");
		//enumeration
		Enumeration<Object>ele=v.elements();
		while(ele.hasMoreElements())
		{
			System.out.println(ele.nextElement());
		}
		
		
		
	}

}
