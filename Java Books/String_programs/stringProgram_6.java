/*
Write a program in java to take a string as input.Display the string
replacing all whitespaces from it.
**/

import java.io.*;

class stringProgram_6
{
    public static void main(String args[])throws IOException
    {
        BufferedReader pp = new BufferedReader(new InputStreamReader(System.in));
        String s,w="";      
        int i,l;
        char pos;
        System.out.println("Enter a string:");
        s = pp.readLine();
        s = s.trim();
        l = s.length();
        for(i = 0  ; i < l ; i++)
        {
            pos = s.charAt(i);
            if(pos == 32)
            pos ='*';
            w = w + pos;
        }
        System.out.println("\nThe new string is:\n" + w);
    }
}