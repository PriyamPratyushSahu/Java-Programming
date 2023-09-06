package _7_Abstract_Class;


abstract class A {
    void meth1() {
        System.out.println("First Method: Inside Class A");
    }

    abstract void meth2();
    abstract void meth3();
}

abstract class B extends A {
    void meth2() {
        System.out.println("Second Method: Inside Class B");
    }
}

class C extends B {
    void meth3() {
        System.out.println("Third Method: Inside Class C");
    }
}


public class _2_MultiLevelAbstractClass {

    public static void main(String args[]) {
        // -> This is wrong ------> A aa = new A();
        // because it is trying to create an instance of an abstract class A.
        // In Java, you cannot create instances of abstract classes directly. 
        //Abstract classes are designed to be inherited by other classes, and they cannot be instantiated on their own.

        System.out.println("Case 1: A a = new C()");
        A a = new C();
        a.meth1();
        a.meth2();
        a.meth3();

        System.out.println("\nCase 2: C c = new C()");
        C c = new C();
        c.meth1();
        c.meth2();
        c.meth3();
    }
}

/*
************************** OUTPUT **************************

Case 1: A a = new C()
First Method: Inside Class A
Second Method: Inside Class B
Third Method: Inside Class C

Case 2: C c = new C()
First Method: Inside Class A
Second Method: Inside Class B
Third Method: Inside Class C
*/
