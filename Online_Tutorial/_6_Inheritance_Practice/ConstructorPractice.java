package _6_Inheritance_Practice;

class Parent {
    
    Parent(){
        System.out.println("Parent Class: Non-Parameterised Constructor called");
    }
    Parent(double a){
        System.out.println("Parent Class: Parameterised Constructor called\nValue from child: " + a);
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
        System.out.println("Case 1: new Child()");
        new Child(); // Not required to create any object
        System.out.println("\nCase 2: new Child(10)");
        new Child(10);
        System.out.println("\nCase 3: new Child(20.0)");
        new Child(20.0);
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
Parent Class: Parameterised Constructor called
Value from child: 20.0
Child Class: Parameterised Constructor called
 */