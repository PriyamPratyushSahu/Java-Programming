class student 
{
void add()
{
System.out.println("ADD Method without arg.");
}
void add(int x)
{
System.out.println("ADD Method with arg.");
}
void add(String x)
{
System.out.println("ADD Method with string arg.");
}
void add(int x,String y)
{
System.out.println("ADD Method string with 2 different arg.");
}
}

class methodover
{
public static void main(String[] args)
{
student s = new student();
s.add();
s.add(1);
s.add("arun");
s.add(1,"arun");
}
}