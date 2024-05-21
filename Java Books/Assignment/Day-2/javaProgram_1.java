/*
Write a program to print following pattern.
            *
          * *
        * * *
      * * * *
    * * * * *

**/

import java.util.*;

class javaProgram_1
{
    public static void main(String args[])
    {
        int i,b,j;
        System.out.println("\nThe pattern is: \n");
        for(i = 1 , b = 4 ; i <= 5 ; i++ , b --)
        {
            for(j = 1 ; j <= b ; j++ )
                System.out.print(" ");
            for(j = 1 ; j <= i ; j++)
                System.out.print("*");
            System.out.println();
        }
    }
}