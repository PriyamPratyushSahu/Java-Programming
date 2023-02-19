
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
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=i;j++)
            {
                count++;
                System.out.print(count+" ");
            }
            System.out.println("");
        }
    }
}

/*
 ************************** OUTPUT **************************

 */