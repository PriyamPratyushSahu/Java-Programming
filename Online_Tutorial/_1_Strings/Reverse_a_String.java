package _1_Strings;
public class Reverse_a_String {

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
