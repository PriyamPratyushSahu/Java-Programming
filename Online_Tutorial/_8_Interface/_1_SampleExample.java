package _8_Interface;

interface Animal {
    void animalType();
    void animalSound();
}

class Dog implements Animal {
    public void animalType() {
        System.out.println("Mammals");
    }
    
    public void animalSound() {
        System.out.println("Barks");
    }
}

class Snake implements Animal {
    public void animalType() {
        System.out.println("Reptiles");
    }
    
    public void animalSound() {
        System.out.println("Hiss");
    }
}

public class _1_SampleExample {
    public static void main(String[] args) {
        Dog d = new Dog();
        Snake s = new Snake();

        System.out.println("About Dog");
        System.out.print("Dog are ");
        d.animalType();
        System.out.print("Dog ");
        d.animalSound();

        System.out.println("\nAbout Snake");
        System.out.print("Snake are ");
        s.animalType();
        System.out.print("Snake ");
        s.animalSound();
    }
}

/*
************************** OUTPUT **************************
About Dog
Dog are Mammals
Dog Barks

About Snake
Snake are Reptiles
Snake Hiss
 */
