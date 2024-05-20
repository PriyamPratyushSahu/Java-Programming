package sample_programs;

public class AnimalTypes extends Animal 
{
	private String sound;

	public AnimalTypes(String name, String nailtype, String teethtype, int nooflegs, String sound) {
		super(name, nailtype, teethtype, nooflegs);
		this.sound = sound;
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
}
