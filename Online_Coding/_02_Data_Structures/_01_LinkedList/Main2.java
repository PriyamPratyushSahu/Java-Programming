package Online_Coding._02_Data_Structures._01_LinkedList;

public class Main2 {
    public static void main(String args[]){
        LinkedList ll = new LinkedList();
        ll.append(1);
        ll.append(2);
        ll.append(13);
        ll.append(4);
        ll.append(17);
        ll.append(5);
        ll.append(29);
        ll.append(6);   

        System.out.print("Before implementing Partition List, ");
        ll.printNode();
        System.out.print("After implementing Partition List, ");
        ll.partitionList(7);
    }
}

