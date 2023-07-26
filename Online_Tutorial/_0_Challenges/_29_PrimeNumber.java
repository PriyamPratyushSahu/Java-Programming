//To check whether a number is prime or not

package _0_Challenges;

public class _29_PrimeNumber {

    static boolean isPrime(int n)
    {
        for(int i=2;i<n/2;i++)
        {
            if(n%i==0)
                return false;
        }
        return true;
        
    }

    public static void main(String args[]){
        for(int i = 1; i <= 10; i++){
            int n = (int) Math.round(Math.random() * 100);
            if(isPrime(n))
                System.out.format("%d is a prime number\n",n );
            else
                System.out.format("%d is not a prime number\n",n );
        }
        
    }
    
}
/*
************************** OUTPUT **************************
26 is not a prime number
64 is not a prime number
24 is not a prime number
77 is not a prime number
84 is not a prime number
69 is not a prime number
91 is not a prime number
84 is not a prime number
73 is a prime number
32 is not a prime number


61 is a prime number
7 is a prime number
3 is a prime number
42 is not a prime number
55 is not a prime number
36 is not a prime number
35 is not a prime number
46 is not a prime number
70 is not a prime number
25 is not a prime number
 */
