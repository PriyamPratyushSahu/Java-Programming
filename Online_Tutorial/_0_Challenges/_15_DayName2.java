//Display Day name, by taking Day number, using switch case

package _0_Challenges;


import java.util.Scanner;

public class _15_DayName2 {
    public static void main(String[] args) {
        Scanner pp = new Scanner(System.in);

        System.out.println("Enter a Day number: ");
        int day = pp.nextInt();

        switch (day) {
            case 1:
            System.out.println("Monday");
            break;
            case 2:
            System.out.println("Tueday");
            break;
            case 3:
            System.out.println("Wednesday");
            break;
            case 4:
            System.out.println("Thurday");
            break;
            case 5:
            System.out.println("Friday");
            break;
            case 6:
            System.out.println("Saturday");
            break;
            case 7:
            System.out.println("Sunday");
            break;
            default:
            System.out.println("Invalid Day Number");    
            break;
        }
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
