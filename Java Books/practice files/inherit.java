class parent
{
public void disp()
{
System.out.println("disp of parent");
}
public void read()
{
System.out.println("read of parent");
}
}
class child extends parent
{
public void disp()
{
System.out.println("disp of child");
}
public void show()
{
System.out.println("disp of child");
}
}

class inherit
{
public static void main(String[] args)
{
parent p = new child();//upcasting
p.disp();
p.read();
//p.show();//error
}
}