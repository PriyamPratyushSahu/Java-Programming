/*Write a program to produce a table of Celsius and the
 equivalent Fahrenheit temperatures from 0 to 100
 **/

 import java.util.*;

 class javaProgram_2
 {
     public static void main(String args[])
     {
         double c,f;
         System.out.println("\n    Celcius               Fahrenheit");
         for(f = 0 ; f <= 100 ; f++)
         {
             c = (((f - 32) * 5) / 9);
             System.out.println(c + "              " + f);
         }
     }
 }