//Check if the ith location of the number is a set or not(1 or not)
package _01_Bit_Manipulation;

public class _09_Prog {

    int decimalToBinary(int num) {
        int binary = 0;
        int base = 1;
    
        while (num > 0) {
            int remainder = num % 2;
            binary += remainder * base;
            base *= 10;
            num /= 2;
        }
    
        return binary;
    }

    boolean checkSet(int n,int i){
        int mask = (1 << i);
        return  (n & mask) != 0;
    }

    public static void main(String args[]){
        _09_Prog pp = new _09_Prog();

        int n = 100 + (int) (Math.round(Math.random() * 50));
        int i = (int)(Math.round(Math.random() * 5));

        System.out.format("Binary equivalent of %d is: %d\n",n,pp.decimalToBinary(n));
        if(pp.checkSet(n, i))
            System.out.format("Integer %d bit position %d is a set bit",n,i);
        else
            System.out.format("Integer %d bit position %d is not a set bit",n,i);
    }
}

/*
 Output
Binary equivalent of 113 is: 1110001
Integer 113 bit position 2 is not a set bit

Binary equivalent of 143 is: 10001111
Integer 143 bit position 1 is a set bit

Binary equivalent of 120 is: 1111000
Integer 120 bit position 2 is not a set bit

Binary equivalent of 110 is: 1101110
Integer 110 bit position 2 is a set bit

Binary equivalent of 115 is: 1110011
Integer 115 bit position 5 is a set bit
 */

 /*
  Explanation

  For 65, binary equivalent: 1 0 0 0 0 0 1
  We can see 0th and 6th bit are set bit
  If we need to check wether(6th) is a set bit or not
  then we need to send a mask having binarr equivalent: 1 0 0 0 0 0 0
  Because 1 & 1 = 1 but 1 & 0 = 0
  If the AND operation results in zero, then it is not a set bit.
  Now to create a mask, we need its ith positon
  mask = 1 << i
  this will create a binary equivalent 1 0 0 0 0 0 0

  */