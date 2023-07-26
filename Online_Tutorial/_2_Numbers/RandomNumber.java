package _2_Numbers;

public class RandomNumber {

    public static void main(String args[]){

        int n = 100;
        System.out.println("Random number between 1 to " + n + ": " + Math.round(Math.random() * n));
        while(true)
        {
            int k = (int) Math.round(Math.random() * n);
            System.out.println("Random number between 1 to " + n + ": " + k);
            if (k == 11)
                break;
        }
        /*
         Random number between 1 to 100: 34
         Random number between 1 to 100: 47
         Random number between 1 to 100: 87
         Random number between 1 to 100: 50
         Random number between 1 to 100: 66
         Random number between 1 to 100: 98
         Random number between 1 to 100: 75
         Random number between 1 to 100: 13
         */
        
        
        while (true) {
            n = (int) Math.round(Math.random() * 20);
            if (n == 20) {
                System.out.println("Match Found");
                System.exit(0);
            } else
                System.out.println(n + "! ! ! ! Try again ! ! ! !");
        }
        /*
         4! ! ! ! Try again ! ! ! !
         3! ! ! ! Try again ! ! ! !
         2! ! ! ! Try again ! ! ! !
         7! ! ! ! Try again ! ! ! !
         17! ! ! ! Try again ! ! ! !
         13! ! ! ! Try again ! ! ! !
         Match Found
         */
    }
}
