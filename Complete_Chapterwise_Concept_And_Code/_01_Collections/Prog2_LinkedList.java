/*
    Linked List
        1. add(element) 
        2. add(int Index, element)
        3. remove(int Index)
        4. addAll(Collection)
        5. addAll(int Index, Collection); 
        6. contains(element)
        7. get(int Index)
        8. set(int Index,element)
        9. listIterator()
        10.listIterator(int Index)
 */ 

package Complete_Chapterwise_Concept_And_Code._01_Collections;
import java.util.*;
public class Prog2_LinkedList {

    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        LinkedList<Integer> linkedList2 = new LinkedList<>(List.of(50, 60, 70, 80, 90));
        LinkedList<Integer> linkedList3 = new LinkedList<>(List.of(2, 4, 6, 8, 10));

        linkedList.add(10);
        System.out.println(linkedList); //[10]

        linkedList.addFirst(5);
        System.out.println(linkedList); //[5, 10]

        linkedList.addLast(20);
        System.out.println(linkedList); //[5, 10, 20]

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
