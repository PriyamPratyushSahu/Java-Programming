//Solve the quadratic equation to find the roots

package _0_Challenges;

import java.util.Scanner;

public class _2_QuadreticEquation {
    public static void main(String args[]) {
        Scanner pp = new Scanner(System.in);
        int a, b, c;
        double root1, root2;

        System.out.println("Enter the value of a,b,c: ");
        //Random number between 1 to 10
        a = pp.nextInt();
        b = pp.nextInt();
        c = pp.nextInt();

        root1 = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
        root2 = (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);

        System.out.print("Roots are: " + String.format("%.2f", root1) + " , " + String.format("%.2f", root2));
        pp.close();
    }
}

/*
 *********************************** OUTPUT ***********************************
 Enter the value of a,b,c: 
1
8
3
Roots are: -0.39 , -7.61
 */
