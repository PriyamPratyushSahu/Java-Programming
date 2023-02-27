/*
Take input the price of some products and calculate CalculateDiscount
  - Less than 500 : 10% discount
  - Greater than equal to  500 and less than 1000 : 15% discount
  - Greater than equal to 1000 : 20% discount
 */

package _0_Challenges;

import java.util.Scanner;

public class _31_CalculateDiscount {

    static double discountCal(double arr[]) {
        double sum = 0;

        for (int i = 0; i < arr.length; i++)
            sum += arr[i];
        System.out.println("Total Price before Discount: " + String.format("%.2f", sum));

        if (sum < 500)
            return sum - (sum * 0.10);
        else if (sum >= 500 && sum < 1000)
            return sum - (sum * 0.15);
        else
            return sum - (sum * 0.20);

    }

    public static void main(String args[]) {

        int size;
        double arr[];
        Scanner pp = new Scanner(System.in);
        System.out.print("Enter number of products: ");
        size = pp.nextInt();
        arr = new double[size];
        System.out.format("Enter %d products price: ", size);
        for (int i = 0; i < arr.length; i++)
            arr[i] = pp.nextDouble();

        System.out.println("After Discount: " + String.format("%.2f", discountCal(arr)));
        pp.close();
    }
}

/*
 ************************** OUTPUT **************************
Enter number of products: 3
Enter 3 products price: 100
200
30
Total Price before Discount: 330.00
After Discount: 297.00


Enter number of products: 5
Enter 5 products price: 100
347
299
764
899
Total Price before Discount: 2409.00
After Discount: 1927.20
 */
