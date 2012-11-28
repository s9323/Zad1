package zad1.zad1;


public abstract class Kawiarnia implements KawiaraniaInterface{

	
	protected int id;
	protected osoba owner;
	
	public void printData()
	{
		System.out.println("Owner: "+owner.getName());
		System.out.println(getKawiarniaDetails());
	}

	public abstract String getKawiarniaDetails();

	public abstract Kawiarnia Clone();

	public void setOwner(osoba owner)
	{
		this.owner=owner;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public osoba getOwner() {
		return owner;
	}


}