package sample_programs;

import java.util.Scanner;

public class BankAccDetailsImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccountDetails bankAccountDetails= new BankAccountDetails(0,0,null,null,0);
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter details :");
		bankAccountDetails.readData();
		
		System.out.println("Do u want to fetch with "
				+ "1. custid 2. accno 3. name");
		
		int ch=sc.nextInt();
		switch(ch)
		{
		case 1:
			System.out.println("Enter custid");
			bankAccountDetails.chkAccBalance(sc.nextInt());
			break;
		case 2:
			System.out.println("Enter accno");
			bankAccountDetails.chkAccBalance(sc.nextLong());// binded during compilation
			break;
		case 3:
			System.out.println("Enter name");
			bankAccountDetails.chkAccBalance(sc.next());
			break;
		default:
				System.out.println("Enter 1 2 3");
		}
		sc.close();
	}

}
