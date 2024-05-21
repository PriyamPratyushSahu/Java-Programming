//command line argument

import java.util.*;
class test_add
{
void add(int... a)                              //(int... a,int b) //error
{
int sum=0;
for(int i:a)
{
sum=sum+i;
}
System.out.println("Sum : "+sum);
}
public static void main(String[] args)
{
test_add t = new test_add();
t.add(1,2);
t.add(1);
t.add(1,2,3);
t.add(1,2,3,4);
t.add(1,2,3,4,5);
t.add();
}
}