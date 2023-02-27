package _6_Inheritance_Practice;

public class BaseClass {
    int a;
    int b;

    public BaseClass(int a, int b) {
        System.out.println("Inside parent constructor");
        this.a = a;
        this.b = b;
    }
    
    public void display()
    {
        System.out.println("Inside Parent class:");
        System.out.println("a :" + a);
        System.out.println("b :" + b);
    }
}
