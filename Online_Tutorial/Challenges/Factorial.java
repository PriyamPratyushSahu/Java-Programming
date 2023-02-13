//To find factorial of a number

package Challenges;

import java.util.Scanner;

public class Factorial {

    public static void main(String args[]) {
        int i, f, k;
        Scanner pp = new Scanner(System.in);
        System.out.println("Enter a number: ");

        i = pp.nextInt();
        for (f = 1, k = 1; k <= i; k++) {
            f = f * k;
        }
        System.out.format("Factorial of %d is: %d", i, f);
        pp.close();
    }
}

/*
 ************************** OUTPUT **************************
Enter a number: 
3
Factorial of 3 is: 6
 */
