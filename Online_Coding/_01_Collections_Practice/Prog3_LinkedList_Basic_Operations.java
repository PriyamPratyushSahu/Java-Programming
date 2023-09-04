/*
    Linked List
        1. Add element in the beginning
        2. Add element in the end
        3. Add element in between
        4. Delete element from the front
        5. Delete element from the end
        6. Delete element in between
        7. Searching in Linked List
        8. Traverse
 */ 

package Online_Coding._01_Collections_Practice;
import java.util.*;
public class Prog3_LinkedList_Basic_Operations {

    //Case 1
    void addElementToFront(LinkedList<Integer> ll,int val){
        ll.addFirst(val);
        displayLinkedList(ll);
    }
    //Case 2
    void addElementToEnd(LinkedList<Integer> ll,int val){
        ll.addLast(val);
        displayLinkedList(ll);
    }
    //Case 3
    void addElementInBetween(LinkedList<Integer> ll,int val,int pos){
        if (pos >= 0 && pos <= ll.size()) {
            ll.add(pos,val);
            displayLinkedList(ll);    
        } 
        else {
            System.out.println("Invalid position\nSize of LinkedList is: "+ ll.size()+"\nElement cannot be added at position " + pos);
        }       
    }
    //Case 4
    void deleteElementFromFront(LinkedList<Integer> ll){
        if(!isLinkedListEmpty(ll)){
            System.out.println("Deleted value: " + ll.removeFirst());
            displayLinkedList(ll);
        }
    }
    //Case 5
    void deleteElementFromLast(LinkedList<Integer> ll){
        if(!isLinkedListEmpty(ll)){
            System.out.println("Deleted value: " + ll.removeLast());
            displayLinkedList(ll);
        }
    }
    //Case 6
    void deleteElementInBetween(LinkedList<Integer> ll, int pos){
        if(!isLinkedListEmpty(ll))
            if (pos >= 0 && pos <= ll.size()) {
                System.out.println("Deleted value: " + ll.remove(pos));
                displayLinkedList(ll);
            } 
            else 
                System.out.println("Invalid position\nSize of LinkedList is: "+ ll.size()+"\nElement cannot be deleted at position " + pos);        
    }
    //Case 7
    void findElementFromList(LinkedList<Integer> ll, int val){
        if(!isLinkedListEmpty(ll)){
            if(ll.contains(val))
                System.out.println("Found at position "+ ll.indexOf(val));
            else
                System.out.println("Sorry not found");
        }
    }
    void displayLinkedList(LinkedList<Integer> ll){
        if(!isLinkedListEmpty(ll)){
            System.out.print("The Linked List is:");
            for(Integer element: ll)
            System.out.print(" "+element);
        }
    }

    Boolean isLinkedListEmpty(LinkedList<Integer> ll){
        Boolean b = false;
        if (ll.isEmpty()) {
            System.out.println("! ! ! !Linked List is empty ! ! ! !");
            b = true;
        }
        return b;
    }

    public static void main(String[] args) {

        LinkedList<Integer> ll = new LinkedList<>();
        Prog3 pp = new Prog3();
        int ch,val,pos;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.print("\nEnter\n1 Add element in the beginning\n2 Add element in the end\n3 Add element in between\n4 Delete element from the front\n5 Delete element from the end\n6 Delete element in between\n7 Searching in Linked List\n8 Traverse\nEnter Your Choice: ");
            ch = sc.nextInt();
            System.out.println();
            switch(ch){
                case 1: 
                System.out.println("Enter a value: ");
                val = sc.nextInt();
                pp.addElementToFront(ll, val);
                break;
                case 2: 
                System.out.println("Enter a value: ");
                val = sc.nextInt();
                pp.addElementToEnd(ll, val);
                break;
                case 3: 
                System.out.println("Enter a value: ");
                val = sc.nextInt();
                System.out.println("Enter postion: ");
                pos = sc.nextInt();
                pp.addElementInBetween(ll, val, pos);
                break;
                case 4: pp.deleteElementFromFront(ll); break;
                case 5: pp.deleteElementFromLast(ll); break;
                case 6: 
                System.out.println("Enter postion: ");
                pos = sc.nextInt();
                pp.deleteElementInBetween(ll, pos);
                break;
                case 7: 
                System.out.println("Enter value to search: ");
                val = sc.nextInt();
                pp.findElementFromList(ll, val);
                break;
                case 8:
                pp.displayLinkedList(ll);
                break;
                default: 
                System.out.println("Wrong Choice");
            }
            System.out.println("\nPress 1 to continue or 0 to terminate");
            ch = sc.nextInt();
        }while(ch == 1);
        sc.close();
    }
}

/*
 *********************************** OUTPUT ***********************************
Enter
1 Add element in the beginning
2 Add element in the end
3 Add element in between
4 Delete element from the front
5 Delete element from the end
6 Delete element in between
7 Searching in Linked List
8 Traverse
Enter Your Choice: 1

Enter a value:
1
The Linked List is: 1
Press 1 to continue or 0 to terminate
1

Enter
1 Add element in the beginning
2 Add element in the end
3 Add element in between
4 Delete element from the front
5 Delete element from the end
6 Delete element in between
7 Searching in Linked List
8 Traverse
Enter Your Choice: 1

Enter a value:
2
The Linked List is: 2 1
Press 1 to continue or 0 to terminate
1

Enter
1 Add element in the beginning
2 Add element in the end
3 Add element in between
4 Delete element from the front
5 Delete element from the end
6 Delete element in between
7 Searching in Linked List
8 Traverse
Enter Your Choice: 1

Enter a value:
3
The Linked List is: 3 2 1
Press 1 to continue or 0 to terminate
1

Enter
1 Add element in the beginning
2 Add element in the end
3 Add element in between
4 Delete element from the front
5 Delete element from the end
6 Delete element in between
7 Searching in Linked List
8 Traverse
Enter Your Choice: 2

Enter a value:
4
The Linked List is: 3 2 1 4
Press 1 to continue or 0 to terminate
1

Enter
1 Add element in the beginning
2 Add element in the end
3 Add element in between
4 Delete element from the front
5 Delete element from the end
6 Delete element in between
7 Searching in Linked List
8 Traverse
Enter Your Choice: 2

Enter a value:
5
The Linked List is: 3 2 1 4 5
Press 1 to continue or 0 to terminate
1

Enter
1 Add element in the beginning
2 Add element in the end
3 Add element in between
4 Delete element from the front
5 Delete element from the end
6 Delete element in between
7 Searching in Linked List
8 Traverse
Enter Your Choice: 3

Enter a value:
6
Enter postion:
3
The Linked List is: 3 2 1 6 4 5
Press 1 to continue or 0 to terminate
1

Enter
1 Add element in the beginning
2 Add element in the end
3 Add element in between
4 Delete element from the front
5 Delete element from the end
6 Delete element in between
7 Searching in Linked List
8 Traverse
Enter Your Choice: 4

Deleted value: 3
The Linked List is: 2 1 6 4 5
Press 1 to continue or 0 to terminate
1

Enter
1 Add element in the beginning
2 Add element in the end
3 Add element in between
4 Delete element from the front
5 Delete element from the end
6 Delete element in between
7 Searching in Linked List
8 Traverse
Enter Your Choice: 5

Deleted value: 5
The Linked List is: 2 1 6 4
Press 1 to continue or 0 to terminate
1

Enter
1 Add element in the beginning
2 Add element in the end
3 Add element in between
4 Delete element from the front
5 Delete element from the end
6 Delete element in between
7 Searching in Linked List
8 Traverse
Enter Your Choice: 6

Enter postion:
6
Invalid position
Size of LinkedList is: 4
Element cannot be deleted at position 6

Press 1 to continue or 0 to terminate
1

Enter
1 Add element in the beginning
2 Add element in the end
3 Add element in between
4 Delete element from the front
5 Delete element from the end
6 Delete element in between
7 Searching in Linked List
8 Traverse
Enter Your Choice: 6

Enter postion:
2
Deleted value: 6
The Linked List is: 2 1 4
Press 1 to continue or 0 to terminate
1

Enter
1 Add element in the beginning
2 Add element in the end
3 Add element in between
4 Delete element from the front
5 Delete element from the end
6 Delete element in between
7 Searching in Linked List
8 Traverse
Enter Your Choice: 7

Enter value to search:
12
Sorry not found

Press 1 to continue or 0 to terminate
1

Enter
1 Add element in the beginning
2 Add element in the end
3 Add element in between
4 Delete element from the front
5 Delete element from the end
6 Delete element in between
7 Searching in Linked List
8 Traverse
Enter Your Choice: 7

Enter value to search:
1
Found at position 1

Press 1 to continue or 0 to terminate
1

Enter
1 Add element in the beginning
2 Add element in the end
3 Add element in between
4 Delete element from the front
5 Delete element from the end
6 Delete element in between
7 Searching in Linked List
8 Traverse
Enter Your Choice: 8

The Linked List is: 2 1 4
Press 1 to continue or 0 to terminate
0
 */

