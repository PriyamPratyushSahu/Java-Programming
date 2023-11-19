package Complete_Chapterwise_Concept_And_Code._02_Data_Structures._03_Stack_And_Queue;

class StackNode {
    int value;
    StackNode next;

    StackNode(int value) {
        this.value = value;
        next = null;
    }
}

public class StackList {
    private StackNode top;
    private int height;

    StackList() {
        top = null;
        height = 0;
    }

    void push(int value) {
        StackNode newNode = new StackNode(value);
        if (top == null)
            top = newNode;
        else {
            newNode.next = top;
            top = newNode;
        }
        System.out.println("Value pushed: " + value);
        height++;
        System.out.print("Updated ");
        displayStack();
    }

    void pop() {
        if (top != null) {
            System.out.println("Value poped: " + top.value);
            top = top.next;
            height--;
            if (top != null)
                System.out.print("Updated ");
            displayStack();
        } else
            System.out.println("Stack is empty");
    }

    void displayStack() {
        if (top != null) {
            StackNode temp = top;
            System.out.print("Stack:");
            while (temp != null) {
                System.out.print(" -> " + temp.value);
                temp = temp.next;
            }
            System.out.println();
        }
    }

    void displayStackHeight() {
        System.out.println("Stack height: " + height);
    }

    void displayTop() {
        if (top != null)
            System.out.println("Top value: " + top.value);
        else
            System.out.println("Stack is empty");
    }
}