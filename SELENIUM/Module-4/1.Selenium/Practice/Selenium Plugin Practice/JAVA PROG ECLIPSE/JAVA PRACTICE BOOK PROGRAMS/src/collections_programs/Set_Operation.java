package collections_programs;

import java.util.HashSet;
import java.util.Set;

class Source2
{
	public Set<Integer> subtract(Set<Integer> a, Set<Integer> b)
	{
		Set<Integer> result=new HashSet<Integer>();
		for(int i:a)
		{
			if(!b.contains(i))
				result.add(i);
		}
		return result;
	}
	public Set<Integer> union(Set<Integer> a, Set<Integer> b)
	{
		
		Set<Integer> res=new HashSet<Integer>();
		res.addAll(a);
		res.addAll(b);
		return res;//a.addAll(b);
	}
	public Set<Integer> intersect(Set<Integer> a, Set<Integer> b)
	{
		Set<Integer> res=new HashSet<Integer>();
		res.addAll(a);
		res.retainAll(b);
		return res;
	}
}
class Set_Operation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> set1 = new HashSet<Integer>();
		 set1.add(5);
		 set1.add(6);
		 set1.add(7);
		 set1.add(8);
		Set<Integer> set2 = new HashSet<Integer>();
		  set2.add(9);
		  set2.add(3);
		  set2.add(7);
		  Source2 s=new Source2();
		  System.out.println(s.intersect(set1,set2));
	}

}
