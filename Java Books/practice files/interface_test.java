interface A
	{
	int x = 5;
	void show();
	public default void read()
		{
		System.out.println("Read of A");
		}
	public static void fun()
		{
		System.out.println("fun of A");
		}
	}

interface B
	{
	int x = 5;
	void disp();
	}

class test implements A,B
	{
	public void show()
		{
		System.out.println("Show method of child");
		}
	public void disp()
		{
		System.out.println("disp method of child");
		}
	}

class interface_test
	{
	public static void main(String[] args)
		{
		test a = new test();
		a.show();
		a.disp();
		a.read();
		A.fun();
		}
	}