
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
        dll.append(7);   

        System.out.format("Before implementing Partition List(%d), ",6);
        dll.printNode();
        System.out.format("After implementing Partition List(%d), ",6);
        dll.partitionList(6);    
    }
}

/******************* OUTPUT  *******************
Before implementing Partition List(6), List is: 1 2 13 4 17 5 29 7 
After implementing Partition List(6), List is: 1 2 4 5 13 17 29 7
*/