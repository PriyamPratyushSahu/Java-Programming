package lab2;

class Savings_Account extends Account
{
	final double minBal;
	boolean withdraw(double d)
	{
		if(minBal>600)
		{
			this.setBalance(this.getBal()-600);
			return true;
		}
		else
			return false;
	}
}
class Current_Account extends Account
{
	double overdraft;
	@Override
	boolean withdraw(double d)
	{
		if(this.getBal()>overdraft)
		{
			return true;
		}
		else
			return false;
	}
}

public class ques2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
