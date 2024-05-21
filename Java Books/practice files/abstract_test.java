abstract class A
{
abstract void show();
}
class test extends A
{
void disp()
{
System.out.println("disp of child");
}
void show()
{
System.out.println("show of A");
}
}
class abstract_test
{
public static void main(String[] args)
{
test t = new test();
t.disp();
}
}