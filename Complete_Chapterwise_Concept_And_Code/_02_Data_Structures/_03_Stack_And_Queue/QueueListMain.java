package Complete_Chapterwise_Concept_And_Code._02_Data_Structures._03_Stack_And_Queue;

public class QueueListMain {
    public static void main(String[] args) {
        QueueList ql = new QueueList();
        ql.enQueue(10);
        ql.enQueue(20);
        ql.enQueue(30);
        ql.enQueue(40);
        ql.enQueue(50);
        ql.enQueue(60);

        ql.deQueue();
        ql.deQueue();
        
        ql.displayFirst();
        ql.displayLast();
        ql.displayQueueLength();
    }   
}

/**
****************** OUTPUT  *******************
Value enqueued: 10
Updated Queue: 10 <-
Value enqueued: 20
Updated Queue: 10 <-20 <-
Value enqueued: 30
Updated Queue: 10 <-20 <-30 <-
Value enqueued: 40
Updated Queue: 10 <-20 <-30 <-40 <-
Value enqueued: 50
Updated Queue: 10 <-20 <-30 <-40 <-50 <-
Value enqueued: 60
Updated Queue: 10 <-20 <-30 <-40 <-50 <-60 <-
Value dequeued: 10
Updated Queue: 20 <-30 <-40 <-50 <-60 <-
Value dequeued: 20
Updated Queue: 30 <-40 <-50 <-60 <-
First value: 30
Last value: 60
Queue length: 4
*/
