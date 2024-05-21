//Write a program to take a number as input and check it is palindrome or not

import java.util.*;

class javaProgram_1
{
    public static void main(String args[])
    {
        Scanner pp = new Scanner(System.in);
        int n,dup,d,rev;
        System.out.println("\nEnter a number:");
        n = pp.nextInt();
        dup = n;
        rev = 0;
        while(dup != 0)
        {
            d = dup % 10;
            rev = (rev * 10) + d;
            dup = dup /10;
        }
        if(rev == n)
            System.out.println(n + " is a palindrome number");
        else
            System.out.println(n + " is not a palindrome number");
    }
}