/*
Write a program in java to take a string as input
and count number of words.
**/

import java.io.*;

class stringProgram_3
{
    public static void main(String args[])throws IOException
    {
        BufferedReader pp = new BufferedReader(new InputStreamReader(System.in));
        String s;
        int i,l,count;
        System.out.print("Enter a string: ");
        s = pp.readLine();
        s = s.trim();
        s = s + " ";
        l = s.length();
        for(i = 0 , count = 0 ; i < l ; i++)
            count = (s.charAt(i) == 32) ? ++count : count;
        System.out.println("\nNumber of words in the string is: " + count);
    }
}