package zad1.zad1;


public class App {

	public static void main(String[] args) {

		Napoj s1 = new Espresso();
		Napoj s2 = new MocnaPalona();
		Napoj s3 = new Cappucino();

	    System.out.println("Bez dodatkow");
	    System.out.println(s1.about() + " " + s1.cena());
	    System.out.println(s2.about() + " " + s2.cena());
	    System.out.println(s3.about() + " " + s3.cena());

        //dodajemy dodatki	

	    s1 = new czekolada(s1);
        s2 = new czekolada(s2);
        s3 = new czekolada(s3);
        System.out.println("z czekolada");
        System.out.println(s1.about() + " " + s1.cena());
        System.out.println(s2.about() + " " + s2.cena());
        System.out.println(s3.about() + " " + s3.cena());
        
        s1 = new mleko(s1);
        s2 = new mleko(s2);
        s3 = new mleko(s3);
        System.out.println("z mlekiem");
        System.out.println(s1.about() + " " + s1.cena());
	    System.out.println(s2.about() + " " + s2.cena());
	    System.out.println(s3.about() + " " + s3.cena());

	    s1 = new bitasmietana(s1);
        s2 = new bitasmietana(s2);
        s3 = new bitasmietana(s3);
        System.out.println("z centralnym zamkiem");
        System.out.println(s1.about() + " " + s1.cena());
	    System.out.println(s2.about() + " " + s2.cena());
	    System.out.println(s3.about() + " " + s3.cena());

	}
}