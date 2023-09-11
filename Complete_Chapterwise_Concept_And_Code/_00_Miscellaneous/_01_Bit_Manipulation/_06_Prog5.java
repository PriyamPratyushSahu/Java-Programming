//Write a program to check a number is even or odd, using Bit Manipulation

package _01_Bit_Manipulation;

public class _06_Prog5 {

    void checkEvenOdd(int n){
        if((n & 1) == 0)
            System.out.println(n + " is an even number");
        else
            System.out.println(n + " is an odd number");
    }
    
    public static void main(String args[]){
        _06_Prog5 pp = new _06_Prog5();

        int n;
        n = (int)(Math.round(Math.random() * 100));
        pp.checkEvenOdd(n);

    }
}

/*
 Output
 50 is an even number

 84 is an even number

 3 is an odd number
 */

 /*
  Explanation
  any even number has its last bit as 0
  example  8  -> 1000
           24 -> 11000
   any odd number has its last nit as 1
   example  11 -> 1011
           27  -> 11011
    We just need to check that last bit is 1 or 0
    Note: This is faster than modulus(%) operation, which is (n % 2 == 0)
  */