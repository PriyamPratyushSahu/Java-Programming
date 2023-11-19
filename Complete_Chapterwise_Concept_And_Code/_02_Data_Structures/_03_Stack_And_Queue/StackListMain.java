package Complete_Chapterwise_Concept_And_Code._02_Data_Structures._03_Stack_And_Queue;

public class StackListMain {
    public static void main(String[] args) {
        StackList sl = new StackList();
        sl.push(10);
        sl.push(30);
        sl.push(90);
        sl.push(50);
        sl.displayStackHeight();
        sl.displayTop();
        sl.push(80);
        sl.push(70);
        sl.displayStack();
        sl.pop();
        sl.pop();
        sl.displayStackHeight();
        sl.displayTop();
        sl.push(110);
    }
}
/**
****************** OUTPUT  *******************
Value pushed: 10
Updated Stack: -> 10
Value pushed: 30
Updated Stack: -> 30 -> 10
Value pushed: 90
Updated Stack: -> 90 -> 30 -> 10
Value pushed: 50
Updated Stack: -> 50 -> 90 -> 30 -> 10
Stack height: 4
Top value: 50
Value pushed: 80
Updated Stack: -> 80 -> 50 -> 90 -> 30 -> 10
Value pushed: 70
Updated Stack: -> 70 -> 80 -> 50 -> 90 -> 30 -> 10
Stack: -> 70 -> 80 -> 50 -> 90 -> 30 -> 10
Value poped: 70
Updated Stack: -> 80 -> 50 -> 90 -> 30 -> 10
Value poped: 80
Updated Stack: -> 50 -> 90 -> 30 -> 10
Stack height: 4
Top value: 50
Value pushed: 110
Updated Stack: -> 110 -> 50 -> 90 -> 30 -> 10
 */