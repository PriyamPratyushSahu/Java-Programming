package Complete_Chapterwise_Concept_And_Code._02_Data_Structures._03_Tree;

class Node{
    int value;
    Node leftNode;
    Node rightNode;

    Node(int value){
        this.value = value;
        leftNode = null;
        rightNode = null;
    }
}
public class Tree {
    private Node head;
    private int length;

    Tree(){
        head = null;
        length = 0;
    }

    Node insertNode(int value){
        Node newNode = new Node(value);

        if(head == null){
            head = newNode;
        }
        else{
            int flag = -1;
            Node travNode = head;
            Node prev = null;
            while(travNode != null){
                prev = travNode;
                if(travNode.leftNode != null){
                    flag = 1;
                    travNode = travNode.rightNode;
                }
                else{
                    flag = 0;
                    travNode = travNode.leftNode;
                }
            }
            if(flag == 0)
                prev.leftNode = newNode;
            else if(flag == 1)
                prev.rightNode = newNode;
        }
        length++;
        return head;
    }

    void traversal(Node startNode){
        Node ptr = startNode;
        if(ptr != null){
            System.out.println(ptr.value);
            traversal(ptr.leftNode);
            traversal(ptr.rightNode);
        }
    }
    void numOfNodes(){
        System.out.println("Number of nodes: "+ length);
    }
}
