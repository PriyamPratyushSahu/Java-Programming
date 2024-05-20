package sample_programs;

public class StudentCalculations extends Student{
	private double tot,avg;
	
	
	public StudentCalculations(int rollno, int sem, String name, String deg, String stream, double m1, double m2,
			double m3, double tot, double avg) {
		super(rollno, sem, name, deg, stream, m1, m2, m3);
		this.tot = tot;
		this.avg = avg;
	}
	
	public double getTot() {
		return tot;
	}
	public void setTot(double tot) {
		this.tot = tot;
	}
	public double getAvg() {
		return avg;
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}
	public void calc()
	{
		readData();
		setTot(getM1()+getM2()+getM3());
		setAvg(getTot()/3);
	}
	public void disp()
	{
		calc();
		System.out.println("Roll no: "+getRollno()+"\nName: "+getName()+"\nTotal: "+getTot()+
				"\nAverage: "+getAvg());
	}
}
