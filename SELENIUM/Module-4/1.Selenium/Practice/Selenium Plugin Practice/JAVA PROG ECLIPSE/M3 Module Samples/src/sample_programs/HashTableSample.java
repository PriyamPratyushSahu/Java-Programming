package sample_programs;


import java.util.*;
class Emp
{
	int empid;
	String ename;
	public Emp(int empid, String ename) {
		this.empid = empid;
		this.ename = ename;
	}
	
}
/*class HashTableSample
{
    public static void main(String args[])
    {
        Hashtable obj=new Hashtable();
        obj.put("A",new Integer(33));
        obj.put("B",new Integer(22));
        obj.put("C",new Integer(88));
        obj.remove(new String("A"));
        System.out.println(obj);

    }
}*/
class HashTableSample
{
    public static void main(String args[])
    {
    	Set set=new HashSet();
    	System.out.println(set.add(new Emp(101,"Suresh")));
    	System.out.println(set.add(new Emp(101,"Suresh")));

    }
}
