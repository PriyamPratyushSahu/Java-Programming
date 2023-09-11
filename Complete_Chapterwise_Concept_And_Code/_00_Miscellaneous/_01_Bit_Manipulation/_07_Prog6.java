// Write a  program to Count Set Bits (Hamming Weight): Count the number of 1 bits in an integer
package _01_Bit_Manipulation;

public class _07_Prog6 {

    int countSetBits(int num) {
        int count = 0;
        while (num != 0) {
            count += num & 1;
            num >>= 1;
        }
        return count;
    }

    public static void main(String args[]){
        _07_Prog6 pp = new _07_Prog6();
        int n = (int) (Math.round(Math.random() * 100));

        System.out.format("Number of set bit of %d is: %d",n,pp.countSetBits(n));
    }   
}
/*
 Output
 Number of set bit of 17 is: 2
 Number of set bit of 6 is: 2
 Number of set bit of 49 is: 3
 */

/*
 Explanation
 17 -> 10001 ( 2 bits are having 1)
 6 -> 110 ( 2 bits are having 1)
 49 -> 11001 ( 3 bits are having 1)
 */
