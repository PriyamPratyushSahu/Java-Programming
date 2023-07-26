//Find Area of the triangle

package _0_Challenges;

import java.text.DecimalFormat;
import java.util.Scanner;

public class _1_TriangleArea {

    public static void main(String args[]) {
        Scanner pp = new Scanner(System.in);
        float area, height, breadth;

        System.out.println("Enter Height & Breadth: ");
        height = pp.nextFloat();
        breadth = pp.nextFloat();

        area = height * breadth;

        DecimalFormat df = new DecimalFormat("#.##");
        System.out.println("Area of the triangle: " + df.format(area));
        pp.close();
    }
}

/*
 *********************************** OUTPUT ***********************************
 Enter Height & Breadth: 
17.65
11.87
Area of the triangle: 209.51
 */
