package Complete_Chapterwise_Concept_And_Code._02_Data_Structures._03_Stack_And_Queue;

class QueueNode {
    int value;
    QueueNode next;

    QueueNode(int value) {
        this.value = value;
        next = null;
    }
}

public class QueueList {
    private QueueNode first;
    private QueueNode last;
    private int length;

    QueueList() {
        first = null;
        last = null;
        length = 0;
    }

    void enQueue(int value) {
        QueueNode newNode = new QueueNode(value);
        if (first == null) {
            first = newNode;
            last = newNode;
        } else {
            last.next = newNode;
            last = newNode;
        }
        System.out.println("Value enqueued: " + value);
        length++;
        System.out.print("Updated ");
        displayQueue();
    }

    void deQueue() {
        if (first != null) {
            System.out.println("Value dequeued: " + first.value);
            QueueNode temp = first;
            first = first.next;
            last = (last == temp) ? null : last;
            temp.next = null;
            length--;
            if (first != null)
                System.out.print("Updated ");
            displayQueue();
        } else
            System.out.println("Queue is empty");
    }

    void displayQueue() {
        if (first != null) {
            QueueNode temp = first;
            System.out.print("Queue: ");
            while (temp != null) {
                System.out.print(temp.value + " <-");
                temp = temp.next;
            }
            System.out.println();
        }
    }

    void displayQueueLength() {
        System.out.println("Queue length: " + length);
    }

    void displayFirst() {
        if (first != null)
            System.out.println("First value: " + first.value);
        else
            System.out.println("Queue is empty");
    }

    void displayLast() {
        if (last != null)
            System.out.println("Last value: " + last.value);
        else
            System.out.println("Queue is empty");
    }
}