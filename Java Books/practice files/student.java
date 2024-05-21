import java.util.Scanner;
class student
{
String name;
int age;
float marks;
void input()
{
Scanner sc = new Scanner(System.in);
System.out.print("enter name : ");
name = sc.nextLine();
System.out.print("enter age : ");
age = Integer.parseInt(sc.nextLine());
System.out.print("enter marks : ");
marks = Float.parseFloat(sc.nextLine());
}
void display()
{
System.out.print("name = "+name+" \nage = "+age+"\nmarks = "+marks);
}
}
class Test
{
public static void main(String[] args)
{
student obj = new student();
obj.input();
obj.display();
}
}