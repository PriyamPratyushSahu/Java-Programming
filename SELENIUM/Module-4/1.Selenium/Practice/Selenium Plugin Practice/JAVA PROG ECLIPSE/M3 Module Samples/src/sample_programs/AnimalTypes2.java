package sample_programs;

public class AnimalTypes2 implements Animal2 
{
	private String name = "";
	private String nailtype,teethtype;
	private int  nooflegs;
	
	private String sound;

	

	public AnimalTypes2(String name, String nailtype, String teethtype, int nooflegs, String sound) {
		this.name = name;
		this.nailtype = nailtype;
		this.teethtype = teethtype;
		this.nooflegs = nooflegs;
		this.sound = sound;
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

	public String getSound() {
		return sound;
	}

	public void setSound(String sound) {
		this.sound = sound;
	}
	public void giveSound()
	{
		if(getName().equals("cat"))
		{
			System.out.println("meow meow");
		}
		else if(getName().equals("dog"))
		{
			setSound("bow bow");
			System.out.println(getSound());
		}
	}
	
	public void eat()
	{
		System.out.println("Food");
	}
	public void sleep() 
	{
		System.out.println("Zzzzz");
	}
}
