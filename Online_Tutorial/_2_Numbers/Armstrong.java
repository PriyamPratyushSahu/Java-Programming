package _2_Numbers;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        int n, m, sum, r;
        Scanner pp = new Scanner(System.in);
        System.out.println("Enter a Number");
        n = pp.nextInt();

        m = n;
        sum = 0;
        while (n > 0) {
            r = n % 10;
            n = n / 10;

            sum = sum + r * r * r;
        }
        if (sum == m)
            System.out.format("%d is  a Armstrong Number", m);
        else
            System.out.format("%d not an Armsttrong Number",m);

        pp.close();
    }
}

/*
 ************************** OUTPUT **************************
 Enter a Number
153
153 is  a Armstrong Number

Enter a Number
189
189 not an Armsttrong Number

 */
