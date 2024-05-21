//Write a program to print the Fibonacci series

import java.util.*;

class javaProgram_6
{
    public static void main(String args[])
    {
        Scanner pp = new Scanner(System.in);
        int n,a,b,c;
        System.out.println("\nEnter the range limit: ");
        n = pp.nextInt();
        n = Math.abs(n);
        System.out.println("The Fibonacci Series is: ");
        if(n == 0)
            System.out.println(n);
        else if(n == 1)
            System.out.println(n);
        else
        {
            System.out.print("0 , 1");
            a = 0;
            b = 1;
            c = 0;
            do
            {
                c = a + b;
                if(c > n)
                break;
                System.out.print(" , " + c);
                a = b;
                b = c;
            }while(true);
        }
    }
}