/*
Write a program to take a word as input and display each letter
with a space.
**/

import java.io.*;

class stringProgram_2
{
    public static void main(String args[])throws IOException
    {
        BufferedReader pp = new BufferedReader(new InputStreamReader(System.in));
        String s;
        int i,l;
        char pos;
        System.out.print("\nEnter a word: ");
        s = pp.readLine();
        s = s.trim();
        l = s.length();
        System.out.print("The new modified string is: ");
        for(i = 0 ; i < l ; i++)
        {
            pos = s.charAt(i);
            System.out.print(pos + " ");
        }
    }
}