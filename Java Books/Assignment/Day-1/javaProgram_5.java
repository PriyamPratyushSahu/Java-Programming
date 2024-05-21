//Write a program to find factorial of a given number

import java.util.*;

class javaProgram_5
{
    public static void main(String args[])
    {
        Scanner pp = new Scanner(System.in);
        int i,n,fac;
        System.out.println("Enter a number:");
        n = pp.nextInt();
        for(i = 1 , fac = 1 ; i <= n ; i++)
        {
            fac *= i;
        }
        System.out.println("The factorial of the number " + n + " is: "  + fac);
    }
}