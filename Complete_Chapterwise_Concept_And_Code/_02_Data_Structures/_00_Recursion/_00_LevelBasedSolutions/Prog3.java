//Sum of Digits: Write a recursive function to find the sum of the digits of a positive integer.
package Complete_Chapterwise_Concept_And_Code._02_Data_Structures._00_Recursion._00_LevelBasedSolutions;

public class Prog3 {

    int sumOfDigits(int n){
        int returnValue = 0;
        if(n > 0)
        returnValue =  (n%10) + sumOfDigits(n/10);
        return returnValue;
    }
    public static void main(String[] args) {
        Prog3 pp = new Prog3();
        int n = (int)Math.round(Math.random() * 1000);
        System.out.format("Sum of digits of %d is: %d",n,pp.sumOfDigits(n));
    }
    
}
