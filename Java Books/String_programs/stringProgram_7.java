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

class stringProgram_7
{
    public static void main(String args[])throws IOException
    {
        BufferedReader pp = new BufferedReader(new InputStreamReader(System.in));
        String s,w;
        int i,l;
        char pos;
        System.out.println("\nEnter a String:");
        s = pp.readLine();
        s = s.trim();
        s = s + " ";
        l = s.length();
        System.out.println("The Output is:");
        for(i = 0 , w = "" ; i < l ; i++)
        {
            pos = s.charAt(i);
            w = w + pos;
            if(s.charAt(i+1) == 32)
            {
                System.out.println(w);
                w = "";
                i++;
            }
        }
    }
}