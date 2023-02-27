//Calculate sum of numbers from command line

package _0_Challenges;

public class _32_SumOfNumbers {
    public static void main(String[] args) {
        double s = 0;
        for (String x : args) {
            if (x.matches("[0-9\\.]+"))
                s = s + Double.parseDouble(x);
        }
        System.out.println("Sum is " + s);
    }

}

/*
Note get into the Online_Tutorial first
cd Online_Tutorial                        
************************** OUTPUT **************************
java Challenges._32_SumOfNumbers 1 2 3 4 5 6                                                
Sum is 21.0

java Challenges._32_SumOfNumbers 18.4 13.9 10 90.3
Sum is 132.6
 */
