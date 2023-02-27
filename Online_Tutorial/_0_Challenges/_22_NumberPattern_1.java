
package _0_Challenges;


public class _22_NumberPattern_1{
    
    public static void main(String[] args) {
        for(int i=1;i<=5;i++)
        {
            for (int j = 1; j <= 5; j++) {
                System.out.print(i + j + " ");
            }
            System.out.println("");
        }
        
        // Count the total time of loop
        System.out.println("\nCount the total time of loop: \n");

        int count=0;
        
      for(int i=1;i<=5;i++){
          for (int j = 1; j <= 5; j++) {
              count++;
            System.out.format("%02d ",count);
          }
          System.out.println("");
      }
    }
}

/*
 ************************** OUTPUT **************************
2 3 4 5 6 
3 4 5 6 7
4 5 6 7 8
5 6 7 8 9
6 7 8 9 10

Count the total time of loop:

01 02 03 04 05 
06 07 08 09 10
11 12 13 14 15
16 17 18 19 20
21 22 23 24 25
 */


