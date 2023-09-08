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

        //1. Bitwise AND (&)
        System.out.println(a & b); //100 -> 4

        //2. Bitwise OR (|)
        System.out.println(a | b); //111 -> 7

        //3. Bitwise XOR (^)
        System.out.println(a ^ b); //011 -> 3
        
        //4. Bitwise NOT (~)
        System.out.println(~a); //010 -> 2 , but java stores in 2's complement so it shows -6
        /*
         The binary representation of 5 is 00000101. When you apply ~ to it, you get 11111010.
         If you interpret 11111010 as an unsigned integer, it represents the decimal number 250.
         If you interpret 11111010 as a signed integer in two's complement form, it represents the decimal number -6
         */

        //5. Left Shift (<<)
        System.out.println(a << 2); // 10100 -> 20
        System.out.println(a >> 2); // 1 -> 1
        System.out.println(b >> 2); // 1 -> 1
    }
    
}
