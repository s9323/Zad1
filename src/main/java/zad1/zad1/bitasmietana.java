package zad1.zad1;

public class bitasmietana<T> extends skladnik<T>{
	Napoj napoj;


	public bitasmietana(Napoj napoj){
		this.napoj = napoj;
	}


	@Override
	public String about() {
		return napoj.about() +" + bitasmietana";
	}

	public double cena(){

		return napoj.cena()+5;

	}

	@Override
	public boolean check(Object obj) {

		return false;
	}

}