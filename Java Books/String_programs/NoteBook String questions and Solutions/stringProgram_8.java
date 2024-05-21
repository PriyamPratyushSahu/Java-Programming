/*
Write a program in java to take string as input.
INPUT: 
DO YOUR DUTY
OUTPUT:
D
DO
Y
YO
YOU 
YOUR
D
DU
DUT
DUTY
**/

import java.io.*;

class stringProgram_8
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
            if(pos == 32)
            w = "";
            else
            {
                w = w + pos;
                System.out.println(w);

            }            
        }
    }
}