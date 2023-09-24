//Given a array of numbers, display all possible subsets.

package _00_Questions;

import java.util.HashSet;
import java.util.Set;

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
        Prog5 pp = new Prog5();
        int arrSize = 1 + (int)(Math.round(Math.random() * 10));
        Set<Integer> uniquSet = new HashSet<>();
        for(int i = 0; i < arrSize; i++)
            uniquSet.add((int)(Math.round(Math.random() * 50)));
        Integer arr[] = new Integer[uniquSet.size()];
        uniquSet.toArray(arr);

        System.out.print("Array elements: ");
        for(int i : arr) System.out.print(i + " ");

        int number_of_subsets = (int) Math.pow(2, arrSize);
        System.out.println();//"List of subsets:");
        for(int i = 0; i < number_of_subsets; i++){
            int binary_equivalent = pp.decimalToBinary(i);
            //System.out.println(i+" . " + binary_equivalent);
            int count = -1;
            int pointer = arrSize-1;
            int subset[] = new int[arrSize];
            while(binary_equivalent != 0){
                if((binary_equivalent & 1) == 1){
                    subset[++count] = arr[pointer];
                    
                }
                pointer--;
                binary_equivalent /= 10;
            }
            System.out.print(i+1 +". { ");
            if(count >= 0){
                System.out.print(subset[count--]);
                for(int j = count ; j >= 0; j--)
                    System.out.print(" ," + subset[j]);
            }
            System.out.println(" }");
        }
    }

}
