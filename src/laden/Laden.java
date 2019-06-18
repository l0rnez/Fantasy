package laden;

import java.util.ArrayList;

import gegenstände.Ikäuflich;
import spieler.Spieler;

public class Laden {

	ArrayList<Ikäuflich> inventar = new ArrayList<Ikäuflich>();

	public Laden() {
		
	}

	public void buy(Spieler spieler, int id) {
		if(spieler.getGold()>inventar.get(id).getPreis()) {
			ArrayList<Ikäuflich> inventarSpieler = spieler.getRucksack();
			inventarSpieler.add(inventar.get(id));
			spieler.setRucksack(inventarSpieler);
			spieler.setGold(spieler.getGold()-inventar.get(id).getPreis());
		}
		else {
			System.out.println("nicht genug Gold");
		}
		inventar.remove(id);
	}
	
	@Override
	public String toString() {
		String s = null;
		System.out.println("[" + this.getClass().getSimpleName() + "]");
		for(int j = 0; j<inventar.size(); j++) {
			System.out.println(inventar.get(j).getClass().getSimpleName());
		}
		return s;
	}
}
