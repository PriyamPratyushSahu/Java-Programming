abstract class shape
{
double ar;
abstract void area();
void disp()
{
System.out.println("area : "+ar);
}
}

class rectangle extends shape
{
int l = 10;
int b= 5;
void area()
{
ar=l*b;
}
}

class circle extends shape
{
int r = 7;
void area()
{
ar=3.14*r*r;
}
}

class abstract_area
{
public static void main(String[] args)
{
shape s = new rectangle();
s.area();
s.disp();
shape s1 = new circle();
s1.area();
s1.disp();
}
}