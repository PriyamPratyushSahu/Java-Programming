// Write a program to take few numbers as input and display all the numbers into a catagory having same last digit.

package Complete_Chapterwise_Concept_And_Code._01_Collections._01_Practice_Programs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class Prog1 {

    HashMap<Integer,ArrayList<Integer>> mapList = new HashMap<>();

    void enterData(int val){
        if(mapList.containsKey(val % 10)){
            mapList.get(val % 10).add(val);
        }
        else{
            ArrayList<Integer> i = new ArrayList<>();
            i.add(val);
            mapList.put(val % 10, i);
        }
    }

    public String toStringMapList(int i, ArrayList<Integer> j){
        StringBuilder sb = new StringBuilder();
        sb.append(i).append(" : [ ");
        int a;
        for( a = 0; a < j.size() -1 ; a++){
            sb.append(j.get(a)).append(", ");
        }
        if(a == j.size() - 1)
            sb.append(j.get(a));
        sb.append("]");
        return sb.toString();
    }

    void displayMapList(){
        Set<Integer> keys = mapList.keySet();
        for(Integer i : keys){
            System.out.println(toStringMapList(i,mapList.get(i)));
        }
    }

    public static void main(String[] args) {
        Prog1 ps = new Prog1();
        int n = 100;
        for(int i = 0 ; i < n; i++) {
            ps.enterData((int)Math.round(Math.random() * 100));
        }
        System.out.println("Number of input: " + n);
        ps.displayMapList();
    }
}

/**
 ************************** OUTPUT **************************
 Number of input: 100
 0 : [ 30, 70, 40, 40, 70, 20, 90, 80, 30, 60]
 1 : [ 21, 1, 11, 21, 1, 81]
 2 : [ 82, 32, 22, 12, 82, 92, 12, 2, 72, 12, 12, 42]
 3 : [ 43, 13, 63, 3, 53, 33, 93, 63, 83, 73, 23, 23]
 4 : [ 64, 44, 64, 94, 84, 54, 4, 34, 94, 74, 94, 14]
 5 : [ 65, 55, 75, 65, 35]
 6 : [ 26, 96, 46, 96, 6, 86, 46, 36, 86]
 7 : [ 67, 27, 37, 67, 27, 27, 67, 17, 57, 27, 47, 87]
 8 : [ 38, 68, 8, 58, 48, 68, 58, 68, 8, 38, 18, 28, 48, 38]
 9 : [ 39, 69, 99, 19, 59, 59, 59, 29]
 */

/**
 Time and space complexity:

 Time Complexity:
 1. Entering Data (enterData method):

 The containsKey check takes O(1) time on average.
 Accessing the ArrayList with get and adding an element to it also takes O(1) time on average.
 If the key is not present, creating a new ArrayList and putting it into the map also takes O(1) time.
 Therefore, the time complexity of enterData is O(1) on average.
 2. Displaying Data (displayMapList method):

 Iterating over the keys takes O(n), where n is the number of distinct keys.
 For each key, accessing the ArrayList and printing its elements takes O(m), where m is the average size of the ArrayList for that key.
 Therefore, the time complexity of displayMapList is O(n * m), where n is the number of distinct keys and m is the average size of the ArrayList.
 Main Method:

 3. Generating and entering n random numbers in the range 0 to 100 in the map takes O(n) time.

 Space Complexity:
 HashMap (mapList):
 The space complexity for the HashMap is O(n * m), where n is the number of distinct keys and m is the average size of the ArrayList.
 ArrayLists:
 The space complexity for ArrayLists is O(n), where n is the total number of elements stored in all ArrayLists.

 Overall:
 The overall time complexity of the main loop is O(n + n * m) due to entering and displaying data.
 The overall space complexity is O(n * m) due to the storage of numbers in the ArrayLists within the HashMap.
 Note: These analyses assume average-case performance for HashMap operations and may vary based on the specific behavior of the hash function and the quality of the hash codes for the keys.
 */