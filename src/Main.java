import laden.Buchhandlung;
import laden.Juwelier;
import laden.Laden;
import laden.Schmiede;
import spieler.Spieler;

public class Main {

	public static void main(String[] args) {
		Spieler s = new Spieler("spieler1", 1000, 100);
		Juwelier juwelier = new Juwelier();
		Schmiede schmiede = new Schmiede();
		Buchhandlung buchhandlung = new Buchhandlung();
		buchhandlung.toString();
		juwelier.toString();
		schmiede.toString();
		
	}
}
