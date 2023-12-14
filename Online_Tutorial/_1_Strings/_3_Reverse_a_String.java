//Write a program to reverse a given String

package _1_Strings;
public class _3_Reverse_a_String {

    public static final int STRING_CONCATENATION = 0;
    public static final int STRING_BUILDER = 1;

    String reverseAString(String str,int type){
        if(type == STRING_CONCATENATION){
            String revStr = "";
            for(int i = str.length()-1; i >= 0; i--)
                revStr += str.charAt(i);
            return revStr;  
        }
        else if(type == STRING_BUILDER){
            StringBuilder revStr = new StringBuilder();
            for(int i = str.length()-1; i >= 0; i--)
                revStr.append(str.charAt(i));
            return revStr.toString(); 
        }
        return "";
    }

    public static void main(String args[]){
        _3_Reverse_a_String pp = new _3_Reverse_a_String();
        String str = "abcdef123";

        System.out.println("String before reverse: " + str);

        
        System.out.println("String after reverse: " + pp.reverseAString(str, 0));
        System.out.println("String after reverse: " + pp.reverseAString(str, 1));
    }
}

/*
In the above code, the line revStr += str.charAt(i); appears to modify the revStr string, but what is happening behind the scenes is the creation of a new string each time a character is added. This is less efficient than using StringBuilder for concatenation, especially in a loop.
 */

/*
****************************** OUTPUT ******************************
String before reverse: abcdef123
String after reverse: 321fedcba
String after reverse: 321fedcba
*/
