//Remove Special Characters from the string using regular expression

package _0_Challenges;


import java.util.Scanner;

public class _8_StringChallenge1 {

    public static void main(String[] args) 
    {
        Scanner pp = new Scanner(System.in);

        String str;
        System.out.println("Enter a string: ");
        str = pp.nextLine();
        str = str.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println("Modified String: " + str);
        pp.close();
    }   
}

/*
 ****************************** OUTPUT ******************************
Enter a string: 
abc^%$ytr#@1256
Modified String: abcytr1256
 */