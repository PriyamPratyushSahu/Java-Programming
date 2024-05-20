package sample_programs;

import java.util.Scanner;

public class Student {
	private int rollno,sem;
	private String name,deg,stream;
	private double m1,m2,m3;
	
	public Student(int rollno, int sem, String name, String deg, String stream, double m1, double m2, double m3) {
		this.rollno = rollno;
		this.sem = sem;
		this.name = name;
		this.deg = deg;
		this.stream = stream;
		this.m1 = m1;
		this.m2 = m2;
		this.m3 = m3;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public int getSem() {
		return sem;
	}

	public void setSem(int sem) {
		this.sem = sem;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDeg() {
		return deg;
	}

	public void setDeg(String deg) {
		this.deg = deg;
	}

	public String getStream() {
		return stream;
	}

	public void setStream(String stream) {
		this.stream = stream;
	}

	public double getM1() {
		return m1;
	}

	public void setM1(double m1) {
		this.m1 = m1;
	}

	public double getM2() {
		return m2;
	}

	public void setM2(double m2) {
		this.m2 = m2;
	}

	public double getM3() {
		return m3;
	}

	public void setM3(double m3) {
		this.m3 = m3;
	}

	public void readData()
	{
		Scanner sc=new Scanner(System.in);
		setRollno(sc.nextInt());
		setName(sc.nextLine());
		setDeg(sc.nextLine());
		setStream(sc.nextLine());
		setSem(sc.nextInt());
		setM1(sc.nextDouble());
		setM2(sc.nextDouble());
		setM3(sc.nextDouble());
		
	}
}
