/*
Write a program in java to take string as input.
INPUT: 
DO YOUR DUTY
OUTPUT:
DO 
DO YOUR
DO YOUR DUTY
**/

import java.io.*;

class stringProgram_9
{
    public static void main(String args[])throws IOException
    {
        BufferedReader pp = new BufferedReader(new InputStreamReader(System.in));
        String s,w;
        int i,l;
        char pos;
        System.out.print("\nEnter a String: ");
        s = pp.readLine();
        s = s.trim();
        s = s + " ";
        l = s.length();
        System.out.println("The Output is:");
        for(i = 0 , w = "" ; i < l ; i++)
        {
            pos = s.charAt(i);
            w = w + pos;
            if(pos == 32)
            {
                System.out.println(w);
            }
        }
    }
}