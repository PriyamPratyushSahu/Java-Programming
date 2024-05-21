



	package logicgate;
	
	public class AND
	{
	  public int doOperation(int a,int b)
	 {
		if(a==1 && b==1)
		return 1;
		else
		return 0;
		}
	}
	
	public class OR
	{
	  public int doOperation(int a,int b)
	 {
		if( a==1 || b==1)
		return 1;
		else
		return 0;
		}
	}
	public class NOT
	{
	   public int doOperation(int a)
	 {
		if(a==0)
		return 1;
		else
		return 1;
		}
	}
