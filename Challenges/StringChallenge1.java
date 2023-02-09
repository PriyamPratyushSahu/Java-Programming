//Remove Special Characters from the string using regular expression

package Challenges;

import java.util.Scanner;

public class StringChallenge1 {

    public static void main(String[] args) 
    {
        Scanner pp = new Scanner(System.in);

        String str;
        System.out.println("Enter a string: ");
        str = pp.nextLine();
        str = str.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println("Modified String: " + str);
    }   
}

/*
 ****************************** OUTPUT ******************************
Enter a string: 
abc^%$ytr#@1256
Modified String: abcytr1256
 */