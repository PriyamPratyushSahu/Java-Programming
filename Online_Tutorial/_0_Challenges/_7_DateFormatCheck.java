//Check whether the given date format matches or not using regular expression

package _0_Challenges;


import java.util.Scanner;

public class _7_DateFormatCheck {

    public static void main(String args[]) {
        Scanner pp = new Scanner(System.in);
        String d;

        System.out.println("Enter date in dd/mm/yyyy format: ");
        d = pp.nextLine();

        String str = String.valueOf(d);
        System.out.println(str.matches("[0-3][0-9]/[01][0-9]/[0-9]{4}"));
        pp.close();
    }
}

/*
 **************************** OUTPUT ****************************
Enter date in dd/mm/yyyy format:
11/04/2000
true
 */
