//To check whether a number is a palindrome number or not

package _0_Challenges;



import java.util.Scanner;

public class _19_Palindrome {

    public static void main(String args[]) {

        Scanner pp = new Scanner(System.in);
        int n, dup, r, pal;
        System.out.print("Enter a number: ");
        n = pp.nextInt();
        pp.close();
        dup = n;
        pal = 0;
        while (dup != 0) {
            r = dup % 10;
            pal = pal * 10 + r;
            dup /= 10;
        }
        if (pal == n)
            System.out.format("%d is a Palindrome number", n);
        else
            System.out.format("%d is not a Palindrome number!", n);
    }
}

/*
 ************************** OUTPUT **************************
Enter a number: 33333
33333 is a Palindrome number

Enter a number: 1234321
1234321 is a Palindrome number

nter a number: 123
123 is not a Palindrome number!

 */
