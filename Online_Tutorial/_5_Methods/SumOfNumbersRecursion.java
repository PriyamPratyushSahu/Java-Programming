//Sum of numbers using Recursion

package _5_Methods;

public class SumOfNumbersRecursion {

    public static int sumOfNumbers(int n) {
        int add = n;
        System.out.println("n status: " + n);
        if (n != 0)
            add += sumOfNumbers(n - 1);
        int k = add - (n - 1);
        int m = n - 1;
        System.out.format("add operation status: %d + %d = %d\n", k, m, add);
        return add;
    }

    public static void main(String args[]) {
        int n = (int) Math.round(Math.random() * 50);
        System.out.println("Sum of numbers from 1 to " + n + ": " + sumOfNumbers(n));
    }
}
/*
************************** OUTPUT **************************
n status: 9
n status: 8
n status: 7
n status: 6
n status: 5
n status: 4
n status: 3
n status: 2
n status: 1
n status: 0
add operation status: 1 + -1 = 0
add operation status: 1 + 0 = 1
add operation status: 2 + 1 = 3
add operation status: 4 + 2 = 6
add operation status: 7 + 3 = 10
add operation status: 11 + 4 = 15
add operation status: 16 + 5 = 21
add operation status: 22 + 6 = 28
add operation status: 29 + 7 = 36
add operation status: 37 + 8 = 45
Sum of numbers from 1 to 9: 45
 */
