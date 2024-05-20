package lab2;

import java.util.Random;

class Person
{
	String name;
	float age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getAge() {
		return age;
	}
	public void setAge(float age) {
		this.age = age;
	}
}

class Account
{
	long accNum;
	double balance;
	Person accHolder;
	public long getAccNum() {
		return accNum;
	}
	public void setAccNum() {
		Random d=new Random();
		this.accNum =d.nextLong() ;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public Person getAccHolder() {
		return accHolder;
	}
	public void setAccHolder(Person accHolder) {
		this.accHolder = accHolder;
	}
	
	void deposit(double d)
	{
		balance+=d;
	}
	void withdraw(double w)//boolean
	{
		if(balance>500)
			balance-=w;
	}
	double getBal()
	{
		return balance;
	}
	public String toString()
	{
		return "Name: "+accHolder.getName()+" Age: "+accHolder.getAge()+" Balance: "+getBal()+" Acc no: "+accNum;
	}
	
}




public class ques1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1=new Person();
		p1.setName("Smith");
		p1.setAge(21.8f);
		Account a1=new Account();
		a1.setAccHolder(p1);
		a1.setAccNum();
		a1.setBalance(2000);
		a1.deposit(2000);
		System.out.println(a1);
		Person p2=new Person();
		p2.setName("Kathy");
		p2.setAge(21.8f);
		Account a2=new Account();
		a2.setAccHolder(p2);
		a2.setAccNum();
		a2.setBalance(3000);
		a2.withdraw(2000);
		System.out.println(a2);
		
	}

}
