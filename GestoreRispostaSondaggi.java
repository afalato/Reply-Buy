package View;

import java.util.LinkedList;

public class GestoreRispostaSondaggi {

	private static GestoreRispostaSondaggi instance;

	private LinkedList<RispostaSondaggioUtente> listaRisp;

	public static GestoreRispostaSondaggi getInstance() {
		if(instance == null) return new GestoreRispostaSondaggi();
		return instance;
	}

	private GestoreRispostaSondaggi() {
		listaRisp = new LinkedList<RispostaSondaggioUtente>();
	}

	public boolean addRispostaSondaggio(RispostaSondaggioUtente risposta) {
		if(risposta!=null) {
			listaRisp.add(risposta);
		return true;
		}
		return false;

	}

	

}
