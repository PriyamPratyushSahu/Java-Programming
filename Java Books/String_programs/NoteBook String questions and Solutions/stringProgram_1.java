/* Write a program in java to take two words as input and display
 the longest word.
 **/

import java.io.*;

class stringProgram_1
{
    public static void main(String args[])throws IOException
    {
        BufferedReader pp = new BufferedReader(new InputStreamReader(System.in));
        String s1,s2;
        int ls1,ls2;
        System.out.print("\nEnter two words as input\nEnter first word:  ");
        s1 = pp.readLine();
        s1 = s1.trim();
        System.out.print("\nEnter second word:  ");
        s2 = pp.readLine();
        s2 = s2.trim();
        ls1 = s1.length();
        ls2 = s2.length();
        if(ls1 > ls2)
            System.out.println("\n" + s1 + " is the longest word");
        else if(ls1 < ls2)
            System.out.println("\n" + s2 + " is the longest word");
        else
            System.out.println("\nBoth words are of same length");
    }
}