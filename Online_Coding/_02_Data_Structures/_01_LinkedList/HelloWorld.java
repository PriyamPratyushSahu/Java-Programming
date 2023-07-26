package Online_Coding._02_Data_Structures._01_LinkedList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

class HelloWorld {
    public void moveZeroes(int[] nums) {
        int zeroCount = 0;
        int nonZeroPos = 0;
        int i;
        int j;
        for(i = 0; i < nums.length; i++){
            if(nums[i] != 0){
                nums[nonZeroPos++] = nums[i];
            }
            else
                zeroCount++;
             
        }
        System.out.println(nums.length - zeroCount - 1);
        for(i = nums.length - zeroCount - 1; i < nums.length;i++){
            nums[i] = 0;
        }
        
    }

    public static void main(String args[]){
        HelloWorld hw = new HelloWorld();
        int arr1[] = {0,1,0,3,12};
        hw.moveZeroes(arr1);
        
    }
}
