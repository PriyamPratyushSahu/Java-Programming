//Write a program to reverse a given String

package _1_Strings;
public class _3_Reverse_a_String {

    public static void main(String args[]){
        String str = "abcdef123";
        String revStr = "";
        int strSize = str.length();

        System.out.println("String before reverse: " + str);

        for(int i = strSize-1; i >=0; i--){
            revStr += str.charAt(i);
        }
        System.out.println("String after reverse: " + revStr);
    }
}

/*
****************************** OUTPUT ******************************
String before reverse: abcdef123
String after reverse: 321fedcba
*/
