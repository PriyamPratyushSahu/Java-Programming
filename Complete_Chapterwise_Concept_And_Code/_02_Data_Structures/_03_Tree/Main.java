package Complete_Chapterwise_Concept_And_Code._02_Data_Structures._03_Tree;

public class Main {

    public static void main(String args[]){
        Tree tt = new Tree();
        Node headNode = null;
        headNode = tt.insertNode(10);
        headNode = tt.insertNode(20);
        headNode = tt.insertNode(30);
        headNode = tt.insertNode(40);
        headNode = tt.insertNode(50);
        headNode = tt.insertNode(60);

        tt.traversal(headNode);
        tt.numOfNodes();
    }
    
}
