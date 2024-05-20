package collections_programs;

import java.util.ArrayList;
import java.util.Collections;

class Source4
{
	public ArrayList<String> changeOccurrence(ArrayList<String> a,String m,String n)
	{
		Collections.replaceAll(a,m,n);
		return a;
	}
	public String listIndex(ArrayList<String> list)
	{
		return list.get(0);
	}
	public ArrayList<String> listAfter(ArrayList<String> a, String m, String n)
	{
		//a.add(a.indexOf(m)+1,n);
		for(int i=0;i<a.size();i++)
		{
			if((a.get(i)).equals(m))
			{
				a.add(i+1,n);
				
				//continue;
			}
		}
		return a;
	}
}
public class Student_Information {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Source4 s=new Source4();
		ArrayList<String> a=new ArrayList<String>();
		a.add("Anu");
		a.add("Anj");
		a.add("Ali");
		a.add("Anu");
		a.add("Sag");
		a.add("Anu");
		a.add("Anu");

		System.out.println(s.listAfter(a, "Anu", "Abhi"));
	}

}
