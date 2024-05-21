/*
Write a program in java to take a string as input and display each letter
in one column and corresponding ASCII value in another column.
**/

import java.io.*;

class stringProgram_5
{
    public static void main(String args[])throws IOException
    {
        BufferedReader pp = new BufferedReader(new InputStreamReader(System.in));
        String s;
        int i,l;
        char pos;
        System.out.print("\nEnter a string: ");
        s = pp.readLine();
        s = s.trim();
        l = s.length();
        System.out.println("\nLetter\t\t ASCII Value");
        for(i = 0 ; i < l ; i++)
        {
            pos = s.charAt(i);
            System.out.println("  " + pos + "   \t\t   " + (int)pos );
        }
    }
}