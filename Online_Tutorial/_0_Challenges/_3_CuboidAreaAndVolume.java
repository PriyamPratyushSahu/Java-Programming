//Find area and volume of the cuboid

package _0_Challenges;

import java.util.Scanner;

public class _3_CuboidAreaAndVolume {

    public static void main(String[] args) 
    {
        Scanner pp =new  Scanner(System.in);
        int length,breadth,height;
        int totalArea,volume;
        
        System.out.println("Enter length, breadth and height");
        length= pp.nextInt();
        breadth= pp.nextInt();
        height= pp.nextInt();
        
        totalArea=2*(length*breadth+length*height+breadth*height);
        
        volume=length*breadth*height;
        
        System.out.println("Total Area: "+totalArea);
        System.out.println("Volume: " + volume);
        
        pp.close();    
        
    }
}
/*
 ****************************** OUTPUT ******************************
Enter length, breadth and height
10
5
8
Total Area: 340
Volume: 400
 */