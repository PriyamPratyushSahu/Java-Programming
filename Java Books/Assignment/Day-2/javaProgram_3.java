/*Write a program that ask user to enter values in two integer a and b,
  now write a code to swap the values of a and b without taking any
  temporary variable **/

  import java.util.*;

  class javaProgram_3
  {
      public static void main(String args[])
      {
          Scanner pp = new Scanner(System.in);
          int a,b;
          System.out.println("\nEnter two values: ");
          a = pp.nextInt();
          b = pp.nextInt();
          System.out.println("Values before swapping");
          System.out.println("a = " + a + "\nb = " + b);
          a = a + b;
          b = a - b;
          a = a - b;
          System.out.println("Values after swapping");
          System.out.println("a = " + a + "\nb = " + b);
      }
  }