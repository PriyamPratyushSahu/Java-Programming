/*
 * Write a program to print XOR value of given n, starting from 1 to n, with time complexity O(1)
 */
package _01_Bit_Manipulation;

public class _04_Prog {

    void solution_1(int n){
            if(n % 4 == 0)
                System.out.println(n);
            else if(n % 4 == 1)
                System.out.println(1);
            else if(n % 4 == 2)
                System.out.println(n+1);
            else if(n % 4 == 3)
                System.out.println(0);
        }
    public static void main(String args[]){
        _04_Prog pp = new _04_Prog();
        int n = 1 + (int)(Math.round(Math.random() * 50));
        System.out.format("The XOR of 1 to %d is: ",n);
        pp.solution_1(n);
    }
}
/*
 Output
The XOR of 1 to 16 is: 16
 The XOR of 1 to 7 is: 0
 The XOR of 1 to 46 is: 47
 */

/*
 Explanation
 If we observer XOR 1 to n, where
                 n
                 1    =>   1 [if (n % 4 == 1) then XOR is 1]
                 2    =>   3 [if (n % 4 == 2) then XOR is n+1]
                 3    =>   0 [if (n % 4 == 3) then XOR is 0]
                 4    =>   4 [if (n % 4 == 0) then XOR is n]
                 5    =>   1 [if (n % 4 == 1) then XOR is 1]
                 6    =>   7 [if (n % 4 == 2) then XOR is n+1]
                 7    =>   0 [if (n % 4 == 3) then XOR is 0]
                 8    =>   4 [if (n % 4 == 0) then XOR is n]
                 9    =>   1 [if (n % 4 == 1) then XOR is 1]

The pattern follows according to the modulus of 4
 */
