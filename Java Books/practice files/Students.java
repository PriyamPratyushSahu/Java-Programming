//array of objects

import java.util.*;
class Student
{
String name;
int age;
float marks;
void input()
{
Scanner sc = new Scanner(in);
System.out.print("enter name : ");
name = sc.nextLine();
System.out.print("enter age : ");
age = Integer.parseInt(sc.nextLine());
System.out.print("enter marks : ");
marks = Float.parseFloat(sc.nextLine());
}
void disp()
{
System.out.print("Name : "+name+"\tAge : "+age+"\tmarks : "+marks);
}
public static void main(String.. args)
{
Student[] s = new Student[5];
for(int i=0;i<5;i++)
{
s[i]=new Student();
s[i].input()
}
for(int i=0;i<5;i++)
{
s[i].disp();
}
}
}