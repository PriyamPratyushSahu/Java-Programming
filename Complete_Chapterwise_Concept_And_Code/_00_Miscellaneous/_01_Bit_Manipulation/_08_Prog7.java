// Write a  program to check if a Number is a Power of Two: Determine if a given integer is a power of 2
package _01_Bit_Manipulation;

public class _08_Prog7 {

    boolean isPowerOfTwo(int num) {
        return num > 0 && (num & (num - 1)) == 0;
    }

    public static void main(String args[]){
        _08_Prog7 pp = new _08_Prog7();
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
 17 -> 10001 ( 2 bits are having 1)
 6 -> 110 ( 2 bits are having 1)
 49 -> 11001 ( 3 bits are having 1)
 */
