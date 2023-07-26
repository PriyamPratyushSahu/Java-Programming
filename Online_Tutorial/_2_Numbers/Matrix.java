//Write a program to find minimum number from the matrix

package _2_Numbers;

public class Matrix {


    public static void main(String args[]){
        int mat[][] = new int[3][3];
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                mat[i][j] = (int)Math.round(Math.random()*100);
            }
        }
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++)
                System.out.print(" " + mat[i][j]);
            System.out.println();
        }

        int min = mat[0][0];

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++)
                min = (min > mat[i][j]) ? mat[i][j] : min;
            System.out.println();
        }

        System.out.println("Minimum number from the matrix: "+ min);

    }



}
