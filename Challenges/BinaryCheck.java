package Challenges;

import java.util.Scanner;

public class BinaryCheck {

    public static void main(String[] args) 
    {
        Scanner pp = new Scanner(System.in);
        int a;

        System.out.println("Enter a binary input: ");
        a = pp.nextInt();
        
        String str=String.valueOf(a);
        System.out.println(str.matches("[01]+"));
    }
}
/*
 **************************** OUTPUT ****************************
 Enter a binary input: 
10010110
true
 */