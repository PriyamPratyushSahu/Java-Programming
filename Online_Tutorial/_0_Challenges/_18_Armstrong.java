//To check whether the number is an Armstrong number or not

package _0_Challenges;


import java.util.Scanner;

//To check whether a number is an armstrong number or not

public class _18_Armstrong {

    public static void main(String args[]) {

        Scanner pp = new Scanner(System.in);
        int n, dup, r, ar;
        System.out.println("Enter a number: ");
        n = pp.nextInt();
        pp.close();

        if (n > 99) {
            dup = n;
            ar = 0;
            while (dup != 0) {
                r = dup % 10;
                ar += (int) Math.pow(r, 3);
                dup /= 10;
            }
            if (ar == n)
                System.out.format("%d is an Armstrong number", n);
            else
                System.out.format("%d is not an Armstrong number!", n);
        } else
            System.out.format("%d is not an Armstrong number!", n);
    }
}

/*
 ************************** OUTPUT **************************
Enter a number:153 
153 is an Armstrong number

Enter a number:2 
2 is not an Armstrong number
 */
