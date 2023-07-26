
class Node{
    int value;
    Node next;
    Node prev;

    Node(int value){
        this.value = value;
        next = null;
        prev = null;
    }
}

public class DoubleLinkedList {
    
    private Node head;
    private Node tail;
    private int length;

    DoubleLinkedList(){
        head = null;
        tail = null;
        length = 0;
    }

    void insert(int value){
        Node dll = new Node(value);

        if(head == null){
            head = dll;
            tail = dll;
            
        }
        else{
            Node current = head;
            while(current.next != null){
                current = current.next;
            }
            current.next = dll;
            dll.prev = current;
            tail = dll;

        }
        length++;
    }

    void headValue(){
        if(head != null){
            System.out.println("Head Value: " + head.value);
        }
        else
            System.out.println("Node is empty");
    }

    void tailValue(){
        if(tail != null){
            System.out.println("Tail Value: " + tail.value);
        }
        else
            System.out.println("Node is empty");
    }

    void printNode(){
        Node current;
        if(head != null){
            System.out.print("List is: ");
            for(current = head; current != null; current = current.next){
                System.out.print(current.value + " ");
            }
            System.out.println("");
        }
    }

    void delete(int value){
        Node current = head;
        while(current != null){

            if(current.value == value){
                length--;
                if(current == head){ //...............................1. Head node
                    head = head.next;
                    if(head != null){
                        head.prev = null;
                    }
                }

                else if(current == tail){//...............................2. Tail node
                    tail = current.prev;
                    if(tail != null)
                        tail.next = null;
                }
                else{
                    current.prev.next =  current.next;
                    current.next.prev = current.prev;
                }
                System.out.println("Deleted Node Value: " + current.value);
                break;
            }
            current = current.next;
        }
        printNode();
        nodeLength();
    }

    void nodeLength(){
        System.out.println("Length of Double Linked List is: " + length);
    }

}
