package _3_Command_Line_argument;

public class CommandLineArgument{
	public static void main(String args[]){
//Type 1: For no argument in the cmd
//		System.out.println("Hello World");

//Type 2: Passing argument in the cmd(Here 2 strings are passed)
//		System.out.println(args[0]);
//		System.out.println(args[1]);

//Type 3: Length of args is not known
		for(String x : args) System.out.print(x + " ");

	}
}

/*
 ***************************** OUTPUT FROM THE CMD*****************************

 //Type 1
 C:\Users\priyamps>javac CommandLineArgument.java
 C:\Users\priyamps>java CommandLineArgument
Hello World

//Type 2
C:\Users\priyamps>javac CommandLineArgument.java
C:\Users\priyamps>java CommandLineArgument Hello World
Hello
World

//Type 3
C:\Users\priyamps>javac CommandLineArgument.java

C:\Users\priyamps>java CommandLineArgument Hello World Welcome to Java Programming
Hello World Welcome to Java Programming
 */