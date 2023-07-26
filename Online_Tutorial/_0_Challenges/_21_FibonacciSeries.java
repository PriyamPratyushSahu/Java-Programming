//To display the fibonacci Series

package _0_Challenges;


import java.util.Scanner;

public class _21_FibonacciSeries {

    public static void main(String args[]) {
        Scanner pp = new Scanner(System.in);
        int n, a, b, c;
        System.out.print("Enter a number: ");
        n = pp.nextInt();
        pp.close();

        System.out.print("The Series is: ");
        if (n == 0)
            System.out.print(n);
        else if (n == 1)
            System.out.print(0 + ", " + n);
        else if (n > 1) {
            a = 0;
            b = 1;
            System.out.print(a + ", " + b);
            c = b + a;
            while (c <= n) {
                System.out.print(", " + c);
                a = b;
                b = c;
                c = a + b;
            }
        }
    }
}
/*
 ************************** OUTPUT **************************
Enter a number: 20
The Series is: 0, 1, 1, 2, 3, 5, 8, 13

Enter a number: 80
The Series is: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55
 */