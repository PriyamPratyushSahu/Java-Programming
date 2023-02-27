//To find factorial of a number

package _0_Challenges;


import java.util.Scanner;

public class _17_Factorial {

    public static void main(String args[]) {
        
        Scanner pp = new Scanner(System.in);
        int n , i, f;
        System.out.println("Enter a number: ");
        n = pp.nextInt();
        pp.close();

        for (f = 1, i = 1; i <= n; i++) {
            f = f * i;
        }
        System.out.format("Factorial of %d is: %d", n, f);
        
    }
}

/*
 ************************** OUTPUT **************************
Enter a number: 
3
Factorial of 3 is: 6
 */
