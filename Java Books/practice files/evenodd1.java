import java.util.Scanner;
class demo
{
public boolean check(int x)
{
if(x%2==0)
return true;
else
return false;
}
}
class evenodd1
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter number : ");
int a = sc.nextInt();
demo obj = new demo();
boolean status = obj.check(a);
if(status)
System.out.println("EVEN NUMBER");
else
System.out.println("ODD NUMBER");
}
}