
package _0_Challenges;


public class _23_NumberPattern_2{
    
    public static void main(String[] args) {
        for(int i=1;i<=5;i++)
        {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println("");
        }

        // Count the total time of loop
        System.out.println("\nCount the total time of loop: \n");
        
        int count=0;
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                count++;
                System.out.print(count+" ");
            }
            System.out.println("");
        }
    }
}

/*
 ************************** OUTPUT **************************

1 
1 2
1 2 3
1 2 3 4
1 2 3 4 5

Count the total time of loop:

1
2 3
4 5 6
7 8 9 10
11 12 13 14 15

 */