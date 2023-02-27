package _0_Challenges;

//Find a second largest number from the array

public class _25_SecondLargestNumber {

    public static void main(String args[]) {
        int arr[] = new int[10];
        int i;

        System.out.print("The array is: ");
        for (i = 0; i < arr.length; i++) {
            arr[i] = (int) Math.round(Math.random() * 100);
            System.out.print(arr[i] + " ");
        }
        int max1, max2;

        max1 = max2 = arr[0];

        for (i = 0; i < arr.length; i++) {
            if (arr[i] > max1) {
                max2 = max1;
                max1 = arr[i];
            }

            else if (arr[i] > max2) {
                max2 = arr[i];
            }
        }
        System.out.println("\nSecond Largest element: " + max2);
    }
}

/*
 ************************** OUTPUT **************************
The array is: 3 85 46 39 37 80 94 52 33 78 
Second Largest element: 85

The array is: 53 5 74 76 52 72 22 41 37 11 
Second Largest element: 74
 */
