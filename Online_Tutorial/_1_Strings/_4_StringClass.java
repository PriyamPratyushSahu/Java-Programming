package _1_Strings;

public class _4_StringClass {

    public static void main(String[] args) {

        //Case 1: String is immutable ***************************************************
        System.out.println("Case 1: String is immutable");

        String s = new String("Priyam");
        System.out.println(s); //Priyam

        s.concat(" Pratyush");
        System.out.println(s); //Priyam
        /*Because  s.concat("Pratyush"); is a new object created but not assigned to any variable and s points to "Priyam" */

        //Solution to concat both the string
        s = s.concat(" Pratyush");
        System.out.println(s); //Priyam Pratyush
        //*******************************************************************************

        //Case 2: Comparision of two string: == operator and equals() method**************

        System.out.println("Case 2: Comparision of two string: == operator and equals()");

        String s1 = new String("Priyam");
        String s2 = new String("Priyam");

        System.out.println("s1 == s2 : " +  (s1 == s2)); //false
        /*This statement checks whether s1 and s2 are the same object in memory. When you use new String("Priyam") to create a String, it explicitly creates a new object in memory, even if there is already a String with the same value in the string pool. As a result, s1 and s2 are two different String objects, and s1 == s2 will be false. 
        */

        System.out.println("s1.equals(s2) : " +  (s1.equals(s2))); //true
        /*This statement checks whether the content of s1 and s2 is the same. The equals method is used to compare the contents of the strings, and in this case, they both have the same content, which is "Priyam." Therefore, s1.equals(s2) will be true
        */

        /*Note: String is the child class of Object class.
          Object class has a function called equals() which actually compares with reference/address. which is same == operator
          But in String class equals() is overridden for content comparision
        */

        //*******************************************************************************
    }
    
}
