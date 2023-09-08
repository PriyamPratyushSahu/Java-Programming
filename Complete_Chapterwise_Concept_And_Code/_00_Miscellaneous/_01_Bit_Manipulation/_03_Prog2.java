//Write a program to swap two numbers without using 3rd variable
//HINT: XOR(^) operator
package _01_Bit_Manipulation;

public class _03_Prog2 {

    void display(int a, int b){
        System.out.println("a: "+ a);
        System.out.println("b: "+ b);
    }
    public static void main(String args[]){
        _03_Prog2 pp = new _03_Prog2();
        int a,b;
        a = 1 + (int) Math.round(Math.random() * 30);
        b = 1 + (int) Math.round(Math.random() * 30);

        System.out.println("Before Swaping");
        pp.display(a, b);

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println("After Swaping");
        pp.display(a, b);
    }  
}
/*
 Output
 Before Swaping
 a: 15
 b: 5
 After Swaping
 a: 5
 b: 15
 */
