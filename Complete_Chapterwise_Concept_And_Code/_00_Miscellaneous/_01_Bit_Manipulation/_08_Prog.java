// Write a  program to check if a Number is a Power of Two: Determine if a given integer is a power of 2
package _01_Bit_Manipulation;

public class _08_Prog {

    boolean isPowerOfTwo(int num) {
        return num > 0 && (num & (num - 1)) == 0;
    }

    public static void main(String args[]){
        _08_Prog pp = new _08_Prog();
        int n = (int) (Math.round(Math.random() * 100));
        if(pp.isPowerOfTwo(n))
            System.out.println(n + " is power of 2");
        else
            System.out.println(n + " is not power of 2");
        
    }   
}
/*
 Output
 16 is power of 2
 75 is not power of 2
 */

/*
 Explanation
 -> num > 0: This part checks whether num is greater than 0.
    This is important because powers of two are always positive integers.
    If num is not greater than 0 (i.e., it's zero or negative), the function immediately returns false.

 ->(num & (num - 1)) == 0: This is the core of the logic to check if num is a power of two.
   (num - 1) subtracts 1 from num. When you subtract 1 from a binary number, 
   it flips the least significant 1 bit to 0 and all the trailing 0s to 1s.
   For example, if num is 8 (binary: 1000), (num - 1) is 7 (binary: 0111).
 */
