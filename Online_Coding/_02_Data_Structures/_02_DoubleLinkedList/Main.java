

public class Main {

    public static void main(String args[]){

        DoubleLinkedList dll = new DoubleLinkedList();
        int size = 1 + (int)Math.round(Math.random() * 10);

        for(int i = 1; i<= size; i++)
        dll.append((int)Math.round(Math.random() * 30));

        dll.printNode();
        dll.headValue();
        dll.tailValue();
        dll.nodeLength();

        java.util.Scanner pp = new java.util.Scanner(System.in);
        System.out.println("Enter value to be deleted: ");
        int delVal = pp.nextInt();
        dll.delete(delVal);

        pp.close();
    }

    
    
}
