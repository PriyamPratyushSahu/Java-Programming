/*
Write a program to print following pattern
        A
      A B A	
    A B C B A
  A B C D C B A
A B C D E D C B A
**/

import java.util.*;

class javaProgram_2
{
 public static void main(String args[])
    {
        int i,b,j;
        System.out.println("The pattern is: ");

        for(i = 1 , b = 8 ; i <= 5 ; i++ , b -= 2)
        {
            for(j = 1 ; j <= b ; j++)
                System.out.print(" ");
            for(j = 1 ; j <= i ; j++)
                System.out.print(" " + (char)(64 + j));
            for( j = i-1 ; j >= 1 ; j--)
                System.out.print(" " + (char)(64 + j));
            System.out.println();
        }
    }
}