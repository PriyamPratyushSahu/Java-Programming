package _7_Abstract_Class;

abstract class Abstract
{
    public Abstract() {
         System.out.println("Abstract Class Constructor"); }
    
    public void meth1()
    {
        System.out.println("Method 1 of Abstract Class");
    }
    
    abstract public void meth2();
}

class Sub extends Abstract {

    public void meth2() {
        System.out.println("Method 2: Defined in Sub Class");
    }
}

public class _1_SampleExample {
    public static void main(String[] args) {
        System.out.println("Case 1: Sub ss = new Sub()");
        Sub ss = new Sub();
        ss.meth1();
        ss.meth2();

        System.out.println("\nCase 2: Abstract s=new Sub()");
        Abstract s = new Sub();
        s.meth1();
        s.meth2();
    }
}
/*
************************** OUTPUT **************************

Case 1: Sub ss = new Sub()
Abstract Class Constructor
Method 1 of Abstract Class
Method 2: Defined in Sub Class

Case 2: Abstract s=new Sub()
Abstract Class Constructor
Method 1 of Abstract Class
Method 2: Defined in Sub Class
 */
