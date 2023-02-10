package Numbers;

public class RandomNumber {

    public static void main(String args[]){

        int n = 100;
        System.out.println("Random number between 1 to " + n + ": " + Math.round(Math.random() * n));
        while(true)
        {
            int k = (int) Math.round(Math.random()*n);
            System.out.println("Random number between 1 to "+ n + ": " + k);
            if(k == 11) break;
        }
    }
}
