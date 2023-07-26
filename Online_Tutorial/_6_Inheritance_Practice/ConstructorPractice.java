package _6_Inheritance_Practice;

class Parent {
    
    Parent(){
        System.out.println("Parent Class: Non-Parameterised Constructor called");
    }
    Parent(double a){
        System.out.println("Parent Class: Parameterised Constructor called: Value from child: " + a);
    }
}

class Child extends Parent{
    Child(){
        System.out.println("Child Class: Non-Parameterised Constructor called");
    }

    Child(int a) {
        System.out.println("Child Class:  Parameterised Constructor called");
    }
    
    Child(double a) {
        super(a);
        System.out.println("Child Class: Parameterised Constructor called");
    }
}

public class ConstructorPractice {

    public static void main(String args[]) {
        Child c;
        System.out.println("Case 1: c = new Child()");
        c = new Child();
        System.out.println("\nCase 2: c = new Child(10)");
        c = new Child(10);
        System.out.println("\nCase 3: c = new Child(20.0)");
        c = new Child(20.0);
    }
}

/*
************************** OUTPUT **************************

Case 1: c = new Child()
Parent Class: Non-Parameterised Constructor called
Child Class: Non-Parameterised Constructor called

Case 2: c = new Child(10)
Parent Class: Non-Parameterised Constructor called
Child Class:  Parameterised Constructor called

Case 3: c = new Child(20.0)
Parent Class: Parameterised Constructor called: Value from child: 20.0
Child Class: Parameterised Constructor called
 */