/*
Write a program to calculate the area of circle and cylinder by
creating methods named areaOfCircle() and areaOfCylinder() in a
class named Area and using a constant variable PI=3.14
**/

import java.util.*;

class Area
{
    double radius,height,area;
    final double PI = 3.14;

    void areaOfCircle()
    {
        Scanner pp = new Scanner(System.in);
        System.out.println("Enter the radius of the circle:");
        radius = pp.nextDouble();
        area = PI * radius * radius;
        System.out.println("Area of the Circle is: " + area);

    }

    void areaOfCylinder()
    {
        Scanner pp = new Scanner(System.in);
        System.out.println("Enter the radius and height of cylinder:");
        radius = pp.nextDouble();
        height = pp.nextDouble();
        area = (2 * PI * radius) * (radius + height);
        System.out.println("Area of the Cylinder is: " + area);
    }
}

class javaProgram_3
{
    public static void main(String args[])
    {
        Scanner pp = new Scanner(System.in);
        int ch;
        System.out.println("Press 1 for area of circle\nPress 2 for area of cylinder");
        System.out.println("Enter your choice:");
        ch = pp.nextInt();
        Area obj = new Area();
        if(ch == 1)
            obj.areaOfCircle();
        else if(ch == 2)
            obj.areaOfCylinder();
        else
        System.out.println("Sorry Wrong Choice");
    }
}