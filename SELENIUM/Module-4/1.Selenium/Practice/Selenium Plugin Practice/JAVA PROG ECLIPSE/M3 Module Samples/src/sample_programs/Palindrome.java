package sample_programs;

import java.util.Scanner;
class Palin
{
	
}
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int number=0;
		Scanner sc=new Scanner(System.in);
		String ch="y";
		while(ch.equalsIgnoreCase("y") ){
		int number=sc.nextInt();
		int backup=number;
		int revdig=0;
		int remainder=0;
		while(number>0)
		{
			remainder=number%10;
			revdig=revdig*10+remainder;
			number=number/10;
		}
		if(revdig==backup)
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not a palindrome");
		}
		System.out.println("Continue y/n? ");
		ch=sc.next();
		}
		sc.close();

	
	}
}
