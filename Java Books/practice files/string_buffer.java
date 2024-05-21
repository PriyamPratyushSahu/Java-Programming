import java.util.*;

class string_buffer
	{
	public static void main(String[] args)
		{
		String x = new String("RCPL");
		String y = new String("INDIA");
		x.concat(y);
		StringBuffer sb1 = new StringBuffer("KIIT");		
		StringBuffer sb2 = new StringBuffer(" BBS");
		sb1.append(sb2);

		System.out.println(x);
		System.out.println(sb1);
		}
	}