//Find the entered year is a leap year or not

package _0_Challenges;


import java.util.Scanner;

public class _12_LeapYear {
    public static void main(String[] args) {
        Scanner pp = new Scanner(System.in);

        System.out.println("Enter a Year number: ");
        int year = pp.nextInt();

        if (year % 4 == 0) { //Condtion 1
            if (year % 100 == 0) { //Condtion 2
                if (year % 400 == 0) { //Condtion 3
                    System.out.println("Its a Leap Year");
                } else // year % 400 != 0
                    System.out.println("Not a Leap Year");
            } else { // year % 100 != 0
                System.out.println("Its a Leap Year");
            }
        } else { // year % 4 == 0
            System.out.println("Not a Leap Year");
        }
        pp.close();
    }
}

/*
 ****************************** OUTPUT ******************************
Enter a Year number:
2000
Its a Leap Year

Enter a Year number:
2160
Its a Leap Year

Enter a Year number:
2140
Its a Leap Year

Enter a Year number:
1300
Not a Leap Year

Enter a Year number:
2024
Its a Leap Year
 */
