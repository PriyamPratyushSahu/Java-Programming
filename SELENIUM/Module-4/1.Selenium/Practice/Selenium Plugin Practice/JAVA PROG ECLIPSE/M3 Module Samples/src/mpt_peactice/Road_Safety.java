package mpt_peactice;

class SpeedInvalidException extends Exception
{
	public SpeedInvalidException(String s)
	{
		super(s);
	}
}
class Speed
{
	String speed;
}
class SpeedImplementation
{
	public String setSpeed(Speed s,int spd)
	{
		String r="";
		try {
		if(spd<=30 || spd>=90)
		{
			
			throw new SpeedInvalidException("SpeedInvalidException");
		}
		else
		{
			s.speed="Valid Speed";
			r=s.speed;
		}
		}
		catch(SpeedInvalidException e)
		{
			r=e.getMessage();
			s.speed="Invalid Speed";
		}
	
		return r;
	}
}
public class Road_Safety {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Speed s=new Speed();
		SpeedImplementation spl=new SpeedImplementation();
		System.out.println(spl.setSpeed(s, 25));
		
	}

}
