//Write a program to display first 5 Armstrong nos

import java.util.*;

class javaProgram_4
{
    public static void main(String args[])
    {
        int i,co,dup,d,sum;
        System.out.println("The first 5 Armstrong numbers are:");
        for(i = 1 , co = 0 ; co < 5 ; i++)
        {
            dup = i;
            sum = 0;
            while(dup != 0)
            {
                d = dup %10;
                sum += (d * d * d) ;
                dup /= 10;
            }
            if(i == sum)
            {
                co++;
                System.out.println(co + ". " + i);
            }
        }
    }
}