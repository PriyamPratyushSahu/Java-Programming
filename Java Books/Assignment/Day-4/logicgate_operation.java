

	package x;
	import java.util.Scanner;
	import logicgate.logicgate_and;
	import logicgate.logicgate_or;
	import logicgate.logicgate_not;

	class logicgate_operation
	
	{
		public static void main(String[] args)
		{
			Scanner pp = new Scanner(System.in);
			int a,b;
		  logicgate_and ob1 = new logicgate_and();
		 logicgate_or ob2 = new logicgate_or();
		 logicgate_not ob3 = new logicgate_not();
	System.out.println("Press 1 for AND operation,\n 2 for OR operation, \n 3 for NOT operation ");
	int ch= pp.nextInt();
	if(ch==1)
	{
		System.out.println("Enter two binary value");
		a= pp.nextInt();
		 b= pp.nextInt();
		int c = ob1.doOperation(a,b);
		System.out.println("The result is: "+ c);
			}
	else if(ch==2)
	{
		System.out.println("Enter two binary value");
		a= pp.nextInt();
		 b= pp.nextInt();
		int c = ob2.doOperation(a,b);
		System.out.println("The result is: "+ c);
			}
	else if(ch==3)
	{
		System.out.println("Enter one binary value");
		a= pp.nextInt();
		int c = ob3.doOperation(a);
		System.out.println("The result is: "+ c);
		}

		}
	}

