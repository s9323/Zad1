package zad1.zad1;

public class czekolada<T> extends skladnik<T>{
	Napoj napoj;


	public czekolada(Napoj napoj){
		this.napoj = napoj;
	}


	@Override
	public String about() {
		return napoj.about() +" + czekolada";
	}

	public double cena(){

		if(napoj instanceof Espresso){
			return napoj.cena()+1;
		}
		else if(napoj instanceof Cappucino){
			return napoj.cena()+2;
		}
		else if(napoj instanceof MocnaPalona){
			return napoj.cena()+3;
		}
		return 0.;
	}

	@Override
	public boolean check(Object obj) {

		return false;
	}
}