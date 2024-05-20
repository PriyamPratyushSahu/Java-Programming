package lab1;

import java.time.LocalDate;
import java.time.Period;

enum Gender
{
	/*male('M'),
	female('F');
	private char gen;
	private Gender(char gen)
	{
		this.gen=gen;
	}
	public char getGender()
	{
		return this.gen;
	}*/
	 f,m;
}
class Person
{
	String fname,lname;
	char gender;
	//Gender g=Gender.values();
	int phone;
	public Person()
	{
		
	}
	public Person(String fname, String lname, char gender,int phone) {
		//super();
		this.fname = fname;
		this.lname = lname;
		this.gender = gender;
		this.phone=phone;
		//this.gender=Gender.getGender(gender)
		//Gender g=Gender.mal;
	   /* switch (gender) {
	            case 'f':
	                    this.gender=Gender.valueOf(gender);
	                    break;
	            case 'm':
	                    this.gender=toChar(Gender.m);
	                    break;}*/

	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	void disp()
	{
		System.out.println("First Name: "+fname+"\nLast Name: "+lname+"\nGender: "+gender+"\nPhone no: "+phone);
	}
	//1.15
	public int calcAge(LocalDate dob)
	{
		LocalDate curDate = LocalDate.now();  
		return Period.between(dob, curDate).getYears(); 
	}
	public String getFullName(String firstName, String lastName)
	{
		return firstName+" "+lastName;
	}
	
}
public class ques1_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person1=new Person("Anusmita","Sarkar",'f',89757);
		//Person person1=new Person();
		person1.disp();
		LocalDate dob = LocalDate.parse("1992-08-11");  
		System.out.println(person1.calcAge(dob));
		System.out.println(person1.getFullName("Anusmita", "Sarkar"));
	}

}
