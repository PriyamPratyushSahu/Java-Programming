/*
 You are given an array of size 2n+2, which contains n distinct values, where each n integers are repeated twice but
  those 2 values are distinct and non repetative.
  Find that value use Bit manipulation technique
  HINT: XOR(^) operator
 The XOR (exclusive or) operation is a binary logical operation that takes two binary values (0 or 1)
 and returns 1 if the number of 1s among the inputs is odd, and 0 if it's even
 */

package _01_Bit_Manipulation;

public class _11_Prog {

    public static void main(String args[]){
        int arr[] = {2,1,2,5,1,4,4,7,3,3};
        int XOR_both_values = 0;
        for(int i = 0; i < arr.length; i++)
            XOR_both_values = XOR_both_values ^ arr[i];
        
        int dup = XOR_both_values;
        int counter = 0;
        while(dup != 0){
            if((dup & 1) == 1)
                break;
            counter++;
            dup = dup >> 1;
        }
        int XOR1 = 0;
        int XOR2 = 0;
        
        for(int i = 0; i < arr.length; i++){
            if((arr[i] & (1 << counter)) != 0)
                XOR1 = XOR1 ^ arr[i];
            else
               XOR2 = XOR2 ^ arr[i];
               
        }
        System.out.print("Array elements: ");
        for(int i : arr) System.out.print(i + " ");

        System.out.println("\nUnique Value 1: "+ XOR1);
        System.out.println("Unique Value 2: "+ XOR2);
    } 
}

/*
  Explanation

  Considering the above example
  arr[] = {2,1,2,5,1,4,4,7,3,3}
  We can see if we take a XOR of all the elements we will get in the end 5 ^ 7
  because due to repetation all the repeat values get cancel out
  now 5 ^ 7 = 2, let's consider any value, but we need to note that
  2 = 0 1 0
  5 = 1 0 1
  7 = 1 1 1 
  we can see 5 and 7 binary arrangement does not match at the least set bit, which is the 1st position in this example
  if we create a mask  = 1 << (least set position)
  and run a loop in the array which elements have 1 at that bit position, then we can see
  5, whose that specific bit position was 0, will have values = 1,5,1,4,4
  7, whose that specific bit position was 1, will have values = 2,2,7,3,3
  If we run a XOR operation to this each different set, we will get 5 and 7 respectively
  */
