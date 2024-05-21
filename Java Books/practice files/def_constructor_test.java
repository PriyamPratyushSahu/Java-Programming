import java.util.Scanner;

class constructor_test
{

//constructor_test()
//{
//System.out.println("default constructor");
//}

constructor_test(int x)
{
System.out.println("parameterized constructor");
}

constructor_test(String x)
{
System.out.println("string parameterized constructor");
}

public static void main(String[] args)
{
System.out.println("inside main");
constructor_test=new constructor_test(1);
constructor_test=new constructor_test("arun");
}

}
