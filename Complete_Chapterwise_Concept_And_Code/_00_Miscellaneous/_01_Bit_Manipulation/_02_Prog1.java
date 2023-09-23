/*
 You are given an array of size 2n+1, which contains n+1 distinct values, where n values are repeated twice but that 1 distinct value
 is present once. Find that value use Bit manipulation technique
 HINT: XOR(^) operator
 The XOR (exclusive or) operation is a binary logical operation that takes two binary values (0 or 1)
 and returns 1 if the number of 1s among the inputs is odd, and 0 if it's even
 */
package _01_Bit_Manipulation;

public class _02_Prog1 {
    public static void main(String args[]){
        int arr[] = { 1,3,7,9,15,43,3,15,7,43,1};
        int uniqVal = arr[0];
        for(int i = 1; i < arr.length; i++)
            uniqVal = uniqVal ^ arr[i];
        System.out.print("Array elements: ");
        for(int i : arr) System.out.print(i + " ");
        System.out.println("\nUnique Value: "+ uniqVal);
    }
}
/*
 Output
 Array elements: 1 3 7 9 15 43 3 15 7 43 1 
Unique Value: 9
 */

 /*
 Explanation
 XOR helps to cancel out repeated values, as a result the unique value remains in the end
 */
