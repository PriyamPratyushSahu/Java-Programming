/*
Write a program in java to take a string as input and
find the ocuurance of each vowels.
**/

import java.io.*;
class stringProgram_4
{
    public static void main(String args[])throws IOException
    {
        BufferedReader pp = new BufferedReader(new InputStreamReader(System.in));
        String s;
        int i,l;
        int vow[] = new int[5];
        char pos;
        System.out.print("\nEnter a string as input: ");
        s = pp.readLine();
        s = s.trim();
        l = s.length();
        for(i = 0 ; i < l ; i++)
        {
            pos = s.charAt(i);
            if(pos == 'a' || pos == 'A') 
                vow[0]++;
            else if(pos == 'e' || pos == 'E')
                vow[1]++;
            else if(pos == 'i' || pos == 'I')
                vow[2]++;
            else if(pos == 'o' || pos == 'O')
                vow[3]++;
            else if(pos == 'u' || pos == 'U')
                vow[4]++;
        }
        System.out.println("\nVowel\t\tOccurance");
        System.out.println(" a/A \t\t  " + vow[0]);
        System.out.println(" e/E \t\t  " + vow[1]);
        System.out.println(" i/I \t\t  " + vow[2]);
        System.out.println(" o/O \t\t  " + vow[3]);
        System.out.println(" u/U \t\t  " + vow[4]);
    }
}