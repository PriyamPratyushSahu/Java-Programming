import java.util.Scanner;
class variables
{
int x=10;
static int y=20;
void show()
{
int z = 30;
System.out.print("X = "+x+" Y = "+y+" Z = "+z);
x++;
y++;
z++;
}
}
class Test
{
public static void main(String[] args)
{
variables obj = new variables();
obj.show();
obj.show();
variables obj1 = new variables();
obj1.show();
obj1.show();
}
}