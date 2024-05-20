package sample_programs;

public class Add 
{
	private int a,b,c;

	public Add(int a, int b, int c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int getC() {
		return c;
	}

	public void setC(int c) {
		this.c = c;
	}
	public int add()
	{
		setC(getA()+getB());
		return c;
	}
	public int sub()
	{
		setC(getA()-getB());
		return c;
	}
	public int mul()
	{
		setC(getA()*getB());
		return c;
	}
	public int div()
	{
		try {
			setC(getA()/getB());
		} catch (ArithmeticException e) {
			// TODO Auto-generated catch block
			return e.hashCode();
		}
		return c;
	}
}
