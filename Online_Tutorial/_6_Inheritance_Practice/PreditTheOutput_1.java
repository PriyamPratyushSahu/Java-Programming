/*Dynamic method dispatch is a concept in Java that allows you to achieve runtime polymorphism through method overriding.
 It is one of the fundamental features of object-oriented programming and is closely related to inheritance and method overriding./ Dynamic method dispatch enables you to call the overridden method of a subclass at runtime, 
even if the reference to the object is of the superclass type.
*/
package _6_Inheritance_Practice;

class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

public class PreditTheOutput_1 {
    public static void main(String args[]) {

        Animal myAnimal = new Dog(); // Using superclass reference to refer to a subclass object
        myAnimal.sound(); // Dog barks
    }
}
/*
 In Java, the @Override annotation is optional,
  but it is recommended to use it when you intend to override a method from a superclass.
  The primary purpose of the @Override annotation is to provide a clear indication to the compiler 
  and other developers that you intend to override a method. 
  It helps catch potential errors at compile-time and improves code readability.
 */

