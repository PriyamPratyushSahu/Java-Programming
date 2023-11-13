
/*
 List of operations:
    1. append(): insert value to linked list
    2. headValue(): to display the head node value
    3. tailValue(): to display the tail node value
    4. printNode(): to display the complete list
    5. nodeLength(): to display length of the list
    6. deleteHeadValue(): to delete the head node
    7. deleteTailValue(): to delete the tail node
    8. deleteValue(): to delete the given node
    9. updateNode(): to update node value at specific position
    10.insertNode(): to insert a node at specific position
    11. serach(): to search a given value in the linked list
    12.reverseLinkedlist(): to reverse the linked list
    13.partitionList(): takes an integer "x" as input and rearranges the linked list in such a way that all nodes with values less than "x" come before nodes with values greater than or equal to "x".
    14.removeDuplicates(): remove duplicate values from the node
 */

class Node {
    int value;
    Node next;
    Node prev;

    Node(int value) {
        this.value = value;
        next = null;
        prev = null;
    }
}

public class DoubleLinkedList {

    private Node head;
    private Node tail;
    private int length;

    DoubleLinkedList() {
        head = null;
        tail = null;
        length = 0;
    }

    // Append(), insert value to linked list-------------------------------------1
    void append(int value) {
        Node dll = new Node(value);

        if (head == null) {
            head = dll;
            tail = dll;

        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = dll;
            dll.prev = current;
            tail = dll;

        }
        length++;
    }

    // headValue(),to display the head node value--------------------------------2
    void headValue() {
        if (head != null) {
            System.out.println("Head Value: " + head.value);
        } else
            System.out.println("Node is empty");
    }

    // tailValue(),to display the tail node value--------------------------------3
    void tailValue() {
        if (tail != null) {
            System.out.println("Tail Value: " + tail.value);
        } else
            System.out.println("Node is empty");
    }

    // printNode(), to display the complete list---------------------------------4
    void printNode() {
        Node current;
        if (head != null) {
            System.out.print("List is: ");
            for (current = head; current != null; current = current.next) {
                System.out.print(current.value + " ");
            }
            System.out.println("");
        }
    }

    // nodeLength(), to display length of the list------------------------------5
    void nodeLength() {
        System.out.println("Length of Double Linked List is: " + length);
    }

    // deleteHeadValue(), to delete the head node-------------------------------6
    void deleteHeadValue() {
        if (head != null) {
            length--;
            System.out.println("Deleted Node Value: " + head.value);
            head = head.next;
            if (head == null || head.next == null) {
                tail = head;
                // System.out.println("head null");
            }
            printNode();
            nodeLength();
        } else
            System.out.println("Node is empty");
    }

    // deleteTailValue(), to delete the tail node-------------------------------7
    void deleteTailValue() {
        if (tail != null) {
            length--;
            System.out.println("Deleted Node Value: " + tail.value);
            tail = tail.prev;
            if (tail == null || tail.prev == null) {
                head = tail;
            }
            printNode();
            nodeLength();
        } else
            System.out.println("Node is empty");
    }

    // deleteValue(), to delete the given node----------------------------------8
    void delete(int value) {
        if (head != null) {
            if (value == head.value)
                deleteHeadValue();
            else if (value == tail.value)
                deleteTailValue();
            else {
                Node ptr = head.next;
                while (ptr != null) {
                    if (ptr.value == value) {
                        System.out.println("Deleted Node Value: " + tail.value);
                        (ptr.next).prev = ptr.prev;
                        (ptr.prev).next = ptr.next;
                    }
                }
                printNode();
                nodeLength();
            }

        } else
            System.out.println("Node is empty");
    }

    void partitionList(int x) {
        if (head != null) {
            Node curNode = head;

            Node dummyNode = new Node(0);
            Node save = dummyNode;
            Node dummyNode2 = new Node(1);
            Node save2 = dummyNode2;
            while (curNode != null) {
                if (curNode.value < x) {
                    dummyNode.next = curNode;
                    dummyNode = curNode;
                } else {
                    dummyNode2.next = curNode;
                    dummyNode2 = curNode;
                }
                curNode = curNode.next;
                dummyNode2.next = null;
            }

            head = save.next;
            dummyNode.next = save2.next;

        }
        printNode();
    }
}
