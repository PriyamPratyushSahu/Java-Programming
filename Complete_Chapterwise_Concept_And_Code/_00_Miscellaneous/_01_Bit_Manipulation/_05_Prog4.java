/*
 * For a given range(L to R) Find the XOR between L to R
 *  L ^ (L+1) ^ (L+2) ^ ... (R-1) ^ R
 */
package _01_Bit_Manipulation;

public class _05_Prog4 {
    int solution_1(int n){
        if(n % 4 == 0)
            return(n);
        else if(n % 4 == 1)
            return(1);
        else if(n % 4 == 2)
            return(n+1);
        else // if(n % 4 == 3)
            return(0);
    }

    public static void main(String args[]){
        _05_Prog4 pp = new _05_Prog4();
        int L = 1 + (int)(Math.round(Math.random() * 30));
        int R = 1 + (int)(Math.round(Math.random() * 30));
        int LXOR = pp.solution_1(L-1);
        int RXOR = pp.solution_1(R);
        System.out.format("XOR between %d and %d: %d",L,R,(LXOR ^ RXOR));
    }
}
/*
 Output
 XOR between 3 and 6: 4
 XOR between 4 and 14: 15
 */

/*
 Explanation
 As we know(from previous program)
 XOR from 1 to n, 
if (n % 4 == 1) then XOR is 1
if (n % 4 == 2) then XOR is n+1
if (n % 4 == 3) then XOR is 0
if (n % 4 == 0) then XOR is n
 
Lets consider 
L = 3
R = 6
So XOR from 1 to R) = 1 ^ 2 ^ 3 ^ 4 ^ 5 ^ 6
and XOR from 1 to L-1 = 1 ^ 2 (Why L-1 explained below)
If we take XOR(L-1) ^ XOR(R) : (1 ^ 2) ^ (1 ^ 2 ^ 3 ^ 4 ^ 5 ^ 6)
As per the property 1 ^ 2 is repeating twice, so it will cancel out, remaining : 3 ^ 4 ^ 5 ^ 6
Which is our target. So if we take XOR(1 to R) ^ XOR(1 to (L-1)) we will get out XOR(L to R) in O(1).
 */
