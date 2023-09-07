package Complete_Chapterwise_Concept_And_Code._01_Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.LinkedList;

public class Prog0 {
    public static void main(String args[]) {

        //Arraylist

        List<Integer> arList = new ArrayList<>(20);
        List<Integer> arList2 = new ArrayList<>(List.of(50, 60, 70, 80, 90));

        arList.add(10);
        System.out.println(arList); // [10]

        arList.add(0, 5);
        System.out.println(arList); // [5, 10]

        arList.add(20);
        System.out.println(arList); // [5, 10, 20]

        arList.remove(2);
        System.out.println(arList); // [5, 10]

        arList.add(20);
        System.out.println(arList); // [5, 10, 20]
        arList.remove(Integer.valueOf(20));
        System.out.println(arList); // [5, 10]
        arList.addAll(arList2);
        System.out.println(arList); // [5, 10, 50, 60, 70, 80, 90]

        //Linked List
        
        List<Integer> linkedList = new LinkedList<>(List.of(50, 60, 70, 80, 90));
        List<Integer> linkedList2 = new LinkedList<>(List.of(50, 60, 70, 80, 90));
        List<Integer> linkedList3 = new LinkedList<>(List.of(2, 4, 6, 8, 10));


        linkedList.add(10);
        System.out.println(linkedList); //[10]

        //Note:
        // The method addFirst(int) is undefined for the type List<Integer>
        // The method addLast(int) is undefined for the type List<Integer>

        linkedList.remove(2);
        System.out.println(linkedList); //[5, 10]

        linkedList.addAll(linkedList2);
        System.out.println(linkedList); //[5, 10, 50, 60, 70, 80, 90]

        linkedList.addAll(1, linkedList3);
        System.out.println(linkedList); //[5, 2, 4, 6, 8, 10, 10, 50, 60, 70, 80, 90]

        System.out.println("Is 50 there in the list: " + linkedList.contains(50)); // Is 50 there in the list: true
        System.out.println("Is 25 there in the list: " + linkedList.contains(25)); // Is 25 there in the list: false

        System.out.println(linkedList.get(5)); // 10

        linkedList.set(6, 100);
        System.out.println(linkedList); //[5, 2, 4, 6, 8, 10, 100, 50, 60, 70, 80, 90]

        ListIterator<Integer> liIt = linkedList.listIterator();
        while (liIt.hasNext()) {
            System.out.print(" " + liIt.next()); // 5 2 4 6 8 10 100 50 60 70 80 90
        }
        System.out.println();

        ListIterator<Integer> liIt2 = linkedList.listIterator(5);
        while (liIt2.hasNext()) {
            System.out.print(" " + liIt2.next()); // 10 100 50 60 70 80 90
        }
        System.out.println();
        

        

    }
}
