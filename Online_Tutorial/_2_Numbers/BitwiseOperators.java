//Decimal to Binary, Binary to Decimal, Right Shift, Left Shift

package _2_Numbers;

import java.util.Scanner;

public class BitwiseOperators {

    static int decToBin(int dec){

        int bin,count,r,power;
        bin = 0;
        count = 0;
        while(dec != 0){
            r = dec % 2;
            power = (int) Math.pow(10,count);
            bin += r * power;
            count++;
            dec /= 2;
        }
        return bin;
    }
    static int binToDec(int bin){

        int dec,count,r,power;
        dec = 0;
        count = 0;
        while(bin != 0){
            r = bin % 10;
            power = (int) Math.pow(2,count);
            dec += r * power;
            count++;
            bin /= 10;
        }
        return dec;
    }

    public static void main(String args[]){
        int n;

        Scanner pp = new Scanner(System.in);

        //System.out.print("Enter a number: ");
        //n = pp.nextInt();

        //Generating random number from a range of 1 to 100
        n = (int) Math.round(Math.random()*100);
        System.out.println("\nNumber: " + n);
        System.out.println("Binary Number: " + decToBin(n));
        System.out.println("Decimal Number: " + binToDec(decToBin(n)));

        System.out.println("\nLeft Shift by 1(binary value): " + (n << 1));
        System.out.println("Left Shift by 1(decimal value): " + decToBin((n << 1)));

        System.out.println("\nRight Shift by 1(binary value): " + (n >> 1));
        System.out.println("Right Shift by 1(decimal value): " + decToBin((n >> 1)));

        System.out.println("\nNOT value: " + ~n);
        pp.close();
    }
}