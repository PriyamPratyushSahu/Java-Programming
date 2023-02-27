package _5_Methods;

import java.util.Scanner;

public class VariableArugements {

    static void sumCal(int... nums) {
        int sum = 0;
        for (int i : nums)
            sum += i;
        System.out.format("Sum of %d elements is: %d", nums.length, sum);
    }

    public static void main(String args[]) {
        int ch;
        int var, var2, var3, var4, var5;
        Scanner pp = new Scanner(System.in);
        System.out.print("Enter number of inputs(max 5): ");

        ch = pp.nextInt();
        switch (ch) {
            case 1:
                var = pp.nextInt();
                sumCal(var);
                break;
            case 2:
                var = pp.nextInt();
                var2 = pp.nextInt();
                sumCal(var, var2);
                break;
            case 3:
                var = pp.nextInt();
                var2 = pp.nextInt();
                var3 = pp.nextInt();
                sumCal(var, var2, var3);
                break;
            case 4:
                var = pp.nextInt();
                var2 = pp.nextInt();
                var3 = pp.nextInt();
                var4 = pp.nextInt();
                sumCal(var, var2, var3, var4);
                break;
            case 5:
                var = pp.nextInt();
                var2 = pp.nextInt();
                var3 = pp.nextInt();
                var4 = pp.nextInt();
                var5 = pp.nextInt();
                sumCal(var, var2, var3, var4, var5);
                break;
            default:
                System.out.println("Limit exceeded !!");
                break;
        }
        pp.close();
    }
}

/*
 ************************** OUTPUT **************************
 Enter number of inputs(max 5): 4
1
2
3
4
Sum of 4 elements is: 10
Enter number of inputs(max 5): 10
Limit exceeded !!

Enter number of inputs(max 5): 3
1
57
90
Sum of 3 elements is: 148
 */
