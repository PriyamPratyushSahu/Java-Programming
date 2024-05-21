/*
A electricity board charges the following rates to domestic users
to charge large consumption of energy.
For first 100 units - 40paise/ unit 
    next  200 units – 50paise/ unit
    next or beyond 300 units – 60paise /unit
If the total bill is more than Rs.250 then an additional charge of 15%
is added to the bill.
Write a program that read the names of the user and number of units
consumed and print the charges with name.
**/

import java.io.*;

class javaProgram_4
{
    public static void main(String args[])throws IOException
    {
        BufferedReader pp = new BufferedReader(new InputStreamReader(System.in));
        String name;
        int units;
        double bill;
        System.out.println("\nEnter the consumer's name:");
        name = pp.readLine();
        System.out.println("Enter the consuption unit:");
        units = Integer.parseInt(pp.readLine());
        if(units > 0 && units <= 100)
            bill = units * 0.4;
        else if(units > 100 && units <= 300)
            bill = (100 * 0.4) + ((units - 100) * 0.5);
        else
            bill = (100 * 0.4) + (200 * 0.5) + ((units - 300) * 0.6);
        
        bill = (bill > 250) ? (bill + (0.15 * bill)) : bill;

        System.out.println("\nConsumer's name: " + name);
        System.out.println("The Electricity Bill is: " + bill);
    }    
}