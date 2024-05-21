import java.util.*;

class string_test
	{
	public static void main(String[] args)
		{
		String s1 = new String();
		String s2 = new String("KIIT");
		char[] c = {'R','C','P','L',' ','I','N','D','I','A'};
		String s3 = new String(c);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s1.isEmpty());
		System.out.println(s2.isEmpty());
		System.out.println(s2.charAt(2));
		System.out.println(s2.length());
		System.out.println(s3.length());
		System.out.println(s2.compareTo(s3));
		System.out.println(s3.substring(4));
		System.out.println(s3.substring(5,8));
		System.out.println(s3.startsWith("R"));
		System.out.println(s3.endsWith("P"));
		System.out.println(s3.contains("K"));
		System.out.println(s3.replaceAll("I","E"));
		String[] arr = s3.split("I");
		System.out.println("after split");
		for(String x: arr)
			{
			System.out.println(x);
			}
		char[] arr2 = s3.toCharArray();
		for(char x: arr2)
			{
			System.out.println(x);
			}
		System.out.println("s3 : "+s3);
		System.out.println(s3.toUpperCase());
		System.out.println(s3.toLowerCase());
		}
	}