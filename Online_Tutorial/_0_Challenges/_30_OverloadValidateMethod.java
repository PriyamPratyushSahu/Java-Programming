//A menu driven program where user enter choice for 1 for area calculation, 2 for reverse a value or array or 3 validate name and age

package _0_Challenges;

import java.util.Scanner;

public class _30_OverloadValidateMethod {

//*************** OPTION 1 *************** */    

    static double area(double radius){ //Area of circle
        return Math.PI*radius*radius;
    }
    
    static double area(double length, double breadth) { //Area of rectangle
        return length * breadth;
    }
    
    static int area(int side) {
        return side * side; 
    }

//*************** OPTION 2 *************** */    
    
    static int reverse(int n){
        int rev=0;
        while(n>0){
            rev=rev*10+n%10;
            n=n/10;
        }
        return rev;
    }
    
    static int [] reverse(int A[]){
        int B[] = new int[A.length];
        for (int i = A.length - 1, j = 0; i >= 0; i--, j++)
            B[j] = A[i];
        return B;
    }
//*************** OPTION 3 *************** */    
    static boolean validate(String name)
    {
        return name.matches("[a-zA-Z\\s]+");
    }
    
    
    static boolean validate(int age)
    {
        return age>=3 && age<=15;
    }

    public static void main(String args[]) {
        
        Scanner pp = new Scanner(System.in);

        int ch;
        System.out.print(
                "Press 1 for Area Calculation\nPress 2 for Reverse a value or array\nPress 3 Validate name and age\nEnter your choice: ");
        ch = pp.nextInt();
        System.out.format("Option %d selected\n", ch);
        switch (ch) {
            case 1:
                System.out.print(
                        "\nPress 1 for area of circle\nPress 2 for area of rectangle\nPress 3 for area of square\nEnter your choice: ");
                ch = pp.nextInt();
                switch (ch) {
                    case 1:
                        double rad;
                        System.out.print("Enter radius of circle: ");
                        rad = pp.nextDouble();
                        System.out.println("Area of circle is: " + String.format("%.2f", area(rad)));
                        break;
                    case 2:
                        double len, br;
                        System.out.print("Enter length and breadth of the rectangle: ");
                        len = pp.nextDouble();
                        br = pp.nextDouble();
                        System.out.println("Area of rectange is: " + String.format("%.2f", area(len, br)));
                        break;
                    case 3:
                        int side;
                        System.out.print("Enter side of the rectangle: ");
                        side = pp.nextInt();
                        System.out.println("Area of square is: " + String.format("%.2f", area(side)));
                        break;
                    default:
                        System.out.println("! ! Wrong Option selected! !");
                        break;
                }
                break;
            case 2:
                System.out.print("\nPress 1 to reverse a value\nPress 2 to reverse an array\nEnter your choice: ");
                ch = pp.nextInt();
                switch (ch) {
                    case 1:
                        int num;
                        System.out.print("Enter the number: ");
                        num = pp.nextInt();
                        System.out.println("Before reverse of number: " + num);
                        System.out.println("After reverse of number: " + reverse(num));
                        break;
                    case 2:
                        int arr[], size;
                        System.out.print("Enter the size of the array: ");
                        size = pp.nextInt();
                        arr = new int[size];
                        System.out.format("Enter %d values: ", size);
                        for (int i = 0; i < arr.length; i++)
                            arr[i] = pp.nextInt();
                        System.out.print("Array before reverse: ");
                        for (int x : arr)
                            System.out.print(x + " ");
                        arr = reverse(arr);
                        System.out.print("\nArray after reverse: ");
                        for (int x : arr)
                            System.out.print(x + " ");
                        break;
                    default:
                        System.out.println("! ! Wrong Option selected! !");
                        break;
                }
                break;
            case 3:
                String name;
                int age;
                System.out.print("\nEnter your name: ");
                pp.nextLine();
                name = pp.nextLine();
                System.out.print("Enter your age: ");
                age = pp.nextInt();
                if (validate(name))
                    System.out.format("%s is a valid name\n", name);
                else
                    System.out.format("%s is not a valid name\n", name);

                if (validate(age))
                    System.out.format("%d is a valid age\n", age);
                else
                    System.out.format("%d is not a valid age\n", age);
                break;
            default:
                System.out.println("\n! ! Wrong Option selected! !");
                break;
        }
        pp.close();
    }
}
/*
 ************************** OUTPUT **************************
 Press 1 for Area Calculation
Press 2 for Reverse a value or array
Press 3 Validate name and age
Enter your choice: 1
Option 1 selected

Press 1 for area of circle
Press 2 for area of rectangle
Press 3 for area of square
Enter your choice: 1
Enter radius of circle: 3.4
Area of circle is: 36.32


Press 1 for Area Calculation
Press 2 for Reverse a value or array
Press 3 Validate name and age
Enter your choice: 1
Option 1 selected

Press 1 for area of circle
Press 2 for area of rectangle
Press 3 for area of square
Enter your choice: 2
Enter length and breadth of the rectangle: 10
3.5
Area of rectange is: 35.00

Press 1 for Area Calculation
Press 2 for Reverse a value or array
Press 3 Validate name and age
Enter your choice: 2
Option 2 selected

Press 1 to reverse a value
Press 2 to reverse an array
Enter your choice: 2
Enter the size of the array: 6
Enter 6 values: 1
4
7
45
32
90
Array before reverse: 1 4 7 45 32 90 
Array after reverse: 90 32 45 7 4 1

Press 1 for Area Calculation
Press 2 for Reverse a value or array
Press 3 Validate name and age
Enter your choice: 3
Option 3 selected

Enter your name: Priyam Pratyush Sahu
Enter your age: 16
Priyam Pratyush Sahu is a valid name
16 is not a valid age


 */