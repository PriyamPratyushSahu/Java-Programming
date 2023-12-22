//Fibonacci Sequence: Write a recursive function to calculate the nth term of the Fibonacci sequence.
package Complete_Chapterwise_Concept_And_Code._02_Data_Structures._00_Recursion._00_LevelBasedSolutions;

import java.util.Scanner;

public class Prog2 {

    int fibonacci(int term, int prev, int latest){
        if(term == 0)
            return 0;
        else if(term == 1)
            return 1;
        else{
            System.out.print(prev + " ");
            return prev + fibonacci(term - 1, latest, prev + latest);
        }

    }

    public static void main(String[] args) {
        Scanner pp = new Scanner(System.in);
        Prog2 pr = new Prog2();
        int n;

        System.out.println("Enter the value of n: ");
        n = pp.nextInt();
        pp.close();
        System.out.print("Fibonacci Series: ");
        System.out.println(pr.fibonacci(n, 0, 1));
    }
}
