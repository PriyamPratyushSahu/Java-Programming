package _0_Challenges;

public class _28_MatrixMultiplication {

    static int[][]  inputMatix(int arr[][],int r, int c){
        for(int i = 0; i < arr.length; i++) //row size -> arr2.length     
            for(int j = 0; j < arr[0].length; j++) //column size -> arr2[0].length
               arr[i][j] = 1 + (int) Math.round(Math.random() * 5);
        return arr;
    }

    static void displayMatrix(String s,int arr[][]){
        System.out.println("\n"+s);
        System.out.format("Array Size: [%d][%d]\n", arr.length,arr[0].length);
        for(int i = 0; i < arr.length; i++){
            for(int j  = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j] +" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) 
    {
        //(int) Math.round(Math.random() * 10)
        int arr1[][];
        int arr2[][];
        int r1,c1,r2,c2;
        int i,j;

        r1 = 1 + (int) Math.round(Math.random() * 5);
        c1 = r2 = 1 + (int) Math.round(Math.random() * 5); //To satisfy matrix multiplication condition
        c2 = 1 + (int) Math.round(Math.random() * 5);

        arr1 = new int [r1][c1];
        arr2 = new int [r2][c2];
        
        //First matrix
        arr1 = inputMatix(arr1,r1,c1);
        displayMatrix("First Matrix",arr1);

        //Second matrix
        arr2 = inputMatix(arr2,r2,c2);
        displayMatrix("Second Matrix",arr2);
        
        int arr3[][]=new int[r1][c2];
    
        for(i = 0 ; i < r1 ;i++){
            for(j = 0 ; j < c2 ; j++){
                arr3[i][j]=0;
                for(int k=0 ; k < r2; k++) //or k < c1
                    arr3[i][j] +=  arr1[i][k] * arr2[k][j];
            }
        }
        displayMatrix("Result Matrix",arr3);
    }
}
/*
 ************************** OUTPUT **************************
 First Matrix
Array Size: [5][6]
4 4 3 3 6 3
1 3 5 6 4 3
4 5 5 5 4 4
4 2 5 3 3 5
4 3 5 1 5 4

Second Matrix
Array Size: [6][3]
2 3 4
4 5 3
5 6 4
2 3 2
6 4 4
6 3 1

Result Matrix
Array Size: [5][3]
99 92 73
93 91 64
111 110 81
95 88 65
101 92 71
 */