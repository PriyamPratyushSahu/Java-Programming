package sample_programs;

public abstract class Animal {
	private String name;
	private String nailtype,teethtype;
	private int  nooflegs;
	
	public Animal(String name, String nailtype, String teethtype, int nooflegs) {
		super();
		this.name = name;
		this.nailtype = nailtype;
		this.teethtype = teethtype;
		this.nooflegs = nooflegs;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNailtype() {
		return nailtype;
	}

	public void setNailtype(String nailtype) {
		this.nailtype = nailtype;
	}

	public String getTeethtype() {
		return teethtype;
	}

	public void setTeethtype(String teethtype) {
		this.teethtype = teethtype;
	}

	public int getNooflegs() {
		return nooflegs;
	}

	public void setNooflegs(int nooflegs) {
		this.nooflegs = nooflegs;
	}
	
	public void eat()
	{
		System.out.println("Food");
	}
	public void sleep()
	{
		System.out.println("Zzzzz");
	}
	abstract void giveSound(); // ; means stmt ends here itself
}
