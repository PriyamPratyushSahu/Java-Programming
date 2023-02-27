package _6_Inheritance_Practice;
//Method Overriding example
class A{
    void display(){
        System.out.println("Class A: display()");
    }
    int returnMethod()
    {
        System.out.println("Class A: returnMethod()");
        return (int)Math.round(Math.random() * 20);
    }
}
class B extends A{
    void display(){
        super.display(); //1. First to A class display()
        System.out.println("Class B: display()"); //2. Then to B class display();
    }
    int returnMethod()
    {
        int A = super.returnMethod();
        System.out.println("Class A: returnMethod()");
        System.out.println("Class B: Return value from A: "+ A);
        return (int)Math.round(Math.random() * 20);
    }
}
public class SuperClass {
    public static void main(String args[]){

        B b= new B();
        b.display();

        int B = b.returnMethod();
        System.out.println("Main method: Return value from B: "+ B);
    }
}

/*
************************** OUTPUT **************************
Class A: display()
Class B: display()
Class A: returnMethod()
Class A: returnMethod()
Class B: Return value from A: 17
Main method: Return value from B: 12
 */