/*
Binary Search: Searches for the element by comparing it with the middle item of the sorted array.
If a match occurs, index is returned, else the searching area is reduced appropriately to
either the upper half or lower half of the array.
Note: The array must be sorted
Time Complexity: O(log2n)
 */

package Complete_Chapterwise_Concept_And_Code._03_Algorithms._01_Searching_Algorithms;

import java.util.Arrays;

public class _02_Prog2 {
    
    Boolean binarySearch(int arr[], int key){
        int i = 0;
        int j = arr.length - 1;
    
        while(i <= j){
            int mid = (i+j)/2; // Calculate the middle index
            if(arr[mid] == key)
                return true; // Key found
            else if(arr[mid] > key )
                j = --mid; // Reduce search range to the lower half
            else
                i = ++mid; // Reduce search range to the upper half
        }

        return false; // Key not found
    }
    public static void main(String[] args) {
        _02_Prog2 pp = new _02_Prog2();

        int arr[] = {85, 81, 29, 71, 42, 31, 10, 98, 44, 96};
        
        Arrays.sort(arr); // Sort the array in ascending order
        System.out.println("Sorted Array: " + Arrays.toString(arr));

        int key = 31;
        System.out.println("Key: " + key);
        if(pp.binarySearch(arr, key))
            System.out.println("Key Value found");
        else
            System.out.println("Key Value not found");
        
        key = 100;
        System.out.println("Key: " + key);
        if(pp.binarySearch(arr, key))
            System.out.println("Key Value found");
        else
            System.out.println("Key Value not found");
    }
}

/*
 Output
Sorted Array: [10, 29, 31, 42, 44, 71, 81, 85, 96, 98]
Key: 31
Key Value found
Key: 100
Key Value not found

 */
