package lab1;

import java.util.Arrays;
import java.util.Scanner;


public class ques1_9 {

	public static String stringMethods(String str, int ch)
	{
		switch(ch)
		{
		case 1:
		{
			return str+str;
		}
		case 2:
		{
			String rep="";
			for(int i=0;i<str.length();i++)
			{
				if(i%2!=0)
				{
					rep+='#';
					continue;
				}
				rep+=str.charAt(i);
			}
			return rep;
		}
		case 3:
		{
			int index = 0;
			char arr[] = str.toCharArray();   
			for (int i = 0; i < str.length(); i++)
	        {
	            int j;
	            for (j = 0; j < i; j++)
	            {
	                if (arr[i] == arr[j])
	                {
	                    break;
	                }
	            }
	            if (j == i)
	            {
	                arr[index++] = arr[i];
	            }
	        }
	        return String.valueOf(Arrays.copyOf(arr, index));
		}
		case 4:
		{
			String rep="";
			for(int i=0;i<str.length();i++)
			{
				if(i%2!=0)
				{
					char cha=str.charAt(i);
					if(str.charAt(i)>='a' && str.charAt(i)<='z')
					{
						int ascii = cha;
						ascii = ascii - 32;
					    cha = (char)ascii;
					    rep+=cha;
					}
					//else
						//rep+=str.charAt(i);
				}
				else
					rep+=str.charAt(i);
			}
			return rep;
		}
		}
		return "";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter string: ");
		String st=s.next();
		System.out.println("Enter choice: ");
		int ch=s.nextInt();
		System.out.println(stringMethods(st,ch));
	}

}
