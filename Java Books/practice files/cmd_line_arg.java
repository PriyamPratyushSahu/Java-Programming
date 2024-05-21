//command line argument

import java.util.*;
class cmd_line_arg
{
public static void main(String[] args)
{
String name = args[0];
int age = Integer.parseInt(args[1]);
System.out.println("Name : "+name+"\nage : "+age);
}
}