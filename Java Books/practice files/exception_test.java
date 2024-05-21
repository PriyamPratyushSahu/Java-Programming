import java.util.*;

class exception_test
{
public void div()
{
Scanner sc = new Scanner(System.in);

try
{
System.out.println("enter 1st number");
int x = sc.nextInt();
System.out.println("enter 2nd number");
int y = sc.nextInt();
int z =x/y;
System.out.println("result "+z);
}
catch(Exception e)
{
System.out.println("INVALID INPUT");
}
}
public static void main(String[] args)
{
exception_test ext = new exception_test();
System.out.println("*******Welcome*******");
ext.div();
System.out.println("*******Thankyou*******");
}
}