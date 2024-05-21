import java.util.Scanner;
class evenodd
{
	public static void main(String[] args)
		{
			Scanner sc = new Scanner(System.in);
			int x = sc.nextInt();
			if(x%2==0)
			{System.out.print(x+" is even");}
			else
			{System.out.print(x+" is odd");}
		}
}