/*
Question: You are given a number N. Find the total number of setbits in the numbers from 1 to N.

Example 1:

Input: N = 3
Output: 4
Explaination: 
1 -> 01, 2 -> 10 and 3 -> 11. 
So total 4 setbits.
Example 2:

Input: N = 4
Output: 5
Explaination: 1 -> 01, 2 -> 10, 3 -> 11 
and 4 -> 100. So total 5 setbits.
Your Task:
You do not need to read input or print anything. Your task is to complete the function countBits() which takes N as input parameter and returns the total number of setbits upto N.

Given code:
Example 1:

Input: N = 3
Output: 4
Explaination: 
1 -> 01, 2 -> 10 and 3 -> 11. 
So total 4 setbits.
Example 2:

Input: N = 4
Output: 5
Explaination: 1 -> 01, 2 -> 10, 3 -> 11 
and 4 -> 100. So total 5 setbits.
Your Task:

class Solution {
    public static long countBits(long N) {
        // code here        
    }
}
*/

/**
// Optimal Solution
class Solution {
    public static long countBits(long N) {
        // code here
        long i,count = 0;
        
          for( i=1;i<=N;i++)
        {
            count += Long.bitCount(i);
        }
        return count;
    }

}

//Non-optimal solution
class QsSolution {
    public static long countBits(long N) {
        // code here
        long i,count = 0,dup;
        
        for(i = 1,count = 0; i <= N; i++){
            dup = i;
            while(dup != 0){
            if(dup % 2 == 1)
                count++;
            dup = dup/2;
            }
        }
        return count;
    }
}
*/
class Prog1{
    // Optimal Solution
        long countBits(long N) {
            long i,count = 0;
            for( i=1;i<=N;i++){
                count += Long.bitCount(i);
            }
            return count;
        }

    //Non-optimal solution
        long countBits2(long N) {
            long i,count = 0,dup;
            for(i = 1,count = 0; i <= N; i++){
                dup = i;
                while(dup != 0){
                if(dup % 2 == 1)
                    count++;
                dup = dup/2;
                }
            }
            return count;
        }
    
    public static void main(String args[]){

        Prog1 obj = new Prog1();
        long k = (long) Math.round(Math.random() * 100);
        System.out.format("Number: %d\n",k);
        System.out.format("Total number of setbits in the numbers from 1 to %d: %d",k,obj.countBits(k));
    }  
}

/*
 *********************************** OUTPUT ***********************************
 Number: 27
Total number of setbits in the numbers from 1 to 27: 64

Number: 52
Total number of setbits in the numbers from 1 to 52: 143

Number: 75
Total number of setbits in the numbers from 1 to 75: 224
 */

