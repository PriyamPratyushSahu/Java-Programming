package Challenges;

public class _28_MatrixMultiplication {

    int[][] inputMatix(int arr[][],int r, int c){
        System.out.println("Two 2d");
        return arr;
    }

    void displayMatrix(int arr[][]){
        for(int i = 0; i < arr)
    }
    public static void main(String[] args) 
    {
        //(int) Math.round(Math.random() * 10)
        int arr1[][];
        int arr2[][];
        int r1,c1,r2,c2;
        int i,j;

        r1 = (int) Math.round(Math.random() * 10);
        c1 = r2 =  (int) Math.round(Math.random() * 10); //To satisfy matrix multiplication condition
        c2 = (int) Math.round(Math.random() * 10);

        arr1 = new int [r1][c1];
        arr2 = new int [r2][c2];
        //First matrix
        arr1

        int A[][]={{3,5,9},{7,6,2},{4,3,5}};
        int B[][]={{1,0,0},{0,1,0},{0,0,1}};
        
        int C[][]=new int[3][3];
    
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                C[i][j]=0;
                for(int k=0;k<3;k++)
                {
                    C[i][j]=C[i][j]+A[i][k]*B[k][j];
                }
            }
        }
        
        for(int x[]:C)
        {
            for(int y:x)
            {
                System.out.print(y+" ");
            }
            System.out.println("");
        }
    
    }
    
}
