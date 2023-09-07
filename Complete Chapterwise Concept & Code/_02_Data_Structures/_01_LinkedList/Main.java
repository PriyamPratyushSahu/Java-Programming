package Online_Coding._02_Data_Structures._01_LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();

        LinkedList ll = new LinkedList();
        ll.append(10);
        ll.append(20);
        ll.append(30);
        ll.append(40);
        ll.append(50);
        ll.append(60);
        ll.append(80);

        ll.printNode(); // List is: 10 20 30 40 50 60 80 
        ll.headValue(); //Head Value: 10
        ll.tailValue(); //Tail Value: 80
        ll.nodeLength(); //Length of Single Linked List is: 7

        System.out.println("30 is present in the list: "+ll.search(30)); //30 is present in the list: true
        System.out.println("35 is present in the list: "+ll.search(35)); //35 is present in the list: false

        ll.reverseLinkedList(); // Reversed List is: 80 60 50 40 30 20 10

        ll.deleteHeadValue();
        //Deleted Node Value: 10
        //List is: 20 30 40 50 60 80
        //Length of Single Linked List is: 6

        ll.deleteTailValue();
        //Deleted Node Value: 80
        //List is: 20 30 40 50 60
        //Length of Single Linked List is: 5

        ll.deleteValue(50);
        //Deleted Node Value: 50
        //List is: 20 30 40 60
        //Length of Single Linked List is: 4

        ll.deleteHeadValue();
        //Deleted Node Value: 20
        // List is: 30 40 60
        // Length of Single Linked List is: 3

        ll.deleteTailValue();
        // Deleted Node Value: 60
        // List is: 30 40
        // Length of Single Linked List is: 2

        ll.updateNode(1, 11); //List is: 11 40

        ll.insertNode(2, 100); 
        // List is: 11 40 100
        //Length of Single Linked List is: 3

        ll.deleteHeadValue();
        // Deleted Node Value: 11
        // List is: 40 100
        // Length of Single Linked List is: 2

        ll.deleteHeadValue();
        // Deleted Node Value: 40
        // List is: 100
        // Length of Single Linked List is: 1

        ll.deleteHeadValue();
        //Deleted Node Value: 100
        //Node is empty

        ll.insertNode(1, 121);
        //List is: 121
        //Length of Single Linked List is: 1
        

        linkedList.removeDuplicates();
        System.out.println("Over");
    }
}

