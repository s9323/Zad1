package zad1.zad1;


	public abstract class Napoj implements NapojInterface {

		protected String napoj ="napoj podstawowy";

		public String about(){
			return napoj;
		}

		public double cena() {
			return 0;
		}
	}

