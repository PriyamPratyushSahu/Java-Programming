//Check whether the given number is a binary number or not using regular expression

package _0_Challenges;


import java.util.Scanner;

public class _6_HexaDecimalCheck {

    public static void main(String[] args) {
        Scanner pp = new Scanner(System.in);
        String a;

        System.out.println("Enter a hexadecimal input: ");
        a = pp.nextLine();

        String str = String.valueOf(a);
        System.out.println(str.matches("[0-9A-F]+"));
        pp.close();
    }

}

/*
 **************************** OUTPUT ****************************
 //1
Enter a hexadecimal input: 
ABC65EF
true

//2
Enter a hexadecimal input: 
XYS64521
false
 */
