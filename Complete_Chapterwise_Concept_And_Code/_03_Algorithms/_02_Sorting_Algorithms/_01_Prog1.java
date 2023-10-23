/*
Bubble sort: Works by swapping adjacent elements in repeated passes, 
if they are not in correctorder.
High time complexity and not suitable for large datasets
Time Complexity: O(n^2)
 */

package Complete_Chapterwise_Concept_And_Code._03_Algorithms._02_Sorting_Algorithms;

public class _01_Prog1 {

    void bubbleSort(int arr[]){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length - i - 1; j++){
                if(arr[j] > arr[j+1]){
                    //Swapping using XOR(^) operator
                    arr[j] = arr[j] ^ arr[j+1];
                    arr[j+1] = arr[j] ^ arr[j+1];
                    arr[j] = arr[j] ^ arr[j+1];
                }
            }
        }
    }

    void display(int arr[]){
        for(int i: arr)
            System.out.print(i + " ");
    }
    
    public static void main(String args[]){
        _01_Prog1 pp = new _01_Prog1();
        int arrSize = 10;
        int arr[] = new int[arrSize];
        for(int i  = 0; i < arrSize; i++)
            arr[i] = (int)(Math.round(Math.random() * 100));

        System.out.println("Array before Bubble sort");
        pp.display(arr);

        pp.bubbleSort(arr);
        System.out.println("\nArray after Bubble sort");
        pp.display(arr);
    }
}
/*
 Output
Array before Bubble sort
85 81 29 71 42 31 10 98 44 96 
Array after Bubble sort
10 29 31 42 44 71 81 85 96 98 

Array before Bubble sort
98 41 40 37 67 22 27 50 59 70 
Array after Bubble sort
22 27 37 40 41 50 59 67 70 98 
 */