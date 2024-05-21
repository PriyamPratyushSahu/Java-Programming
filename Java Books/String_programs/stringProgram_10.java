/*
Write a program in java to take string as input.
INPUT: 
DO YOUR DUTY
OUTPUT:
  DO 
    YOUR
        DUTY
**/

import java.io.*;

class stringProgram_10
{
    public static void main(String args[])throws IOException
    {
        BufferedReader pp = new BufferedReader(new InputStreamReader(System.in));
        String s,w;
        int i,l,c,k;
        char pos;
        System.out.println("\nEnter a String:");
        s = pp.readLine();
        s = s.trim();
        s = s + " ";
        l = s.length();
        System.out.println("The Output is:");
        for(i = 0 , w = "" , c = 0 ; i < l ; i++)
        {
            pos = s.charAt(i);
            if(pos != 32)
            {
                c++;
                w = w + pos;
            }
            else
            {
                System.out.println(w);
                for(k = 1 ; k <= c ; k++)
                    System.out.print(" ");                
                w = "";
            }
        }
    }
}