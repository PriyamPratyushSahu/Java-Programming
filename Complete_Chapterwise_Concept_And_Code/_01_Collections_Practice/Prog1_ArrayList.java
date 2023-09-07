/*
    ArrayList and Iterator
        1. add(element) 
        2. add(int Index, element)
        3. remove(int Index)
        4. remove(Integer.valueOf(n))
        5. addAll(Collection)
        6. addAll(int Index, Collection); 
        7. contains(element)
        8. get(int Index)
        9. set(int Index,element)
        10.listIterator()
        11.listIterator(int Index)
 */ 

package Complete_Chapterwise_Concept_And_Code._01_Collections_Practice;
import java.util.*;
public class Prog1_ArrayList {

    public static void main(String args[]){
        ArrayList<Integer> arList = new ArrayList<Integer>(20);
        ArrayList<Integer> arList2 = new ArrayList<>(List.of(50,60,70,80,90));
        ArrayList<Integer> arList3 = new ArrayList<>(List.of(2,4,6,8,10));

        arList.add(10); 
        System.out.println(arList); //[10]

        arList.add(0,5);  
        System.out.println(arList); //[5, 10]

        arList.add(20);
        System.out.println(arList); //[5, 10, 20]

        arList.remove(2);
        System.out.println(arList); //[5, 10]

        arList.add(20);
        System.out.println(arList); //[5, 10, 20]
        arList.remove(Integer.valueOf(20));
        System.out.println(arList); //[5, 10]
        arList.addAll( arList2); 
        System.out.println(arList); //[5, 10, 50, 60, 70, 80, 90]

        arList.addAll(1,arList3); 
        System.out.println(arList); // [5, 2, 4, 6, 8, 10, 10, 50, 60, 70, 80, 90]
        System.out.println("Is 50 there in the list: "+ arList.contains(50)); // Is 50 there in the list: true
        System.out.println("Is 25 there in the list: "+ arList.contains(25)); // Is 25 there in the list: false

        System.out.println(arList.get(5)); // 10

        arList.set(6,100);
        System.out.println(arList); // [5, 2, 4, 6, 8, 10, 100, 50, 60, 70, 80, 90]

        ListIterator<Integer> liIt = arList.listIterator();
        while(liIt.hasNext()){
            System.out.print(" "+ liIt.next()); // 5 2 4 6 8 10 100 50 60 70 80 90
        }
        System.out.println();
        ListIterator<Integer> liIt2 = arList.listIterator(5);
        while(liIt2.hasNext()){
            System.out.print(" "+ liIt2.next()); // 10 100 50 60 70 80 90
        }
    }
    
}
