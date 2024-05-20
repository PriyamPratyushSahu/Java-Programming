package sample_programs;


class DemoSuper
{
    public void method()
    {
        System.out.println("from superclass");
    }
}
class DemoSub extends DemoSuper
{
    public void method()
    {
        System.out.println("from subclass");
    }
}
public class OverridingSample
{
	public static void main(String[] args) {

	DemoSuper ref=new DemoSub();
    ref.method();
}
}