//inheritance with polymorphism

package sample_programs;

import java.util.Scanner;

public class BankAccDetails2 {
	private int custid;
	private long accno;
	private String name,status;
	private double balance;
	public BankAccDetails2(int custid, long accno, String name, String status, double balance) {
		this.custid = custid;
		this.accno = accno;
		this.name = name;
		this.status = status;
		this.balance = balance;
	}
	public int getCustid() {
		return custid;
	}
	public void setCustid(int custid) {
		this.custid = custid;
	}
	public long getAccno() {
		return accno;
	}
	public void setAccno(long accno) {
		this.accno = accno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public void readData()
	{
		Scanner sc=new Scanner(System.in);
		setCustid(sc.nextInt());
		setAccno(sc.nextLong());
		setStatus(sc.next());
		setName(sc.next());
		setBalance(sc.nextDouble());
	}
	public void chkAccBalance(int custid)
	{
		if(getCustid()==custid)
		{
			System.out.println("Customer id: "+getCustid()+
					"Accno: "+getAccno()+"Name: "+getName()+"Balance: "+getBalance());
		}
	}
	public void chkAccBalance(long accno)
	{
		if(getAccno()==accno)
		{
			System.out.println("Customer id: "+getCustid()+
					"Accno: "+getAccno()+"Name: "+getName()+"Balance: "+getBalance());
		}
	}
	public void chkAccBalance(String name)
	{
		if(getName().equals(name))
		{
			System.out.println("Customer id: "+getCustid()+
					"Accno: "+getAccno()+"Name: "+getName()+"Balance: "+getBalance());
		}
	}


}

