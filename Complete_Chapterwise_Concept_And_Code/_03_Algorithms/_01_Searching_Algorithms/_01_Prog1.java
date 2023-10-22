/*
Linear Search: Search each and every element of the array till you find the required element.
Time Complexity: O(n)
 */
package Complete_Chapterwise_Concept_And_Code._03_Algorithms._01_Searching_Algorithms;

public class _01_Prog1 {

    Boolean linearSearch(int arr[], int key){
        for(int i: arr){
            if(i == key)
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        _01_Prog1 pp = new _01_Prog1();

        int arr[] = {1, 33, 17, 19, 75, 89, 52, 27, 63};
        int key = 75;
        System.out.println("Key: " + key);
        if(pp.linearSearch(arr, key))
            System.out.println("Key found");
        else
            System.out.println("No Key didn't found");
        
        key = 100;
        System.out.println("Key: " + key);
        if(pp.linearSearch(arr, key))
            System.out.println("Key found");
        else
            System.out.println("No Key didn't found");
    }
    
}
