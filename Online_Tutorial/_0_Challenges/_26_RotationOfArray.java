package _0_Challenges;

import java.util.Scanner;

public class _26_RotationOfArray {

    public static void main(String[] args) 
    {
        
        int arr[] = new int[10];
        int i,ch;

        System.out.print("The array is: ");
        for (i = 0; i < arr.length; i++) {
            arr[i] = (int) Math.round(Math.random() * 100);
            System.out.print(arr[i] + " ");
        }
        Scanner pp =new Scanner(System.in);
        do{
            System.out.print("\nAfter Left rotation: ");
            int temp = arr[0];
            
            for(i = 1 ; i < arr.length ; i++){
                arr[i-1]=arr[i];
            }
            arr[arr.length-1] = temp;
        
            for(int x:arr)
                System.out.print(x+",");
                
            System.out.println("\nPress 1 to continue left rotation\nPress any key to stop");
            ch = pp.nextInt();
            
        } while (ch == 1);
        pp.close();  
    } 
}

/*
************************** OUTPUT **************************

The array is: 4 27 49 62 77 9 34 87 89 4 
After Left rotation: 27,49,62,77,9,34,87,89,4,4,
Press 1 to continue left rotation
Press any key to stop
1

After Left rotation: 49,62,77,9,34,87,89,4,4,27,
Press 1 to continue left rotation
Press any key to stop
1

After Left rotation: 62,77,9,34,87,89,4,4,27,49,
Press 1 to continue left rotation
Press any key to stop
1

After Left rotation: 77,9,34,87,89,4,4,27,49,62,
Press 1 to continue left rotation
Press any key to stop
3
 */
