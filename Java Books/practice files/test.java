//write a program to display all prime numbers between 1 t 100

import java.util.scanner;
class test
{
boolean prime(int x)
{
for(int number = 1; number <= 100; number++)
{
if(number==1)
{
return false;
}
for (int divisor = 2; divisor < number && isPrime; divisor++)
{
if (number % divisor == 0)
{
return false;
}
}
}
public static void main(String[] args)
{
test obj = new test();
boolean status = obj.prime(a);
for(int number = 1; number <= 100; number++)
{
if(status)
{
System.out.println(number+"\n");
}
}
}