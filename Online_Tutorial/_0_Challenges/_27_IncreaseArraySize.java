package _0_Challenges;

public class _27_IncreaseArraySize {
    public static void main(String[] args) {
        
        int arr1[]= new int[1 + (int) Math.round(Math.random() * 10)]; // Array size from 1 to 10;
        System.out.println("Length of A = "+arr1.length);
        for(int i = 0; i < arr1.length; i++){
            arr1[i] = (int) Math.round(Math.random() * 100);
            System.out.print(" "+ arr1[i]);
        }
            
        int arr2[]=new int[arr1.length + (int) Math.round(Math.random() * 10)];
        for(int i = 0; i < arr1.length ; i++){
            arr2[i]=arr1[i];
        }
        arr1 = arr2;
        System.out.println("\nLength of A = "+arr1.length);
    }
}

/*
************************** OUTPUT **************************
Length of A = 6
 46 88 34 25 82 55
Length of A = 7

Length of A = 5
 81 29 82 96 11
Length of A = 12
 */