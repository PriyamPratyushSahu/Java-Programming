package _6_Inheritance_Practice;

public class Child_1 extends BaseClass {
    public Child_1(int a, int b) {
        super(a, b);
        System.out.println("Inside child constructor");
    }

    public static void main(String args[]) {
        System.out.println("Child 1");
        Child_1 ch = new Child_1(10, 20);
        //BaseClass ba = new BaseClass(10,20);
        ch.display();
    }
}
/*
************************** OUTPUT **************************
Child 1
Inside parent constructor
Inside child constructor
Inside Parent class:
a :10
b :20
 */
