/*
 A menu driven program
 1. Get the Nth Bit: Get the value of the Nth bit (0 or 1) from an integer
 2. Set the Nth Bit: Set (make it 1) the Nth bit of an integer
 3. Clear the Nth Bit: Clear (make it 0) the Nth bit of an integer.
 4. Update the Nth Bit: Update (set to a specific value) the Nth bit of an integer.
 5. Extract Lowest Set Bit: Get the value of the lowest set (1) bit in an integer.
 */

package _01_Bit_Manipulation;

public class _10_Prog {

    //0
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

    //1
    int getNthBit(int num, int n) {
        return (num >> n) & 1;
    }

    //2
    int setNthBit(int num, int n) {
        return num | (1 << n);
    }

    //3
    int clearNthBit(int num, int n) {
        return num & ~(1 << n);
    }

    //4
    int updateNthBit(int num, int n, int value) {
        // Clear the Nth bit and set it to 'value'
        return (num & ~(1 << n)) | (value << n);
    }

    //5
    int extractLowestSetBit(int num) {
        return num & -num;
    }
    
    public static void main(String args[]){
        _10_Prog pp = new _10_Prog();

        int n = (int) (Math.round(Math.random() * 100));
        System.out.format("Binary equivalent of %d is: %d\n",n,pp.decimalToBinary(n)); //0
        System.out.println("2nd bit: " + pp.getNthBit(n, 2));                               //1
        System.out.println("Set 2nd bit: " + pp.setNthBit(n, 2));                           //2
        System.out.println("Clear 2nd bit: " + pp.clearNthBit(n, 2));                       //3
        System.out.println("Update 2nd bit: " + pp.updateNthBit(n, 2, 1));            //4
        System.out.println("Lowest Set bit: " + pp.extractLowestSetBit(n));                   //5
    }
}
/*
 Output
 Binary equivalent of 58 is: 111010
2nd bit: 0
Set 2nd bit: 62
Clear 2nd bit: 58
Update 2nd bit: 62
Lowest Set bit: 2

Binary equivalent of 87 is: 1010111
2nd bit: 1
Set 2nd bit: 87
Clear 2nd bit: 83
Update 2nd bit: 87
Lowest Set bit: 1
 */
