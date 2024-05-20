package sample_programs;

import java.util.Scanner;

class Fibonacci
{
	private int term1; //instance variables
	private int term2;
	private int term3;
	private int noofterms;//local var turned to inst var
	Fibonacci(int term1,int term2)
	{
		this.term1=term1;
		this.term2=term2;
		this.term3=0;
		this.noofterms=0;
	}
	public void readInput()//stub
	{
		System.out.println("Enter the no of terms: ");
		Scanner sc=new Scanner(System.in);
		noofterms=sc.nextInt();
		//sc.close();
	}
	public void calcFibo()//stub
	{
		term1=0;
		term2=1;
		System.out.println("Fibonacci series \n"+term1+"\n"+term2);
		for(int i=2;i<noofterms;i++)
		{
			term3=term1+term2;
			System.out.println(term3);
			term1=term2;
			term2=term1;
			term2=term3;
		}
	}
	
}