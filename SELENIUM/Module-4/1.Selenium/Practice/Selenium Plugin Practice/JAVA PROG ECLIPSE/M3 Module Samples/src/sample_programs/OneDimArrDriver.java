package sample_programs;

import java.util.Scanner;

public class OneDimArrDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int num[]= [0,0,0,0,0,0,0,0,0,0];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter how many elem: ");
		int size=sc.nextInt();
		OneDimArr oneDimArr=new OneDimArr(size);
		//oneDimArr.addValues();
		oneDimArr.searchElement();

	}

}
