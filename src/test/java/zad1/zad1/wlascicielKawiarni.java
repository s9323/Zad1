package zad1.zad1;


public class wlascicielKawiarni extends Kawiarnia{

	//pole statyczne

	//pola prywatne

	private String nazwa;
	private String ilosc;

	//pola publiczne

	//konstruktory
	public wlascicielKawiarni(String nazwa, String ilosc)
	{
		this.nazwa=nazwa;
		this.ilosc=ilosc;
	}

	public wlascicielKawiarni()
	{
		this("","");
	}

	//wlasciwosci
	public String getNazwa() {
		return nazwa;
	}

	public void setNazwa(String nazwa) {
		this.nazwa = nazwa;
	}

	public String getIlosc() {
		return ilosc;
	}

	public void setIlosc(String ilosc) {
		this.ilosc = ilosc;
	}

	//metody


	@Override
	public String getKawiarniaDetails() {
		
		return nazwa+" "+ilosc;
	}

	@Override
	public Kawiarnia Clone() {

		wlascicielKawiarni returnValue =new wlascicielKawiarni();
		returnValue.setIlosc(this.ilosc);

		return returnValue;
	}
}