package sample_programs;

import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class OneDimArr {
	private int size;
	private int[] numbers=new int[size];

	OneDimArr(int size)
	{
		this.size=size;
		numbers=new int[this.size];
	}
	public OneDimArr(int[] numbers,int size) {
		this.size=size;
		this.numbers = numbers;
	}
	
	public void readInput()
	{
		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<size;i++)
		{
			numbers[i]=sc.nextInt();
		}
	}
	public void addValues()
	{
		readInput();
		int total=0;
		for(int i=0;i<size;i++)
		{
			 total=total+numbers[i];
		}
		System.out.println("Sum of nos: "+total);
		calcQuo();
	}
	@SuppressWarnings("finally")
	public void calcQuo() throws ArrayIndexOutOfBoundsException
	{
		int dividend=2;
		System.out.println("Numbers divided: ");
		/*for(int number:numbers)
		{
			try
			{
				System.out.println(number/dividend);
			}
			catch(ArithmeticException ae)
			{
				System.out.println("Dividend is 0");
			}
		}*/
		for(int i=0;i<5;i++)
		{
			System.out.println(numbers[i]/dividend);
			
			  try { System.out.println(numbers[i]/dividend); } 
			  catch(ArithmeticException ae) 
			  { System.out.println("Dividend is 0"); 
			  break; 
			  }
			  catch(ArrayIndexOutOfBoundsException aiobe) {
				  System.out.println(aiobe.getMessage());
				  System.out.println("Array index is wrong"); 
				  //break; 
				  } 
			  catch(Exception ae) {
			  System.out.println("Exception occured"); 
			  //break;
			  } 
			  finally {
			  System.out.println("Finally block"); 
			  break; 
			  }
			 
		}
			/*File f;
			try {
				f = new File("\\hj.txt");
				f.renameTo(null);
				System.out.println(f.exists());
			} catch (NullPointerException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//boolean ex=f.exists();
			*/
		
	}
	public void searchElement()
	{
		addValues();
		Scanner sc=new Scanner(System.in);
		System.out.println("Elements in sorted order");
		Arrays.sort(numbers);
		for(int num:numbers) {
			System.out.println(num);
		}
		System.out.println(numbers);
		System.out.println("What elem to search: ");
		int elmt=sc.nextInt();
		for(int i=0;i<size;i++)
		{
			if(elmt==numbers[i])
			{
				System.out.println("Element found at location: "+i);
			}
		}
		
	}
	
}
