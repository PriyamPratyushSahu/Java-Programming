//Find Radix of a given number

package _0_Challenges;


import java.util.Scanner;

public class _11_RadixNumber {
    public static void main(String[] args) {
        Scanner pp = new Scanner(System.in);
        String num;

        System.out.println("Enter a Number");
        num = pp.nextLine();

        if (num.matches("[01]+"))
            System.out.println("Binary Number\nRadix=2");

        else if (num.matches("[0-7]+"))
            System.out.println("Octal Number\nRadix=8");

        else if (num.matches("[0-9]+"))
            System.out.println("Decimal Number\nRadix=10");

        else if (num.matches("[0-9A-F]+"))
            System.out.println("Hexa Number\nRadix=16");

        else
            System.out.println("Not a Number");
        pp.close();
    }
}

/*
 ****************************** OUTPUT ******************************
Enter a Number
1010111
Binary Number
Radix=2

Enter a Number
140712
Octal Number
Radix=8

Enter a Number
982341
Decimal Number
Radix=10

Enter a Number
82AB6
Hexa Number
Radix=16

Enter a Number
123XYZ
Not a Number
 */
