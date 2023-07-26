//Remove extra space from the string

package _0_Challenges;


import java.util.Scanner;

public class _10_StringChallenge3 {

    public static void main(String[] args) {
        Scanner pp = new Scanner(System.in);

        String str;
        System.out.println("Enter a string: ");
        str = pp.nextLine();
        str = str.replaceAll("\\s+", " ").trim();
        String words[]=str.split("\\s");
        System.out.println("Total number of words: " + words.length);
        pp.close();
    }
}

/*
 ****************************** OUTPUT ******************************
Enter a string: 
The quick brown fox jumps over the lazy dog
Total number of words: 9
 */
