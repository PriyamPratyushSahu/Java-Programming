//Open-Closed Principle
package Java_Pattern_Designs;

enum Color{
    RED, GREEN, BLUE
}

enum Size{
    SMALL, MEDIUM, LARGE, HUGE
}

class Product{
    public String name;
    public Color color;
    public Size size;

    public Product(String name, Color color, Size size){
        this.name = name;
        this.color = color;
        this.size = size;
    }
}
