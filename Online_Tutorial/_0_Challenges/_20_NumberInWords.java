// To enter a number and display each digit in words

package _0_Challenges;


import java.util.Scanner;

public class _20_NumberInWords {
    public static void main(String[] args) {
        Scanner pp = new Scanner(System.in);
        int n, r;
        String str = "";
        char c;

        System.out.print("Enter a Number: ");
        n = pp.nextInt();
        pp.close();

        while (n > 0) {
            r = n % 10;
            str = str + r;
            n = n / 10;
        }

        //System.out.println(str); //To check

        for (int i = str.length() - 1; i >= 0; i--) {
            c = str.charAt(i);
            switch (c) {
                case '0':
                    System.out.print("Zero ");
                    break;
                case '1':
                    System.out.print("One ");
                    break;
                case '2':
                    System.out.print("Two ");
                    break;
                case '3':
                    System.out.print("Three ");
                    break;
                case '4':
                    System.out.print("Four ");
                    break;
                case '5':
                    System.out.print("Five ");
                    break;
                case '6':
                    System.out.print("Six ");
                    break;
                case '7':
                    System.out.print("Seven ");
                    break;
                case '8':
                    System.out.print("Eight ");
                    break;
                case '9':
                    System.out.print("Nine ");
                    break;

            }

        }

    }

}
/*
 ************************** OUTPUT **************************
Enter a Number: 34876
Three Four Eight Seven Six

Enter a Number: 345991
Three Four Five Nine Nine One 
 */
