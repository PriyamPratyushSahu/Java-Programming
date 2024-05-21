//this keyword

class student 
{
int age;
String name;
public void setValue(String name,int age)
{
name = this name;
age = this age;
}
public void disp()
{
System.out.println()
System.out.println("name = "+name+ "age = "+age);
}
}

class thistest
{
public static void main(String[] args)
{
student s = new student();
s.setValue("arun",19);
s.disp();
}
}