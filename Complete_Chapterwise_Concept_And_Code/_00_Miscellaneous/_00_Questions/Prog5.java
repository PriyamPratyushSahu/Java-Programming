//Given a array of numbers, display all possible subsets.

package _00_Questions;

public class Prog5 {

    int decimalToBinary(int num) {
        int binary = 0;
        int base = 1;
    
        while (num > 0) {
            int remainder = num % 2;
            binary += remainder * base;
            base *= 10;
            num /= 2;
        }
    
        return binary;
    }

    public static void main(String args[]){
        int arrSize = 1 + (int)(Math.round(Math.random() * 10));
        int arr[] = new int[arrSize];
        for(int i = 0; i < arrSize; i++)
            arr[i] = (int)(Math.round(Math.random() * 50));
        
        System.out.print("Array elements: ");
        for(int i : arr) System.out.print(i + " ");
    }

}
