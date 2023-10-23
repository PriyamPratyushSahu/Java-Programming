package Complete_Chapterwise_Concept_And_Code._03_Algorithms._02_Sorting_Algorithms;

import java.util.Arrays;

public class _02_Prog2 {

    void selectionSort(int arr[]){
        for(int i = 0; i < arr.length; i++){
            for(int j = i+1; j <= arr.length - 1; j++){
                if(arr[i] > arr[j]){
                    //Swapping using XOR(^) operator
                    arr[i] = arr[i] ^ arr[j];
                    arr[j] = arr[i] ^ arr[j];
                    arr[i] = arr[i] ^ arr[j];
                }
            }
        }
    }

    void display(int arr[]){
            System.out.println(Arrays.toString(arr));
    }
    
    public static void main(String args[]){
        _02_Prog2 pp = new _02_Prog2();
        int arrSize = 10;
        int arr[] = new int[arrSize];
        for(int i  = 0; i < arrSize; i++)
            arr[i] = (int)(Math.round(Math.random() * 100));

        System.out.println("Array before Selection sort");
        pp.display(arr);

        pp.selectionSort(arr);
        System.out.println("\nArray after Selection sort");
        pp.display(arr);
    }
}
/*
 Output
Array before Selection sort
[52, 38, 13, 82, 94, 96, 17, 43, 80, 73]

Array after Selection sort
[13, 17, 38, 43, 52, 73, 80, 82, 94, 96]


Array before Selection sort
[13, 54, 61, 36, 41, 0, 69, 55, 30, 52]

Array after Selection sort
[0, 13, 30, 36, 41, 52, 54, 55, 61, 69]
 */