package mpt_peactice;

import java.lang.IllegalArgumentException;

import java.util.TreeMap;

class Source
{
	TreeMap<String,String> data=new TreeMap<String,String>();
	
	public String getNumber(String name)
	{
		return data.get(name);
	}
	public String putNumber(String name,String number)
	{
		try 
		{
		if(name!=null && number!=null)
		{
			data.put(name, number);
			return "True";
		}
		else
		{
			throw new IllegalArgumentException("Name or Number: NULL Exception");
		}
		}
		catch(IllegalArgumentException e)
		{
			return e.getMessage();
		}
	}
	public boolean getName(String number)
	{
		if(data.containsValue(number))
			return true;
		else
			return false;
	}
	public TreeMap<String,String> print()
	{
		return data;
	}
}

public class Directory_Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//TreeMap<String,String> a=new TreeMap<String,String>();
		Source directory=new Source();
		System.out.println(directory.putNumber("A1", "1111"));
		System.out.println(directory.putNumber("A2", "2222"));
		System.out.println(directory.putNumber("A3", "3333"));
		System.out.println(directory.print());
		System.out.println(directory.getNumber("A1"));
		System.out.println(directory.getNumber("A2"));
		System.out.println(directory.getNumber("A3"));

	}

}
