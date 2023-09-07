package _01_Bit_Manipulation;
/*
 Bit Manipulation
 1. Bitwise AND (&):
        Performs a bitwise AND operation between two numbers.
        Clears bits where both operands have 0.
        Useful for masking specific bits.
 2. Bitwise OR (|):
        Performs a bitwise OR operation between two numbers.
        Sets bits where either operand has 1.
        Useful for combining or setting specific bits.
 3. Bitwise XOR (^):
        Performs a bitwise XOR operation between two numbers.
        Sets bits where only one operand has 1.
        Useful for toggling specific bits.
 4. Bitwise NOT (~):
        Performs a bitwise NOT operation on a single number.
        Inverts all the bits (0s become 1s, and 1s become 0s).
 5. Left Shift (<<):
        Shifts the bits of a number to the left by a specified number of positions.
        Fills the vacated bits with zeros.
6. Right Shift (>>):
       Shifts the bits of a number to the right by a specified number of positions.
       Fills the vacated bits with the sign bit (for signed data types) or zeros (for unsigned data types).
7. Zero-fill Right Shift (>>>):
       Similar to right shift (>>), but always fills with zeros.
       Useful for unsigned integer operations.
 */

public class _01_Bit_Manipulation_Fundamentals {
    public static void main(String args[]){
        int a = 5; //101
        int b = 6; //110
        System.out.println(a & b); //100 -> 4
        System.out.println(a | b); //111 -> 7
        System.out.println(a^b);   //011 -> 3(XOR operator: Even(1) : 0 & Odd(1): 1)
        
        
        //Doubt
        System.out.println(~a); //010 -> 2
    }
    
}
