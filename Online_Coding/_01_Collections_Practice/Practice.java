package Online_Coding._01_Collections_Practice;
import java.util.*;
public class Practice {

    public static void main(String args[]){
        Map<Integer,Character> mp = new HashMap<>();

        mp.put(1,'A');
        mp.put(2,'B');
        mp.put(3,'C');
        mp.put(4,'D');
        mp.put(5,'E');

        System.out.println(mp.toString());
    }
}
/*
 *********************************** OUTPUT ***********************************
 {1=A, 2=B, 3=C, 4=D, 5=E}
 */