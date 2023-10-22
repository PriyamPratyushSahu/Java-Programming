package _1_Strings;
public class _1_All_String_methods {

    public static void main(String args[]){
        String str1 = "Priyam Pratyush Sahu";

        System.out.println("String: "+ str1);
        System.out.println("String Length: "+ str1.length());
        System.out.println("To Lower case: "+ str1.toLowerCase());
        System.out.println("To Upper case: "+ str1.toUpperCase());
        System.out.println("\nFirst Name(substring): "+ str1.substring(0,6));
        System.out.println("Middle Name(substring): "+ str1.substring(7,15));
        System.out.println("Last Name(substring): "+ str1.substring(16));
        System.out.println("\nReplace whitespace to $: "+ str1.replace(" ","$"));
        System.out.println("\nStarts with P: "+ str1.startsWith("P"));
        System.out.println("Ends with u: "+ str1.endsWith("u"));
        System.out.println("\nCharacter at index position 10: "+ str1.charAt(10));
        System.out.println("Index position of iy: "+ str1.indexOf("iy"));
        System.out.println("Index position of Pr after index postion 2: "+ str1.indexOf("Pr",2));
        System.out.println("Index position of u from last: "+ str1.lastIndexOf("u"));

        System.out.println("Comparing strings: ");
        //Type 1
        String str2 = "Priyam Pratyush Sahu";
        System.out.println("str1 == str2: " + (str1 == str2));

        //Type 2
         str2 = new String("Priyam Pratyush Sahu");
        System.out.println("str1 == str2: " + (str1 == str2));

        //Type 3
        str2 = new String();
        str2 = "Priyam Pratyush Sahu";
        System.out.println("str1 == str2: " + (str1 == str2));

        System.out.println("str1.equals(str2): "+ str1.equals(str2));
        System.out.println("str1.compareTo(str2): "+ str1.compareTo(str2));

    }
}

/*
******************************** OUTPUT *************************************
String: Priyam Pratyush Sahu
String Length: 20
To Lower case: priyam pratyush sahu
To Upper case: PRIYAM PRATYUSH SAHU

First Name(substring): Priyam
Middle Name(substring): Pratyush
Last Name(substring): Sahu

Replace whitespace to $: Priyam$Pratyush$Sahu

Starts with P: true
Ends with u: true

Character at index position 10: t
Index position of iy: 2
Index position of Pr after index postion 2: 7
Index position of u from last: 19
Comparing strings:
str1 == str2: true
str1 == str2: false
str1 == str2: true
str1.equals(str2): true
str1.compareTo(str2): 0
 */
