//Remove extra space from the string

package _0_Challenges;


import java.util.Scanner;

public class _9_StringChallenge2 {

    public static void main(String[] args) {
        Scanner pp = new Scanner(System.in);

        String str;
        System.out.println("Enter a string: ");
        str = pp.nextLine();
        str = str.replaceAll("\\s+", " ").trim();
        System.out.println("Modified String: " + str);
        pp.close();
    }

}

/*
 ****************************** OUTPUT ******************************
Enter a string: 
abc def   hij pk   uipw
Modified String: abc def hij pk uipw
 */
