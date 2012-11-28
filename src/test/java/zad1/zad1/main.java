package zad1.zad1;

public class main {

	public static void main(String[] args) {

	    Kawiarnia c = new wlascicielKawiarni("Adam","5");
		osoba adam = new osoba("Adam","1");
    	adam.getKawiarnia().add(c);
    	c.setOwner(adam);
    	
    	
    	wlasciciel mgr = new wlasciciel();
		mgr.save(new osoba("Adam","1"));
    	
	}


}
