package collections_programs;

import java.util.ArrayList;

class Source
{
	public String printIndex(ArrayList<String> list, int ind)
	{
		return list.get(ind);
	}
	public ArrayList<String> addAfter(ArrayList<String> a, String m, String n)
	{
		a.add(a.indexOf(m)+1,n);
		return a;
	}
	public ArrayList<String> pickIndexAndAppend(ArrayList<String> p, int ind)
	{
		String c=p.get(ind);
		p.remove(ind);
		p.add(c);
		return p;
	}
}

public class TV_Show {
	public static void main(String args[])
	{
		ArrayList<String> list=new ArrayList<String>();//Creating arraylist  
		  list.add("Mango");//Adding object in arraylist    
		  list.add("Apple");    
		  list.add("Banana");    
		  list.add("Grapes");  
		  Source s=new Source();
		  System.out.println(s);
		  System.out.println(s.printIndex(list, 2));
		  System.out.println(s.addAfter(list, "Banana", "Mango"));
		  System.out.println(s.pickIndexAndAppend(list, 0));
	}
}
