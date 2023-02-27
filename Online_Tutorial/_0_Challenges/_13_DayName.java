//Display Day name, by taking Day number, using if else

package _0_Challenges;


import java.util.Scanner;

public class _13_DayName {
    public static void main(String[] args) {
        Scanner pp = new Scanner(System.in);

        System.out.println("Enter a Day number: ");
        int day = pp.nextInt();

        if (day == 1)
            System.out.println("Monday");
        else if (day == 2)
            System.out.println("Tueday");
        else if (day == 3)
            System.out.println("Wednesday");
        else if (day == 4)
            System.out.println("Thurday");
        else if (day == 5)
            System.out.println("Friday");
        else if (day == 6)
            System.out.println("Saturday");
        else if (day == 7)
            System.out.println("Sunday");
        else
            System.out.println("Invalid Day Number");
        pp.close();

    }
}

/*
 ****************************** OUTPUT ******************************
Enter a Day number: 
7
Sunday

Enter a Day number: 
2
Tueday

Enter a Day number: 
10
Invalid Day Number
 */
