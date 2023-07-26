//Check whether the given number is a binary number or not using regular expression

package _0_Challenges;


import java.util.Scanner;

public class _5_BinaryCheck {

    public static void main(String[] args) 
    {
        Scanner pp = new Scanner(System.in);
        int a;

        System.out.println("Enter a binary input: ");
        a = pp.nextInt();
        
        String str=String.valueOf(a);
        System.out.println(str.matches("[01]+"));
        pp.close();
    }
}
/*
 **************************** OUTPUT ****************************
 Enter a binary input: 
10010110
true
 */