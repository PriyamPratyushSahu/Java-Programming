//Write a program to find greater number 

import java.util.*;
class javaProgram_2 
{
    public static void main(String args[])    
    {
        Scanner pp = new Scanner(System.in);
        int i,n,h;
        System.out.println("\nEnter how many numbers you want to enter:");
        n = pp.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter " + n + " values:");
        for(i = 0 ; i < n ; i++)
            arr[i] = pp.nextInt();
        for(h = arr[0] , i = 1 ; i < n ; i++)
        {
            if(h < arr[i])
                h = arr[i];
        }
        System.out.println("\nThe highest number is: " + h);
    }
}