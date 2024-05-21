import java.util.Scanner;

class statictest
{
static
{
System.out.println("static block 1");
}
public static void main(String[] args)
{
System.out.println("inside main");
}
static
{
System.out.println("static block 2");
}
}
