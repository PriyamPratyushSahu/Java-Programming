//Write a program to check if a given no. is prime.

import java.util.*;

class javaProgram_3 
{
    public static void main(String args[])   
    {
        Scanner pp = new Scanner(System.in);
        int i,n,dup,co;
        System.out.println("\nEnter a number:");
        n = pp.nextInt();
        dup = n;
        n = Math.abs(n);
        for(i = 1 , co = 0 ; i <= n ; i++)
        {
            if(n % i == 0)
            {
                co++;
            }
            if (co == 3)
            break;
        }

        if(co == 2)
            System.out.println(dup + " is a prime number");
        else
        System.out.println(dup + " is not a prime number");
    }
}