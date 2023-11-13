
public class Main2 {
    public static void main(String args[]){
        DoubleLinkedList dll = new DoubleLinkedList();
        dll.append(1);
        dll.append(2);
        dll.append(13);
        dll.append(4);
        dll.append(17);
        dll.append(5);
        dll.append(29);
        dll.append(6);   

        System.out.print("Before implementing Partition List, ");
        dll.printNode();
        System.out.print("After implementing Partition List, ");
    }
}

/******************* OUTPUT  *******************
Before implementing Partition List, List is: 1 2 13 4 17 5 29 6 
After implementing Partition List, List is: 1 2 4 5 6 13 17 29 

*/