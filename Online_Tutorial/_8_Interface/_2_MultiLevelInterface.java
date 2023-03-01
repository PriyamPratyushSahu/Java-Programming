package _8_Interface;
interface A
{
    int score = 0;
    static void positionA() {
        System.out.println("Inside A");
    }
    public void MethodA();
    public void position();
}

interface B extends A
{
    //Note: cannot use positionB() inside this interface if declared in interface A
    static void positionB() {
        System.out.println("Inside B");
    }
    public void MethodB();
}

class C implements B
{
    public void position() {
        System.out.println("Inside C");
    }

    public void MethodA() {
        System.out.println("From A");
    }

    public void MethodB() {
        System.out.println("From B");
    }
}

public class _2_MultiLevelInterface {
    public static void main(String args[]) {
        C c = new C();
        c.position();
        c.MethodA();
        c.MethodB();
        
        System.out.println("\n");
        A.positionA();
        System.out.println("Score:" + A.score);
        
        System.out.println("\n");
        B.positionB();
    }
}
/*
************************** OUTPUT **************************
Inside C
From A
From B

Inside A
Score:0

Inside B
 */