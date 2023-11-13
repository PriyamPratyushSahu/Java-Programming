package Complete_Chapterwise_Concept_And_Code._02_Data_Structures._01_LinkedList;

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

    Node(int value) {
        this.value = value;
        next = null;
    }
}

public class LinkedList {
    private Node head;
    private Node tail;
    private int length;

    LinkedList() {
        head = null;
        tail = null;
        length = 0;
    }

    // Append(), insert value to linked list-----------------------------1
    void append(int value) {
        Node newNode = new Node(value);

        if (head != null) {
            Node currentNode = head;

            while (currentNode.next != null)
                currentNode = currentNode.next;
            currentNode.next = newNode;
            tail = newNode;
        } else {
            head = newNode;
            tail = newNode;
        }
        length++;
    }

    // headValue(),to display the head node value-------------------------2
    void headValue() {
        if (head != null) {
            System.out.println("Head Value: " + head.value);
        } else
            System.out.println("Node is empty");
    }

    // tailValue(),to display the tail node value-------------------------3
    void tailValue() {
        if (tail != null) {
            System.out.println("Tail Value: " + tail.value);
        } else
            System.out.println("Node is empty");
    }

    // printNode(), to display the complete list--------------------------4
    void printNode() {
        Node current;
        if (head != null) {
            System.out.print("List is: ");
            for (current = head; current != null; current = current.next) {
                System.out.print(current.value + " ");
            }
            System.out.println("");
        } else
            System.out.println("Node is empty");
    }

    // nodeLength(), to display length of the list------------------------5
    void nodeLength() {
        if (length != 0)
            System.out.println("Length of Single Linked List is: " + length);
        else
            System.out.println("Node is empty");
    }

    // deleteHeadValue(), to delete the head node-------------------------6
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

    // deleteTailValue(), to delete the tail node-------------------------7
    void deleteTailValue() {
        if (tail != null) {
            length--;
            System.out.println("Deleted Node Value: " + tail.value);
            Node currNode = head;
            while (currNode.next != tail)
                currNode = currNode.next;
            tail = currNode;
            tail.next = null;

            printNode();
            nodeLength();
        } else
            System.out.println("Node is empty");
    }

    // deleteValue(), to delete the given node----------------------------8
    void deleteValue(int value) {
        if (head.value == value)
            deleteHeadValue();
        else if (tail.value == value)
            deleteTailValue();
        else if (length > 2) {
            Node current = head;
            while (current.next != null && (current.next).value != value) {
                current = current.next;
            }
            if (current != null) {
                length--;
                if ((current.next).next == null)
                    tail = current;
                System.out.println("Deleted value: " + (current.next).value);
                current.next = (current.next).next;
            }
        } else {
            System.out.println("Node is empty");
        }

    }

    // updateNode(), to update node value at specific position-----------9
    void updateNode(int pos, int value) {
        if (pos <= length) {
            int i = 1;
            Node cuNode = head;
            while (i != pos) {
                i++;
                cuNode = cuNode.next;
            }
            cuNode.value = value;
            printNode();
        } else
            System.out.println("Invalid Position");
    }

    // insertNode(), to insert a node at specific position-------------10
    void insertNode(int pos, int value) {
        if (pos <= length || pos == 1) {
            if (pos == 1) {
                append(value);
            } else {
                Node newNode = new Node(value);
                Node prev = head;
                int i = 1;
                while (i < pos) {
                    i++;
                    prev = prev.next;
                }
                newNode.next = prev.next;
                prev.next = newNode;
            }
            if (pos != 1)
                length++;
            printNode();
            nodeLength();
        } else if (length == 0)
            System.out.println("Node is empty");
        else
            System.out.println("Invalid Position");
    }

    // serach(), to search a given value in the linked list-----------11
    public boolean search(int val) {
        Node current = head;
        while (current != null) {
            if (current.value == val) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    // reverseLinkedlist(): to reverse the linked list-----------------12
    void reverseLinkedList() {
        if (head != null) {
            Node temp = head;
            head = tail;
            tail = temp;

            Node afterNode;
            Node beforeNode = null;
            for (int i = 0; i < length; i++) {
                afterNode = temp.next;
                temp.next = beforeNode;
                beforeNode = temp;
                temp = afterNode;
            }
            System.out.print("Reversed List is: ");
            for (Node current = head; current != null; current = current.next) {
                System.out.print(current.value + " ");
            }
            System.out.println("");
        } else
            System.out.println("Node is empty");
    }

    // partitionList(): takes an integer "x" as input and rearranges the linked list in such a way that all nodes with values less than "x" come before nodes with
    // values greater than or equal to "x".----------------------------13
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

    // removeDuplicates(): to remove duplicate values from the linked list-------14
    public void removeDuplicates() {
        System.out.println(length);
         if (length > 1) {
             Node current = head;
             Node end = head;

             while (current != null) {
                 // Add a null check before entering the loop
                 if (end == null) {
                     break;
                 }

                 Node ptr = head;
                 int flag = 0;

                 while (ptr != current) {
                     if (ptr.value == current.value) {
                         flag = 1;
                         break;
                     }
                     ptr = ptr.next;
                 }

                 if (flag == 0) {
                     end = ptr;
                 } else {
                     end.next = current.next;
                 }

                 current = current.next;
             }

             printNode();
         } else if(length == 1)
             System.out.println("Only one node present");
         else
             System.out.println("Node is empty");
    }    

}
