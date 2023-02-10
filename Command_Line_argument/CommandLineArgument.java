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