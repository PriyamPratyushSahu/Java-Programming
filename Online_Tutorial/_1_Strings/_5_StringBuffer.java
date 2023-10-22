package _1_Strings;

public class _5_StringBuffer {
    public static void main(String[] args) {

        // Case 1: StringBuffer is mmutable
        // ***************************************************
        System.out.println("Case 1: StringBuffer is mmutable");

        StringBuffer s = new StringBuffer("Priyam");
        System.out.println(s); // Priyam

        s.append(" Pratyush");
        //append the string " Pratyush" to the existing content of the StringBuffer using the append method. After this operation, the StringBuffer now contains "Priyam Pratyush."
        System.out.println(s); // Priyam Pratyush
        // *******************************************************************************

        // Case 2: Comparision of two string: == operator and equals()
        // method**************

        System.out.println("Case 2: Comparision of two string: == operator and equals()");

        StringBuffer s1 = new StringBuffer("Priyam");
        StringBuffer s2 = new StringBuffer("Priyam");

        System.out.println("s1 == s2 : " + (s1 == s2)); // false
        /* Since s1 and s2 are two different StringBuffer objects with their own separate memory locations, s1 == s2 will evaluate to false. This is because you are comparing whether s1 and s2 are the same object in memory, which they are not.
         */

        System.out.println("s1.equals(s2) : " + (s1.equals(s2))); // false
        /* The equals() method for StringBuffer is not overridden to compare the content of the StringBuffer objects, as is the case with String objects. Instead, it uses the default equals() method inherited from the Object class, which performs a reference comparison. This means that it will check whether s1 and s2 are the same object in memory.
         */

        /* Solution
        To compare the content of StringBuffer objects, you should first convert them to strings using the toString() method and then compare the resulting strings using the equals() method.
         */
        System.out.println("s1.toString().equals(s2.toString()) : " + s1.toString().equals(s2.toString())); //true

        // *******************************************************************************
    }
}
