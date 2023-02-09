//Check whether the given number is a binary number or not using regular expression

package Challenges;

import java.util.Scanner;

public class HexaDecimalCheck {

    public static void main(String[] args) 
    {
        Scanner pp = new Scanner(System.in);
        int a;

        System.out.println("Enter a hexadecimal input: ");
        a = pp.nextInt();
        
        String str=String.valueOf(a);
        System.out.println(str.matches("[0-9A-F]+"));
        pp.close();
    }
    
}
