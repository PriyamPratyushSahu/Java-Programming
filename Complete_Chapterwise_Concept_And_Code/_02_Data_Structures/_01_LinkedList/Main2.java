package Complete_Chapterwise_Concept_And_Code._02_Data_Structures._01_LinkedList;

public class Main2 {
    public static void main(String[] args) {

        LinkedList ll = new LinkedList();
        ll.append(10);
        ll.append(80);
        ll.append(20);
        ll.append(40);
        ll.append(60);
        ll.append(50);
        ll.append(30);

        System.out.format("Before implementing Partition List(%d), ",55);
        ll.printNode();
        System.out.format("After implementing Partition List(%d), ",55);
        ll.partitionList(55);
    }
}

/******************* OUTPUT  *******************
Before implementing Partition List(55), List is: 10 80 20 40 60 50 30 
After implementing Partition List(55), List is: 10 20 40 50 30 80 60
*/