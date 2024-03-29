//Factorial: Write a recursive function to calculate the factorial of a given positive integer.
package Complete_Chapterwise_Concept_And_Code._02_Data_Structures._00_Recursion._00_LevelBasedSolutions;


public class Prog1 {

    int factorial(int n){
        System.out.println(n);
        if(n == 1)
            return 1;
        return n * factorial(n-1);
    }
    public static void main(String args[]){
        Prog1 pp = new Prog1();
        int randomNumber = 1 + (int) Math.round(Math.random() * 10);
        System.out.format("Factorial of "+ randomNumber + " is :" + pp.factorial(randomNumber));
    }
}
