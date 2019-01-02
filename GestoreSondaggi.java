package View;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;

public class GestoreSondaggi {

	private static GestoreSondaggi instance;

	//Da sostituire con gestore DB
	private LinkedList<Sondaggio>listaSondaggi;

	public static GestoreSondaggi getInstance() {
		if (instance == null ) return new GestoreSondaggi();
		return instance;
	}

	public void addSondaggio(Sondaggio sondaggio) {

	}

	public void removeSondaggio(Sondaggio sondaggio) {

	}

	public void updateSondaggio(Sondaggio sondaggio) {

	}

	
	public int calculateCreditoSondaggio(Sondaggio sondaggio) {
	
		int valoreSondaggio=0;
		if(sondaggio != null  && !sondaggio.getDomande().isEmpty()) {
			// calcolo valore in credito del sondaggio
		valoreSondaggio = sondaggio.getDomande().size() * sondaggio.getDomande().getFirst().getListaRisposte().getFirst().getPunti();
		
		}
		if (valoreSondaggio>0) return valoreSondaggio;
		return 0;
	}
	
	private GestoreSondaggi() {
	listaSondaggi= new LinkedList<Sondaggio>();

	}
	
	
	// da eliminare serve per il test senza db
	public GestoreSondaggi(LinkedList<Sondaggio> listaSondaggi) {
    this.listaSondaggi = listaSondaggi;
	}
	

	public Sondaggio getSondaggio(int id) {
	Iterator<Sondaggio> it =listaSondaggi.iterator();
	while(it.hasNext()) {
		Sondaggio sond = it.next();
		if(sond.getId_Sondaggio() == id) {
			return sond;
		}
	}
	return null;
	}

	public LinkedList<Sondaggio> getAllSondaggi() {
		
		return listaSondaggi;
	}

}
