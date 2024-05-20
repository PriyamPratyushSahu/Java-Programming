package mpt_peactice;
class BMI
{
	public float returnWeight(String str)
	{
		String s[]=str.split("@");
		String weight=s[0].replace("-", ".");
		float d=Float.parseFloat(weight);
		return d;
	}
	public float returnHeight(String str)
	{
		String s[]=str.split("@");
		String height=s[1].replace("-", ".");
		float d=Float.parseFloat(height);
		return d;
	}
	public float calculateBMI(float height,float weight)
	{
		if(height==0 || weight==0)
			return -1;
		else
			return weight/(height*height);
	}
	public String checkStatus(float bmi)
	{
		if(bmi>=20 && bmi<=24)
			return "nourished";
		else
			return "malnourished";
	}
}
public class BMI_calc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BMI bm=new BMI();
		System.out.println(bm.calculateBMI(bm.returnHeight("68-33@1-78"), bm.returnWeight("68-33@1-78")));
		System.out.println(bm.checkStatus(bm.calculateBMI(bm.returnHeight("68-33@1-78"), bm.returnWeight("68-33@1-78"))));
	}

}
