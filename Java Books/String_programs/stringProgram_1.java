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
        System.out.println("\nEnter two words: ");
        s1 = pp.readLine();
        s1 = s1.trim();
        s2 = pp.readLine();
        s2 = s2.trim();
        ls1 = s1.length();
        ls2 = s2.length();
        if(ls1 > ls2)
            System.out.println(s1 + " is the longest word");
        else if(ls1 < ls2)
            System.out.println(s2 + " is the longest word");
        else
            System.out.println("Both words are of same length");
    }
}