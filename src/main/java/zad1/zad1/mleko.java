package zad1.zad1;

public class mleko<T> extends skladnik<T>{
	Napoj napoj;


	public mleko(Napoj napoj){
		this.napoj = napoj;
	}


	@Override
	public String about() {
		return napoj.about() +" + mleko";
	}

	public double cena(){

		return napoj.cena()+4;

	}

	@Override
	public boolean check(Object obj) {

		return false;
	}
}