//Factorial: Write a recursive function to calculate the factorial of a given positive integer.
package Online_Coding.Recursion;


public class Prog1 {

    int factorial(int n){
        System.out.println(n);
        if(n == 1)
            return 1;
        return n * factorial(n-1);
    }
    public static void main(String args[]){
        Prog1 pp = new Prog1();
        int randomNumber = 1 + (int) Math.round(Math.random() * 20);
        System.out.format("Factorial of "+ randomNumber + " is :" + pp.factorial(randomNumber));
    }
}
