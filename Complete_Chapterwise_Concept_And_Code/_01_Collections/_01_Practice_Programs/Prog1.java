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
        sb.append(i).append(" : ").append(j.toString());
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
0 : [30, 80, 30, 60, 40, 80, 0, 100, 30, 100, 100]
1 : [81, 71, 31, 61, 11, 11, 61, 11]
2 : [22, 72, 12, 2, 92, 22, 12, 52, 2, 2, 72, 82]
3 : [23, 53, 13, 73, 13, 13, 43, 83, 93, 83, 83, 53, 3, 23, 43]
4 : [64, 44, 44, 34, 34, 14]
5 : [55, 95, 45, 55, 15, 5, 5, 95]
6 : [16, 76, 76, 26, 76, 66, 26]
7 : [57, 67, 87, 77, 87, 27, 97, 67, 57, 47]
8 : [18, 8, 58, 38, 68, 18, 68, 88, 18, 68, 88, 78, 28, 28, 28]
9 : [89, 69, 99, 29, 89, 49, 69, 69]
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