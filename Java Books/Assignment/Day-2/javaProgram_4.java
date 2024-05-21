//Write a program to take a integer as input and display its multiplication table

import java.util.*;

class javaProgram_4
{
    public static void main(String args[])
    {
        Scanner pp = new Scanner(System.in);
        int i,n;
        System.out.println("\nEnter a number: ");
        n = pp.nextInt();
        System.out.println("The multiplication table is:");
        
        for(i = 1 ; i <= 10 ; i++)
        System.out.println(n + " X " + i + " = " + (n*i));
    }
}