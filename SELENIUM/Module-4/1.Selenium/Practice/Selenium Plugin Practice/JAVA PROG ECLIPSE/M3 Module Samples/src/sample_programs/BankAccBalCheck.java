package sample_programs;

public class BankAccBalCheck extends BankAccDetails2 {

	public BankAccBalCheck(int custid, long accno, String name, String status, double balance) {
		super(custid, accno, name, status, balance);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void chkAccBalance(int custid)
	{
		if(getCustid()==custid)
		{
			System.out.println("Customer id: "+getCustid()+
					"Accno: "+getAccno()+"Name: "+getName()+"Status: "+getStatus()+"Balance: "+getBalance());
		}
	}
	@Override
	public void chkAccBalance(long accno)
	{
		if(getAccno()==accno)
		{
			System.out.println("Customer id: "+getCustid()+
					"Accno: "+getAccno()+"Name: "+getName()+"Status: "+getStatus()+"Balance: "+getBalance());
		}
	}
	@Override
	public void chkAccBalance(String name)
	{
		if(getName().equals(name))
		{
			System.out.println("Customer id: "+getCustid()+
					"Accno: "+getAccno()+"Name: "+getName()+"Status: "+getStatus()+"Balance: "+getBalance());
		}
	}
}
